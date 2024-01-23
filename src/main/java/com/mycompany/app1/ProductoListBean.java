package com.mycompany.app1;

import com.mycompany.app1.logica.ProductoBLL;
import com.mycompany.app1.model.ProductoBase;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;

@Named(value = "_productoList")
@ViewScoped
@Getter
public class ProductoListBean implements Serializable {

    private String name = "HIsss111111s";
    @Inject
    private ProductoBLL productoBLL;

    private List<ProductoBase> lista = null;

    public ProductoListBean() {
    }

    public String buscar() {
        lista = productoBLL.buscarProductos();
        return null;
    }

}
