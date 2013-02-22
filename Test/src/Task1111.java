/**
 * Created with IntelliJ IDEA.
 * User: Nick
 * Date: 22.02.13
 * Time: 12:47
 * To change this template use File | Settings | File Templates.
 */
public class Task1111 {
    public static void main(String[] args) {
//        StdOut.print("Enter cols num: ");
//        int n = StdIn.readInt();
//        StdOut.print("Enter rows num: ");
//        int m = StdIn.readInt();
//
//        boolean[][] mas = new boolean[n][m];
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[0].length; j++) {
//                mas[i][j] = StdRandom.bernoulli();
//            }
//        }
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[0].length; j++) {
//                if (mas[i][j]) {
//                    StdOut.print('*');
//                } else {
//                    StdOut.print(' ');
//                }
//            }
//            StdOut.println();
//        }
//
//        trans(mas);
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[0].length; j++) {
//                if (mas[i][j]) {
//                    StdOut.print('*');
//                } else {
//                    StdOut.print(' ');
//                }
//            }
//            StdOut.println();
//        }
//
//        StdOut.println("Enter num for find log(2)");
//        StdOut.println("Result: "+ lg(StdIn.readInt()));

        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++){
            mas[i] = StdRandom.uniform(10);
        }
        for (int i = 0; i < mas.length; i++){
            StdOut.print(mas[i] + " ");
        }
        StdOut.println();
        int[] res = histogram(mas, mas.length);
        for (int i = 0; i < res.length; i++){
            StdOut.print(res[i] + " ");
        }
    }

    public static void trans(boolean[][] mas) {
        for (int i = 1; i < mas.length; i++) {
            for (int j = i - 1; j < mas[0].length; j++) {
                boolean bubble = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = bubble;
            }
        }
    }

    public static int lg(int n){
        int base = 2;
        int step = 0;
        int num = 1;


        while (step != Integer.MAX_VALUE){
            if ((num * base) > n){
                return step;
            }else
            {
                num = num * base;
                step++;
            }
        }
    return -1;
    }

    public static int[] histogram(int[] a, int m){
        int[] results = new int[m];

        int count;
        for (int i = 0; i < a.length; i++){
            count = 0;
            for (int j = 0; j < a.length; j++){
                 if (a[i] == a[j]){
                     count++;
                 }
            results[i] = count;
            }
        }
        return results;

    }
}
