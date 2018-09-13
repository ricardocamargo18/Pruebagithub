
package algoritmos;

import java.util.Scanner;
public class Arreglos_Bidimensional{

	static int n,fact, numero,r,trian;
	static double coef;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=1;
		numero=1;
		calculos();
	}
	static void calculos(){
		fact=factorizar(numero);
		coef=coeficiente(numero,r);
		trian=triangulo(numero,r);
	}
	static int factorizar(int n){
		Scanner entrada =  new Scanner(System.in);
		int i,f=1;//variables locales
		System.out.println("Digite un número");
		n = entrada.nextInt();
		for(i=1;i<=n;++i){
			f=f*i;
		}
		System.out.println("el valor factorial de "+n+ " es " +f);
		return f;
	}
	static double coeficiente (int n,int r){
		Scanner entrada =  new Scanner(System.in);
		int i,factorialn=1, factorialr=1, factorialnr=1, difnr; //variables locales
		double c,f;
		System.out.println("Digite el valor de n");
		n= entrada.nextInt();
		System.out.println("Digite el valor de r");
		r = entrada.nextInt();
		
				
		if (n > 0){
			for(i=1; i<=n;++i);
			factorialn = factorialn*i;           
		}

		if (r > 0){
			for(i=1; i<=r;++i);
			factorialr = factorialr*i;

		}
		difnr=n-r;
		if (difnr > 0){
			for(i=1; i<=difnr;++i);
			factorialnr = factorialnr*i;

		}
	
		f =(factorialr*(factorialnr));
		c = (factorialn / f);

		System.out.println("El valor de coeficiente " +n+ " y " +r+ " es "+c);
		return c;
}
	
	static int triangulo (int n,int r){
		Scanner entrada =  new Scanner(System.in);
	int t=1,c=1,i,factorialn=1, factorialr=1, factorialnr=1, difnr; //variables locales
	System.out.println("Digite el valor de n");
	n= entrada.nextInt();
	
	for(i=0;i<=n;++i){
		
	if (n > 0){
		for(i=1; i<=n;++i);
		factorialn = factorialn*i;           
	}
	if (r <=n ){
		difnr=n-r;
	if (r <=n ){
		for(i=1; i<=r;++i);
		factorialr = factorialr*i;
	
	}
	if (difnr > 0){
		for(i=1; i<=difnr;++i);
		factorialnr = factorialnr*i;
	}
	}
	
	c = (factorialn / (factorialr*(factorialnr)));
	++t;
	}
	System.out.println("el valor de " +c+ " es " +t);
	return t;

	}
	
}
