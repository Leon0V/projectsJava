public class Triangle {
    public static void main(String[] args){

        float height;

        float base;

        float area;

        System.out.print("\nCálculo de área de retângulo!\n");

        height = Console.readFloat("\nInforme a altura do retângulo em metros: ");

        base = Console.readFloat("\nInforme o comprimento da base do retângulo em metros: ");

        //area = (height*base)/2;

        area = height * base;

        System.out.print("\nA área total to triângulo em metros quadrados é: " + area);
    }
}
