package Algorutmus;

public class Task1 {
//    Дан отсортированный массив, в котором все элементы встречаются дважды (один за другим), а один элемент появляется только один раз.
//Написать метод для нахождения этого элемента.
//Решить задачу
//
//
//через простой цикл
//2*. через бинарный поиск

//1.
    public int findSingleElement(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

//    2.
public int findSingleElement2(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (mid % 2 == 1) {
            mid--;
        }

        if (arr[mid] != arr[mid + 1]) {
            right = mid;
        } else {
            left = mid + 2;
        }
    }
    return arr[left];
}

}
