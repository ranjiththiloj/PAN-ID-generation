import java.util.*;

public class pan {
    public static void main(String[] args) {
         Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder  strname = new StringBuilder();
        name = name.toUpperCase();
        strname.append(name.charAt(0));    
        for (int i = 0; i < 4; i++) {
            char randomChar = (char) ('a' + (int) (Math.random() * 26));
            char upperCaseChar = Character.toUpperCase(randomChar);
            strname.append(upperCaseChar);
        }
        strname.append(" ");
        for (int i = 0; i < 4; i++) {
            int num = (int) (Math.random() * 5);;
            strname.append(num);
        }
        strname.append(" ");
        for (int i = 0; i < 4; i++) {
            int num = (int) (Math.random() * 4);
            strname.append(num);
        }
        System.out.println("Your PAN Id is: " +strname);
    }
    
}