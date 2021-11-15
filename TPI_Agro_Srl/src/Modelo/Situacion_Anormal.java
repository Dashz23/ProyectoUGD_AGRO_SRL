package Modelo;

import java.util.*;
import javax.persistence.*;
//*----------------------------------------------------Annotations-------------------------------------------------------------
@Entity
@Table(name = "Situacion_Anormal")
public class Situacion_Anormal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_situacion")
    int id_situacion;
   
    @Column(name = "descripcion")
    String descripcion;
   
    @Column(name = "nivel_daño")
    String nivel_dano;

    @OneToMany(mappedBy="situacion",cascade=CascadeType.ALL)
    private List <Proyecto_De_Cultivo> proyectos_afectados;

//*------------------------------------------------------Constructors-----------------------------------------------------------

    public Situacion_Anormal(String descripcion, String nivel_dano) {
        this.descripcion = descripcion;
        this.nivel_dano = nivel_dano;
    }
    
    public Situacion_Anormal() {
    }
//*----------------------------------------------------Getters and Setters------------------------------------------------------
   
    public int getId_situacion() {
        return id_situacion;
    }

    public void setId_situacion(int id_situacion) {
        this.id_situacion = id_situacion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNivel_dano() {
        return nivel_dano;
    }
    public void setNivel_dano(String nivel_dano) {
        this.nivel_dano = nivel_dano;
    }   

    
}

