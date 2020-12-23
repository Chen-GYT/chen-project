import com.aspose.cells.*;

import java.io.FileOutputStream;
import java.io.InputStream;

public class TestForExcel2PDF {

    public static void main(String[] args) {

        String sourceFilePath="E:\\weijia\\重庆农商\\test.xls";
        String desFilePath="E:\\weijia\\重庆农商\\test.pdf";
        excel2pdf(sourceFilePath, desFilePath);
    }
    /**
     * 获取license 去除水印
     * @return
     */
    public static boolean getLicense() {
        boolean result = false;
        try {
            InputStream is = TestForExcel2PDF.class.getClassLoader().getResourceAsStream("\\license.xml");
            License aposeLic = new License();
            aposeLic.setLicense(is);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    /**
     * excel 转为pdf 输出。
     *
     * @param sourceFilePath  excel文件
     * @param desFilePathd  pad 输出文件目录
     */
    public static void excel2pdf(String sourceFilePath, String desFilePathd ){
        if (!getLicense()) { // 验证License 若不验证则转化出的pdf文档会有水印产生
            return;
        }
        try {
            Workbook wb = new Workbook(sourceFilePath);// 原始excel路径
            FileOutputStream fileOS = new FileOutputStream(desFilePathd);
            PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
            pdfSaveOptions.setOnePagePerSheet(true);
            int[] autoDrawSheets={3};
            int[] showSheets={0};
            printSheetPage(wb,showSheets);
            wb.save(fileOS, pdfSaveOptions);
            fileOS.flush();
            fileOS.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 设置打印的sheet 自动拉伸比例
     * @param wb
     * @param page 自动拉伸的页的sheet数组
     */
    public static void autoDraw(Workbook wb,int[] page){
        if(null!=page&&page.length>0){
            for (int i = 0; i < page.length; i++) {
                wb.getWorksheets().get(i).getHorizontalPageBreaks().clear();
                wb.getWorksheets().get(i).getVerticalPageBreaks().clear();
            }
        }
    }


    /**
     * 隐藏workbook中不需要的sheet页。
     * @param wb
     * @param page 显示页的sheet数组
     */
    public static void printSheetPage(Workbook wb,int[] page){
        for (int i= 1; i < wb.getWorksheets().getCount(); i++)  {
            wb.getWorksheets().get(i).setVisible(false);
        }
        if(null==page||page.length==0){
            wb.getWorksheets().get(0).setVisible(true);
        }else{
            for (int i = 0; i < page.length; i++) {
                wb.getWorksheets().get(i).setVisible(true);
            }
        }
    }

}


