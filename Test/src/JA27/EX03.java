package JA27;

public class EX03 {
    public static void main(String[] args) {
        //다차원 배열

        int[][] arrays = new int[3][3]; //3*3 9blocks 선언시에는 1부터?

        arrays[0][0] = 1;
        arrays[0][1] = 2;
        arrays[0][2] = 3;
        arrays[1][0] = 4;
        arrays[1][1] = 5;
        arrays[1][2] = 6;
        arrays[2][0] = 7;
        arrays[2][1] = 8;
        arrays[2][2] = 9;

        System.out.println(arrays.length);
        
        //for 문에서 실행문이 한줄(바로아래)라면 중괄호가 없어도 작동
        for (int i = 0; i < arrays.length; ++i) {
            for (int j = 0; j < arrays.length; ++j) {
                System.out.println(arrays[i][j]);
            }

        }

        int [][] ezarrays = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //3dimension array

        int [][][] d3arrs = {
                {
                        {11,12,13},
                        {14,15,16},
                        {17,18,19}
                },
                {
                        {21,22,23},
                        {24,25,26},
                        {27,28,29}
                },
                {
                        {31,32,33},
                        {34,35,36},
                        {37,38,39}
                }

        };

        System.out.println(d3arrs[2][1][0]);
        System.out.println(d3arrs.length); //row의 개수 층의수
        System.out.println(d3arrs[0].length); //첫 row의 colum의 길이 0층의 호의 수
        System.out.println(d3arrs[0][0].length); // 0층 - 0호 - 방의 개수

    }
}
