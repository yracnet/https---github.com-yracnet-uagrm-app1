package com.mycompany.app1;

import com.mycompany.app1.logica.ProductoBLL;
import com.mycompany.app1.model.ProductoBase;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import lombok.Getter;

@Named(value = "_productoNew")
@ViewScoped
@Getter
public class ProductoNewBean implements Serializable {

    private ProductoBase producto = new ProductoBase();
    @Inject
    private ProductoBLL productoBLL;
    
    
    public String guardarProducto() {
        productoBLL.crearProducto(producto);
    return "index?faces-redirect=true";
    }
    
}
