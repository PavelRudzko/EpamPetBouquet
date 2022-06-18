package FlowersShop.src.main.java;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class ExcelReader {
    public ArrayList<PriceElement> readExcel() throws IOException {
        ArrayList<PriceElement> result = new ArrayList<>();
        XSSFWorkbook excelWorkbook = new XSSFWorkbook(new FileInputStream("C:\\Users\\Xiaomi\\IdeaProjects\\PetBouquet\\src\\букет.xlsx"));
        int numberOfSheets = excelWorkbook.getNumberOfSheets();

        XSSFSheet sheet = excelWorkbook.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();
        for (int j = 1; j < rowCount; j++) {
            XSSFRow row = sheet.getRow(j);
            int cellCount = row.getPhysicalNumberOfCells();
            PriceElement element = new PriceElement();
            element.sort = row.getCell(0).toString();
            element.size = (int)row.getCell(1).getNumericCellValue();
            element.price = row.getCell(3).getNumericCellValue();
            element.condition = (int)row.getCell(4).getNumericCellValue();
            element.color = row.getCell(2).toString();
            element.country = row.getCell(5) == null? "" : row.getCell(5).toString();

            result.add(element);
        }

        return result;
    }
}
