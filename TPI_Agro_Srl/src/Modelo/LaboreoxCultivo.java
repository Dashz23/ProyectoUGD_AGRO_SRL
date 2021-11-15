package Modelo;

//*----------------------------------------------------Annotations-------------------------------------------------------------
import javax.persistence.*;

@Entity
@Table(name = "LaboreoxCultivo")
public class LaboreoxCultivo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "nro_orden")
  private int nro_orden;

  @Column(name = "duracion")
  private String duracion;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="idCultivo") 
  private Cultivo cultivo;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="idLaboreo") 
  private Laboreo laboreo;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="idEstado") 
  private Estado_Del_Proyecto estado;

  
//*------------------------------------------------------Constructors-----------------------------------------------------------

  public LaboreoxCultivo(int nro_orden, String duracion, Laboreo laboreo, Cultivo cultivo, Estado_Del_Proyecto estado) {
      this.nro_orden = nro_orden;
      this.duracion = duracion;
      this.laboreo = laboreo;
      this.cultivo = cultivo;
      this.estado = estado;
  }

  public LaboreoxCultivo() {

  }
//*----------------------------------------------------Getters and Setters------------------------------------------------------

  public int getNro_orden() {
      return nro_orden;
  }

  public void setNro_orden(int nro_orden) {
      this.nro_orden = nro_orden;
  }

  public String getDuracion() {
      return duracion;
  }

  public void setDuracion(String duracion) {
      this.duracion = duracion;
  }

  public Laboreo getLaboreo() {
      return laboreo;
  }

  public void setLaboreo(Laboreo laboreo) {
      this.laboreo = laboreo;
  }

  public Cultivo getCultivo() {
      return cultivo;
  }

  public void setCultivo(Cultivo cultivo) {
      this.cultivo = cultivo;
  }

  public Estado_Del_Proyecto getEstado() {
      return estado;
  }

  public void setEstado(Estado_Del_Proyecto estado) {
      this.estado = estado;
  }

}

