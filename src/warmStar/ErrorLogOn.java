package warmStar;

import java.util.HashMap;

public class ErrorLogOn {

    private HashMap<String,String> error;
    private boolean validate;

    public ErrorLogOn() {
        error = new HashMap();
        validate = true;
    }

    public void checkNickName(String nickName){
        if((nickName != null) && nickName.isEmpty()){
            error.put("login", "Please enter a valid login");
            validate = false;
        }
    }

    public void checkPassword(String password){
        if((password != null) && password.isEmpty()){
            error.put("password", "Please enter a valid password");
            validate = false;
        }
    }

    public boolean getValidate(){
        return validate;
    }

    public HashMap<String, String> getMapError(){
        return error;
    }
}
