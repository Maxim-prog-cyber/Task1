import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
//        Входные данные
//        В первой строке входных данных содержатся натуральные числа N и K (0<N,K≤100000).
//        Во второй строке задаются N элементов первого массива, отсортированного по возрастанию,
//        а в третьей строке – K элементов второго массива. Элементы обоих массивов - целые числа,
//        каждое из которых по модулю не превосходит 109
//
//        Выходные данные
//
//          Требуется для каждого из K чисел вывести в отдельную строку "YES",
//          если это число встречается в первом массиве, и "NO" в противном случае.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int x1 = scanner.nextInt();
            int[] arr = new int[x];
            int[] arr1 = new int[x1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = scanner.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr1.length ; j++) {
                    if (arr[i] == arr1[j]) {
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }
                    break;
                }
            }
        }
    }

