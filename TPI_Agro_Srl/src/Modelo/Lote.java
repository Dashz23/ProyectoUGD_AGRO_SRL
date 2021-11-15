package Modelo;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Lote")

public class Lote{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lote")
    private int id_lote;

    @Column(name = "superficie_total")
    private float superficie_total;
   
    @Column(name = "ubicacion")
    private String ubicacion;

    @Column(name = "medidas")
    private String medidas;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idCampo")
    private Campo campo;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_suelo")
    private Tipo_De_Suelo tipoSuelo; 
    
    @OneToMany(mappedBy="lote",cascade=CascadeType.ALL)
    private List<Proyecto_De_Cultivo> proyectos;

//*------------------------------------------------------Constructors-----------------------------------------------------------
  public Lote(float superficie_total, String ubicacion, String medidas, Campo campo, Tipo_De_Suelo tipoSuelo) {
        this.superficie_total = superficie_total;
        this.ubicacion = ubicacion;
        this.medidas = medidas;
        this.campo = campo;
        this.tipoSuelo = tipoSuelo;
    }
    
   public Lote() {
    }
//*----------------------------------------------------Getters and Setters------------------------------------------------------
     public int getId_lote() {
        return id_lote;
    }

    public void setId_lote(int id_lote) {
        this.id_lote = id_lote;
    }

    public float getSuperficie_total() {
        return superficie_total;
    }

    public void setSuperficie_total(float superficie_total) {
        this.superficie_total = superficie_total;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public void setCampo(Campo campo) {
     this.campo = campo;
    }

    public Campo getCampo() {
        return campo;
    }

    public Tipo_De_Suelo getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(Tipo_De_Suelo tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    
}
