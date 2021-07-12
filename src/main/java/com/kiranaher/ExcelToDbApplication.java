package com.kiranaher;

//import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ExcelToDbApplication //implements CommandLineRunner

{

	//@Autowired
	//static ExcelReadService service ;
	
	public static void main(String[] args) {
		SpringApplication.run(ExcelToDbApplication.class, args);
		
		
	}
	
	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * String path =args[0]; System.out.println("application start");
	 * service.ReadDataFromExcel(path); System.out.println("application end"); }
	 */

}
