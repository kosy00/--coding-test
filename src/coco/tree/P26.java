package coco.tree;

//예상 대진표
public class P26 {
    public int solution(int n, int a, int b) {
        int round;

        for(round = 0; ; round++) {
            if(a == b) break;
            a = (a + 1) / 2;
            b = (b + 1) / 2;
        }
        return round;
    }
}
