class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int ans = 0, n = plants.length, a = 0, b = n - 1, volA = capacityA, volB = capacityB;
        while (a <= b) {
            if (a == b) {
                if(plants[a] > volA && plants[b] > volB) ans += 1;
            } else {
                if (plants[a] <= volA) {
                    ans += 0;
                    volA -= plants[a];
                } else {
                    ans += 1;
                    volA = capacityA;
                    volA -= plants[a];
                }
                if (plants[b] <= volB) {
                    ans += 0;
                    volB -= plants[b];
                } else {
                    ans += 1;
                    volB = capacityB;
                    volB -= plants[b];
                }
            }
            a++;
            b--;
        }
        return ans;
    }
}