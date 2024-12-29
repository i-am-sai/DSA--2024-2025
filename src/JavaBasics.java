public class JavaBasics {
    public static void main(String[] args) {

        String a = "Sam";
        String b = "Sam";
        System.out.println(a==b);
        System.out.println(a.equals(b));

        String c = new String("Sam");
        String d = new String("Sam");
        System.out.println(c==d);
        System.out.println(c.equals(d));


        float f = 09.7f;
        double e = 890.4d;
        System.out.println(e);
        byte m =54;

        // Scientific numbers
        float f1 = 5e3f;
        double d1 = 2E4d;
        System.out.println(f1);
        System.out.println(d1);

        //Type Casting
        // Widening
        int i =9;
        double j = i;
        System.out.println(j);
        // Narrowing
         double my = 9.87d;
         int myInt = (int) my;
        System.out.println(myInt);

        // real life ex :
        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore/maxScore *100.0f;
        System.out.println(percentage);

        //escape  characters
        System.out.println("Im S \"ai\" ");

        //math function
        Math.random();
        System.out.println(Math.abs(-4.67));
        System.out.println(Math.random());
        int random = (int)(Math.random() * 100);
        System.out.println(random);


    }
}
