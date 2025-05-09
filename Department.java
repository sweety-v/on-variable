public class Department{
     static String departmentName="HR";
     String employeeName;
    public static void main(String [] args){
        
        System.out.println("Department: "+Department.departmentName);
        Department employee1=new Department();
        Department employee2=new Department();
         employee1.employeeName="John";
         employee2.employeeName="Alice";
         System.out.println("Employee 1: "+employee1.employeeName);
         System.out.println("Employee 2: "+employee2.employeeName);
         System.out.println("After Modification: ");
        departmentName="Marketing";
        System.out.println("Department: "+Department.departmentName);
       
         System.out.println("Employee 1: "+employee1.employeeName);
         System.out.println("Employee 2: "+employee2.employeeName);
    }
  }