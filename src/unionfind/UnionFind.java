package unionfind;

public interface UnionFind {
    boolean connected(int point1, int point2);

    void connect(int point1, int point2) throws IllegalAccessException;
}
