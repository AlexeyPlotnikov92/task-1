import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num;
        try {
            num = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            throw new IllegalArgumentException("Нужно вводить число!");
        }
        if (num > 0) {
            System.out.println("start solution1");
            solution1(num);
            System.out.println("start solution2");
            solution2(num);
            System.out.println("start solution3");
            solution3(num);

        }
    }

    public static void solution1(int num) {
        for (int i = 1; i < num; i++) {
            if (i % 15 == 0) {
                System.out.println("FooBar");
            } else if (i % 3 == 0) {
                System.out.println("Foo");
            } else if (i % 5 == 0) {
                System.out.println("Bar");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void solution2(int num) {
        for (int i = 1; i < num; i++) {
            int temp = i % 15;
            switch (temp) {
                case 0 -> System.out.println("FooBar");
                case 3 -> System.out.println("Foo");
                case 6 -> System.out.println("Foo");
                case 9 -> System.out.println("Foo");
                case 12 -> System.out.println("Foo");
                case 5 -> System.out.println("Bar");
                case 10 -> System.out.println("Bar");
                default -> System.out.println(i);
            }
        }
    }

    public static void solution3(int num) {
        int i = 0;
        int c = 0;
        int d = 0;
        while (true) {
            ++i;
            ++c;
            ++d;
            StringBuilder sb = new StringBuilder("");
            if (i == num) break;
            if (c == 3) {
                c = 0;
                sb.append("Foo");
            }
            if (d == 5) {
                d = 0;
                sb.append("Bar");
            } else if (d != 0 && c != 0) {
                sb.append(i);
            }
            System.out.println(sb.toString());
        }
    }
}
