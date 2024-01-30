package localJava.javaUtil;
import java.util.Random;
import java.util.Scanner;

/**
 * StringUtil
 */
public class StringUtil {

    public static String getRandomText(int charNum){
          String result = "";
          Random random = new Random();
          for (int i = 0; i < charNum; i++) {
            result += (char)random.nextInt(97,122);
          }
          return result;
    }

    public static String padLeading(String input, int length) {
        String result = "";
        if(length <= input.length())
          result = input;
        else {
          for (int i = 0; i < (length - input.length()); i++) {
            result += " ";
          }
          result += input.trim();
        }
        return result;
    }

    public static String trimLeading(String input) {
        String result = "";          
        for (int i = 0; i < input.length(); i++) {
          if(input.charAt(i) != ' '){
            result += input.charAt(i);
          }
        }
        System.out.println(result.length());
        return result;
    }

    public static void concater() {
          Scanner scan = new Scanner(System.in);
          System.out.println("Yazıları giriniz:");
          String result="";
          for(;;){
            String s = scan.nextLine();
            if(s.equals("quit"))
              break;
            result+= s + "-";
          }
          result = result.substring(0, result.length()-1);
          System.out.println(result);
    }

    public static void reverse(String s){
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
          result += s.charAt(i);
        }
        System.out.println(result);
    }

    public static void login(String id, String password){  
        int trys = 3;        
        for (int i = 0; i < 2; i++) {
          if(id.equals("kadir") && password.equals("kadir")){
            System.out.println("Giriş başarılı");
            break;
          }
          --trys;
          System.out.println("Hata Kalan hakkınız " + trys);
        }
    }

    public static void countString(String text, String searchText) {
        int count = 0;
        int index = 0;
        while((index = text.indexOf(searchText, index)) != -1){
          ++count;
          ++index;
        }
        System.out.println(count);
    }
}