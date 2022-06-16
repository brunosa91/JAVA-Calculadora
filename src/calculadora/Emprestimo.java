package calculadora;

public class Emprestimo {
    
    public static void emprestimo (int parcela, double valor){
        
        if (parcela <= 2){
            System.out.println("O valor da parcela sem acŕecimo é " + valor/parcela);
            
        } else if (parcela > 2 && parcela <= 12) {


            System.out.println("O valor da parcela com juros é " + (valor/parcela) * 1.02);
            
        }else{
            System.out.println("Número de parcelas inválido");
        }

    }
}
