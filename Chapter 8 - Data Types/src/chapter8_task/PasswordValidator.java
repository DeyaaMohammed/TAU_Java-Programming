package chapter8_task;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        System.out.println("Enter your username:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        UserAccount userAccount = new UserAccount(userName, "");

        printPasswordRules();
        System.out.println("Enter your password:");
        userAccount.changePassword();

        System.out.println("Do you want to change your password? Y/N");
        char choice = scanner.next().charAt(0);
        switch (choice){
            case 'y':
            case 'Y':
                System.out.println("Enter your new password:");
                userAccount.changePassword();
                break;
            case 'n':
            case 'N':
                System.out.println("Your password stays the same");
                break;
            default:
                System.out.println("Invalid Input!");
        }

    }

    public static void printPasswordRules(){
        System.out.println("Your password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

}
