package JA27;

public class EX02 {
    public static void main(String[] args) {
        int[] arr1 = new int[6];
        int index = 0;

        while (true) {
            int num = (int)(Math.random()*30 + 1); //난수 생성 0~30
            //random 은 0과 1사이수 무작위 출력

            boolean insert = true;

            for (int i = 0; i <= index ; i++){
                if (arr1[index] == num) {
                insert = false; //arr1안에서 중복되는지 확인
                break;}

            }

            if (insert == true) {
                arr1[index] = num;
                ++index;
            }

            if (index == 6) break;



        }

        for (int i = 0; i <6 ;++i) {
            System.out.println(arr1[i]);
        }
    }
}
