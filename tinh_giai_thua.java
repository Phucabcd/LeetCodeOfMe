


public class tinh_giai_thua {
    static int tinh(int n){
        if(n == 1){
            return 1;
        }else{
            return (n * tinh(n - 1));
    }
}
    public static void main(String[] args) {
        System.out.println("Giai thua cua 6 la: " + tinh(5));
}
    
}