package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author tombisnis@yahoo.com
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try{       
            String sourceInput = System.getProperty("user.dir") + "/src/io/input.txt";
            String sourceOutput = System.getProperty("user.dir") + "/src/io/output.txt";
            
            fileInputStream = new FileInputStream(sourceInput);
            fileOutputStream = new FileOutputStream(sourceOutput);
            
            int c;
            
            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c); 
            }
        }finally{
            if(fileInputStream != null){
                fileInputStream.close();
            }
            
            if(fileOutputStream != null){
                fileOutputStream.close();
            }
        }
    }
}