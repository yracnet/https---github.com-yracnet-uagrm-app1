package com.mycompany.app1.logica;

import com.mycompany.app1.model.DescuentoBase;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Default
@Stateless
public class DescuentoBLLImpl implements DescuentoBLL {

    @PersistenceContext
    private EntityManager em;

    public DescuentoBLLImpl() {
    }

    public DescuentoBLLImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public DescuentoBase registrarDescuentoNormal(DescuentoBase descuento) {
        return descuento;
    }

    @Override
    public DescuentoBase registrarDescuentoGlobal(DescuentoBase descuento) {
        return descuento;
    }

    @Override
    public DescuentoBase buscarDescuento(String codigo) {
       DescuentoBase value = new DescuentoBase();
       value.setCodigo(codigo);
        return value;
    }

}
