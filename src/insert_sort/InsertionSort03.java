package insert_sort;

// 5 8 6 2 4 가 나오도록 정렬을 하시오.

import java.util.Arrays;

public class InsertionSort03 {
    public int[] sort(int[] arr) {
        int temp;

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }

//        for (int j =i; j>0; j--) {
//            System.out.printf("i : %d j : %d j-- : %d\n", i, j, j-1);
//        }

//        int j = i;
//
//        if (arr[j] < arr[j-1]) {
//            temp = arr[j];
//            arr[j] = arr[j-1];
//            arr[j-1] = temp;
//        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {8, 5, 6, 2, 4};

        InsertionSort03 is = new InsertionSort03(); // 객체(인스턴스) 생성, 선언

        int[] result = is.sort(arr1); // result에 arr를 담기
        System.out.println(Arrays.toString(result));

        //1번 정렬 후
        // int[] arr2 = {5, 8, 6, 2, 4};


    }
}
