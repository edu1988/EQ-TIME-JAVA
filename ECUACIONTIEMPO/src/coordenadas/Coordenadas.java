package coordenadas;

public class Coordenadas {
	
	private int grados;
	private int minutos;
	private int segundos;
	
	public Coordenadas(int g, int m, int s){
		grados = g;
		minutos = m;
		segundos = s;
	}
	
	public float convertirAGrados(){
		
		float minutosGrados = (float)minutos / 60;
		float segundosGrados = ((float)segundos / 60)/60;
		float gradosTotales = (float)grados + minutosGrados + segundosGrados;
		return gradosTotales;
	}

}
