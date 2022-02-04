import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.util.*;

public class SendMessage
{
	public static void main(String args[]) throws Exception
	{
		String from ="enagariksewa@gmail.com";
	String password="Enagarik@123";
	InternetAddress to=new InternetAddress("bishalkan6a@gmail.com");
	Properties properties=new Properties();
	properties.put("mail.smtp.auth",true);
	properties.put("mail.smtp.starttls.enable",true);
	properties.put("mail.smtp.host","smtp.gmail.com");
	properties.put("mail.smtp.port","587");
	
	System.out.println("Msg Sending");
	Session session=Session.getDefaultInstance(properties,new Authenticator(){
		protected PasswordAuthentication getPasswordAuthentication() {  
		return new PasswordAuthentication(from,password);  
		}
	});
	
	MimeMessage msg=new MimeMessage(session);
	msg.setFrom(new InternetAddress(from));
	msg.addRecipient(Message.RecipientType.TO,to);
	msg.setSubject("Haw kura");
	msg.setText("Hawai ta ho ni ");
	Transport.send(msg);
	
	System.out.println("Msg Sent");
	}
}