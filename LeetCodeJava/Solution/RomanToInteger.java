public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String roman = "MCCXXXIV";
        int num = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int temp = 0;
            switch (roman.charAt(i)) {
                case 'I':
                    temp = 1;
                    break;
                case 'V':
                    temp = 5;
                    break;
                case 'X':
                    temp = 10;
                    break;
                case 'L':
                    temp = 50;
                    break;
                case 'C':
                    temp = 100;
                    break;
                case 'D':
                    temp = 500;
                    break;
                case 'M':
                    temp = 1000;
                    break;
                default:
                    System.out.println("Invalid Roman Numeral");
                    return;
            }

            if (4*temp < num) {
                num -= temp;
            } else {
                num += temp;
            }

            
        }
        System.out.println(roman);
        System.out.println(num);
    }
}