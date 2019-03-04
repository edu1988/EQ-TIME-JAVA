package coordenadas;

public class DiaDelAño {
	
	private int dia;
	private int mes;
	private int año;
	
	public DiaDelAño(int d, int m, int a){
		dia = d;
		mes = m;
		año = a;
	}
	
	public boolean esBisiesto(){
		return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
	}
	
	public int getDiaDelAño(){
		
		int diaDelAño = 0;
		switch (mes){
			case 1: diaDelAño = dia;
			break;
			case 2: diaDelAño = dia+31;
			break;
			case 3: diaDelAño = dia+59;
			break;
			case 4: diaDelAño = dia+90;
			break;
			case 5: diaDelAño = dia+120;
			break;
			case 6: diaDelAño = dia+151;
			break;
			case 7: diaDelAño = dia+181;
			break;
			case 8: diaDelAño = dia+212;
			break;
			case 9: diaDelAño = dia+243;
			break;
			case 10: diaDelAño = dia+273;
			break;
			case 11: diaDelAño = dia+304;
			break;
			case 12: diaDelAño = dia+334;
		}
		return diaDelAño;
	}
	
	public double getAnguloFromDia(){
		
		double anguloRadianes = ((2*Math.PI)/365)*
				(getDiaDelAño()-1);
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
