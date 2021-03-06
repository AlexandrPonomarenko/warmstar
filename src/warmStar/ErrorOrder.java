package warmStar;

import java.util.HashMap;

public class ErrorOrder {
    private HashMap<String,String> error;
    private boolean validate;
    private String type ="";

    public ErrorOrder() {
        error = new HashMap();
        validate = true;
    }

    public void checkFild(String fild, String type){
        if((fild != null) && fild.isEmpty()){
            error.put(type, "The field can not be empty");
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
