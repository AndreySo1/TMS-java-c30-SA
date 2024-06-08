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
    }
}
