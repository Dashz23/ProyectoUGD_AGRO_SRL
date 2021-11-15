package Modelo;

import java.util.*;
import javax.persistence.*;
//*----------------------------------------------------Annotations-------------------------------------------------------------
@Entity
@Table(name = "Estado_Del_Proyecto")
public class Estado_Del_Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado")
    private int id_estado;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha_inicio")
    private Date fecha_inicio; 

    @Column(name = "fecha_fin")
    private Date fecha_fin;

    @Column(name = "motivo_cancelamiento")
    private String motivo_cancelamiento;

    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idProyecto")
    private Proyecto_De_Cultivo proyecto; 

    @OneToMany(mappedBy="estado",cascade=CascadeType.ALL)
    private List<LaboreoxCultivo> laboreos_realizados;
//*------------------------------------------------------Constructors-----------------------------------------------------------

    public Estado_Del_Proyecto(String descripcion, Date fecha_inicio, Date fecha_fin, String motivo_cancelamiento, Proyecto_De_Cultivo proyecto) {
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.motivo_cancelamiento = motivo_cancelamiento;
        this.proyecto = proyecto;
    }

    public Estado_Del_Proyecto() {
    }
//*----------------------------------------------------Getters and Setters------------------------------------------------------

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getMotivo_cancelamiento() {
        return motivo_cancelamiento;
    }

    public void setMotivo_cancelamiento(String motivo_cancelamiento) {
        this.motivo_cancelamiento = motivo_cancelamiento;
    }

    public Proyecto_De_Cultivo getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto_De_Cultivo proyecto) {
        this.proyecto = proyecto;
    }
    
}

