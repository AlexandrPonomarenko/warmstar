package warmStar;

import java.util.HashMap;

public class ErrorLogIn {
    private HashMap<String,String> error;
    private boolean validate;
    private String password;

    public ErrorLogIn(){
        error = new HashMap();
        validate = true;
    }

    public void checkNickName(String nickName){
        if((nickName != null) && nickName.isEmpty()){
            error.put("login", "Please enter a valid login");
            validate = false;
        }
    }

    public void checkFirstName(String firstName){
        if((firstName != null) && firstName.isEmpty()){
            error.put("FName", "Please enter a valid first name");
            validate = false;
        }
    }

    public void checkLastName(String lastName){
        if((lastName != null) && lastName.isEmpty()){
            error.put("LName", "Please enter a valid last name");
            validate = false;
        }
    }

    public void checkEmail(String email){
        if((email != null) && email.isEmpty()){
            error.put("email", "Please enter a valid email");
            validate = false;
        }
    }

    public void checkPhoneNumber(String phoneNumber){
        if((phoneNumber != null) && phoneNumber.isEmpty()){
            error.put("PNumber", "Please enter a valid phone number");
            validate = false;
        }
    }

    public void checkAge(String age){
        if((age != null) && age.isEmpty()){
            error.put("age", "Please enter a valid age");
            validate = false;
        }
    }

    public void checkPasswordOne(String password){
        if((password != null) && password.isEmpty()){
            error.put("password", "Please enter a valid password");
            validate = false;
        }else{
            this.password = password;
        }
    }

    public void checkPasswordTwo(String password){
        if(checkPasswords(password)){
            if((password != null) && password.isEmpty()){
                error.put("password2", "Please enter a valid password");
                validate = false;
            }
        }
    }
    public boolean getValidate(){
        return validate;
    }

    public String getErrorMessage(String key){
        String errorMessage = error.get(key.trim());
        return (errorMessage == null)? "null" : errorMessage;
    }

    private boolean checkPasswords(String password){
        if((this.password != null) && this.password.equals(password)){
            return true;
        }
        return false;
    }
}
