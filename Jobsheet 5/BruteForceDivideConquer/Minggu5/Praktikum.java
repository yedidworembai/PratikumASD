package BruteForceDivideConquer.Minggu5;

public class Praktikum {
    public int cariMaxDC(int[]arr , int l, int r){
        if (l == r){
            return arr[l];

        }
        int mid = (l + r) / 2;
        int maxKiri = cariMaxDC(arr, l, mid);
        int maxKanan = cariMaxDC(arr, mid + 1, r);
        return Math.max(maxKiri, maxKanan);

    }
    public int cariMinDC(int[] arr, int l, int r){
        if (l == r){
            return arr[l];
        }
        int mid = (l + r) / 2;
        int minKiri = cariMinDC(arr, l, mid);
        int minKanan = cariMinDC(arr, mid + 1, r);
        return Math.min(minKiri,minKanan);

    }
    public double hitungRataRataBF(int[] arr){
        double total = 0;
        for (int i = 0; i< arr.length; i++){
            total += arr[i];
        }
        return total / arr.length;
    }
}
