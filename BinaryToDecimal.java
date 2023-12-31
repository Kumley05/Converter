import java.util.Scanner;
public class BinaryToDecimal{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Binary Number(0 or 1)");
    String B = input.nextLine();
    input.close();
    System.out.println(binaryToDecimal(B));
  }
  
  static int binaryToDecimal(String B){
    int decimal = 0;
    int n = B.length()-1;
    for(int i=0; i<B.length(); i++){
      int digit = B.charAt(i)-'0';
      if(digit !=0 && digit != 1){
        System.out.println("Input not a Binary Number(0,1)");
        return -1;
      }
      decimal += digit * Math.pow(2, n);
      n--;
    }
    return decimal;
  }
}
