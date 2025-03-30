public class recursion {
    public static void main(String[] args) {
        int result = sum(10);  // funcao criada
        System.out.println(result);
    }
    public static int sum(int k) {
        if(k > 0) {
            return sum(k - 1);
        } else {
            return 0;
        }
    }
}

