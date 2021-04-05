package com.sr.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String rawPassword="123456";
		String encodedPassword=encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);

	}
	//$2a$10$QdEToMRvgc9GtuJ/ZBtm2.XJjXaDBLJgqIoIPq8wnhMddAJlDjO9u
	//$2a$10$FJwvZdgXyUUfuk/VxvM9VO5jhPg/AuAHZIVZM9xBOwk1WyEr2EtZ6
	//$2a$10$tsOf3QiMJrkaACAW2HTFFe.Xp1KGMkMW/4FiL.1UIQzBigx.sYUJe

}
