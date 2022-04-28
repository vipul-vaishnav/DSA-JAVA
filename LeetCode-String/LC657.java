public class LC657 {
    public static void main(String[] args) {
        String moves = "LL";
        System.out.println(judgeCircle(moves));
    }

    // 657. Robot Return to Origin

    static boolean judgeCircle(String moves) {
        int[] pos = { 0, 0 };
        char[] movesArr = moves.toCharArray();
        for (int i = 0; i < movesArr.length; i++) {
            if (movesArr[i] == 'U') {
                pos[1] += 1;
            } else if (movesArr[i] == 'D') {
                pos[1] -= 1;
            } else if (movesArr[i] == 'L') {
                pos[0] -= 1;
            } else if (movesArr[i] == 'R') {
                pos[0] += 1;
            }
        }
        return pos[0] == 0 && pos[1] == 0;
    }
}
