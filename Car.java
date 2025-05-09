public class Car{
     static String companyName="Honda";
     String carModel="civic";
    public static void main(String [] args){
        
        System.out.println("Company: "+Car.companyName);
        Car car1=new Car();
        Car car2=new Car();
        car2.carModel="Accord";
        System.out.println("car 1 Model: "+car1.carModel);
        System.out.println("car 2 Model: "+car2.carModel);
    }
  }