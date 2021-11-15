package Principal;

import Controlador.Controlador;
import Vista.MenuPrincipal;
import Vista.MenuSituacionesA;

public class Principal {
	public static void main(String[] args) {
		Controlador control = new Controlador();
		MenuPrincipal ventana_m_principal = new MenuPrincipal(control);
		
		ventana_m_principal.setVisible(true);
	}
}
