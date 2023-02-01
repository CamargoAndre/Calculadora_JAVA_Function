import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main extends Calculadora{

    private static Scanner sc = new Scanner(System.in);
    private static Calculadora calculadora = new Calculadora();

    public static void main(String[] args) {

        Integer numero1;
        Integer numero2;
        String opcao;
        Boolean continua = true;

        while(continua){

            System.out.println("####CALCULADORA######");
            System.out.println("");

            numero1 = pegarNumero("PRIMEIRO");
            opcao = tela();
            numero2 = pegarNumero("SEGUNDO");

            switch (opcao){
                case "+" -> soma(numero1, numero2);
                case "-" -> subtrair(numero1, numero2);
                case "*" -> multiplicar(numero1, numero2);
                case "/" -> dividir(numero1, numero2);
            }

            continua = desejaSair();

        }
    }
    private static void soma(Integer num1, Integer num2){
        Double resultado = calculadora.executar(num1, num2, calculadora.soma());
        System.out.printf("RESULTADO %s + %s = %.2f\n", num1, num2, resultado);
        System.out.println("TECLE ENTER PARA CONTINUAR");
        sc.nextLine();
    }
    private static void subtrair(Integer num1, Integer num2){
        Double resultado = calculadora.executar(num1, num2, calculadora.subtrair());
        System.out.printf("RESULTADO %s - %s = %.2f\n", num1, num2, resultado);
        System.out.println("TECLE ENTER PARA CONTINUAR");
        sc.nextLine();
    }
    private static void multiplicar(Integer num1, Integer num2){
        Double resultado = calculadora.executar(num1, num2, calculadora.multiplicar());
        System.out.printf("RESULTADO %s * %s = %.2f\n", num1, num2, resultado);
        System.out.println("TECLE ENTER PARA CONTINUAR");
        sc.nextLine();
    }
    private static void dividir(Integer num1, Integer num2){
        if(num2 == 0){
            System.out.println("Não é possível dividir por zero");
            return;
        }
        Double resultado = calculadora.executar(num1, num2, calculadora.dividir());
        System.out.printf("RESULTADO %s / %s = %.2f\n", num1, num2, resultado);
        System.out.println("TECLE ENTER PARA CONTINUAR");
        sc.nextLine();
    }

    private static Boolean desejaSair() {

        System.out.println("REALIZAR OUTRO CALCULO");
        System.out.println("OU DIGITE 1 PARA SAIR");

        String opcao = sc.nextLine();

        if(opcao.equals("1")){
            return false;
        }

        return true;
    }

    private static String tela(){

        System.out.println("+ SOMA || - SUBTRAIR || * MULTIPLICAR || / DIVIDIR");

        return sc.nextLine();
    }

    private static Integer pegarNumero(String s){

        System.out.println("DIGITE O " + s + " NUMERO");
        return Integer.valueOf(sc.nextLine());
    }
}