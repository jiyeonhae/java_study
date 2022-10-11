package pac2;

public class Main2
{
    public static void main(String[] args)
    {
        Look ex = new Look( 20);
        ex.output(); //왜안되나 했더니 내가 메서드 안만든거였음

        Look ex2 = new Look();
        ex2.output();

    }
    
    // 데이터 이동 = 데이터 복사 - 이전 장소 데이터 삭제
    // 데이터 변경 = 데이터 생성 - 이전 데이터 삭제
    
    //생성자는 생성 당시에 한번만 호출 가능
}
