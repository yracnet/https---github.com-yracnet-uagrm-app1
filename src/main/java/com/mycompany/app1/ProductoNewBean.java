package com.mycompany.app1;

import com.mycompany.app1.logica.ProductoBLL;
import com.mycompany.app1.model.ProductoBase;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import java.io.Serializable;
import lombok.Getter;

@Named(value = "_productoNew")
@ViewScoped
@Getter
public class ProductoNewBean implements Serializable {

    private ProductoBase producto = new ProductoBase();
    @Inject
    @SmokeMode
    private ProductoBLL productoBLL;
    
    
    public String guardarProducto() {
        productoBLL.crearProducto(producto);
    return "index?faces-redirect=true";
    }
    
}
