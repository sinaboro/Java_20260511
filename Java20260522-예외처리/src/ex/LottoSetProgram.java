package ex;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSetProgram {

    public static void main(String[] args) {

        Random random = new Random();

        Set<Integer> lotto = new HashSet<>();
        
        LottoProgram lo = new LottoProgram();
        
        // Set은 중복 저장이 안됨
        while (lotto.size() < 6) {

            int num = random.nextInt(45) + 1;

            lotto.add(num);
        }

        System.out.println("로또 번호");

        for (int num : lotto) {
            System.out.print(num + " ");
        }
    }
}
