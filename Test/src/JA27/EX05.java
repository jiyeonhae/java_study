package JA27;

import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;

public class EX05 {
    public static void main(String[] args) {
        //Selection Sort

        //Random 값 만들기

        int[] asd = new int[5];
        int index = 0;

        while (true) {
            int num = (int) (Math.random()*30+1);
            boolean check = true;

            for (int i = 0; i <= index; ++i){
                if (asd[index] == num) {
                    check = false;
                    break;}
                 }

            if (check == true){
                asd[index] = num;
                ++index;
            }
            if (index == 5) break;

        }
        for (int i = 0; i < asd.length; ++i)
        {
            System.out.println(asd[i]);}

        System.out.println("====================================");
        //버블정렬 오름차 뒤로갈수록 커짐
        for (int i = 0; i < asd.length - 1; ++i){    //현재의 수  - 맨마지막 index의 숫자는 존재x
            for (int j = (i+1); j< asd.length; ++j){      //비교할 다음 수 - i번째 다음의 숫자들과 비교해야해서 i+1

                if (asd[i]< asd[j]){ //--------------------------------부호를 통해 오름차/내림차 변경가능
                    int temp = asd[i];
                    asd[i] = asd[j];
                    asd[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(asd));

        System.out.println("====================================");
        //선택정렬 내림차 뒤로갈수록 작아짐
               /* for (int i = 0; i < asd.length; ++i){
                    for (int j =0; j < i - 1; ++j) {
                        if (asd[i]>asd[j]){
                            int temp = asd[i];

                        }
                    }
                }*/

        int temp;
        for (int i = 0; i< asd.length-1; i++){
            int indexMin = i;
            for (int j = i +1; j< asd.length; j++){
                if (asd[j]> asd[indexMin]){          //--------------------------------부호를 통해 오름차/내림차 변경가능
                    indexMin = j;
                }
            }
            temp = asd[indexMin];
            asd[indexMin] = asd[i];
            asd[i] = temp;


        }

        System.out.println(Arrays.toString(asd));
    }
}
