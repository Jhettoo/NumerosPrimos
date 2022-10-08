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
        int acortador=0;        //acorta el ciclo
        ////////   PRIMER ALGORITMO  -  CICLO CORTO  //////////////
        System.out.print("========= NUMEROS PRIMOS ==========\n\n");
        System.out.print("Ingrese la cantidad de números: ");
        tamano= scanner.nextInt();
        System.out.println("\n Versión con el ciclo más corto\n");
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
        System.out.println("\n***** "+iteraciones+" Iteraciones con ciclo de impresión  *****");
        
        ///////  VERSIÓN LARGA - TAMIZ DE ERASTÓSTENES   //////////////
        int primos[] = new int[tamano];
        System.out.println("\n\nVersión COMPLETA de Tamiz de Aristostenes...\n");
        iteraciones=0;
        
        for (int i=3;i<tamano;i++)
        {
            iteraciones++;
            if ((i%2)==0)       //0 si no es primo
                primos[i]=1;
        }
        for (int i=4; i<tamano; i++)
        {
            iteraciones++;
            if ((i%3)==0)
                primos[i]=1;
        }
        for (int i=6; i<tamano; i++)
        {
            iteraciones++;
            if ((i%5)==0)
                primos[i]=1;
        }
        for (int i=8; i<tamano; i++)
        {
            iteraciones++;
            if ((i%7)==0)
                primos[i]=1;
        }
        System.out.println(iteraciones+" Iteraciones del proceso");
        for(int i=2; i<tamano; i++)
        {
            iteraciones++;
            if (primos[i]==0)
                System.out.print(i+" ");
        }
        System.out.println("\n"+iteraciones+" Iteraciones del proceso mas la impresión");
        
        ///////  VERSIÓN CORTA - TAMIZ DE ERASTÓSTENES   //////////////
        System.out.println("\n\nVersión CORTA de tamiz de Erastóstenes...\n");
        iteraciones=0;
        
        for (int i=1;i<tamano;i=i+2)
        {
            iteraciones++;
            if ((i%2)==0 && i!=2)       //0 si no es primo
                primos[i]=1;
            if ((i%3)==0 && i!=3)
                primos[i]=1;
            if ((i%5)==0 && i!=5)
                primos[i]=1;
            if ((i%7)==0 && i!=7)
                primos[i]=1;
        }
        System.out.println(iteraciones+" Iteraciones del proceso");
        for(int i=2; i<tamano; i++)
        {
            iteraciones++;
            if (primos[i]==0)
                System.out.print(i+" ");
        }
        System.out.println("\n"+iteraciones+" Iteraciones del proceso mas la impresión");
        
    }
}