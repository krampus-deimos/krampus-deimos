package hammy;

public class AreTheyTheSame {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        comp(a,b);
    }

    public static boolean comp(int[]a, int[]b){
        if(b.length < a.length ) return false;
        if(a.length == 0) return true;
        boolean flag = false;
        int first = a[0];
        double same = Math.pow(first, 2);
        int[] copy = new int[a.length-1];
        for (int i = 0; i < b.length; i++) {
            if(i < a.length-1) {
                System.out.println(a[i+1]);
                copy[i] = a[i+1];
            }
            if(b[i] == same) flag = true;
        }
        if(!flag) return false;
        else return comp(copy, b);
    }
}
