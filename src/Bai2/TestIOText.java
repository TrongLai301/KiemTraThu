package Bai2;

import java.io.*;

public class TestIOText {
        public static void main(String[] args) {
            try {
                String[] arraySong = {"Hello califonia", "We don’t talk any more", "Nắng ấm xa dần", "Em của ngày hôm qua", "Thất tình"};
                String fileName = "list_song.txt";
                File file = new File(fileName);
                file.createNewFile();
//            writeDataToFileWithFileWriter(fileName,arraySong);
//            readDataToFileWithFileReader(fileName);
                writeDataToFileWithBufferWriter(fileName, arraySong);
                readDataToFileWithBufferReader(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public static void writeDataToFileWithFileWriter(String file, String[] array) {
            try {
                FileWriter fw = new FileWriter(file);

                for (int i = 0; i < array.length; i++) {
                    String aSong = array[i];
                    fw.write(aSong + "\n");
                }
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public static void readDataToFileWithFileReader(String file) {
            try {
                FileReader fileReader = new FileReader(file);
                int character;
                while ((character = fileReader.read()) != -1) {
                    System.out.print((char) character);
                }
                fileReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void writeDataToFileWithBufferWriter(String file, String[] arraySong) {

            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for (int i = 0; i < arraySong.length; i++) {
                    bufferedWriter.write(arraySong[i] + "\n");
                }
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public static void readDataToFileWithBufferReader(String file) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }


