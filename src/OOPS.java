public class OOPS {

    static String Employee_name;
    static float Employee_salary;

    public OOPS(String name, float salary){
      Employee_name = name;
      Employee_salary = salary;
    }

    public String getname(){
        return Employee_name;
    }

    public void setname(String name){
        Employee_name = name;
    }
    static void set(String n, float m){
        Employee_name = n;
        Employee_salary = m;
    }

    static void get(){
        System.out.println("Employee name is : " + Employee_name);
        System.out.println("Employee salary is : " + Employee_salary);
    }

    public static void main(String[] args) {
          OOPS.set("Rathod", 7);
          OOPS.get();

          OOPS myObject = new OOPS("Sai", 1000000);
        System.out.println("EMp name : " + myObject.getname());
        myObject.setname("Swaroop");
        System.out.println("New Emp name : " + myObject.getname() );
        System.out.println(myObject);
    }
}
