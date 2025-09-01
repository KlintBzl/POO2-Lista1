
package lista.pkg4;

public class Métodos {
    
    String FE = "Esta é uma frase de exemplo para exercício.";
    
    public void tamanho(){
        int T = FE.length();
        System.out.println("Tamanho: " + T);
    }
    
    public void maiúsculo(){
        String FEMa = FE.toUpperCase();
        System.out.println("Frase maiúscula: " + FEMa);
    }
    
    public void minúsculo(){
        String FEMi = FE.toLowerCase();
        System.out.println("Frase minúscula: " + FEMi);
    }
    
    public void Pegar(){
        String PF = FE.substring(11, 27);
        System.out.println("Frase retirada: " + "'" + PF + "'");
    }
}
