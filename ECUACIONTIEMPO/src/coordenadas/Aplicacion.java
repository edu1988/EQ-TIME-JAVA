package coordenadas;

//import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		DiaDelAño nuevoDia = new DiaDelAño(4,3,2019);
		
		System.out.println(nuevoDia.esBisiesto());
		System.out.println(nuevoDia.getDiaDelAño());
		System.out.println(nuevoDia.getAnguloFromDia());
		System.out.println(nuevoDia.getEcuacionTiempo());
		
		/*Me voy a cagar en todo a ver si esto me sale de una vez*/
		/*Que está pasando por que no va*/
	}

}
