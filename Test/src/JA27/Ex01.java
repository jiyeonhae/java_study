package JA27;

public class Ex01 {
    public static void main(String[] args) {
        {//array
            int[] arr1 = {1, 2, 3, 4, 5}; // C# style

            int arr2[] = new int[5]; // 배열 초기화 C style


            System.out.println(arr1[0]); // 해당 번째 출력 배열 숫자는 0부터 시작
            // sp : 공백 공백문자가 존재! "    " 문자열초기화
            //null : 공백 빈공간! 제어문자

            //alt + drag 여러줄 선택
            //alt+ shift 이동
            //ctrl d 해당 라인 복사
        }

        {
            //원소 : 배열이내 한 단위
            int[] arr1 = new int [3];
            for (int i = 0; i < 3; i++) {
                System.out.println(arr1[i]);
            }

        }
        {  //String array
            String[] starr = {"dd", "we", "sd"}; //.length는 배열의 길이
            for (int i = 0; i < starr.length; i++) {
                System.out.println(starr[i]);
            }
        }

    }
}
