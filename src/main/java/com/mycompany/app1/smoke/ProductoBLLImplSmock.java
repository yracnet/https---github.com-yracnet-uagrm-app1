package com.mycompany.app1.smoke;

import com.mycompany.app1.logica.ProductoBLL;
import com.mycompany.app1.model.ProductoBase;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.app1.SmokeMode;

@Stateless
@SmokeMode
public class ProductoBLLImplSmock implements ProductoBLL {


    private static List<ProductoWrapper> list = new ArrayList<>(List.of(ProductoWrapper.createProductoWrap(1L),
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
