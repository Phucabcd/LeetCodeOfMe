
public class _check_Number_factorial {
    // Người Ai Cập không hề thích con số 0, 
    // vì vậy khi tính giá trị giai thừa của một số họ sẽ tìm cách bỏ các con số 0 
    // ở cuối cùng đi để nhìn cho đẹp. Bạn hãy viết chương trình tìm chữ số cuối cùng khác 0 
    // của n! với n là số nguyên dương được nhập vào từ bàn phím
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
  
  public static int check(int n){
      int fact = factorial(n);
      
      while(fact % 10 == 0){
        fact /= 10;
      }
      
      return fact % 10;
    }
  
  // public static void main(String[] args) {
  //       Scanner sc = new Scanner(System.in);
  //       int n = sc.nextInt();
  //       System.out.println(check(n));  
  //   }

    
}