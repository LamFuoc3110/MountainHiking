// Purpose: Get input from user.
package View;
import Utils.Acceptable;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import Models.Student;
/**
 *
 * @author ACER
 */
public class Input {
    
    private static final Scanner scanner = new Scanner(System.in);   
    
    public static boolean isValid(String input, String regex) {
        return input.matches(regex);
    }
    
    // public void getRegister(Student student){
    //     student.setStudentID(scanner.nextLine());
    //     student.setName(scanner.nextLine());
    //     student.setPhoneNumber(scanner.nextLine());
    //     student.setEmail(scanner.nextLine());
       
    // }
    public static String getStuName(){
        String name = "";
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        while(true){
            if(isValid(name, Acceptable.NAME_VALID)){
                break;
            }else{
                System.out.println("Invalid name. Please enter again: ");
            }
        }
        return name;
    }
    public static String getStuID(){
        String iD = "";
        System.out.println("Enter name: ");
        iD = scanner.nextLine();
        while(true){
            if(isValid(iD, Acceptable.STUDENT_ID)){
                break;
            }else{
                System.out.println("Invalid student ID. Please enter again: ");
            }
        }
        return iD;
    }
    
    public static String getStuPhone(){
        String phone = "";
        System.out.println("Enter phone number: ");
        phone = scanner.nextLine();
        while(true){
            if(isValid(phone, Acceptable.PHONE_VALID)){
            break;
            }else{
            System.out.println("Invalid phone number. Please enter again: ");
            }
        }
        return phone;
        }
        
        
    public static String getStuEmail(){
        String email = "";
        System.out.println("Enter email: ");
        email = scanner.nextLine();
        while(true){
            if(isValid(email, Acceptable.EMAIL_VALID)){
                break;
                }else{
                System.out.println("Invalid email. Please enter again: ");
                }
            }
        return email;
        }
    // filter by campus: SE, HE, DE, QE, CE
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
