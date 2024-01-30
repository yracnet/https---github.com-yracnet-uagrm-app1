package com.mycompany.app1.model;

import javax.persistence.Column;
import javax.persistence.Embedded; 
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class DescuentoBase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String codigo;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private Long productoId;
    @Column
    private DescuentoTipo tipo;
    @Column
    private Double porcentaje;
    @Embedded
    private CreatedPolice creacion;
    @Embedded
    private UpdatedPolice actualizacion;

    public static DescuentoBase createDescuentoBase(String codigo) {
        DescuentoBase instance = new DescuentoBase();
        instance.setCodigo(codigo);
        instance.setNombre("Name: " + codigo);
        return instance;
    }

}
