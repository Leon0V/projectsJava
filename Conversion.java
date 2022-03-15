public class Conversion {
    public static void main(String[] args){

        double dolar;

        double euro;

        double pesoar;

        double real;
        
        System.out.print("\nConversão de moeda: Real para moedas estrangeiras.");
        
        real = Console.readFloat("\n Informe a quantia em Reais para a conversão: ");

        dolar = (real/5.11);

        euro = (real/5.55);

        pesoar = (real/0.04);
        
        System.out.print("\nO valor total em dólares é de: " + String.format("%.2f", dolar));

        System.out.print("\nO valor total em euros é de: " + String.format("%.2f", euro));

        System.out.print("\nO valor total em pesos argentinos é de: " + String.format("%.2f", pesoar));

    }
    
}
