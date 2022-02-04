import java.io.*;
import java.net.InetAddress;
import java.util.Properties;
import java.util.Date;
import javax.mail.*;
import javax.mail.internet.*;

public class JavaMail
{

public Session cerateSession(){
	Properties p=System.getProperties();
	p.setProperty("mail.transport.protocol","smtp");
	p.setProperty("mail.smtp.host","andrew.cmu.edu");
	
	Session sess=Session.getDefaultInstance(p);
	return sess;

}

public Message createMessage(Session sess) throws MessagingException{
	Message mess=new MimeMessage(sess);
	mess.setFrom(new InternetAddress("basnetbinod777@gmail.com"));
	mess.setRecipients(Message.RecieptType.TO,InternetAddress.parse("yo@gmail.com",false));
	mess.setSubject("Test");
	mess.setText("test");
	mess.setSentDate(new Date());
	return mess;
}


public static void main(String args[]){
	
	MessageSend send=new MessageSend();
	Session sess=send.createSession();
	try{
		MessageSend mess=send.createMessage(sess);
		Transport.send(mess);
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}