package JA27;

public class EX04 {
    public static void main(String[] args) {
        
        //문자열 String == Class - literal 상수 실행전 인식함/
        //char = 2bytes String = 
        //String이 같다고 인식하는 방법 - 내용값이 같으면 같은 주소값을 가짐
        String name1 = "Max";
        String name2 = "Cass"; //정적 메모리 할당
        String name3 = "Max"; //이때 name1과 name3는 같은 주소값을 다른 이름으로 참조
        String name4 = new String("Cass"); // 새로운 주소값을 할당 = 동적 할당

        //동적할당 - 정적할당 차이
        //동적 = runtime 중 stack, hip// 정적 = runtime 이전 data, 상수(constant)



        //정렬
        int[] arr1 = new int[10];
        int index = 0;

        while(true) {

            int num = (int)(Math.random()*100+1);
            boolean Check = true;
            for (int i =0; i <= index; ++i) {
                if (arr1[index] == num) {
                    Check = false;
                    break;
                }
            }
            if (Check == true) {
                arr1[index] = num;
                ++index;
            }
            if (index == 10) break;
        }

        for (int a = 0; a < arr1.length; a++){
            System.out.println(arr1[a]);
        }

        System.out.println("---------------------------");
        //난수생성 완료

        //정렬    -- 버블 정렬 안깔끔 잘안씀
        for (int i = 0; i < arr1.length - 1; ++i){    //현재의 수  - 맨마지막 index의 숫자는 존재x 맨앞에서  직전까지
            for (int j = (i+1); j< arr1.length; ++j){      //비교할 다음 수 - i번째 다음의 숫자들과 비교해야해서 i+1
                                                            //i다음 수부터 끝까지

                if (arr1[i]> arr1[j]){
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        //향상된 for 문구조  변수형 : 배열명
        for (int element : arr1) {
            System.out.println(element);
            
        }
        

        //선택정렬을 통해 버블정렬통해 오름차순이 된것을 내림차순으로, 버블정렬이 내림차순이면 오름차순으로 만들어보기

    }
}
