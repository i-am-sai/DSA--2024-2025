public class PerfectNumber {

    public static void main(String[] args) {
           int num = 128;
        System.out.println(check(num));
        System.out.println(check1(135));
    }

    public static boolean check1(int num) {
        int i = 0;
        Boolean flag = true;
        int num1 = num;
        int ans = 0;
        while (flag && num1 > 0) {
            int temp = num1 % 10;
            if (num % temp == 0) {
                num1 = num1 / 10;

            } else {
                flag = false;
            }
        }
        return flag;
    }


    public static boolean check(int num){
        int i= 1;
        int sum =0;
        while(i<num){
            if(num %i ==0){
                sum += i;
            }
            i++;
        }
        if(sum == num){
            return true;
        }
        return false;
    }
}
