/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaphonebookfullversion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Глеб
 */

public class PhoneBook {

    public Scanner scanner;
    public String a, b;
    public int c;
    public String Skype1, Skype2, Skype3, Skype4, Skype5, Skype6, Skype7, Skype8, Skype9, Skype10;
    public String name1, name2, name3, name4, name5, name6, name7, name8, name9, name10;
    public String email1, email2, email3, email4, email5, email6, email7, email8, email9, email10;
    public String number1, number2, number3, number4, number5, number6, number7, number8, number9, number10;
    public FileInputStream fis;
    public FileOutputStream file1;
    public FileOutputStream file2;
    public FileOutputStream file3;
    public FileOutputStream file4;
    public FileOutputStream file5;
    public FileOutputStream file6;
    public FileOutputStream file7;
    public FileOutputStream file8;
    public FileOutputStream file9;
    public FileOutputStream file10;

    public void startPrograme() throws FileNotFoundException, IOException {
        System.out.println("Hello! Welcome to phone book");
        System.out.println("1-start,2-exit(without whitespace)");
        scanner = new Scanner(System.in);

        a = scanner.nextLine();
        if (a.equals("1")) {
            System.exit(0);
        }
        if (a.equals("2")) {
            System.out.println("0 - write obonents\n"
                    + "1 -  create pages (obonents)\n"
                    + "2  - get console obonent + name file\n"
                    + "3  – get directory + name file\n"
                    + "4  – exit programe\n"
                    + "5  – delete file + name file\n"
                    + "6  -  delete all files"
            );
            System.err.println("Next you should enter command (you should start with make atributes of obonents when enter command of create file ");
            System.out.println("Next your command:");

            while (true) {
                b = scanner.nextLine();
                if (b.equals("0")) {

                    getFileAtributes();

                }
                if (b.equals("1")) {

                    fileCreator();
                }

                if (b.equals("2")) {
                    fileWriter();
                    System.out.print("What file you wish to print?(enter full name of file without whitespase)");
                    String w = scanner.nextLine();
                    fis = new FileInputStream("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\JavaPhoneBookFullVersion\\src\\Contacts\\" + w + ".txt");
                    while (fis.available() > 0) {
                        int read = fis.read();
                        System.out.print((char) read);
                    }

                    fis.close();
///////
                }
                if (b.equals("3")) {
                    System.out.print("What file you wish to print?(enter full name of file without whitespase)");
                    String p = scanner.nextLine();
                    File project_dir = new File(p + ".txt");
                    System.out.println("Name:");
                    System.out.println(project_dir.exists());

                    System.out.println("Paths:");
                    System.out.println(project_dir.getPath());
                    System.out.println(project_dir.getAbsoluteFile().getPath());
                    System.out.println(project_dir.getCanonicalFile().getPath());

                    System.out.println("Names:");
                    System.out.println(project_dir.getName());
                    System.out.println(project_dir.getAbsoluteFile().getName());
                    System.out.println(project_dir.getCanonicalFile().getName());
                }
                if (b.equals("4")) {
                    System.out.println("Good bye");
                    System.exit(0);
                    break;
                }
                if (b.equals("5")) {
                    System.out.print("What file you wish to delete?(enter full name of file without whitespase)");
                    String i = scanner.nextLine();
                    File deletel = new File(i + ".txt");
                    deletel.delete();
                }
                if (b.equals("6")) {
                    File deletel = new File(name1 + number1 + ".txt");
                    deletel.delete();
                    File deletel2 = new File(name2 + number2 + ".txt");
                    deletel2.delete();
                    File deletel3 = new File(name3 + number3 + ".txt");
                    deletel3.delete();
                    File deletel4 = new File(name4 + number4 + ".txt");
                    deletel4.delete();
                    File deletel5 = new File(name5 + number5 + ".txt");
                    deletel5.delete();
                    File deletel6 = new File(name6 + number6 + ".txt");
                    deletel6.delete();
                    File deletel7 = new File(name7 + number7 + ".txt");
                    deletel7.delete();
                    File deletel8 = new File(name8 + number8 + ".txt");
                    deletel8.delete();
                    File deletel9 = new File(name9 + number9 + ".txt");
                    deletel9.delete();
                    File deletel10 = new File(name10 + number10 + ".txt");
                    deletel10.delete();

                }
                System.out.print("enter new command?");

            }
        }
    }

