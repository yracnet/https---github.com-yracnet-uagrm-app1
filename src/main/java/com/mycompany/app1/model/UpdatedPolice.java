package com.mycompany.app1.model;

import jakarta.persistence.Column;
import java.io.Serializable;
import java.util.Date;

public class UpdatedPolice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "usuario_actualizacion")
    private String usuario;
    @Column(name = "fecha_actualizacion")
    private Date fecha;

}
