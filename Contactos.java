package seccion3;

import javax.swing.JOptionPane;

public class Contactos {

	public static void main(String args[]) {
		String nombre;
		String direccion;
		String telefono;
		int posicionGuardar = 0;
		int posicionConsultar;
		String[][] libreta = new String[5][3];
		boolean continuar = true;

		while (continuar) {
			String menu = JOptionPane.showInputDialog(
					"1. guardar contacto \n" + "2. consultar contaco \n" + "3. borrar contacto \n" + "4. salir");
			switch (menu) {

			case "1":
				posicionGuardar = Integer
				.parseInt(JOptionPane.showInputDialog("ingrese la posicion a guardar"));

				if (posicionGuardar < 0 || posicionGuardar > 4) {
					JOptionPane.showMessageDialog(null, "Posicion del arreglo no valida");

				} else {

					if (libreta[posicionGuardar][0] == null) {
						nombre = JOptionPane.showInputDialog("ingrese el nombre");
						telefono = JOptionPane.showInputDialog("ingrese el telefono");
						direccion = JOptionPane.showInputDialog("ingrese la direccion");
						
						libreta[posicionGuardar][0] = nombre;
						libreta[posicionGuardar][1] = telefono;
						libreta[posicionGuardar][2] = direccion;

						JOptionPane.showMessageDialog(null, "Contacto guardado");

					} else if (libreta[posicionGuardar][0] != null) {

						nombre = JOptionPane.showInputDialog("ingrese el nombre");
						telefono = JOptionPane.showInputDialog("ingrese el telefono");
						direccion = JOptionPane.showInputDialog("ingrese la direccion");
						posicionGuardar = Integer
								.parseInt(JOptionPane.showInputDialog("ingrese la posicion a guardar"));

						libreta[posicionGuardar][0] = nombre;
						libreta[posicionGuardar][1] = telefono;
						libreta[posicionGuardar][2] = direccion;

						if (JOptionPane.showConfirmDialog(null, "Desea sobre escribir el contacto") == 0) {

							libreta[posicionGuardar][0] = nombre = libreta[posicionGuardar][0];
							libreta[posicionGuardar][1] = telefono = libreta[posicionGuardar][1];
							libreta[posicionGuardar][2] = direccion = libreta[posicionGuardar][2];

							JOptionPane.showMessageDialog(null, "Contacto guardado");
						} else {
							JOptionPane.showMessageDialog(null, "Ok");
						}

					} else {
						JOptionPane.showMessageDialog(null, "Contacto guardado");
					}
					
					
				}

				break;

			case "2":
				posicionConsultar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posicion a consultar"));

				if (posicionConsultar < 0 || posicionConsultar > 4) {
					JOptionPane.showMessageDialog(null, "La posicion seleccionada no es correcta");

				} else {
					if (libreta[posicionConsultar][0] == null) {
						JOptionPane.showMessageDialog(null, "No se encuentra el contacto");
					} else {
						JOptionPane.showMessageDialog(null, "Nombre " + libreta[posicionConsultar][0] + "\nTelefono: "
								+ libreta[posicionConsultar][1] + "\nDireccion: " + libreta[posicionConsultar][2]);
					}
				}

				break;
			case "3":
				int posicionborrar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a borrar"));

				if (posicionborrar < 0 || posicionborrar > 4) {
					JOptionPane.showMessageDialog(null, "Esta posicion " + posicionborrar + " Esta fuera de la matriz");
				} else {
					if (libreta[posicionborrar][0] == null) {
						JOptionPane.showMessageDialog(null, "Agenda de contactos vacia");
					} else {

						JOptionPane.showMessageDialog(null, "Posicion borrada correctamete ");
						libreta[posicionborrar][0] = null;
						libreta[posicionborrar][1] = null;
						libreta[posicionborrar][2] = null;
					}
				}

				break;
			case "4":
				continuar = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "por favor lea bien e ingrese una opcion valida");

			}
		}

	}
}
