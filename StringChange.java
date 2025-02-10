//Made by Dallin Lyman
//splits a string into parts 
package sd2;
import java.util.Scanner;
public class StringChange {
    public static void main(String[] args) {
    String test="the quick Brown Fox Jumped over the lazy dog";//string to be split
    String[] word = test.split(" ");//splits the string at each space
    int l = word.length;
    for(int i=0;i<=l-1;i++){//checks every word for an extra space and then prints it
    word[i].replace(" ","");
    System.out.println(word[i]);
        }
        System.out.println("The string has "+l+" words");//outputs the number of words in the array
        Scanner in = new Scanner(System.in); //scans for the next line and puts it in the variable "a"
        System.out.println("input something");
        String a = in.nextLine();
        in.close();
        String[] word2 = a.split(" ");//splits at the space
        int l2 = 0;//variable for the length of the word
        for(int i=0;i<=word2.length-1;i++){//prints a string if it doesn't have a space
            if(true == word2[i].contentEquals("")){
            } else{
                System.out.println(word2[i]);
                l2++;
            }
        }
            System.out.println("Your string has "+l2+" words");// prints the counted number of words
    }
}
