package com.mycompany.app1.smoke;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Embeddable
public class TracerPolice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "usuario_tracer")
    private String usuario;
    @Column(name = "fecha_tracer")
    private Date fecha;
    @Column(name = "ip_tracer")
    private String ip;
    @Column(name = "mac_tracer")
    private String mac;
    @Column(name = "proyecto_tracer")
    private String proyecto;

}
