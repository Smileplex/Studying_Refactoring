public class StackMemory {
    public static void main(String[] args){
        int value = 3;
        value = firstMethod(value);
    }

    private static int firstMethod(int passedValue) {
        int temp = passedValue * 6;
        int result = temp / 2;
        return secondMethod(result);
    }

    private static int secondMethod(int result) {
        int finalResult = result * 5;
        return finalResult;
    }

    /*
    public class StackAreaExample {
        public static void main(String[] args) {
            int value = 5;	value = 4;	value = 3;	value = 2;
            System.out.println(value);

            for(int i=0; i<5; i++){
            }

            System.out.println(i);
        }
}
*/
}
