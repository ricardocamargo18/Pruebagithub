package algoritmos;

public class Arreglo_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int numeros  [] = new int [31];
		int x,a;
		
        for ( x = 0 ; x < 30 ; x ++) {
            numeros[x]=(int)(Math.random()*10);
            System.out.println("numeros desr["+x+"]="+numeros[x]);
        }
        int temp;
        
            for(x=0; x<31-1; x++) {
            	for(a = x+1; a < 31; a++ ){
            		if (numeros[x]==0){
            			temp = numeros[x];
            			numeros[x] = numeros[a];
            			numeros[a] = temp;
            		}
            	}
            	System.out.println("numeros["+x+"]="+numeros[x]);
            }
	}
}
