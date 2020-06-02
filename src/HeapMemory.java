import java.util.ArrayList;
import java.util.List;

public class HeapMemory {
    public static void main(String[] args){
        int orderAmount = 3900000;
        String orderUrl = "http://www.sushiandchips.com/order";

        List<String> orderItems = new ArrayList<>();
        orderItems.add("California Roll");
        orderItems.add("Dragon Roll");

        calculate(orderItems);
    }

    private static void calculate(List<String> orderItems) {
        String item = orderItems.get(0);
        if(item.equals("California Roll"))
            orderItems.add("Bonus Roll given");
        Integer a = 32;
        System.out.println(item);
    }
}
