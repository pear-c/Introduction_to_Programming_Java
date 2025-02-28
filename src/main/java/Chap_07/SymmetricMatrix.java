package Chap_07;

public class SymmetricMatrix {
    private double[][] matrix;

    public SymmetricMatrix(int n) {
        matrix = new double[n][];
        for(int i=0; i<n; i++) {
            matrix[i] = new double[i+1];
        }
    }

    public double get(int row, int col) {
        if(row >= col)
            return matrix[row][col];
        else
            return matrix[col][row];
    }

    public void set(int row, int col, double value) {
        if(row >= col)
            matrix[row][col] = value;
        else
            matrix[col][row] = value;
    }

    public int size() {
        return matrix.length;
    }
}
