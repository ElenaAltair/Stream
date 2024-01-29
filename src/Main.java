import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        List<Integer> intList2 = new ArrayList<>();

        //Отфильтруйте положительные числа
        for (int number : intList) {
            if (number > 0 && number % 2 == 0) {
                intList2.add(number);
            }
        }


        //Отсортируйте отфильтрованные числа в порядке возрастания
        Collections.sort(intList2);

        //Выведите результат на экран
        for (int number : intList2) {
            System.out.print(number + ", ");
        }
        System.out.println();


    }
}
