package LAB3.lab3_11;

public class SystemConfig {
    
    private static SystemConfig instance ;
    private String serverUrl;
    private int maxConnections;

      private SystemConfig(){
        serverUrl = "default.server.com";
        maxConnections = 10;
    }
    public static SystemConfig getInstance(){
        if(instance == null){
            instance = new SystemConfig();
        }
        return instance;
    }
    public String getServerUrl(){
        return serverUrl;
    }
    public void setServerUrl(String url){
        serverUrl = url;
    }
    public int getMaxConnections(){
        return maxConnections;
    }
    public void setMaxConnections(int count){
        if(count > 0){
            maxConnections = count;
            System.out.println("Max connections set." );
        }
        else if(count <= 0){
            System.out.println("Invalid count.");

        }
    }
}

