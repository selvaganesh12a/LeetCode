class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double faren = (1.80 * celsius) + 32;
        return new double[]{kelvin,faren};
    }
}