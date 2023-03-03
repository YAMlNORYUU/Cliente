package co.edu.unbosque.controller;

import java.util.Iterator;
import java.util.Random;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.FachadaVista;

public class Controlador {

	private FachadaVista vp;
	private Cliente cl;

	public Controlador() {
		cl = new Cliente("127.0.0.1", 7000);
		vp = new FachadaVista();
		cl.run();
	}

}
