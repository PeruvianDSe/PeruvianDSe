package Labs;

import java.util.Scanner;

public class Lecture12DailyActivity {
    public static void main(String[] args) {
        String [] owner = {"Alice", "Bob", "Carol"};
        /*for (String name : owner){
            System.out.println(name);
        }*/

        for (int index = 0; index < owner.length; index++){
            System.out.println(owner [index]);
        }
        System.out.print("Enter a name: ");
        Scanner scnr = new Scanner(System.in);
        String target = scnr.nextLine();
        boolean found = false;
        for (String name : owner){
            if (name.equals(target)){
                found = true;
                break;
            }
        }
        if (found){
            System.out.print(target + " is in the list");
        }
        else{
            System.out.print(target + " is not in the list");
        }
        scnr.close();
    }
    
}