package co.edu.unbosque.controller;

import java.util.Iterator;
import java.util.Random;

import co.edu.unbosque.model.FachadaModelo;
import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.FachadaVista;

public class Controlador {

	private FachadaModelo model;
	private FachadaVista vp;

	public Controlador() {
		model = new FachadaModelo();
		vp = new FachadaVista();
		asignarOyentes();
	}

	private void asignarOyentes() {
	}

	public void ejecutar() {
		while (true) {
			try {





				vp.getJpane().mostrarDialogo("Taller"
						+ "\n"+"1) Cargar estudiantes 2) Salir ");
	

				String aux = vp.getConsola().leerTexto();
				int eleccion = Integer.parseInt(aux);
				switch (eleccion) {
				case 1:
					vp.getJpane().mostrarDialogo("1");

					break;
				case 2:
					vp.getJpane().mostrarDialogo("2");

					break;

				default:
					
					break;


				}	} 	catch (Exception e) {
					// TODO: handle exception
				}
		}
	}}

