package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

    public static void main(String[] args) {
        FileWriter fileWriter=null;
        String text = "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;";
        try {
             fileWriter=new FileWriter("/home/iskander/testFiles/test1.txt", true);
//             for (int i=0;i<text.length();i++){
//                 fileWriter.write(text.charAt(i));
//             }

//            fileWriter.write(text);
            fileWriter.write("\nА.С. Пушкин");
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
