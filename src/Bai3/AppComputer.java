package Bai3;

import java.io.File;
import java.io.IOException;

public class AppComputer {
    public static void main(String[] args) {
        Computer computer= new Computer();
        Computer computer1 = new Computer("101","Nokia20","Nokia","i5",10.0,true);
        Computer computer2 = new Computer("102","Nokia201","Nokia1","i6",10.0,false);
        Computer computer3 = new Computer("103","Nokia202","Nokia2","i5",19.0,true);
        computer.addComputerToArray(computer1);
        computer.addComputerToArray(computer2);
        computer.addComputerToArray(computer3);

        try {
            String fileName = "database.txt";
            File file = new File(fileName);
            file.createNewFile();
            computer.addComputerToFile(fileName,computer1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
