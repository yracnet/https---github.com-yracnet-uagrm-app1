package com.mycompany.app1.logica;

import com.mycompany.app1.model.ProductoBase;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.List;


//@Stateless
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
        em.persist(producto);
        return producto;
    }
 
}
