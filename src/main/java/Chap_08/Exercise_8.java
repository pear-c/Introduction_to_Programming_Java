package Chap_08;

public class Exercise_8 {
    static public double root (double A, double B, double C) throws IllegalArgumentException {
        if(A == 0) {
            throw new IllegalArgumentException("A can't be zero");
        }
        else {
            double disc = B*B - 4*A*C;
            if(disc < 0) {
                throw new IllegalArgumentException("Discriminant < zero.");
            }
            return (-B + Math.sqrt(disc)) / (2*A);
        }

    }
    public static void main(String[] args) {
        System.out.println(root(3, 5, 1));

    }
}
