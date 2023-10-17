package Algorutmus;

public class Task2 {
//    Написать рекурсивную функцию вычисления факториала factorial(n) - произведения всех чисел до n включительно

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
//
//Оценить временную сложность фрагментов алгоритмов:
//
//
//a)  Временная сложность: O(n * m)
//for (int i = 0; i < n; ++i) {
//  for (int j = 1; j < m; ++j) {
//    a[i][j]++;
//  }
//}
//
//
//b) Временная сложность: O(n^2)
//for (int i = 0; i < n-1; ++i) {
//  for (int j = 0; j < n-i; ++j) {
//    a[i][j]++;
//  }
//}
//
//
//c)Временная сложность: O(n * log3(n))
//for (int i = 0; i < n; ++i) {
//  for (int j = 1; j < n; j *= 3) {
//    a[i][j]++;
//  }
//}
//
//
//d)Временная сложность: O(1000 * n)
//for (int i = 0; i < 1000; ++i) {
//  for (int j = 1; j < n; ++j) {
//    ++count;
//  }
//}
//
//
//e)Временная сложность:  O(n^2).
//for (int i = 0; i < n; ++i) {
//  for (int j = 0; j < n/3; ++j) {
//    matrx[i][i]++;
//  }
//}

}
