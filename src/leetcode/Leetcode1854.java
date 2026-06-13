package leetcode;

public class Leetcode1854 {
    static void main() {
        int logs[][] = {{1993,1999},{2000,2010}};
        int n = logs.length;
        int[] populationChange = new int[101];
        for (int i=0; i<n; i++) {
            int birth = logs[i][0];
            int death = logs[i][1];
            populationChange[birth - 1950]++;
            populationChange[death - 1950]--;
        }
        int maxPopulation = 0;
        int maxYear = 1950;
        int currentPopulation = 0;

        for (int i = 0; i < 101; i++) {
            currentPopulation += populationChange[i];

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxYear = 1950 + i;
            }
        }

        System.out.println(maxYear);;
    }
}

