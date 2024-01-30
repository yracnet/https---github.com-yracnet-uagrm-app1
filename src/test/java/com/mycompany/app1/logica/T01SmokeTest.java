package com.mycompany.app1.logica;

import com.mycompany.app1.Environment;
import com.mycompany.app1.model.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class T01SmokeTest extends Environment {

    @Test
    public void t001InsertProductoBase() {
        ProductoBase p = new ProductoBase();
        p.setNombre("P1");
        p.setPrecio(10D);
        p.setCantidadDisponible(1L);
        p.setActualizacion(UpdatedPolice.createUpdatedPolice());
        p.setCreacion(CreatedPolice.createCreatedPolice());
        try {
            em.persist(p);
            assertNotNull(p.getId());
        } catch (Exception e) {            
            throw new AssertionError(e);
        }
    }

    @Test
    public void t001InsertDescuentoBase() {
        DescuentoBase d = new DescuentoBase();
        d.setCodigo("D1");
        d.setNombre("Descuento 1");
        d.setPorcentaje(0.01D);
        d.setTipo(DescuentoTipo.SIMPLE);
        d.setActualizacion(UpdatedPolice.createUpdatedPolice());
        d.setCreacion(CreatedPolice.createCreatedPolice());
        try {
            em.persist(d);
            assertNotNull(d);
        } catch (Exception e) {            
            throw new AssertionError(e);
        }
    }
}
