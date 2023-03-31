
/*	Implementacion de la conjetura de Goldbach.	Todo numero par, puede ser representado por sumatoria de dos numeros primos.
 *  Ejemplos:
 *  4 --> 2 + 2
 *  6 --> 3 + 3
 *  8 --> 5 + 3
 *  10 --> 7 + 3
 *  12 --> 7 + 5
 *  14 --> 11 + 3
 *  16 --> 13 + 3
 *  18 --> 11 + 7
 *  
 *  2023-03-31
 *  M.Melocchi
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Primzahlen2 {

	public static void main(String[] args) {

		int primos[] = new int[1000];	//creo matriz para almacenar 1000 numeros primos.
		int p = 0;						//indice matriz numeros primos
		int pmax;
		int sumatorias = 0;
		
		for (int n =1;n<=200;n++){

			int Count=0;
			
			for (int q=1;q<=n;q++) {
			
				// divide un numero "n" por numeros desde 1 hasta llegar al mismo numero n, chequeando
				// que el resto de la division de cero. Si hay solo dos divisiones con resto cero, significa que
				// el numero es primo (ya que solo puede dividirse por el mismo, o por 1)
				if(n%q == 0){
					Count++;
				}
			}
				
			if (Count==2){
			//System.out.println(n + " ist eine Primzahl");
			primos[p] = n;	//carga el numero primo en la matriz
			p++;
		}
	}
	pmax = p-1;
	/*
	System.out.println("Cantidad de numeros primos encontrados = "+ p);			//solo para debugging.
	System.out.println("Primer numero primo = "+ primos[0] + " p = 0");			//solo para debugging.
	System.out.println("Septimo numero primo = "+ primos[6] + " p = 6");		//solo para debugging.
	System.out.println("Ultimo numero primo = "+ primos[pmax] + " p = " + p);	//solo para debugging.
	 */

	//Encuentro sumatoria de primos por fuerza bruta:
	for(int par=4; par<=20; par+=2) {

		for(p=0; p<=pmax; p++) {

			for(int i=0; i<=pmax; i++) {

				if( (primos[p]+primos[i]) == par) {
					System.out.println(par + "=\t" + primos[p] + " + " + primos[i]);
					sumatorias++;
				}

			}
		}


	}

	JFrame parent = new JFrame();

    JOptionPane.showMessageDialog(parent, sumatorias + " sumatorias encontradas.");

}	//Fin main()

}

	
