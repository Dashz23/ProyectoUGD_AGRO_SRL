package Modelo;

import java.util.*;
import javax.persistence.*;
//*----------------------------------------------------Annotations-------------------------------------------------------------
@Entity
@Table(name = "Cultivo")
public class Cultivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cultivo")
    private int id_cultivo;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="nroSuelo")
    private Tipo_De_Suelo Tipo_suelo;

    @OneToMany(mappedBy="cultivo",cascade=CascadeType.ALL)
    private List<LaboreoxCultivo> laboreosxCultivo; 

    @OneToMany(mappedBy="culti",cascade=CascadeType.ALL)
    private List<Proyecto_De_Cultivo> proyectosxCultivo; 
//*------------------------------------------------------Constructors-----------------------------------------------------------

    public Cultivo(String descripcion, Tipo_De_Suelo Tipo_suelo) {
        this.Tipo_suelo = Tipo_suelo;
        this.descripcion = descripcion;
    }

    public Cultivo() {
    }
//*----------------------------------------------------Getters and Setters------------------------------------------------------

    public int getId_cultivo() {
        return id_cultivo;  
    }

    public void setId_cultivo(int id_cultivo) {
        this.id_cultivo = id_cultivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo_De_Suelo getTipoSuelo() {
        return Tipo_suelo;
    }

    public void setTipoSuelo(Tipo_De_Suelo tipo_suelo) {
        Tipo_suelo = tipo_suelo;
    }

}

