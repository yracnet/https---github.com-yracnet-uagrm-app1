package com.mycompany.app1.logica;

import com.mycompany.app1.model.ProductoBase;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Default
@Stateless
public class ProductoBLLImpl implements ProductoBLL {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ProductoBase> buscarProductos() {
        TypedQuery<ProductoBase> query = em.createQuery("SELECT p FROM ProductoBase p", ProductoBase.class);
        List<ProductoBase> productos = query.getResultList();
        return productos;
    }

    @Override
    public ProductoBase crearProducto(ProductoBase producto) {
        System.out.println("PERSIST");
        em.persist(producto);
        return producto;
    }
 
}
