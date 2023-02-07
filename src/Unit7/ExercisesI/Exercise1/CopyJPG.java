package Unit7.ExercisesI.Exercise1;

import java.io.*;

public class CopyJPG {
    public static void main(String[] args) {
        File originalFile = new File("photo.jpg");
        File newFile = new File("photo_CPY.jpg");
        FileInputStream inStream=null;
        FileOutputStream outStream=null;
/*
        try {
            inStream = new FileInputStream(originalFile);
            outStream = new FileOutputStream(newFile);
            int byte = inStream.read();
            while (byte != -1) {
                outStream.write(byte);
                byte = inStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (inStream != null) {
                try {
                    inStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (outStream != null) {
                try {
                    outStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
*/
        try {
            inStream = new FileInputStream(originalFile);
            outStream = new FileOutputStream(newFile);
            byte buffer [] = new byte[512];
            int value =0;
            while (value!=-1){
                outStream.write(buffer);
                value = inStream.read(buffer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (inStream != null) {
                try {
                    inStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (outStream != null) {
                try {
                    outStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