    private void getFileAtributes() {
        int m = 1;
        System.out.println("obonent:" + m);
        System.out.print("enter name and surname:");
        name1 = scanner.nextLine();
        System.out.print("enter number:");
        number1 = scanner.nextLine();
        System.out.print("enter e-mail");
        email1 = scanner.nextLine();
        System.out.print("enter Skype");
        Skype1 = scanner.nextLine();
        m++;
        //1
        System.out.println("obonent:" + m);
        System.out.print("enter name and surname:");
        name2 = scanner.nextLine();
        System.out.print("enter number:");
        number2 = scanner.nextLine();
        System.out.print("enter e-mail");
        email2 = scanner.nextLine();
        System.out.print("enter Skype");
        Skype2 = scanner.nextLine();
        m++;
        //2
        System.out.println("obonent:" + m);
        System.out.print("enter name and surname:");
        name3 = scanner.nextLine();
        System.out.print("enter number:");
        number3 = scanner.nextLine();
        System.out.print("enter e-mail");
        email3 = scanner.nextLine();
        System.out.print("enter Skype");
        Skype3 = scanner.nextLine();
        m++;
        //3
        System.out.println("obonent:" + m);
        System.out.print("enter name and surname:");
        name4 = scanner.nextLine();
        System.out.print("enter number:");
        number4 = scanner.nextLine();
        System.out.print("enter e-mail");
        email4 = scanner.nextLine();
        System.out.print("enter Skype");
        Skype4 = scanner.nextLine();
        m++;
        //4
        System.out.println("obonent:" + m);
        System.out.print("enter name and surname:");
        name5 = scanner.nextLine();
        System.out.print("enter number:");
        number5 = scanner.nextLine();
        System.out.print("enter e-mail");
        email5 = scanner.nextLine();
        System.out.print("enter Skype");
        Skype5 = scanner.nextLine();
        m++;
        //5
        System.out.println("obonent:" + m);
        System.out.print("enter name and surname:");
        name6 = scanner.nextLine();
        System.out.print("enter number:");
        number6 = scanner.nextLine();
        System.out.print("enter e-mail");
        email6 = scanner.nextLine();
        System.out.print("enter Skype");
        Skype6 = scanner.nextLine();
        m++;
        //6
        System.out.println("obonent:" + m);
        System.out.print("enter name and surname:");
        name7 = scanner.nextLine();
        System.out.print("enter number:");
        number7 = scanner.nextLine();
        System.out.print("enter e-mail");
        email7 = scanner.nextLine();
        System.out.print("enter Skype");
        Skype7 = scanner.nextLine();
        m++;
        //7
        System.out.println("obonent:" + m);
        System.out.print("enter name and surname:");
        name8 = scanner.nextLine();
        System.out.print("enter number:");
        number8 = scanner.nextLine();
        System.out.print("enter e-mail");
        email8 = scanner.nextLine();
        System.out.print("enter Skype");
        Skype8 = scanner.nextLine();
        m++;
        //8
        System.out.println("obonent:" + m);
        System.out.print("enter name and surname:");
        name9 = scanner.nextLine();
        System.out.print("enter number:");
        number9 = scanner.nextLine();
        System.out.print("enter e-mail");
        email9 = scanner.nextLine();
        System.out.print("enter Skype");
        Skype9 = scanner.nextLine();
        m++;
        //9
        System.out.println("obonent:" + m);
        System.out.print("enter name and surname:");
        name10 = scanner.nextLine();
        System.out.print("enter number:");
        number10 = scanner.nextLine();
        System.out.print("enter e-mail");
        email10 = scanner.nextLine();
        System.out.print("enter Skype");
        Skype10 = scanner.nextLine();
        m++;
        //10
    }

    private void fileCreator() throws FileNotFoundException {
        file1 = new FileOutputStream("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\JavaPhoneBookFullVersion\\src\\Contacts\\" + name1 + number1 + ".txt");
        file2 = new FileOutputStream("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\JavaPhoneBookFullVersion\\src\\Contacts\\" + name2 + number2 + ".txt");
        file3 = new FileOutputStream("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\JavaPhoneBookFullVersion\\src\\Contacts\\" + name3 + number3 + ".txt");
        file4 = new FileOutputStream("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\JavaPhoneBookFullVersion\\src\\Contacts\\" + name4 + number4 + ".txt");
        file5 = new FileOutputStream("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\JavaPhoneBookFullVersion\\src\\Contacts\\" + name5 + number5 + ".txt");
        file6 = new FileOutputStream("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\JavaPhoneBookFullVersion\\src\\Contacts\\" + name6 + number6 + ".txt");
        file7 = new FileOutputStream("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\JavaPhoneBookFullVersion\\src\\Contacts\\" + name7 + number7 + ".txt");
        file8 = new FileOutputStream("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\JavaPhoneBookFullVersion\\src\\Contacts\\" + name8 + number8 + ".txt");
        file9 = new FileOutputStream("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\JavaPhoneBookFullVersion\\src\\Contacts\\" + name9 + number9 + ".txt");
        file10 = new FileOutputStream("c:\\Users\\Глеб\\Documents\\NetBeansProjects\\JavaPhoneBookFullVersion\\src\\Contacts\\" + name10 + number10 + ".txt");
    }

