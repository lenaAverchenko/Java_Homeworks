package de.telran.averchenko.elena.homework20New.task1;

import java.io.File;

public class DirectoryEditor {
    public DirectoryEditor() {
    }
    public boolean deleteDirectory (String path) {
        File file = new File(path);
        return file.delete();
    }

    public boolean deleteSubDirectory (String startDirectoryPath) {
        File file = new File(startDirectoryPath);
        File[] files = file.listFiles();
        boolean isDeleted = false;
        if (files.length > 0){
            for (int i = 0; i < files.length; i++) {
                if (!files[i].isDirectory()){
                    System.out.println("There is no directory to be deleted");
                    isDeleted = false;
                } else if (files[i].isDirectory()){
                    files[i].delete();
                    isDeleted = true;
                    break;
                }
            }
        }
        return isDeleted;
    }
}
