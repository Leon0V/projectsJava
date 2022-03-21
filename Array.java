import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Array {

    public static void main(String[] args) {

        Integer [] RandomValues = new Integer[5];
        Random random = new Random();
        //o valor acima é para uma array de 1000 elementos, com um fator randomico.

        int temp;
        //variavel para alocar valor temporario para comparação na ordenação que será usado na ordenação manual

        System.out.println("\n >>Random Values Sorted inside an array: <<\n");

        
        for(int i = 0; i < RandomValues.length; i++){
            
            //adicionando valores randomicos ao array
            RandomValues[i] = random.nextInt(10000);

        }

        //comandos para ordenação automática
        Arrays.sort(RandomValues);

        System.out.println("\n Elements of an Array sorted in ascending order AUTOMATICALLY: "+ Arrays.toString(RandomValues)+"\n");

        Arrays.sort(RandomValues, Collections.reverseOrder());
                
        System.out.println("\n Elements of an Array sorted in descending order AUTOMATICALLY:  "+ Arrays.toString(RandomValues) + "\n");

        //ordenando manualmente os valores dentro de uma variavel temporaria para ordenação:
        for(int i = 0; i < RandomValues.length; i++){

            for(int j = i; j < RandomValues.length; j++){

                if(RandomValues[i] > RandomValues[j]){

                    temp = RandomValues[i];

                    RandomValues[i] = RandomValues[j];
                    RandomValues[j] = temp;
                    

                }
            }
        }
   
        //mostrando elementos ordenados manualmente: 
       System.out.print("\n Elements of the array sorted MANUALLY in ascending order: ");
        for(int a : RandomValues){
            System.out.print(" " + a);
            
        }

        System.out.println("\n");
        
        //ordenando de maior para menor manualmente
        for(int i = 0; i < RandomValues.length; i++){

            for(int j = i; j < RandomValues.length; j++){
    
                if(RandomValues[i] < RandomValues[j]){
    
                        temp = RandomValues[i];
    
                        RandomValues[i] = RandomValues[j];
                        RandomValues[j] = temp;
                        
    
                }
               }
        }

        // //mostrando elementos ordenados manualmente em ordem reversa: 
        System.out.print("\n Elements of the array sorted MANUALLY in reverse order: ");
        for(int reverso : RandomValues){
            System.out.print(" " + reverso);
        }

        System.out.println("\n");
           
    }
      
}