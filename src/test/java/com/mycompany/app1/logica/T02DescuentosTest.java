package com.mycompany.app1.logica;

import com.mycompany.app1.Environment;
import com.mycompany.app1.model.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class T02DescuentosTest extends Environment {

    private DescuentoBLL descuentoBLL;

    @BeforeEach
    public void init() {
        descuentoBLL = new DescuentoBLLImpl(em);
    }

    @Test
    public void t001RegistrarDescuentoNivelItem() {
        DescuentoBase d = new DescuentoBase();
        d.setCodigo("DS001");
        d.setNombre("Descuento Primavera");
        d.setDescripcion("Descuento Simple 1%");
        d.setPorcentaje(0.01D);
        d.setProductoId(1L);
        d.setTipo(DescuentoTipo.SIMPLE);
        d.setActualizacion(UpdatedPolice.createUpdatedPolice());
        d.setCreacion(CreatedPolice.createCreatedPolice());
        descuentoBLL.registrarDescuentoGlobal(d);

        DescuentoBase dd = descuentoBLL.buscarDescuento("DS001");

        assertEquals(dd.getCodigo(), "DS001");
        assertEquals(dd.getPorcentaje(), 0.01D);

    }

    @Test
    public void t001RegistrarDescuentoNivelGlobal() {
        DescuentoBase d = new DescuentoBase();
        d.setCodigo("DG001");
        d.setNombre("Descuento Primavera");
        d.setDescripcion("Descuento Simple 2%");
        d.setPorcentaje(0.02D);
        d.setTipo(DescuentoTipo.GLOBAL);
        d.setActualizacion(UpdatedPolice.createUpdatedPolice());
        d.setCreacion(CreatedPolice.createCreatedPolice());
        descuentoBLL.registrarDescuentoGlobal(d);

        DescuentoBase dd = descuentoBLL.buscarDescuento("DG001");

        assertEquals(dd.getCodigo(), "DG001");
        assertEquals(dd.getPorcentaje(), 0.02D);

    }
}
