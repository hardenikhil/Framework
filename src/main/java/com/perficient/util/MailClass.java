package com.perficient.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class MailClass {
	public  MailClass(String fromMail, String tomail,Exception e) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("priyaktest1@gmail.com", "search123");
			}
		});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromMail));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(tomail));
			message.setSubject("Script failed");
			message.setText("your test has failed for script name:Name of your scipt <============================>"
					+ ExceptionUtils.getStackTrace(e));
			Transport.send(message);
			System.out.println("Done");
		} catch (MessagingException ex) {
			throw new RuntimeException(ex);
		}
		
	}
//	public MailClass(PageManager pm){
//		super(pm);
//	} 
		
	
//	public void open() {
//		/*
//		 * read the url from property file
//		 */
//		//Properties PROPERTIES_RESOURCES = SystemUtil.loadPropertiesResources("/testdata_insite.properties");
//		//String URL = PROPERTIES_RESOURCES.getProperty("insite.url");
//		pageManager.navigate("www.gmail.com");
//	}
	public static void main (String args[]){
		try{
			
		}
		catch (Exception e) {
			MailClass mail = new MailClass("priyaktest@gmail.com","priyaktest@gmail.com",e);
		}
		
		
	}
}
