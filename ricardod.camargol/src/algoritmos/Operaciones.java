package algoritmos;


public class Operaciones {
	
	public static double coeficiente(double i, double j) {
		double facN,facR,resta,facresta,resultado;
		facN=factorial(i);
		facR=factorial(j);
		resta=i-j;
		facresta=factorial(resta);
		resultado=(facN)/(facR*(facresta));
		return (resultado);
		
	}
	
	public static double factorial(double x) {
		double factor=1;
		while (x!=0)
		{
			factor*=x;
			x--;
		}
		return factor;
	}


}
