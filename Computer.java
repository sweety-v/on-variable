public class Computer{
      static String os="Windows";
       String ram;
   public static void main(String [] args){
      System.out.println("OS: "+Computer.os);
       
   Computer computer1=new Computer();
       computer1.ram="8GB";
    Computer computer2=new Computer();
       computer2.ram="16GB";  
     System.out.println("Computer 1 RAM: "+computer1.ram);
     System.out.println("Computer 2 RAM: "+computer2.ram);
    }
}

        