package calculadora;

public class Calculadora {

    public static void soma(double num1, double num2) {

        double resultado = num1 + num2;

        System.out.println("A soma dos números " + num1 +" e "+num2 +" tem o resultado de " + resultado);

    }
    public static void subtracao(double num1, double num2) {

        double resultado = num1 - num2;

        System.out.println("A subtração dos números " + num1 +" e "+num2 +" tem o resultado de " + resultado);

    }

    public  static  void  multiplicacao(double num1, double num2){
        double resultado = num1 * num2;

        System.out.println("A multiplicação dos númetos " + num1 + " e " + num2 + " tem o resultado de " +resultado);
    }

    public  static  void  divisao(double num1, double num2){

        double resultado =  num1/num2;

        System.out.println("A divisão dos númetos " + num1 + " e " + num2 + " tem o resultado de " +resultado);
    }


}