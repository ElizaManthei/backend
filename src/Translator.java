//Translator class met daarin een HashMap variabele,
//        een constructor met 2 arrays als parameter en
//        een translate functie;

import java.util.HashMap;

public class Translator {

   private HashMap<Integer,String> numLet = new HashMap<>();

    public Translator(int numbers[], String letters[]) {
       for (int i = 0; i < numbers.length; i++){
           this.numLet.put(numbers[i],letters[i]);
       }
   }
    public  String translate(Integer number){
            return this.numLet.get(number);
        }
    }