public class HomeWork_2 {

    public static void main(String[] args) {

        /*Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание №1: ");

        for (int i = 0; i < arr1.length; i++)

            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else arr1[i] = 1;

            for (int i = 0; i < arr1.length; i++) {

                System.out.print(arr1[i]);
            }
            System.out.println("\n" + "Задание №2: ");
             array2();

            System.out.println("\n" + "Задание №3: ");
            array3();

            System.out.println("\n" + "Задание №4: ");
            array4();
    }

    /*Задание №2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/

    public static void array2() {
        int[] arr2 = new int[8];

        for (int i = 1, j = 0; i < arr2.length; i++) arr2[i] = j += 3;
        for (int x : arr2) System.out.print(x + " ");
    }

    /*Задание №3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/

    public static void array3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
            System.out.print(arr3[i] + " ");
        }
    }

        /*Задание №4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        заполнить его диагональные элементы единицами;*/

    public static void array4() {
        int[][] arr4 = new int[7][7];

        for (int i = 0; i < arr4.length; i++) {

            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {

                if (i == j || i == ( j2 - 1 )) arr4[i][j] = 1;

                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\r\n");
        }
    }
}







