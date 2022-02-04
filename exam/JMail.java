import javax.mail.*;
import javax.activation.*;
import javax.mail.internet.*;
import java.util.*;

public class JMail
{
	public static void main(String args[])
	{
		try{
		String from="enagariksewa@gmail.com";
		String password="Enagarik@123";
		InternetAddress to=new InternetAddress("bishalkan6a@gmail.com");
		Properties prop=new Properties();
		prop.put("mail.smtp.auth",true);
		prop.put("mail.smtp.starttls.enable",true);
		prop.put("mail.smtp.host","smtp.gmail.com");
		prop.put("mail.smtp.port",587);
		Session session =Session.getDefaultInstance(prop,new Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(from,password);
			}
		});
		
		MimeMessage msg=new MimeMessage(session);
		msg.setFrom(new InternetAddress(from));
		msg.addRecipient(Message.RecipientType.TO,to);
		msg.setSubject("Hello");
		msg.setText("Fromo java");
		Transport.send(msg);
		System.out.println("Message sent sucess");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}