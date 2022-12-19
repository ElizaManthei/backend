//Translator class met daarin een HashMap variabele,
//        een constructor met 2 arrays als parameter en
//        een translate functie;

import java.util.HashMap;

public class Translator {
   private int  numbers[];
   private String letters[];
   private HashMap<Integer,String> numLet = new HashMap<>();

    public Translator(int numbers[], String letters[]) {
       this.numbers = numbers;
       this.letters = letters;
       for (int i = 0; i < 9; i++){
           this.numLet.put(numbers[i],letters[i]);
       }
   }
    public  String translate(Integer number){
            return this.numLet.get(number);
        }
    }