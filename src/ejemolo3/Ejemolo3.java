
package ejemolo3;

import java.util.Scanner;


public class Ejemolo3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner (System.in);
        double n1,n2,n3,n4;
        double resultado;
        System.out.println("ingrese primera nota");
        n1= leer.nextDouble();
        System.out.println("ingrese segunda nota");
        n2= leer.nextDouble();
        System.out.println("ingrese tercera nota");
        n3= leer.nextDouble();
        System.out.println("ingrese cuarta nota");
        n4= leer.nextDouble();
        resultado=(n1+n2+n3+n4)/4;
        System.out.println("el promedio final es: " +resultado);
                
    }
    
    
}
