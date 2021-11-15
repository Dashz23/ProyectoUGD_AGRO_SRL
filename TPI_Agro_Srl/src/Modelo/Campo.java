package Modelo;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Campo")
public class Campo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_campo")
    private int id_campo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @OneToMany(mappedBy="campo",cascade=CascadeType.ALL)
    private List <Lote> lotes; 
    

  //*------------------------------------------------------Constructors-----------------------------------------------------------
      public Campo(String nombre, String direccion) {
          this.nombre = nombre;
          this.direccion = direccion;
      }

      public Campo() {
      }
  //*----------------------------------------------------Getters and Setters------------------------------------------------------

      public String getNombre() {
          return nombre;
      }

      public void setNombre(String nombre) {
          this.nombre = nombre;
      }

      public int getId_campo() {
          return id_campo;
      }

      public void setId_campo(int id_campo) {
          this.id_campo = id_campo;
      }

      public String getDireccion() {
          return direccion;
      }

      public void setDireccion(String direccion) {
          this.direccion = direccion;
      }
}
