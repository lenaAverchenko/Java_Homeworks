package de.telran.averchenko.elena.homework20New.task1;

import java.io.File;
import java.io.IOException;

public class DirectoryEditorApp {
    public static void main(String[] args) {

        DirectoryEditor directoryEditor = new DirectoryEditor();

        String path = "C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework20New\\task1\\test";
        File file = new File(path);
        File fileTwo = new File(path + "\\test2");
        File fileThree = new File(path + "\\test3");
        File fileFour = new File(path + "\\test4");
        File fileFive = new File(path + "\\test5.txt");
        file.mkdir();
        fileTwo.mkdir();
        fileThree.mkdir();
        fileFour.mkdir();
        try {
            fileFive.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Для проверки работы метода можно раскомментировать. Папки можно создать заранее, чтобы было нагляднее
        //deleteSubDirectory(path) - удаляет не все вложенные папки, а только 1
        directoryEditor.deleteDirectory(path + "\\test4");
        directoryEditor.deleteSubDirectory(path);
        directoryEditor.deleteSubDirectory(path);
        directoryEditor.deleteSubDirectory(path);
    }
}
