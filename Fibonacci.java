public class Fibonacci {
    public static void main(String[] args) {
        
        int value=0, a=1, b=1, informed;

        System.out.print("\n Sequência de Fibonacci a partir de um número inteiro:");

        informed = Console.readInt("\n Informe um valor inteiro e positivo para ser cálculado a sequência de Fibonacci: ");

        System.out.print("1 1 ");
        
        while (value <=informed){

            value = a+b;

            if(value>=informed)

            break;

            System.out.print(value + " ");

            a = b;

            b = value;

        }
    }   
}
