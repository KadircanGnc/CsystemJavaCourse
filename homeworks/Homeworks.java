package localJava.homeworks;

public class Homeworks {
    
    public static String compareNums(int num1, int num2, int num3) {
        String result = "";
        if (num1 < num2 && num2 < num3) {
            result += num1 + " < " + num2 + " < " + num3;
        } else if (num1 == num2 && num2 < num3) {
            result += num1 + " = " + num2 + " < " + num3;
        } else if (num1 < num2 && num2 == num3) {
            result += num1 + " < " + num2 + " = " + num3;
        } else if (num1 == num2 && num2 == num3) {
            result += num1 + " = " + num2 + " = " + num3;
        } else {
            result += "belirsiz durum";
        }
        return result;
    }

    public static int mid(int num1, int num2, int num3) {        
        int min = Math.min(Math.min(num1, num2), Math.min(num2, num3));
        int max = Math.max(Math.max(num1, num2), Math.max(num2, num3));
        int result = (num1 + num2 + num3) - (max + min);
        return result;
    }

    public static int signum(int num) {
        if (num > 0)
            return 1;
        else if (num < 0)
            return -1;
        else
            return 0;
    }
}
