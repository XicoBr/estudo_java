public class test {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }
    public static int sum(int start, int end) {
        if (end > start ) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
/*sum(5,5) = 5
* sum(5,6) = 5 + 6
* sum(5,7) = 5 + 6 + 7
* sum(5,8) = 5 + 6 + 7 + 8
* sum(5,9) = 5 + 6 + 7 + 8 + 9
* sum(5,10) = 5 + 6 + 7 + 8 + 9 + 10
*  */