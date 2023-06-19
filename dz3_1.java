import java.util.LinkedList;
import java.util.Random;


public class dz3_1 {
    public static void main(String[] args) {
         LinkedList<Integer> list = new LinkedList<>();
        rand_add_list(10, 100, list);
        System.out.println("Исходный список: " + list);
        remove_even(list);
        System.out.println("Список без четных чисел: " + list);

    }

    public static void rand_add_list(int count, int maxValue, LinkedList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            list.add(rand.nextInt(maxValue));
        }
    }

    public static void remove_even(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }
    
}
