package Modelo;

import javax.persistence.*;
import java.util.*;
//*----------------------------------------------------Annotations-------------------------------------------------------------
@Entity
@Table(name = "Laboreo")
public class Laboreo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_laboreo")
    int id_laboreo;

    @Column(name = "descripcion")
    String descripcion;

    @OneToMany(mappedBy="laboreo",cascade=CascadeType.ALL)
    private List<LaboreoxCultivo> laboreosxcultivo; 
//*------------------------------------------------------Constructors-----------------------------------------------------------

    public Laboreo(String descripcion) {
        this.descripcion = descripcion;
    }

    public Laboreo() {
    }
//*----------------------------------------------------Getters and Setters------------------------------------------------------
    public int getId_laboreo() {
        return id_laboreo;
    }

    public void setId_laboreo(int id_laboreo) {
        this.id_laboreo = id_laboreo;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}

