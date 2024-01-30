package com.mycompany.app1.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Embeddable
public class CreatedPolice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "usuario_creacion")
    private String usuario;
    @Column(name = "fecha_creacion")
    private Date fecha;
    
    public static CreatedPolice createCreatedPolice(){
        CreatedPolice value = new CreatedPolice();
        value.fecha = new Date();
        value.usuario = "U001";
        return value;
    }

}
