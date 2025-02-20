// Purpose: Get input from user.
package View;

import java.util.Scanner;
import Models.Student;
/**
 *
 * @author ACER
 */
public class Input {
    
    private static final Scanner scanner = new Scanner(System.in);   

    
    public void getRegister(Student student){
        student.setStudentID(scanner.nextLine());
        student.setName(scanner.nextLine());
        student.setPhoneNumber(scanner.nextLine());
        student.setEmail(scanner.nextLine());
       
    }
    public void printCampus(){
       System.out.println("1. SE");
       System.out.println("2. HE");
       System.out.println("3. DE");
       System.out.println("4. QE");
       System.out.println("5. CE"); 
    }



    // public void selectCampus(){
    //     int choice;
    //     do {
    //         try {
    //             switch (choice) {
    //                 case 1:
                        
    //                     break;
                
    //                 default:
    //                     break;
    //             }
    //         } catch (Exception e) {
    //             // TODO: handle exception
    //         }
    //     } while (condition);
    // }


}
