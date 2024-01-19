package com.mycompany.app1.logica;

import com.mycompany.app1.model.ProductoBase;
import java.util.List;

public interface ProductoBLL {

    List<ProductoBase> buscarProductos();    
    
    ProductoBase crearProducto(ProductoBase producto);
}
