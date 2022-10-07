package entreprimos;
/**
 *
 * @author diego
 */
public class EntrePrimos {

    public static void main(String[] args) 
    {
        int iteraciones=0;
        System.out.print("NUMEROS PRIMOS\n\n2 ");
        for (int i=3; i<100; i=i+2)
        {
            iteraciones++;
            if (  ((i-((int)(i/10))*10)!=5) &&  ((i%3)!=0) &&  ((i%7)!=0) || i==3 || i==5 || i==7 )
            {
                System.out.print(i+" ");
            }
        }
        System.out.println("\n** "+iteraciones+" Iteraciones  **");
    }
}
