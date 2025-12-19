package LAB4.lab4_11;

import java.util.Scanner;

public class Main {

    public static void main(String[] cfrt) {

        Scanner input = new Scanner(System.in); 

        String BaseTheme = input.nextLine();
        int BaseFont = input.nextInt();
        boolean BaseDrakmode = input.nextBoolean();
        input.nextLine();
        String UserTheme = input.nextLine();
        int UserFont = input.nextInt();
        boolean UserDrakmode  = input.nextBoolean();
        
        
        Configuration baseConfig = new Configuration(BaseTheme,BaseFont,BaseDrakmode);
        Configuration userConfig = new Configuration(UserTheme,UserFont,UserDrakmode);
        Configuration finalConfig = new Configuration(baseConfig,userConfig);

        finalConfig.displaySettings();
        input.close();



        
    }
}
