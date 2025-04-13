public class _recursive {
    
    // public static void recurse(int n){
    //     if(n > 4){
    //         return;
    //     }

    //     System.out.println("n : " + n);
    //     recurse(n + 1);
    //     System.out.println("back n : " + n);
    // }

    public static int result(int n){
        if(n <= 1){
          return 1;
        }
        return n * result(n - 1);
        
        
      }

    public static void main(String[] args) {
        // recurse(1);
        System.out.println(result(4));
    }
}
