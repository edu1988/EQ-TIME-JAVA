package coordenadas;

//import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		DiaDelA�o nuevoDia = new DiaDelA�o(4,3,2019);
		
		System.out.println(nuevoDia.esBisiesto());
		System.out.println(nuevoDia.getDiaDelA�o());
		System.out.println(nuevoDia.getAnguloFromDia());
		System.out.println(nuevoDia.getEcuacionTiempo());

	}

}
