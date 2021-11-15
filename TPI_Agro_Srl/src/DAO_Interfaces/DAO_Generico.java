package DAO_Interfaces;

import java.util.List;

public interface DAO_Generico<T>{
	
	public void saveObjeto(T clase);
    public void deleteObjeto(T clase);
    public void updateObjeto(T clase);
    public List<T> getAll();
    public T getObjeto(int id);
        
}
