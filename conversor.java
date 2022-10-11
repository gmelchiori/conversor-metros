import java.util.Scanner;

public class conversor {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor em metros: ");
        double metros = scanner.nextDouble();
        
        double centimetros =  metros*100;
        System.out.println("O valor em metros é igual a " + centimetros + " centímetros. \n");
    }
}