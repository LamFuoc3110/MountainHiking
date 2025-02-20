
package View;

import java.util.*;
import Controller.StudentList;
/**
 *
 * @author ACER
 */
public class MenuView {
    private static final Scanner scanner = new Scanner(System.in);
    private final StudentList studentList;

    public MenuView(StudentList studentList) {
        this.studentList = studentList;
    }
    public  void printMenu() {
        System.out.println("\n====================== MENU ======================");
        System.out.println("1. New Registration");
        System.out.println("2. Update Registration Information");
        System.out.println("3. Display Registered List");
        System.out.println("4. Delete Registration Information");
        System.out.println("5. Search Participants by Name");
        System.out.println("6. Filter Data by Campus");
        System.out.println("7. Statistics of Registration Numbers by Location");
        System.out.println("8. Save Data to File");
        System.out.println("9. Exit the Program");
    }
    
    public int getUserChoice(){
       
        try{
           return Integer.parseInt(scanner.nextLine().trim());
       } catch (NumberFormatException e){
           return -1;
        }
    }
    public void userChoice(){
        int choice;
        do{
            printMenu();
            System.out.println("Enter your Choice: ");
            choice = getUserChoice();
            try{
            switch (choice) {
                case 1:
                    studentList.registerStudent();
                    break;
                case 2:
                    studentList.updateStudent();
                    break;
                case 3:
                    studentList.displayAll();
                    break;
                case 4:
                    studentList.deleteReg();
                    break;    
                case 5:
                    studentList.searchStudent();
                    break;    
                case 6:
                    studentList.FilterByCampus();
                    break;    
                case 7:
                    studentList.statisticsRegistration();
                    break;    
                case 8:
                    studentList.saveToFile();
                    break;    
                case 9:
                    studentList.exitProgram();
                    break;    
                
                default:
                    System.out.println("Please try from 1 to 9 !!!");
                }
            
            }catch(Exception e){
                System.out.println("Error" + e.getMessage());
            }
        
        
        }while(choice >= 1 && choice <= 9);
        
        
    }
    
}
    
