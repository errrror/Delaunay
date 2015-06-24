package model;
/**
 * 
 * Arista, linea o lado, no orientado. 
 * 
 * @author Benjamin Diaz
 *
 */
public class Edge {
	public Point p1, p2;
	
	public Edge(){
	}
	
	public Edge (Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
}
