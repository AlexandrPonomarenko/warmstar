package warmStar;

import java.sql.Date;

public class User {
    private int id;
    private String nickName;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNamber;
    private int age;
    private Date data;
    private String password;
    private String passwordTwo;

    public User(){

    }
    public User(int id, String nickName, String firstName, String lastName, String email, String phoneNamber, int age, Date data, String password, String passwordTwo){
        this.id = id;
        this.nickName = nickName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNamber = phoneNamber;
        this.age = age;
        this.data = data;
        this.password = password;
        this.passwordTwo = passwordTwo;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNamber(String phoneNamber) {
        this.phoneNamber = phoneNamber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordTwo(String passwordTwo) {
        this.passwordTwo = passwordTwo;
    }

    public int getId(){
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNamber() {
        return phoneNamber;
    }

    public int getAge() {
        return age;
    }

    public Date getData() {
        return data;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordTwo() {
        return passwordTwo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickName=" + nickName + ", firstName=" + firstName + ", lastName=" + lastName +
                ", email=" + email + ",phoneNamber=" + phoneNamber + ", age=" + age + ", data=" + data + "}";
    }
}
