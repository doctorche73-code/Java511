

import java.io.File;
import java.util.Scanner;

class FileExplorer {
    private File currentDirectory;

    public FileExplorer() {
        this.currentDirectory = new File(System.getProperty("user.home"));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Текущая директория: " + currentDirectory.getAbsolutePath());
        System.out.println("Доступные команды:");
        System.out.println("list    -> печатает все папки и файлы");
        System.out.println("files   -> печатает все файлы");
        System.out.println("folders -> печатает все папки");
        System.out.println("cd path -> переходить в указанный путь");
        System.out.println("cd..    -> переходить на шаг назад");
        System.out.println("exit    -> выход из программы");

        while (true) {
            System.out.print("\n" + currentDirectory.getAbsolutePath() + "> ");
            String command = scanner.nextLine().trim();

            if (command.equals("exit")) {
                break;
            } else if (command.equals("list")) {
                listAll();
            } else if (command.equals("files")) {
                listFiles();
            } else if (command.equals("folders")) {
                listFolders();
            } else if (command.startsWith("cd.. ")) {
                changeDirectory(command.substring(5));
            } else {
                System.out.println("Неизвестная команда.");
            }
        }

        scanner.close();
        System.out.println("Программа завершена.");
    }

    private void listAll() {
        System.out.println("Все папки и файлы в " + currentDirectory.getAbsolutePath() + ":");

        File[] files = currentDirectory.listFiles();
        if (files == null) {
            System.out.println("Нет доступа к директории или директория не существует.");
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("[DIR]  " + file.getAbsolutePath());
            } else {
                System.out.println("[FILE] " + file.getAbsolutePath());
            }
        }
    }

    private void listFiles() {
        System.out.println("Файлы в " + currentDirectory.getAbsolutePath() + ":");

        File[] files = currentDirectory.listFiles();
        if (files == null) {
            System.out.println("Нет доступа к директории или директория не существует.");
            return;
        }

        boolean hasFiles = false;
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getAbsolutePath());
                hasFiles = true;
            }
        }

        if (!hasFiles) {
            System.out.println("В этой директории нет файлов.");
        }
    }

    private void listFolders() {
        System.out.println("Папки в " + currentDirectory.getAbsolutePath() + ":");
        System.out.println("----------------------------------------");

        File[] files = currentDirectory.listFiles();
        if (files == null) {
            System.out.println("Нет доступа к директории или директория не существует.");
            return;
        }

        boolean hasFolders = false;
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(file.getAbsolutePath());
                hasFolders = true;
            }
        }

        if (!hasFolders) {
            System.out.println("В этой директории нет папок.");
        }
    }

    private void changeDirectory(String path) {
        if (path.equals("cd..")) {
            File parent = currentDirectory.getParentFile();
            if (parent != null && parent.exists()) {
                currentDirectory = parent;
                System.out.println("Перешел в: " + currentDirectory.getAbsolutePath());
            } else {
                System.out.println("Невозможно перейти на уровень выше.");
            }
            return;
        }

        File newDir;
        if (path.startsWith("/") || path.contains(":")) {
            newDir = new File(path);
        } else {
            newDir = new File(currentDirectory, path);
        }

        if (!newDir.exists()) {
            System.out.println("Директория не существует: " + newDir.getAbsolutePath());
        } else if (!newDir.isDirectory()) {
            System.out.println("Указанный путь не является директорией: " + newDir.getAbsolutePath());
        } else {
            currentDirectory = newDir;
            System.out.println("Перешел в: " + currentDirectory.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        FileExplorer explorer = new FileExplorer();
        explorer.start();
    }
}