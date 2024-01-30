package localJava.javaUtil;

import java.util.Random;

public class MathUtil {
    public static void diceRoller() {
          Random r = new Random();
          int evenCounter = 0;
          for (int i = 0; i < 100; i++) {
            int dice1 = r.nextInt(6);
            int dice2 = r.nextInt(6);
            if (dice1 == dice2)
              evenCounter++;
            System.out.println(evenCounter);
          }
    }

    public static void coinFlipper(){
        Random r = new Random();
        int headsCount = 0;
        for (int i = 0; i < 100; i++) {
          boolean flip = r.nextBoolean();
          if (flip == true)
            headsCount++;            
        }
        System.out.println(headsCount);
    }

    public static int pow(int a, int b){
        int result = 1;
        for (int i = 1; i <= b ; i++) {
          result *= a;
        }
        return result;
    }

    public static boolean isArmstrong(int value){
        String temp = String.valueOf(value);
        int result = 0;         
        for (int i = 0; i < temp.length() ; i++) {
          result += pow(Integer.parseInt(temp.substring(i, i + 1)), temp.length());
        }
        return result == value;
    }

    public static void isArmstrongTest(){
        for (int i = 0; i <= 99999; i++) {
          if(isArmstrong(i))
            System.out.printf("%d%n", i);
        }
    }

    public static void compare(int x,int y,int z){
        if(Math.min(x, y) < Math.min(y, z))
          System.out.printf("Sonuç: %d < %d < %d", Math.min(x, y), Math.min(y, z), Math.max(y, z));
        else
          System.out.printf("Sonuç: %d < %d < %d",Math.min(y, z), Math.min(x, y), Math.max(x, y));
    }

    public static int mid(int x, int y, int z){
        if((x<=y && x>=z) || (x>=y && x<=z))
          return x;
        else if((y<=x && y>=z) || (y>=z && y<=x))
          return y;
        else if((z<=x && z>=y) || (z>=y && z<=x))
          return z;
        return 0;
    }

    public static int signum(int value){
        if(value < 0)
          return -1;
        else if(value > 0)
          return 1;
        else
          return 0;
    }

    public static double distance(double x, double y){
        return Math.abs(y - x);
    }

    public static int getDigitSum(int x){
        return (x / 100) + (x / 10 % 10) + (x % 10);
    }

    public static void roots(int a,int b,int c){
        double x,y;
        double delta = (b * b) - (4 * a * c);
        if (delta > 0) {
          x = (-b + Math.sqrt(delta));
          y = (-b - Math.sqrt(delta));
        }
        else if (delta == 0) {
          x = -b;
          y = -b;
        }
        else {
          x=0;
          y=0;
        }          
        System.out.printf("Roots x1 = %f , x2 = %f", x,y);
    }
}
