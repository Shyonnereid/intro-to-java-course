package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    public static boolean check(String fileName) throws FilenameException {
        if (fileName == null || fileName.isEmpty()) {
            throw new FilenameException("file is empty");
        }
        
        return fileName.endsWith(".java");
    }


    public static void main(String[] args) {
        // need a space in memory and reserve a space in map 
        Map map = new HashMap<String, Integer>();
       
        try {

            boolean result = false;

           result = check("fileName");

           if (result == true)
           map.put("fileName", 1);

           else 
           map.put("fileName", 0);

        } 

        catch (FilenameException e) {
            

            read try catch block 
            read map data structure

        }



}

}
