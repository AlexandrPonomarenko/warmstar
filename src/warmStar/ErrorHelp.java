package warmStar;

import java.util.HashMap;

public class ErrorHelp {
    private HashMap<String,String> error;
    private boolean validate;
    private String type = "";

    public ErrorHelp() {
        error = new HashMap();
        validate = true;
    }

    public void checkFild(String fild, String type){
        if((fild != null) && fild.isEmpty()){
            error.put(type, "The field can not be empty");
            validate = false;
        }
    }

    public void checkTextFild(String fild, String type){
        if((fild != null) && fild.isEmpty()){
            error.put(type, "The field can not be empty");
            validate = false;
        }else if((fild != null) && fild.length() < 20){
            error.put(type, "Your message must contain at least 20 characters.");
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
