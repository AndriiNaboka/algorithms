package unionfind;


import java.util.Arrays;

public class UnionFindGreedyAlgorithm implements UnionFind {
    //represent array of sets
    //element of array represents set
    //at first time sets consist from one element that represent index
    private int[] sets;

    public UnionFindGreedyAlgorithm(int length) {
        sets = new int[length];

        for (int set = 0; set < length; set++) {
            sets[set] = set;
        }
    }

    //if elements of array equals it means that elements are in the same set
    @Override
    public boolean connected(int point1, int point2) {
        return sets[point1] == sets[point2];
    }

    @Override
    public void connect(int point1, int point2) throws IllegalAccessException {
        if (point1 > sets.length || point2 > sets.length) {
            throw new IllegalAccessException();
        }

        int setPoint1 = sets[point1];
        int setPoint2 = sets[point2];

        if (setPoint1 == setPoint2) {
            return;
        }

        //find all sets that related to the set of point2
        //and change set to the set of poin1
        for (int i = 0; i < sets.length; i++) {
            if (sets[i] == setPoint2) {
                sets[i] = setPoint1;
            }
        }
    }


    @Override
    public String toString() {
        return "UnionFindGreedyAlgorithm{" +
                "sets=" + Arrays.toString(sets) +
                '}';
    }
}
