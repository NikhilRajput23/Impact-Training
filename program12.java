public class program12 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 2};
        int u = f(arr);
        System.out.println(u);
    }

    public static int f(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; 
        }
        return result;
    }
}
