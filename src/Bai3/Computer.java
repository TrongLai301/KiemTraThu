package Bai3;

import java.io.FileWriter;
import java.io.IOException;

public class Computer {
        protected Computer[] computers;
        protected String id;
        protected String name;
        protected String menuF;
        protected String configuration;
        protected double price;
        protected boolean status;
        protected int count;

        public Computer() {
            computers = new Computer[0];
            count = 0;
        }

        public Computer(String id, String name, String menuF, String configuration, double price, boolean status) {
            this.id = id;
            this.name = name;
            this.menuF = menuF;
            this.configuration = configuration;
            this.price = price;
            this.status = status;
        }

        public void addComputerToArray(Computer computer) {
            computers = new Computer[count++];
            for (int i = 0; i <computers.length ; i++) {
                this.computers[i] = computer;
            }
        }
        public void addComputerToFile(String file, Computer computer){
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(file);
//                while (computer< computers.length)
                    fileWriter.write(computer.id+" " +computer.name+" "+computer.menuF+" "+computer.configuration+" "+computer.price+" "+computer.status+ "\n");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

