package warmStar;

import java.util.HashMap;

public class ErrorOrder {
    private HashMap<String,String> error;
    private boolean validate;

    public ErrorOrder() {
        error = new HashMap();
        validate = true;
    }

    public void checkFild(String fild){
        if((fild != null) && fild.isEmpty()){
            error.put("city", "The field can not be empty");
            validate = false;
        }
    }

//    public void checkPassword(String password){
//        if((password != null) && password.isEmpty()){
//            error.put("address", "The field can not be empty");
//            validate = false;
//        }
//    }

    public boolean getValidate(){
        return validate;
    }

    public HashMap<String, String> getMapError(){
        return error;
    }
}
