package coordenadas;

//import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		DiaDelAno nuevoDia = new DiaDelAno(4,3,2019);
		
		System.out.println(nuevoDia.esBisiesto());
		System.out.println(nuevoDia.getDiaDelAno());
		System.out.println(nuevoDia.getAnguloFromDia());
		System.out.println(nuevoDia.getEcuacionTiempo());
		/*Borro comentarios y solo dejo uno*/
		/*A ver si de una vez consigo importar de github a eclipse*/
		/*Añado comentarios*/
	}

}
