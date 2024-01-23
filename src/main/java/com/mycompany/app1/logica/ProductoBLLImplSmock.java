package com.mycompany.app1.logica;

import com.mycompany.app1.model.ProductoBase;
import com.mycompany.app1.smoke.ProductoWrapper;
import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;


@Stateless
public class ProductoBLLImplSmock implements ProductoBLL {


    private List<ProductoWrapper> list = new ArrayList<>(List.of(ProductoWrapper.createProductoWrap(1L),
            ProductoWrapper.createProductoWrap(2L),
            ProductoWrapper.createProductoWrap(3L),
            ProductoWrapper.createProductoWrap(4L)
    ));

    @Override
    public List<ProductoBase> buscarProductos() {
        return list.stream().map(it -> it.getData()).toList();
    }

    @Override
    public ProductoBase crearProducto(ProductoBase producto) {
        ProductoWrapper smoke = ProductoWrapper.createProductoWrap(producto);
        list.add(smoke);
        return producto;
    }
 
}
