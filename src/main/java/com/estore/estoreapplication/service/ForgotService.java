package com.estore.estoreapplication.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;
@Service
public class ForgotService {
	@Autowired
	private JavaMailSender JavaMailSender;
	public String generateOtp() {
		Random random = new Random();
		int otplength = 6;
		StringBuilder otp = new StringBuilder();
		for(int i=0;i<otplength;i++) {
			otp.append(random.nextInt(10)); 		
		}
		System.out.println(otp);
		return otp.toString();
	}
	public String sendOtp(String Email,String otp) throws Exception{
		MimeMessage mimeMessage = JavaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
		helper.setTo(Email);
		helper.setSubject("Forgot paswword otp");
		helper.setText("your otp is"+otp);
		JavaMailSender.send(mimeMessage);
		System.out.println(otp);
		return "Message is send";
	}
}
