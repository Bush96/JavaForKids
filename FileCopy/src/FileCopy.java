
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        int[] somedata = {56, 230, 123, 43, 11, 37};

        FileOutputStream myFile1;
        FileInputStream myFile = null;
        try {
            myFile1 = new FileOutputStream("C:\\Users\\Bush\\Desktop\\by.txt");
            for (int i = 0; i < somedata.length; i++) {
                myFile1.write(somedata[i]);

                myFile = new FileInputStream("C:\\Users\\Bush\\Desktop\\by.txt");
                while (true) {
                    int intValueOfByte = myFile.read();
                    System.out.print(" " + intValueOfByte);
                    if (intValueOfByte == -1) {
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка в копировании."
                    + e.toString());

        } finally {
            try {
                myFile.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            System.out.println(
                    "Чтение файла завершено успешно");
        }
    }
}



