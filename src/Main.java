public class Main {
    public static void main(String[] args) {
        System.out.println("Задания 1");
        int[] numbers = new int[]{1, 2, 3};
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        int[] numbers2 = new int[]{1, 3, 5, 7};

        System.out.println("Задание 2");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.print(fractionalNumbers[i]);
            if (i < fractionalNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]);
            if (i < numbers2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("Задание 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            System.out.print(fractionalNumbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("Задание 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
    }
}