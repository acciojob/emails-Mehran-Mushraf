package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(this.getPassword() != oldPassword) return;
        if(newPassword.length() < 8) return;

        if (true) {
            int count = 0;

            // checking capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char)i;

                String str1 = Character.toString(c);
                if (newPassword.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return;
            }
        }

        if (true) {
            int count = 0;

            // checking small letters
            for (int i = 97; i <= 122; i++) {

                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);

                if (newPassword.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return;
            }
        }


        if(true){
            int count = 0;

        // checking for digits
            for(int i=0;i<=9;i++)
            {
                String str = Integer.toString(i);
                if(newPassword.contains(str))
                {
                    count++;
                }
            }
            if(count == 0)
            {
                return;
            }
        }

//        chicking for special characters

        if (!(newPassword.contains("@") || newPassword.contains("#")
                || newPassword.contains("!") || newPassword.contains("~")
                || newPassword.contains("$") || newPassword.contains("%")
                || newPassword.contains("^") || newPassword.contains("&")
                || newPassword.contains("*") || newPassword.contains("(")
                || newPassword.contains(")") || newPassword.contains("-")
                || newPassword.contains("+") || newPassword.contains("/")
                || newPassword.contains(":") || newPassword.contains(".")
                || newPassword.contains(", ") ||newPassword.contains("<")
                || newPassword.contains(">") || newPassword.contains("?")
                || newPassword.contains("|"))) {
            return;
        }

        this.setPassword(newPassword);
        return;
    }
}
