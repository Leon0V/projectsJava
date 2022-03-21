import java.util.Arrays;
import java.util.Random;

public class Exe08 {

    public static void main(String[] args) {
        int[] valoresRandomicos = new int[10];
        Random random = new Random();
        //o valor acima é para uma array de 1000 elementos, com um fator randomico.
    
        System.out.println(" -- EXERCÍCIO 08 -- \n");

        //este >for< funciona para adicionar valores randomicos até 10000 dentro do array.
        for(int i = 0; i < valoresRandomicos.length; i++){
            valoresRandomicos[i] = random.nextInt(10000);
        }

        //for(int i = 0; i < valoresRandomicos.length; i++){
            //System.out.print(valoresRandomicos[i] + " ");

        //esta linha sorteia os arrays em ordem crescente.
        Arrays.sort(valoresRandomicos);
           
        //}

        //esta linha imprime o array na ordem crescente:
        System.out.println("Elements of array sorted in ascending order : "
        + Arrays.toString(valoresRandomicos)+"\n");
        
    }

}
