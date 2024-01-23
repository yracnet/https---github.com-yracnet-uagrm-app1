package com.mycompany.app1.smoke;

import com.mycompany.app1.model.*;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductoWrapper {
    
    private ProductoBase data;
    private TracerPolice development;

    public static ProductoWrapper createProductoWrap(Long id) {
        ProductoWrapper instance = new ProductoWrapper();
        instance.data = ProductoBase.createProductoBase(id);
        instance.development = createTracerPolice();
        return instance;
    }

    public static ProductoWrapper createProductoWrap(ProductoBase data) {
        ProductoWrapper instance = new ProductoWrapper();
        instance.data = data;
        instance.development = createTracerPolice();
        return instance;
    }

    public static TracerPolice createTracerPolice() {
        TracerPolice instance = new TracerPolice();
        instance.setFecha(new Date());
        instance.setIp("0.0.0.0");
        instance.setMac("C3-7D-D4-E6-70-39");
        return instance;
    }
}
