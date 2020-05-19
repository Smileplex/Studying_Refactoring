
public class BaseExample {
    private static String _content = "1234567890";

    public static void main(String[] args) {
        print(3);
    }

    //해당 메서드는 내용 출력과 테두리 출력의 기능을 가지고 있습니다.
    private static void print(int times) {
        // TODO Auto-generated method stub
        System.out.print("+");
        for(int i = 0 ; i < _content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for(int i = 0 ; i < times; i++) {
            System.out.println("|"+_content+"|");
        }

        System.out.print("+");
        for(int i = 0 ; i < _content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