    private void fileWriter() throws IOException {
        byte[] bytes = name1.getBytes();
        byte[] bytes2 = number1.getBytes();
        byte[] bytes3 = email1.getBytes();
        byte[] bytes4 = Skype1.getBytes();
        file1.write(bytes);
        file1.write('\n'); // write (int)
        file1.write(bytes2);
        file1.write('\n'); // write (int)
        file1.write(bytes3);
        file1.write('\n'); // write (int)
        file1.write(bytes4);
        //1
        byte[] bytes5 = name2.getBytes();
        byte[] bytes6 = number2.getBytes();
        byte[] bytes7 = email2.getBytes();
        byte[] bytes8 = Skype2.getBytes();
        file2.write(bytes5);
        file2.write('\n'); // write (int)
        file2.write(bytes6);
        file2.write('\n'); // write (int)
        file2.write(bytes7);
        file2.write('\n'); // write (int)
        file2.write(bytes8);
        //3
        byte[] bytes9 = name3.getBytes();
        byte[] bytes10 = number3.getBytes();
        byte[] bytes11 = email3.getBytes();
        byte[] bytes12 = Skype3.getBytes();
        file3.write(bytes9);
        file3.write('\n'); // write (int)
        file3.write(bytes10);
        file3.write('\n'); // write (int)
        file3.write(bytes11);
        file3.write('\n'); // write (int)
        file3.write(bytes12);
        //4
        byte[] bytes13 = name4.getBytes();
        byte[] bytes14 = number4.getBytes();
        byte[] bytes15 = email4.getBytes();
        byte[] bytes16 = Skype4.getBytes();
        file4.write(bytes13);
        file4.write('\n'); // write (int)
        file4.write(bytes14);
        file4.write('\n'); // write (int)
        file4.write(bytes15);
        file4.write('\n'); // write (int)
        file4.write(bytes16);
        //5
        byte[] bytes17 = name5.getBytes();
        byte[] bytes18 = number5.getBytes();
        byte[] bytes19 = email5.getBytes();
        byte[] bytes20 = Skype5.getBytes();
        file5.write(bytes17);
        file5.write('\n'); // write (int)
        file5.write(bytes18);
        file5.write('\n'); // write (int)
        file5.write(bytes19);
        file5.write('\n'); // write (int)
        file5.write(bytes20);
        //6
        byte[] bytes21 = name6.getBytes();
        byte[] bytes22 = number6.getBytes();
        byte[] bytes23 = email6.getBytes();
        byte[] bytes24 = Skype6.getBytes();
        file6.write(bytes21);
        file6.write('\n'); // write (int)
        file6.write(bytes22);
        file6.write('\n'); // write (int)
        file6.write(bytes23);
        file6.write('\n'); // write (int)
        file6.write(bytes24);
        //7
        byte[] bytes25 = name7.getBytes();
        byte[] bytes26 = number7.getBytes();
        byte[] bytes27 = email7.getBytes();
        byte[] bytes28 = Skype7.getBytes();
        file7.write(bytes25);
        file7.write('\n'); // write (int)
        file7.write(bytes26);
        file7.write('\n'); // write (int)
        file7.write(bytes27);
        file7.write('\n'); // write (int)
        file7.write(bytes28);
        //8
        byte[] bytes29 = name8.getBytes();
        byte[] bytes30 = number8.getBytes();
        byte[] bytes31 = email8.getBytes();
        byte[] bytes32 = Skype8.getBytes();
        file8.write(bytes);
        file8.write('\n'); // write (int)
        file8.write(bytes2);
        file8.write('\n'); // write (int)
        file8.write(bytes3);
        file8.write('\n'); // write (int)
        file8.write(bytes4);
        //9
        byte[] bytes33 = name9.getBytes();
        byte[] bytes34 = number9.getBytes();
        byte[] bytes35 = email9.getBytes();
        byte[] bytes36 = Skype9.getBytes();
        file9.write(bytes);
        file9.write('\n'); // write (int)
        file9.write(bytes2);
        file9.write('\n'); // write (int)
        file9.write(bytes3);
        file9.write('\n'); // write (int)
        file9.write(bytes4);
        //10
        byte[] bytes37 = name10.getBytes();
        byte[] bytes38 = number10.getBytes();
        byte[] bytes39 = email10.getBytes();
        byte[] bytes40 = Skype10.getBytes();
        file10.write(bytes);
        file10.write('\n'); // write (int)
        file10.write(bytes2);
        file10.write('\n'); // write (int)
        file10.write(bytes3);
        file10.write('\n'); // write (int)
        file10.write(bytes4);

    }
}
