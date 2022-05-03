package excelProject;



import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.analysis.function.Add;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ReadInvoices {
	
	
	
	public static  String NAME ="C:/Users/drino/Downloads/fletparaqitjet.xlsx";
	
	
	
	public static void main(String[] args) {
		
		Provimi p = new Provimi();
	
		 
		ArrayList<Provimi> pr=new ArrayList<Provimi>();
		ArrayList<Provimi> pr1=new ArrayList<Provimi>();

	try {int i=0;
			
			FileInputStream file = new FileInputStream(new File(NAME));
			Workbook workbook = new XSSFWorkbook(file);
			DataFormatter dataFormatter = new DataFormatter();
			Iterator<Sheet> sheets = workbook.sheetIterator();
			while(sheets.hasNext()) {
				Sheet sh = sheets.next();
				//System.out.println("Sheet name is "+sh.getSheetName());
				//System.out.println("---------");
				Iterator<Row> iterator = sh.iterator();
				while(iterator.hasNext()) {
					Row row = iterator.next();
					Iterator<Cell> cellIterator = row.iterator();
					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						cell.toString();
						String cellValue = dataFormatter.formatCellValue(cell);
						if(cell.getCellType() == CellType.STRING) {
							if(cell.getColumnIndex()==0)
							{
							 p.setAfati(cell.getStringCellValue());
							
							}
							else if(cell.getColumnIndex()==3)
							{
							 p.setName(cell.getStringCellValue());
							
							}
							else if(cell.getColumnIndex()==4)
							{
							 p.setAge(cell.getStringCellValue());
							 pr.add(new Provimi(p.getAfati(),p.getName(),p.getAge()) );
							 
							}


						}
						 else if (cell.getCellType() == CellType.NUMERIC) {
							
							 p.setNum((int) cell.getNumericCellValue());
							 pr1.add(new Provimi(p.getNum()));
							

						}
						

					//	System.out.print(cellValue+"\t");
						
					}
					//System.out.println();
					
				}
			}
			//System.out.println(pr.get(2).getName());
			
			


			workbook.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
	}
	public static ArrayList<Provimi> excel(){
		Provimi p = new Provimi();
		
		ArrayList<Provimi> pr=new ArrayList<Provimi>();
		ArrayList<Provimi> pr1=new ArrayList<Provimi>();

	try {int i=0;
			
			FileInputStream file = new FileInputStream(new File(NAME));
			Workbook workbook = new XSSFWorkbook(file);
			DataFormatter dataFormatter = new DataFormatter();
			Iterator<Sheet> sheets = workbook.sheetIterator();
			while(sheets.hasNext()) {
				Sheet sh = sheets.next();
				//System.out.println("Sheet name is "+sh.getSheetName());
				//System.out.println("---------");
				Iterator<Row> iterator = sh.iterator();
				while(iterator.hasNext()) {
					Row row = iterator.next();
					Iterator<Cell> cellIterator = row.iterator();
					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						cell.toString();
						String cellValue = dataFormatter.formatCellValue(cell);
						if(cell.getCellType() == CellType.STRING) {
							if(cell.getColumnIndex()==0)
							{
							 p.setAfati(cell.getStringCellValue());
							
							}
							
							else if(cell.getColumnIndex()==3)
							{
							 p.setName(cell.getStringCellValue());
							
							}
							else if(cell.getColumnIndex()==4)
							{
							 p.setAge(cell.getStringCellValue());
							 pr.add(new Provimi(p.getAfati(),p.getName(),p.getAge()) );
							 
							}


						}
						 else if (cell.getCellType() == CellType.NUMERIC) {
							
							 p.setNum((int) cell.getNumericCellValue());
							 pr1.add(new Provimi(p.getNum()));
							

						}
						

					//	System.out.print(cellValue+"\t");
						
					}
					//System.out.println();
					
				}
			}
			//System.out.println(pr.get(2).getName());
		

			


			workbook.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return pr;}
	public static ArrayList<Provimi> excelprim(){
		Provimi p = new Provimi();
		
		ArrayList<Provimi> pr=new ArrayList<Provimi>();
		ArrayList<Provimi> pr1=new ArrayList<Provimi>();

	try {int i=0;
			
			FileInputStream file = new FileInputStream(new File(NAME));
			Workbook workbook = new XSSFWorkbook(file);
			DataFormatter dataFormatter = new DataFormatter();
			Iterator<Sheet> sheets = workbook.sheetIterator();
			while(sheets.hasNext()) {
				Sheet sh = sheets.next();
				//System.out.println("Sheet name is "+sh.getSheetName());
				//System.out.println("---------");
				Iterator<Row> iterator = sh.iterator();
				while(iterator.hasNext()) {
					Row row = iterator.next();
					Iterator<Cell> cellIterator = row.iterator();
					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						cell.toString();
						String cellValue = dataFormatter.formatCellValue(cell);
						if(cell.getCellType() == CellType.STRING) {
							if(cell.getColumnIndex()==3)
							{
							 p.setName(cell.getStringCellValue());
							
							}
							else if(cell.getColumnIndex()==4)
							{
							 p.setAge(cell.getStringCellValue());
							 pr.add(new Provimi(p.getName(),p.getAge()) );
							 
							}


						}
						 else if (cell.getCellType() == CellType.NUMERIC) {
							 if(cell.getColumnIndex()==5) {
							 p.setNum((int) cell.getNumericCellValue());
							 }else if(cell.getColumnIndex()==6) {
								 p.setId((int)cell.getNumericCellValue());
							 }else if(cell.getColumnIndex()==7) {
								 p.setSemestri((int)cell.getNumericCellValue());
							 pr1.add(new Provimi(p.getNum(),p.getId(),p.getSemestri()));
							 }

						}
						

					//	System.out.print(cellValue+"\t");
						
					}
					
					
				}
			}
			//System.out.println(pr.get(2).getName());
			
			


			workbook.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return pr1;
		
	}
}

