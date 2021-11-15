package Modelo;

import javax.persistence.*;
import java.util.*;
//*----------------------------------------------------Annotations-------------------------------------------------------------
@Entity
@Table(name = "Tipo_De_Suelo")
public class Tipo_De_Suelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_tipo")
    int nro_tipo;

    @Column(name = "descripcion")
    String descripcion;

    @OneToMany(mappedBy="tipoSuelo",cascade=CascadeType.ALL)
    private List<Lote> lotes;

    @OneToMany(mappedBy="Tipo_suelo",cascade=CascadeType.ALL)
    private List <Cultivo> cultivos; 
//*------------------------------------------------------Constructors-----------------------------------------------------------
    public Tipo_De_Suelo(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo_De_Suelo() {
    }
//*----------------------------------------------------Getters and Setters------------------------------------------------------

    public int getNro_tipo() {
        return nro_tipo;
    }

    public void setNro_tipo(int nro_tipo) {
        this.nro_tipo = nro_tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
      
    
}

