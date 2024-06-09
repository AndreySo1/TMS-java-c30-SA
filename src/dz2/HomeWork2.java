package dz2;

public class HomeWork2 {
    public static void task1(int number) {
        System.out.println("HW2-task1-description: Вывести число в обратном порядке");
        System.out.println("Number before: " + number);
        boolean isMinus = false;
        if (number < 0) { // отрицательное число? в конце вернем минус
            number *= -1;
            isMinus = true;
        }
        int numberForCount = number;
        int newNumber = 0;
        int count = 1;

        for(int i = 2; numberForCount / 10 >= 1; i++){ // оприделяем из скольки цифр состоит число
            numberForCount = numberForCount / 10;
            count = i;
        }

        for(int i = count; i > 0; i--){
            int multiplier = 1;
            for(int j = i; j > 1; j--){
                multiplier *= 10;
            }
            newNumber += (number % 10) * multiplier;
            number = number / 10;
        }
        System.out.println("Number after: " + (isMinus ? (newNumber * -1) : newNumber));
        System.out.println("END--------------------");
    }

    public static void task2(int number) {
        System.out.println("HW2-task2-description: Вывести макс и мин цифры");
        System.out.println("Number: " + number);
        if (number < 0) number *= -1; // если число отрицательное переводим в +
        int max = 0;
        int min = 9;

        for (;;) {
            if (number % 10 > max) max = number % 10;
            if (number % 10 < min) min = number % 10;
            if (number < 10) {
                break;
            }
            number = number / 10;
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        System.out.println("END--------------------");
    }

    public static void task3(int number) {
        System.out.println("HW2-task3-description: Вывести true если в числе нет цифр дубликатов");
        System.out.println("Number: " + number);
        if (number < 0) number *= -1; // если число отрицательное переводим в +
        boolean allDigitUnic = true;
        int digitUnic0 = 0;
        int digitUnic1 = 0;
        int digitUnic2 = 0;
        int digitUnic3 = 0;
        int digitUnic4 = 0;
        int digitUnic5 = 0;
        int digitUnic6 = 0;
        int digitUnic7 = 0;
        int digitUnic8 = 0;
        int digitUnic9 = 0;

        for (;;) {
            switch (number % 10){
                case 0: digitUnic0++; break;
                case 1: digitUnic1++; break;
                case 2: digitUnic2++; break;
                case 3: digitUnic3++; break;
                case 4: digitUnic4++; break;
                case 5: digitUnic5++; break;
                case 6: digitUnic6++; break;
                case 7: digitUnic7++; break;
                case 8: digitUnic8++; break;
                case 9: digitUnic9++; break;
            }

            if (digitUnic0 > 1 || digitUnic1 > 1 || digitUnic2 > 1 || digitUnic3 > 1 || digitUnic4 > 1 || digitUnic5 > 1 || digitUnic6 > 1 || digitUnic7 > 1 || digitUnic8 > 1 || digitUnic9 > 1){
                allDigitUnic = false;
                break;
            }

            if (number < 10) {
                break;
            }
            number = number / 10;
        }

        System.out.println("Result: " + allDigitUnic);
        System.out.println("END--------------------");
    }
}
