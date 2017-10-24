package Relatorio;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author JOÃO PAULO CORDEIRO
 */
public class GerarRelatorioVenda {
   

    public static void main(String[] args) {
           // criação do documento
          Document document = new Document();
                 
          try {
             
              PdfWriter.getInstance(document, new FileOutputStream("D:\\PDF_DevMedia7.pdf"));
              document.open();
             
              // adicionando um parágrafo no documento
              Paragraph p = new Paragraph("Comprovante não fiscal");
              p.setAlignment(1);
              document.add(p);
              p = new Paragraph("     ");
              document.add(p);
              
             
              PdfPTable table = new PdfPTable(3);
              
              PdfPCell cel1= new PdfPCell(new Paragraph("RG"));
              PdfPCell cel2= new PdfPCell(new Paragraph("Nome"));
              PdfPCell cel3= new PdfPCell(new Paragraph("Sexo"));
              
              table.addCell(cel1);
              table.addCell(cel2);
              table.addCell(cel3);
              
              cel1= new PdfPCell(new Paragraph("9.420.249-3"));
              cel2= new PdfPCell(new Paragraph("João Paulo Cordeiro"));
              cel3= new PdfPCell(new Paragraph("Masculino"));
              
              table.addCell(cel1);
              table.addCell(cel2);
              table.addCell(cel3);
              document.add(table);
              
              
}
          catch(DocumentException de) {
              System.err.println(de.getMessage());
          }
          catch(IOException ioe) {
              System.err.println(ioe.getMessage());
          }
          document.close(); 
    }
}
