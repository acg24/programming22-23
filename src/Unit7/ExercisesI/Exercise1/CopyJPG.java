package Unit7.ExercisesI.Exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyJPG {
    File inputFile = new File("photo.jpg");
    FileInputStream myFileSt;

    {
        try {
            myFileSt = new FileInputStream(inputFile);
            int count = 0;
            int readbyte = myFileSt.read( );
            while (readbyte != -1) {
                if (readbyte == '\n')
                    count ++;
                readbyte = myFileSt.read( );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if ( myFileSt!=null){
                try {
                    myFileSt.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
