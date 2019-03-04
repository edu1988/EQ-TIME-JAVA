package coordenadas;

//import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
//		int grados = Integer.parseInt(JOptionPane.showInputDialog
//				("Escribe los grados"));
//		
//		int minutos = Integer.parseInt(JOptionPane.showInputDialog
//				("Escribe los minutos"));
//		
//		int segundos = Integer.parseInt(JOptionPane.showInputDialog
//				("Escribe los segundos"));
//		
//		Coordenadas coordenadas1 = new Coordenadas(grados,minutos,segundos);
//		
//		JOptionPane.showMessageDialog(null, "Sus coordenadas en grados"
//				+ " son " + coordenadas1.convertirAGrados());
		
		DiaDelAño nuevoDia = new DiaDelAño(4,3,2019);
		
		System.out.println(nuevoDia.esBisiesto());
		System.out.println(nuevoDia.getDiaDelAño());
		System.out.println(nuevoDia.getAnguloFromDia());
		System.out.println(nuevoDia.getEcuacionTiempo());

	}

}
