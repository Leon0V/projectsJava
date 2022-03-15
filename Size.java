public class Size {
    public static void main(String[] args){
        
        int num1;

        int num2;

        System.out.print("\nCálculo de maior e menor número inteiro:");

        num1 = Console.readInt("\n Informe o primeiro número: ");

        num2 = Console.readInt("\n Informe o segundo número: ");

        if (num1 > num2){
            System.out.print("\n O Maior número é: " + num1);
            System.out.print("\n E o menor número é: " + num2);
        }
        else{
            System.out.print("\n O Maior número é: " + num2);
            System.out.print("\n E o menor número é: " + num1);
        }

    }
    
}
