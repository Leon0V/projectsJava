public class Age {
    public static void main(String[] args) {

        int age;

        System.out.print("\n Cálculo de Faixa Etária:");

        age = Console.readInt("\n Informe a idade do cidadão: ");

        if(age <= 13)      {
            System.out.print("\n A Faixa etária do cidadão é: Criança.");
        }
        else if(age > 13 && age <= 18){
            System.out.print("\n A Faixa etária do cidadão é: Adolescente.");

        }
        else if(age > 18 && age <= 60){
            System.out.print("\n A Faixa etária do cidadão é: Adulto.");

        }
        else if(age < 60){
            System.out.print("\n A Faixa etária do cidadão é: Adolescente.");
        }
    }
}