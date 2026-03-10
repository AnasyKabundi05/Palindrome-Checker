import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String s = JOptionPane.showInputDialog(null,"Please enter a string");

        if(isPalindrome(s)){
            JOptionPane.showMessageDialog(null,"The String " + s + " is Palindrome");
        }else {
            JOptionPane.showMessageDialog(null,"The String " + s + " is not Palindrome");
        }

    }

    public static Boolean isPalindrome(String s){
        //CREATE INDEXES
        int first = 0;
        int last = s.length() - 1;

        while(first < last){

            if(s.charAt(first) != s.charAt(last)){
                return false;
            }else {
                first++;
                while (s.charAt(first) == ' ')
                    first++;

                last--;
                while (s.charAt(last) == ' ')
                    last--;
            }

        }


        return true;
    }
}