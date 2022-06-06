public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        else {
            int m = reverse(number);
            for (int i = 0; i < getDigitCount(number); i++) {
                int temp = m % 10;
                switch (temp)
                {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }
                m /= 10;
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0)return 1;
        int num = 0;
        while (number > 0) {
            num++;
            number /= 10;
        }
        return num;
    }

    public static int reverse(int number) {
        int New = 0;
        if (number < 0)
        {
            number *= -1;
            while (number > 0)
            {
                New *= 10;
                New += number % 10;
                number /= 10;
            }
            return (New * -1);
        }
        while (number > 0) {
            New *= 10;
            New += number % 10;
            number /= 10;
        }
        return New;
    }
}