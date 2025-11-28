import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("Lab 1 Java");
        System.out.printf("test");
        try (Scanner sc = new Scanner(System.in)) {

        System.out.println("Виберiть завдання: \nЗавдання №1 - 1 \nЗавдання №2 - 2 \nЗавдання №3 - 3 \nЗавдання №4 - 4 \nВихiд - 0");
        int e = sc.nextInt();
        
        switch (e) {
            case 1 -> first();
            case 2 -> second();
            case 3 -> third();
            case 4 -> fourth();
            default -> System.out.println("Невiрний вибiр");
        }
    }

    }
    
    public static double calcExpression(double x, double y) {
        double part1 = (2 * x * x + x * y) / ((x * y) * (x * y));
        double part2 = (3 * x * y - Math.pow(y, 3)) / (x * x + 2 * y * y);
        return part1 + part2;
    }

    public static void first() {
    try (Scanner sc = new Scanner(System.in)) {
    // Варіант 1: Вхідні дані дійсного типу, результат – дійсний
    System.out.println("Варiант 1: Введiть x (double), y (double):");
    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();
    double res1 = calcExpression(x1, y1);
    System.out.println("Результат (double): " + res1);

    // Варіант 2: Вхідні дані цілого типу, результат – дійсний
    System.out.println("Варiант 2: Введiть x (int), y (int):");
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    double res2 = calcExpression(x2, y2);
    System.out.println("Результат (double): " + res2);

    // Варіант 3: Вхідні дані дійсного типу, результат – цілого типу
    System.out.println("Варiант 3: Введiть x (double), y (double):");
    double x3 = sc.nextDouble();
    double y3 = sc.nextDouble();
    int res3 = (int) calcExpression(x3, y3);
    System.out.println("Результат (int): " + res3);
    }
    }

    public static void second() {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Введiть a (double): ");
        double a = sc.nextDouble();
        System.out.print("Введiть b (double), b > a: ");
        double b = sc.nextDouble();
        System.out.print("Введiть n (кiлькiсть елементiв, n ≤ 200): ");
        int n = sc.nextInt();

        double[] X = new double[n];
        System.out.println("Введiть " + n + " чисел X[i]:");
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextDouble();
        }

        double sumA = 0;
        double prodB = 1;
        boolean boolA = false;
        boolean boolB = false;
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (X[i] < a) {
                sumA += X[i];
                boolA = true;
            }
            if (X[i] > b) {
                prodB *= X[i];
                boolB = true;
            }
            if (X[i] >= a && X[i] <= b) {
                if (X[i] < min) min = X[i];
                if (X[i] > max) max = X[i];
            }
        }

        if (boolA) {
            System.out.println("Сума всiх X(i) < a: " + sumA);
        } else {
            System.out.println("Немає елементiв X(i) < a.");
        }
        if (boolB) {
            System.out.println("Добуток всiх X(i) > b: " + prodB);
        } else {
            System.out.println("Немає елементiв X(i) > b.");
        }
        if (min != Double.MAX_VALUE && max != -Double.MAX_VALUE) {
            System.out.println("Мiнiмальний серед X(i) -> [a, b]: " + min);
            System.out.println("Максимальний серед X(i) -> [a, b]: " + max);
        } else {
            System.out.println("Немає елементiв X(i) -> [a, b].");
        }
    }
    }

    public static void third() {
    try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Введiть n (розмiр матрицi, n ≤ 15): ");
    int n = sc.nextInt();

    int[][] A = new int[n][n];
    int[][] B = new int[n][n];
    int[] X = new int[n];

    System.out.println("Введiть елементи матрицi A:");
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            A[i][j] = sc.nextInt();

    System.out.println("Введiть елементи матрицi B:");
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            B[i][j] = sc.nextInt();

    for (int i = 0; i < n; i++) {
        boolean N = true;
        for (int j = 0; j < n; j++) {
            if (A[i][j] >= 0 || B[i][j] >= 0) {
                N = false;
                break;
            }
        }
        X[i] = N ? 1 : 0;
    }

    System.out.print("Вектор X: ");
    for (int i = 0; i < n; i++)
        System.out.print(X[i] + " ");
    System.out.println();
}
}

public static void fourth() {
    try (Scanner sc = new Scanner(System.in)) {

    System.out.println("Введiть текст:");
    String text = sc.nextLine();

    String[] words = text.split("[\\s\\p{Punct}]+");
    StringBuilder r = new StringBuilder();
    for (String word : words) {
    if (word.length() % 2 == 0) {
        r.append(word).append(" ");
        }
    }

    System.out.println("Результат:");
    System.out.println(r.toString().trim());    
    }
    }

}


