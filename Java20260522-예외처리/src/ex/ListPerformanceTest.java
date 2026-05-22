package ex;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceTest {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // 초기 데이터 저장
        for (int i = 0; i < 300000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start;
        long end;

        // =====================================
        // 1. 조회 (get)
        // =====================================

        start = System.nanoTime();

        for (int i = 0; i < 300000; i++) {
            arrayList.get(i);
        }

        end = System.nanoTime();

        System.out.println("ArrayList 조회 시간 : " + (end - start));



        start = System.nanoTime();

        for (int i = 0; i < 300000; i++) {
            linkedList.get(i);
        }

        end = System.nanoTime();

        System.out.println("LinkedList 조회 시간 : " + (end - start));



        // =====================================
        // 2. 수정 (set)
        // =====================================

        start = System.nanoTime();

        for (int i = 0; i < 300000; i++) {
            arrayList.set(i, i * 10);
        }

        end = System.nanoTime();

        System.out.println("ArrayList 수정 시간 : " + (end - start));



        start = System.nanoTime();

        for (int i = 0; i < 300000; i++) {
            linkedList.set(i, i * 10);
        }

        end = System.nanoTime();

        System.out.println("LinkedList 수정 시간 : " + (end - start));



        // =====================================
        // 3. 삽입 (add)
        // 중간 위치 삽입
        // =====================================

        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(50000, 999);
        }

        end = System.nanoTime();

        System.out.println("ArrayList 삽입 시간 : " + (end - start));



        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(50000, 999);
        }

        end = System.nanoTime();

        System.out.println("LinkedList 삽입 시간 : " + (end - start));



        // =====================================
        // 4. 삭제 (remove)
        // 앞 삭제
        // =====================================

        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.remove(0);
        }

        end = System.nanoTime();

        System.out.println("ArrayList 삭제 시간 : " + (end - start));



        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.remove(0);
        }

        end = System.nanoTime();

        System.out.println("LinkedList 삭제 시간 : " + (end - start));
    }
}