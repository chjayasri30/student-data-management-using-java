import java.util.ArrayList;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> rollList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> branchList = new ArrayList<>();
        ArrayList<String> phoneNoList = new ArrayList<>();
        while (true) {
            int choice;
            System.out.println("Student Data Managemenet System");
            System.out.println("1. Add Student details");
            System.out.println("2. View Student details");
            System.out.println("3. Remove Student details");
            System.out.println("4. Exit");
            System.out.println("Enter your choice!");

            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("You Entered a Choice to Add data");
                System.out.println("Enter rollnumber");
                int roll = sc.nextInt();
                rollList.add(roll);
                sc.nextLine();
                System.out.println("Enter Name");
                String name = sc.nextLine();
                nameList.add(name);
                System.out.println("Enter Branch");
                String branch = sc.nextLine();
                branchList.add(branch);
                System.out.println("Enter Phoneno.");
                String phone = sc.nextLine();
                phoneNoList.add(phone);  
                //sc.nextLine();      
                System.out.println("\nPerfect! Student details were added");
                break;
            case 2:
                if(rollList.isEmpty()){
                System.out.println("Sorry! No student data is found");
                }
                else{
                System.out.println("Sno. rollNumber Name   Branch PhoneNo");
                for(int i = 0; i < rollList.size(); i++){
                    System.out.print("\n "+(i+1));
                    System.out.print(" "+rollList.get(i));
                    System.out.print(" "+nameList.get(i));
                    System.out.print(" "+branchList.get(i));
                    System.out.print(" "+phoneNoList.get(i));
                    System.out.println("\n");
                }
                }
                break;
            case 3:
                System.out.println("Enter Rollno to delete");
                int delroll = sc.nextInt();
                int index = rollList.indexOf(delroll);
                if(index != -1) {
                rollList.remove(index);
                nameList.remove(index);
                branchList.remove(index);
                phoneNoList.remove(index);
                System.out.println("Student details removed.");
                } else {
                System.out.println("Roll number not found.");
                }
                break;
            case 4:
                System.out.println("Exiting...");
                sc.close();
                System.out.println("Thanks for your co-operation!!");
                return;
            default:
                System.out.println("Sorry you Entered a Wrong option");
                break;
            }
        }
        
    }
}