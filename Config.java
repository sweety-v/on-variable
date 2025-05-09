public class Config{
     static String configName="System Config";
      String settingValue;

    public static void main(String [] args){
        configName="System Config";
      System.out.println("Config Name: "+Config.configName);
      Config config1=new Config();
         config1.settingValue="Dark Mode";
        System.out.println("Setting 1: "+config1.settingValue);
      Config config2=new Config();
        config2.settingValue="Light Mode";
        System.out.println("Setting 2: "+config2.settingValue);
     }
}
       