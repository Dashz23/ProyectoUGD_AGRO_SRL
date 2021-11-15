package Modelo;

import java.util.*;
import javax.persistence.*;
//*----------------------------------------------------Annotations-------------------------------------------------------------
@Entity
@Table(name = "Proyecto_De_Cultivo")

public class Proyecto_De_Cultivo {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto")
    private int id_proyecto;

    @Column(name = "nombre")
    private String nombre;

    @Column( name = "fecha_inicio")
    private Date fecha_inicio; 

    @Column(name = "fecha_fin")
    private Date fecha_fin;

    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idLote")
    private Lote lote;

    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idCultivo")
    private Cultivo culti;

    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idsituacion")
    private Situacion_Anormal situacion;

    @OneToMany(mappedBy="proyecto",cascade=CascadeType.ALL)
    private List <Estado_Del_Proyecto> estados;

//*------------------------------------------------------Constructors-----------------------------------------------------------
    public Proyecto_De_Cultivo(String nombre, Date fecha_inicio, Date fecha_fin, Lote lote, Cultivo culti, Situacion_Anormal situacion) {
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.lote = lote;
        this.culti = culti;
        this.situacion = situacion;
    }

    public Proyecto_De_Cultivo() {
    }
//*----------------------------------------------------Getters and Setters------------------------------------------------------

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Cultivo getCulti() {
        return culti;
    }

    public void setCulti(Cultivo culti) {
        this.culti = culti;
    }

    public Situacion_Anormal getSituacion() {
        return situacion;
    }

    public void setSituacion(Situacion_Anormal situacion) {
        this.situacion = situacion;
    }
    
}

