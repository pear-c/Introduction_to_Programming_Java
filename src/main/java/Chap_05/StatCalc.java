package Chap_05;

public class StatCalc {
    private int count;
    private double sum;
    private double squareSum;
    private double max;
    private double min;

    public StatCalc() {
        count = 0;
        sum = 0;
        squareSum = 0;
        max = Double.MIN_VALUE;
        min = Double.MAX_VALUE;
    }

    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num * num;
        if(num > max) {
            max = num;
        }
        if(num < min) {
            min = num;
        }
    }

    public int getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getMean() {
        return sum / count;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt(squareSum / count - mean * mean);
    }
}
