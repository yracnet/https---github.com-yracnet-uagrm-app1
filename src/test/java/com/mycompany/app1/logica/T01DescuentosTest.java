package com.mycompany.app1.logica;

import com.mycompany.app1.Environment;
import com.mycompany.app1.model.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class T01DescuentosTest extends Environment {

    private DescuentoBLL descuentoBLL;

    @BeforeEach
    public void init() {
        descuentoBLL = new DescuentoBLLImpl(em);
    }

    @Test
    public void t001RegistrarDescuentoNivelItem() {
        List<ProductoBase> list = em.createQuery("SELECT p FROM ProductoBase p", ProductoBase.class).getResultList();
        // List list = em.createQuery("SELECT o FROM DescuentoBase o").getResultList();
        System.out.println(">>>>>" + list);

        System.out.println(">>>>>" + descuentoBLL);
    }

    @Test
    public void t002RegistrarDescuentoNivelGlobal() {
    }

}
