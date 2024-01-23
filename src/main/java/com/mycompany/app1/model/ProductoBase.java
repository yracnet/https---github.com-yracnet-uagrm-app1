package com.mycompany.app1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class ProductoBase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private Double precio;
    @Column
    private Long cantidadDisponible;
    @Embedded
    private CreatedPolice creacion;
    @Embedded
    private UpdatedPolice actualizacion;

    public static ProductoBase createProductoBase(Long id) {
        ProductoBase instance = new ProductoBase();
        instance.setId(id);
        instance.setNombre("Name" + id);
        return instance;
    }

}
