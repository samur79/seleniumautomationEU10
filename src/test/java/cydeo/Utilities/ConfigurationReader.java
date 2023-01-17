package cydeo.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1- Create the object of Properties
    private static Properties properties = new Properties();
//as we want it to be unaccessible from outside i made it private
    static{

        //to solve the exception permanently we need try catch block
        try {

            //2- We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load the properties object using FileInputStream object
            properties.load(file);

            //close the file whenever you upload it
            file.close();


        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
