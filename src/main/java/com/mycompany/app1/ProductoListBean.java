package com.mycompany.app1;

import com.mycompany.app1.logica.ProductoBLL;
import com.mycompany.app1.model.ProductoBase;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;

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
