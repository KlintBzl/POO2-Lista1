
package lista.pkg2;

import java.util.Scanner;

public class escanear {
    
    public void Escanear(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o seu nome :)");
        
        String nome = scanner.nextLine();
        
        System.out.println("Olá, " + nome + "! Bem-vindo ao programa");
    }
}
