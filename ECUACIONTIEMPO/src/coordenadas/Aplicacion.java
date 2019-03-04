package coordenadas;

//import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		DiaDelAño nuevoDia = new DiaDelAño(4,3,2019);
		
		System.out.println(nuevoDia.esBisiesto());
		System.out.println(nuevoDia.getDiaDelAño());
		System.out.println(nuevoDia.getAnguloFromDia());
		System.out.println(nuevoDia.getEcuacionTiempo());

	}

}
