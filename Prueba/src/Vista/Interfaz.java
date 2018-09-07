package Vista;

import javax.swing.JOptionPane;

public class Interfaz {
	
	public void escribirMensaje(String texto)
	{
		JOptionPane.showMessageDialog(null, texto, "Programa Prueba", JOptionPane.INFORMATION_MESSAGE);
	}
}
