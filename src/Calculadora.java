import java.util.function.BiFunction;

public class Calculadora {

    public Double executar(Integer num1, Integer num2, BiFunction<Integer, Integer, Double> calcula) {
        return calcula.apply(num1, num2);
    }

    public BiFunction<Integer, Integer, Double> soma(){
        return  (num1, num2) -> Double.valueOf(num1) + Double.valueOf(num2);
    }

    public BiFunction<Integer, Integer, Double> subtrair(){
        return  (num1, num2) -> Double.valueOf(num1) - Double.valueOf(num2);
    }

    public BiFunction<Integer, Integer, Double> multiplicar(){
        return  (num1, num2) -> Double.valueOf(num1) * Double.valueOf(num2);
    }

    public BiFunction<Integer, Integer, Double> dividir(){
        return  (num1, num2) -> Double.valueOf(num1) / Double.valueOf(num2);

    }



}
