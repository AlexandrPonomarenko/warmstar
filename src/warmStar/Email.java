package warmStar;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Email {
    private String subject;
    private String textMessage;
    private final String WARMSTAREMAIL = "mainwarmstar@gmail.com";
    private final String WARMSTARPASSWORD = "warmStar1992";
    private String receiverName;
    private String receiverEmail;
    private String city;
    private String address;
    private int price;
    private String type;
    private String help;
    private Properties properties;
    private Session session;
    private Message message;


    public Email(String receiverName, String receiverEmail, String city, String address, int price, String type){
        this.receiverName = receiverName;
        this.receiverEmail = receiverEmail;
        this.city = city;
        this.address = address;
        this.price = price;
        this.type = type;
        setTextMessage();
        setType(this.type);
        setSubject();
        setProperties();
    }

    public Email(String receiverName, String receiverEmail, String textMessage, String help){
        subject = "teamWarmStar";
        this.help = help;
        this.receiverName = receiverName;
        this.receiverEmail = receiverEmail;
        this.textMessage = textMessage;
        setProperties();
    }

    private void setTextMessage(){
        textMessage = "Hello dear " + receiverName + " Thank you for purchasing in our network of WarmStar salons. " +
                "Within 10 minutes our team will contact you to clarify the details of the purchases. To the address specified by you " + city + " " + address + " выедет наша "  +
                "a team of specialists will deliver you a purchase and arrange the details." +
                "On all questions you can contact us at furriets@gmail.com or come to our salon at" +
                " c. Kharkov pr. Saturn's Belt st. Quiet Harbor. Amount to be paid " + price +" Have a nice day.";
    }

    private void setSubject(){
        subject = type;
    }

    private void setType(String type){
        if(type.equals("car")){
            this.type = "Congratulations you have purchased a car";
        }else if (type.equals("bike")){
            this.type = "Congratulations you have purchased a bike";
        }else if(type.equals("all")){
            this.type = "Congratulations you have purchased the equipment";
        }
    }

    private void setProperties(){
        this.properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
    }

    private Properties getProperties(){
        return properties;
    }

    private Session getSession(String email, String password) {
        session = Session.getInstance(getProperties(),new javax.mail.Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, password);
            }
        });
        return session;
    }

    public void sendEmail(){
        message = new MimeMessage(getSession(WARMSTAREMAIL, WARMSTARPASSWORD));
        try {
            if(help == null) {
                message.setFrom(new InternetAddress(WARMSTAREMAIL));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(receiverEmail));
                message.setSubject(subject);
                message.setText(textMessage);

                Transport.send(message);
            }else{
                message.setFrom(new InternetAddress(WARMSTAREMAIL));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress("furriets@gmail.com"));
                message.setSubject(subject);
                message.setText(textMessage + " От " + receiverName + " " + receiverEmail);

                Transport.send(message);
            }
            System.out.println("Acces send mail");
        }catch(MessagingException m){
            System.out.println("no send message");
            m.printStackTrace();
        }
    }
}
