package unionfind;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        UnionFind unionFind = new UnionFindGreedyAlgorithm(5);

        System.out.println(unionFind);
        unionFind.connect(0, 1);
        System.out.println(unionFind);
        unionFind.connect(2, 4);
        System.out.println(unionFind);
        unionFind.connect(0, 2);
        System.out.println(unionFind);
    }
}
