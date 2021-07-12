package com.kiranaher;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class MyController {
	
	@Autowired
	ExcelReadService service ;
	
	@RequestMapping("/hello")
	public Sample hello() {
		System.out.println("Running OK.");
		return new Sample(101, "Kiran");
	}
	
	@PostMapping(path = "/insert",consumes = "application/json")
	public Sample insert(@ModelAttribute Sample sample) {
		
		String path = "C:\\Users\\KiranA3\\Desktop\\AllergyDatabase.xlsx";
		//String path = "C://Users//KiranA3//Desktop//AllergyDatabase.xlsx";
			try {
				service.ReadDataFromExcel(path);
			} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			
				e.printStackTrace();
			}
			
			return sample;
			
		
	}
}
