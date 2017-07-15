import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendMail {
public static void main(String[] args) {
final String username = "knavin12@gmail.com";
final String password = "password";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "true");
props.put("mail.smtp.host", "smtp.gmail.com");
props.put("mail.smtp.port", "587");
Prepared by: Navin Sharma 18 Unit-5: Network Programming
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("knavin12@gmail.com"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse("knavin12@gmail.com"));
message.setSubject("Testing Subject");
message.setText("Hello Navin,"
+ "\n\n Congrates u succeded sending mail\n through Java.mail API.");
Transport.send(message);
System.out.println("Your email has been sent successfully");
} catch (MessagingException e) {
throw new RuntimeException(e);
}
}
}