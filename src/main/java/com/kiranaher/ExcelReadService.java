package com.kiranaher;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcelReadService {

	@Autowired
	AllergyRepository repo;
	
	public List<Allergy> ReadDataFromExcel(String excelPath) 
			throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		//FileInputStream fis=
		//	new FileInputStream(new File("C:\\Users\\KiranA3\\Desktop\\AllergyDatabase.xlsx"));  
		
		XSSFWorkbook wb = new XSSFWorkbook(new File("C:\\Users\\\\KiranA3\\\\Desktop\\\\AllergyDatabase.xlsx"));
		
		//HSSFWorkbook wb = new HSSFWorkbook(fis); 
		
		XSSFSheet sheet1 = wb.getSheetAt(0);  
		
		//Workbook workbook = WorkbookFactory.create(new File(excelPath));
		
		// Retrieving the number of sheets in the Workbook
        
		System.out.println("Workbook has " + wb.getNumberOfSheets() + " Sheets : ");
        
		System.out.println("Retrieving Sheets using for-each loop");
        
        for(Sheet sheet: wb) {
            
        	System.out.println("=> " + sheet.getSheetName());
            
            //DataFormatter dataFormatter = new DataFormatter();
            
            for (Row row: sheet) {
            	
    			
            	
            	String id              = 	row.getCell(0).getStringCellValue();
            	String name            =  	row.getCell(1).getStringCellValue();
            	String type            = 	row.getCell(2).getStringCellValue();
            	String source          =  	row.getCell(3).getStringCellValue();
            	String isoform         =  	row.getCell(4).getStringCellValue();
            	String allerginicity  =  	row.getCell(5).getStringCellValue();
            	
            
            	
            	  
            	Allergy allergy = new Allergy();
            	allergy.setAllergy_id(id);
            	allergy.setName(name);
            	allergy.setType(type);
            	allergy.setSource(source);
            	allergy.setIsoform(isoform);
            	allergy.setAllerginicity(allerginicity);
            	
            	repo.save(allergy);
            	
                System.out.println(row.getCell(0));
                System.out.println(row.getCell(1));
                System.out.println(row.getCell(2));
                System.out.println(row.getCell(3));
                System.out.println(row.getCell(4));
                System.out.println(row.getCell(5));
              
            }
            
        }
		
        
        
		return null;
	}
}
