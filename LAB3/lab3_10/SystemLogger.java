package LAB3.lab3_10;

public class SystemLogger {

        private static int currentLogLevel = 1;

            private static String getLavelName(int level){
                if (level == 1){
                return "INFO";
            } else if (level == 2){
                return "DEBUG";
            } else if(level == 3){
                return "ERROR";
            } else {
                return "UNKNOWN";
        }
    } 

    public static void setLogLevel(int newLevel){

        if (newLevel >= 1 && newLevel <= 3){

            currentLogLevel = newLevel;
            System.out.println(getLavelName(newLevel));
        }else{
            System.out.println("Invalid log level.");
        }
        
    }
        public static void log(int MessageLevel, String Message){

        if (MessageLevel >= currentLogLevel){
            
            String levelName = getLavelName(MessageLevel);
            System.out.println("[" + levelName + "]: " + Message);
        }
    }
}