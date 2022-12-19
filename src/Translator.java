//Translator class met daarin een HashMap variabele,
//        een constructor met 2 arrays als parameter en
//        een translate functie;

import java.util.HashMap;

public class Translator {
   private int  number[];
   private String letters[];
   private HashMap<Integer,String> numLet = new HashMap<>();

    public Translator(int number[], String letters[]) {
       this.number = number;
       this.letters = letters;
       for (int i = 0; i < 9; i++){
           this.numLet.put(number[i],letters[i]);
       }
   }
    public  String translate(Integer number){
            return this.numLet.get(number);
        }
    }