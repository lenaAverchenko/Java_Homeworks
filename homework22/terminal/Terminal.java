package de.telran.averchenko.elena.homework22.terminal;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Scanner;

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Terminal {
    String initialDirection;

    // Знаки "<", ">" можно поубирать из условий, делала, как в описании домашки
    public Terminal(String initialDirection) {
        this.initialDirection = initialDirection;
    }

    public void useCommand() throws IOException {
        File dir = new File(initialDirection);
        System.out.println(dir.getAbsolutePath());
        Scanner scanner = new Scanner(System.in);
        String request = "";
        while (!request.equals("exit")) {
            dir = new File(initialDirection);
            request = scanner.nextLine();

            if (request.equals("cd ..")) {
                initialDirection = dir.getParent();
                System.out.println(initialDirection);
                File file = new File(initialDirection);
                if (!file.exists()) {
                    throw new IOException("The direction doesn't exist");
                }
            }
            if (request.contains("cd <") && request.contains(">")) {
                String[] partOfPath = request.split("<", request.length());
                String path = dir.getAbsolutePath() + File.separator + partOfPath[1].substring(0, partOfPath[1].length() - 1);
                System.out.println(path);
                initialDirection = path;
                File file = new File(initialDirection);
                if (!file.exists()) {
                    throw new IOException("The direction doesn't exist");
                }
            }

            if (request.equals("ls")) {
                System.out.println(Arrays.toString(dir.list()));
            }

            if (request.contains("ls ") && !request.equals("ls -la")) {
                String[] str = request.split(" ");
                String pathLs = initialDirection + File.separator + str[1];
                File fileLs = new File(pathLs);
                System.out.println(Arrays.toString(fileLs.list()));
                if (!fileLs.exists()) {
                    throw new IOException("The direction doesn't exist");
                }
            }

            if (request.equals("ls -la")) {
                File someFile = new File(initialDirection);
                File[] currentFile = someFile.listFiles();
                // Для проверки
//                System.out.println(Arrays.toString(currentFile));
                for (int i = 0; i < currentFile.length; i++) {
                    System.out.print(currentFile[i].getName() + " ");
                    if (currentFile[i].canRead()) {
                        System.out.print("r ");
                    } else {
                        System.out.print("- ");
                    }
                    if (currentFile[i].canWrite()) {
                        System.out.print("w ");
                    } else {
                        System.out.print("- ");
                    }
                    if (currentFile[i].canExecute()) {
                        System.out.print("x ");
                    } else {
                        System.out.print("- ");
                    }
                    if (currentFile[i].isHidden()) {
                        System.out.print("h ");
                    } else {
                        System.out.print("- ");
                    }
                    System.out.println("");


                }
            }


            if (request.contains("mkdir ")) {
                String[] str = request.split(" ");
                String pathMkdir = dir.getAbsolutePath() + File.separator + str[1];
                Path path = Files.createDirectory(Path.of(pathMkdir));
                System.out.println(path.toAbsolutePath());
                initialDirection = pathMkdir;
            }
            if (request.contains("nano ")) {
                String[] str = request.split(" ");
                String pathNano = dir.getAbsolutePath() + File.separator + str[1];
                File newFile = new File(pathNano);
                newFile.createNewFile();
                initialDirection = newFile.getParent();

            }

            //не рискую проверять)) Отстальное работает
            if (request.contains("rm ")) {
                String[] str = request.split(" ");
                String pathForRM = dir.getAbsolutePath() + File.separator + str[1];
                File fileToRemove = new File(pathForRM);
                fileToRemove.delete();
                if (!fileToRemove.exists()) {
                    throw new IOException("There is nothing to remove");
                }

            }

            if (request.equals("pwd")) {
                System.out.println(dir.getAbsolutePath());
            }

            // mv test <from> <to>
            if (request.contains("mv") && request.contains("<") && request.contains("> <") && request.contains(">")) {
                String[] str = request.split(" ");
                String fileName = str[1];
                String from = str[2].substring(1, str[2].length() - 1);
                System.out.println(from);
                String to = str[3].substring(1, str[3].length() - 1);
                System.out.println(to);
                File file = new File(initialDirection + File.separator + fileName);
                Path initPath = file.toPath();
                Path targetPath = Paths.get(to + File.separator + fileName);
                System.out.println(initPath.toAbsolutePath());
                System.out.println(Paths.get(to));
                initPath = Files.move(initPath, targetPath, REPLACE_EXISTING);
                initialDirection = to;
            }

            // не совсем понимаю, почему он идеально меняет параметры для записи,
            // и не может поменять для чтения и исполнения

            if (request.contains("chmod <") && request.contains("> <") && request.contains(">")) {
                File fileInitial = new File(initialDirection);
                String[] requestDetails = request.split(" ");
                String requestToDo = requestDetails[1].substring(1, requestDetails[1].length() - 1);
                String nameOfFile = requestDetails[2].substring(1, requestDetails[2].length() - 1);
                String pathToFile = fileInitial.getAbsolutePath() + File.separator + nameOfFile;
                File currentFileToChange = new File(pathToFile);

                    if (!currentFileToChange.canRead() && requestToDo.equals("r")) {
                        currentFileToChange.setReadable(true);
                    } else if(currentFileToChange.canRead() && requestToDo.equals("r")) {
                        currentFileToChange.setReadable(false);
                    }
                    if (!currentFileToChange.canWrite() && requestToDo.equals("w")) {
                        currentFileToChange.setWritable(true);
                    } else if (currentFileToChange.canWrite() && requestToDo.equals("w")) {
                        currentFileToChange.setWritable(false);
                    }
                    if (!currentFileToChange.canExecute() && requestToDo.equals("x")) {
                        currentFileToChange.setExecutable(true);
                    } else if (currentFileToChange.canExecute() && requestToDo.equals("x")) {
                        currentFileToChange.setExecutable(false);

                }


            }

        }

    }
}



