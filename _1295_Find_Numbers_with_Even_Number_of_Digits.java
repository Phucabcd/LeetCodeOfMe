public class _1295_Find_Numbers_with_Even_Number_of_Digits {

    public static int findNumbers(int[] nums) {
        int cout = 0;

        for (int a : nums) {
            int soLuongChuSo = tinhSoChuSo(a);
            if (soLuongChuSo % 2 == 0) {
                cout++;
            }
        }
        return cout;
    }

    private static int tinhSoChuSo(int a) {
        int result = a;
        int bienDem = 0;
        while (result != 0) {
            result = a / 10;
            a = result;
            bienDem++;
        }

        return bienDem;
    }

    public static void main(String[] args) {
        int[] nums = {1, 22, 3333, 444};

        System.out.println(findNumbers(nums));
    }
}
