
import java.util.Scanner;

public class pseudocodigoEjercicio2 {
    public static void main(String[] args){
        int No;
        int Contador = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        No = sc.nextInt();
        System.out.println("Lista:");
        for(int i = 0 ; i <= No - 1 ; i++){
            System.out.println(Contador);
            Contador++;
        }
    }    
}
