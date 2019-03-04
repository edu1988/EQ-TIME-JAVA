package coordenadas;

public class DiaDelA�o {
	
	private int dia;
	private int mes;
	private int a�o;
	
	public DiaDelA�o(int d, int m, int a){
		dia = d;
		mes = m;
		a�o = a;
	}
	
	public boolean esBisiesto(){
		return (a�o % 4 == 0 && a�o % 100 != 0 || a�o % 400 == 0);
	}
	
	public int getDiaDelA�o(){
		
		int diaDelA�o = 0;
		switch (mes){
			case 1: diaDelA�o = dia;
			break;
			case 2: diaDelA�o = dia+31;
			break;
			case 3: diaDelA�o = dia+59;
			break;
			case 4: diaDelA�o = dia+90;
			break;
			case 5: diaDelA�o = dia+120;
			break;
			case 6: diaDelA�o = dia+151;
			break;
			case 7: diaDelA�o = dia+181;
			break;
			case 8: diaDelA�o = dia+212;
			break;
			case 9: diaDelA�o = dia+243;
			break;
			case 10: diaDelA�o = dia+273;
			break;
			case 11: diaDelA�o = dia+304;
			break;
			case 12: diaDelA�o = dia+334;
		}
		return diaDelA�o;
	}
	
	public double getAnguloFromDia(){
		
		double anguloRadianes = ((2*Math.PI)/365)*
				(getDiaDelA�o()-1);
		return anguloRadianes;
	}
	
	public double getEcuacionTiempo(){
		
		double ang = getAnguloFromDia();
		double minutosEcuacion = 229.18*(0.000075
				+0.001868*Math.cos(ang)
				-0.032077*Math.sin(ang)
				-0.014615*Math.cos(2*ang)
				-0.040849*Math.sin(2*ang));
		return minutosEcuacion;
	}
	
	
}
