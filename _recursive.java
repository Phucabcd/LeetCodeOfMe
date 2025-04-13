public class _recursive {
    
    public static void recurse(int n){
        if(n > 4){
            return;
        }

        System.out.println("n : " + n);
        recurse(n + 1);
        System.out.println("back n : " + n);
    }

    public static void main(String[] args) {
        recurse(0);
    }
}
