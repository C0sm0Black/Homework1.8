public class Homework {

    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }

    private static void task3() {


        System.out.println("Задача 3");

        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = {"f", "d", "c"};

        for (int i = array1.length - 1; i >= 1; i--) {

            System.out.print(array1[i] + ", ");

        }

        System.out.println(array1[0]);

        for (int i = array2.length - 1; i >= 1; i--) {

            System.out.print(array2[i] + ", ");

        }

        System.out.println(array2[0]);

        for (int i = array3.length - 1; i >= 1; i--) {

            System.out.print(array3[i] + ", ");

        }

        System.out.println(array3[0]);

    }

    private static void task2() {

        System.out.println("Задача 2");

        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = {"f", "d", "c"};

        for (int i = 0; i < array1.length - 1; i++) {

            System.out.print(array1[i] + ", ");

        }

        System.out.println(array1[array1.length - 1]);

        for (int i = 0; i < array2.length - 1; i++) {

            System.out.print(array2[i] + ", ");

        }

        System.out.println(array2[array2.length - 1]);

        for (int i = 0; i < array3.length - 1; i++) {

            System.out.print(array3[i] + ", ");

        }

        System.out.println(array3[array3.length - 1]);

    }

    private static void task1() {

        System.out.println("Задача 1");

        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = {"f", "d", "c"};

    }

}
