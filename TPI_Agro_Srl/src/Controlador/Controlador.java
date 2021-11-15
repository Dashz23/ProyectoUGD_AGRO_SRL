package Controlador;

import java.util.List;

import DAO_Imp.Campo_Imp;
import DAO_Imp.Situacion_Anormal_Imp;
import DAO_Imp.Tipo_De_Suelo_Imp;
import Modelo.Campo;
import Modelo.Situacion_Anormal;
import Modelo.Tipo_De_Suelo;

public class Controlador {

	private Campo_Imp campoImpl;
    private Tipo_De_Suelo_Imp tpSueloImpl;
    private Situacion_Anormal_Imp situacionAnImpl; 

    

    //----------------------------------------------METODOS INSERTAR DATOS---------------------------------------------
    
    public Controlador() {
        campoImpl = new Campo_Imp();
        tpSueloImpl = new Tipo_De_Suelo_Imp();
        situacionAnImpl = new Situacion_Anormal_Imp();
    }

    public void agregar_campo(String nombre, String dire){
        Campo C = new Campo(nombre, dire);
        campoImpl.saveObjeto(C);
    }

    public void agregar_tp_suelo(String descrip){
        Tipo_De_Suelo tp = new Tipo_De_Suelo(descrip);
        tpSueloImpl.saveObjeto(tp);
    }

    public void agregar_situacion_anormal(String des, String nivel){
        Situacion_Anormal S = new Situacion_Anormal(des,nivel);
        situacionAnImpl.saveObjeto(S);
    }
    //------------------------------------------METODOS LISTAR TODOS LOS DATOS-----------------------------------------
    
    public List <Campo> obtener_campos(){
        List <Campo> mostrar = null;
        mostrar = campoImpl.getAll();
        return mostrar;
    }

    public List <Tipo_De_Suelo> obtener_tps_suelo(){
        List <Tipo_De_Suelo> mostrar = null;
        mostrar = tpSueloImpl.getAll();
        return mostrar;
    }

    public List <Situacion_Anormal> obtener_situaciones_anormales(){
        List <Situacion_Anormal> mostrar = null;
        mostrar = situacionAnImpl.getAll();
        return mostrar;
    }
    //-----------------------------------------------METODOS BORRAR DATOS-----------------------------------------------
    
    public void eliminar_campo(int id){
       Campo c = new Campo(null,null);
       c.setId_campo(id);
       campoImpl.deleteObjeto(c);
    }

    public void eliminar_tp_suelo(int id){
       Tipo_De_Suelo t = new Tipo_De_Suelo(null);
       t.setNro_tipo(id);
       tpSueloImpl.deleteObjeto(t); 
    }

    public void eliminar_situacion_anormal(int id){
       Situacion_Anormal s = new Situacion_Anormal(null,null);
       s.setId_situacion(id);
       situacionAnImpl.deleteObjeto(s);
    }

    //--------------------------------------------METODOS ACTUALIZAR DATOS-----------------------------------------------
    public void actualizar_campo(int id, String nombre, String direccion){
        Campo c = new Campo(nombre,direccion);
        c.setId_campo(id);
        campoImpl.updateObjeto(c);
    }

    public void actualizar_tp_suelo(int id, String descrip){
        Tipo_De_Suelo tp = new Tipo_De_Suelo(descrip);
        tp.setNro_tipo(id);
        tpSueloImpl.updateObjeto(tp);
    }

    public void actualizar_situacion_anormal(int id, String descrip, String danio){
        Situacion_Anormal s = new Situacion_Anormal(descrip, danio);
        s.setId_situacion(id);
        situacionAnImpl.updateObjeto(s);
    }
}
