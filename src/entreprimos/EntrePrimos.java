package entreprimos;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EntrePrimos {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int iteraciones=0;
        int tamano=0;
        System.out.print("NUMEROS PRIMOS\n\n");
        System.out.print("Ingrese la cantidad de números: ");
        tamano= scanner.nextInt();
        System.out.print("2 ");
        for (int i=3; i<tamano; i=i+2)
        {
            iteraciones++;
            if (  ((i-((int)(i/10))*10)!=5) &&  ((i%3)!=0) &&  ((i%7)!=0) || i==3 || i==5 || i==7 )
            {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println("\n** "+iteraciones+" Iteraciones  **");
    }
}