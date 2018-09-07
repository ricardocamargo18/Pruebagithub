package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {
	
	Mundo m;
	Interfaz gui;
	
	public Controlador()
	{
		m = new Mundo();
		gui = new Interfaz();
		gui.escribirMensaje(m.getBd().getDato());
	}
}
