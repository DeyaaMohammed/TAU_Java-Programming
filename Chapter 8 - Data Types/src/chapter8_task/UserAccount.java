package chapter8_task;

import java.util.Scanner;

public class UserAccount {
    private String userName;

    private String currentPassword;

    public UserAccount(String userName, String currentPassword){
        this.userName = userName;
        this.currentPassword = currentPassword;
    }

    public void changePassword(){
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        String porposedPassword = "";

        while (!valid){
            String errorMessage = "";
            porposedPassword = scanner.nextLine();

            if(porposedPassword.length() < 8){
                errorMessage += "\n Your password must be at least 8 characters.";
            }

            if(porposedPassword.equals(porposedPassword.toLowerCase())){
                errorMessage += "\n Your password must include an uppercase letter.";
            }

            if(porposedPassword.matches("[a-zA-Z0-9 ]*")){
                errorMessage += "\n Your password must include a special character (e.g. %,$[:).";
            }

            if(porposedPassword.toUpperCase().contains(userName.toUpperCase())){
                errorMessage += "\n Your password cannot contain your username.";
            }

            if(porposedPassword.equals(currentPassword)){
                errorMessage += "\n Your password must be different from your current password.";
            }

            if(errorMessage.equals("")){
                valid = true;
            }
            else{
                System.out.println(errorMessage);
                errorMessage = "";
            }
        }

        currentPassword = porposedPassword;
    }
}
