package com.example;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class PasswordEncryptionAndDecryption {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Password : ");
		String yourPassword = scan.next();

		Encoder encoder = Base64.getEncoder();
		String encodedPasword = encoder.encodeToString(yourPassword.getBytes());

		System.out.println("Your Enocoded Password is : " + encodedPasword);

		Decoder decoder = Base64.getDecoder();
		byte[] bytes = decoder.decode(encodedPasword);

		System.out.println("Your Decoded Password is : " + new String(bytes));

	}

}
