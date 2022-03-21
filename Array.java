import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {
        int[] RandomValues = new int[10];
        Random random = new Random();
        //o valor acima é para uma array de 1000 elementos, com um fator randomico.
    
        System.out.println(" Random Values Sorted inside an array: \n");

        //este >for< funciona para adicionar valores randomicos até 10000 dentro do array.
        for(int i = 0; i < RandomValues.length; i++){
            RandomValues[i] = random.nextInt(10000);
        }

        //esta linha sorteia os arrays em ordem crescente.
        Arrays.sort(RandomValues);
        

        //esta linha imprime o array na ordem crescente:
        System.out.println("Elements of array sorted in ascending order : "
        + Arrays.toString(RandomValues)+"\n");
        
    }

}
