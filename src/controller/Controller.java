package controller;

import model.Grafo;

public class Controller {
	public Controller() {
		super();
	}
	
	public String teste() throws Exception {
		Grafo<Integer> g = new Grafo(routers);
		
		g.link("A", "B");
		g.link("A", "D");
		g.link("B", "C");
		g.link("C", "D");
		
		return g.toString();
	}
}
