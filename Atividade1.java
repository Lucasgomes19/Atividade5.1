    import java.util.Scanner;

    public class Atividade1 {

    public static void main(String[] args) { 
       int n;
       try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite o número: ");
           n = sc.nextInt();
    }
       imprimeNumeros(n);
    }

    static void imprimeNumeros(int n){
        int b, c;
        for (b=1; b <= n; b++) {
            for(c=0; c<b; c++){
                
                System.out.print(b+" ");
            }
            System.out.println(" ");
        
            
        }

    }
}
    
