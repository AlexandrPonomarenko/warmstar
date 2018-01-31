package warmStar;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Email {
    private String subject;
    private String textMessage;
    private final String WARMSTAREMAIL = "furriets@gmail.com";
    private final String WARMSTARPASSWORD = "199223ATDHFKZ";
    private String receiverName;
    private String receiverEmail;
    private String city;
    private String address;
    private int price;
    private String type;
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

    private void setTextMessage(){
        textMessage = "Здравствуйте Уважаемый " + receiverName + " спасибо за покупку в нашей сети салонов WarmStar. " +
                "В течении 10 минут с Вами свяжется наша команда, для уточнения деталей покупок. По указанному Вами адресу " + city + " " + address + " выедет наша "  +
                "команда специалистов доставит Вам покупку и оформит детали." +
                "По всем вопросам вы можите обращатся на нашу почту furriets@gmail.com или приехать к нам в салон по адресу" +
                " г. Харьков пр. Ленина 54 Б. Сумма к оплате " + price +" Хорошего вам дня.";
    }

    private void setSubject(){
        subject = type;
    }

    private void setType(String type){
        if(type.equals("car")){
            this.type = "Поздравляем Вы приобрели автомобиль";
        }else{
            this.type = "Поздравляем Вы приобрели велосипед";
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

    private Session getSession(){
        session = Session.getInstance(getProperties(),new javax.mail.Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(WARMSTAREMAIL, WARMSTARPASSWORD);
            }
        });
        return session;
    }

    public void sendEmail(){
        message = new MimeMessage(getSession());
        try {
                message.setFrom(new InternetAddress(WARMSTAREMAIL));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(receiverEmail));
                message.setSubject(subject);
                message.setText(textMessage);

                Transport.send(message);
            System.out.println("Acces");
        }catch(MessagingException m){
            System.out.println("no send message");
            m.printStackTrace();
        }
    }

}
