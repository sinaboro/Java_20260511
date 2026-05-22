package ex;

import java.util.Random;

public class LottoProgram {

    public static void main(String[] args) {

        Random random = new Random();
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {

            int num = random.nextInt(45) + 1;
            boolean duplicate = false;

            // 기존에 뽑은 번호들과 비교
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {
                    duplicate = true;
                    break;
                }
            }

            // 중복이면 현재 자리 다시 뽑기
            if (duplicate) {
                i--;
            } else {
                lotto[i] = num;
            }
        }

        System.out.print("로또 번호 : ");

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
