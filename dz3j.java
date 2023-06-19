import java.util.ArrayList;
import java.util.Random;

public class dz3j {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        rand_add_list(10, 100, list);
        System.out.println("Исходный список: " + list);
        min_element(list);
        max_element(list);
        avg_sum(list);

    }

    public static void rand_add_list(int count, int maxValue, ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            list.add(rand.nextInt(maxValue));
        }
    }

    public static void min_element(ArrayList<Integer> list) {
        list.sort(null);
        int min = list.get(0);
        System.out.println("Минимальный элемент в списке: " + min);
    }

    public static void max_element(ArrayList<Integer> list) {
        list.sort(null);
        int max = list.get(list.size() - 1);
        System.out.println("Минимальный элемент в списке: " + max);
    }

    public static void avg_sum(ArrayList<Integer> list) {
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        float avg = sum / list.size();
        System.out.println("Среднее арифметическое эл-ов списка: " + avg);
    }
}