package sai.swaroop;

class Test1{
  String name1;

    public Test1(String name1){
        this.name1 = name1;
    }
}
public class InnerClass {

   static class Test {
         String name;

          public Test(String name){
              this.name = name;
          }
    }

    public static void main(String[] args) {
        Test a = new Test("Sai");
        Test b = new Test("Swaroop");
        System.out.println(a.name);
        System.out.println(b.name);

        Test1 c = new Test1("Sai");
        Test1 d = new Test1("Swaroop");
        System.out.println(c.name1);
        System.out.println(d.name1);
    }
}

