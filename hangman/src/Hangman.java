
import java.util.Scanner;


public class Hangman {

static Scanner input = new Scanner(System.in); 
    

    public static void main(String[] args) {
                
        
        
        double w = Math.random()* 25;
        String testing = (getWord(w));
        String userGuess;     
        int g = testing.length();
        
        
        System.out.println(testing);
        while(g != 0){
        System.out.println("\n\nThere are " + testing.length()+ " letters in the word");
        System.out.println("Enter the letter you wish to guess");
        userGuess = input.nextLine();
        
        
        System.out.println(testInput(testing, userGuess, g));
        //if (testInput == false){
            
        //}
        //System.out.println();
        }    
    }
        
        
    //choose the word to challenge with
    public static String getWord(double w) {
        String[] words = new String[25];
        
        words[0] = "test";
        words[1] = "fail";
        words[2] = "nickel";
        words[3] = "music";
        words[4] = "awesome";
        words[5] = "dinner";
        words[6] = "smoker";
        words[7] = "lighter";
        words[8] = "pizza";
        words[9] = "java";
        words[10] = "chicken";
        words[11] = "school";
        words[12] = "miner";
        words[13] = "fallout";
        words[14] = "world";
        words[15] = "warcraft";
        words[16] = "speaker";
        words[17] = "phone";
        words[18] = "candy";
        words[19] = "life";
        words[20] = "sexy";
        words[21] = "tequila";
        words[22] = "beer";
        words[23] = "time";
        words[24] = "winner";
        
        String hangword =  words[(int)w];
        
            return hangword;
            

    }
    //test the input
    public static int testInput(String testing, String userGuess, int g) {
        int i = 0;
        int l = testing.length();
        boolean find = false;
        int correct=0;
        
        while (i != l){
            if(testing.charAt(i)== userGuess.charAt(0)){ 
                System.out.println("Correct");
               correct++;
               i++;
            find = true;
            }
            else 
                i++;
            
            if(i == l&&correct==0){ 
                System.out.println("Incorrect");
                i=0;
                break;
            }
     }  

        if (correct == 0){
            g--;
        }
        System.out.println("Attempts " + testing.length() + "/" + g);
         System.out.print("Number correctly guessed this round ");
         return correct;
    }
    
    //public static String numGuesses() {
        
    //}
    
    public static String numGuesses(String userGuess) {
        String[] letters = new String[26];
        
        letters[0] = "a";
        letters[1] = "b";
        letters[2] = "c";
        letters[3] = "d";
        letters[4] = "e";
        letters[5] = "f";
        letters[6] = "g";
        letters[7] = "h";
        letters[8] = "i";
        letters[9] = "j";
        letters[10] = "k";
        letters[11] = "l";
        letters[12] = "m";
        letters[13] = "n";
        letters[14] = "o";
        letters[15] = "p";
        letters[16] = "q";
        letters[17] = "r";
        letters[18] = "s";
        letters[19] = "t";
        letters[20] = "u";
        letters[21] = "v";
        letters[22] = "w";
        letters[23] = "x";
        letters[24] = "y";
        letters[25] = "z";
        
        return userGuess;
    }
    
    
    
    
}
