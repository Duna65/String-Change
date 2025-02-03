package sd2;
import java.util.Scanner;
public class StringChange {
    public static void main(String[] args) {
    String test="the quick Brown Fox Jumped over the lazy dog";
    String[] word = test.split(" ");
    int l = word.length;
    for(int i=0;i<=l-1;i++){
    System.out.println(word[i]);
        }
        System.out.println("The string has "+l+" words");
        Scanner in = new Scanner(System.in);
        System.out.println("input something");
        String a = in.nextLine();
        in.close();
        String[] word2 = a.split(" ");
        int l2 = word2.length;
        for(int i=0;i<=l2-1;i++){
            System.out.println(word2[i]);
            System.out.println("Your string has "+l2+" words");
        }
    }
}
