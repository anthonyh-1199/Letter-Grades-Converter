/*
 */
package gradecounter;

import static java.lang.Integer.parseInt;
import java.util.*;

public class Gradecounter{
    
    //Returns true if string can be converted into an number
    public static boolean isNumeric(String strNum) {
        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException n) {
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        //DECLARATIONS
        String gradeInput;
        int gradeConvert;
        ArrayList<Integer> gradeList = new ArrayList<>();

        Scanner console = new Scanner(System.in);
        System.out.println("Please list the grades you wish to convert: ");
        gradeInput = console.nextLine();

        //Putting the input into the array
        while (isNumeric(gradeInput)){ //Exit loop when NaN
            gradeConvert = parseInt(gradeInput);
           
            gradeList.add(gradeConvert);
            
            gradeInput = console.next();
        }
        
        //Output
        
        System.out.println();
        
        for (Integer i : gradeList){
            System.out.print(i);
            
            if (i >= 90){
                System.out.println(" is an A"); 
            }

            else if (i >= 80){
                System.out.println(" is a B");
            }

            else if (i >= 70){
                System.out.println(" is a C");
            }

            else if (i >= 60){
                System.out.println(" is a D");
            }

            else{
                System.out.println(" is an F");
            }
        }
    }
}