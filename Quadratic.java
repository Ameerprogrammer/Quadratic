public class Quadratic {

    public static int solutions(int a,int b,int c) {
        //discriminant formula
        int D = b*b-4*a*c;

        //2 real solutions
        if(D > 0) {
            return 2;
        }
        //1 real solution
        if(D == 0) {
            return 1;
        }
        //not existing solution
        if(D < 0) {
            return 0;
        }

        return D;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + solutions(1,0,-1) + " solutions");
        System.out.println("Output: " + solutions(1,0,0)+ " solutions");
        System.out.println("Output: " + solutions(1,0,1)+ " solutions");
    }
}