class StudentInfo {
    public static void main(String[] args){

        int age = 21;
        String name = "Om";
        String course = "TY BSc CS";
        double per = 88.2;

        System.out.println("Name : " + name);
        System.out.println("Age is :" + age);
        System.out.println("Course :" + course);
        System.out.println("Percentage :" + per);
    }
}


// Java-1 Student information
// class StudentInfo {
//     public static void main(String[] args) {
//         int roll = 101; String name = "Prasad";
//         String course = "TY BSc CS"; double per = 78.5;
//         System.out.println("Roll: " + roll);
//         System.out.println("Name: " + name);
//         System.out.println("Course: " + course);
//         System.out.println("Percentage: " + per);
//     }
// }

// Java-2 Prime number
// import java.util.Scanner;
// class Prime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int n = sc.nextInt();
//         boolean prime = n > 1;
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) { prime = false; break; }
//         }
//         System.out.println(n + (prime ? " is prime" : " is not prime"));
//     }
// }

// Java-3 Fibonacci (n terms)
// class Fib {
//     public static void main(String[] args) {
//         int n = 10, a = 0, b = 1;
//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");
//             int c = a + b; a = b; b = c;
//         }
//     }
// }
// Output: 0 1 1 2 3 5 8 13 21 34

// Java-11 Sum of array
// class ArraySum {
//     public static void main(String[] args) {
//         int[] a = {10, 20, 30, 40, 50};
//         int sum = 0;
//         for (int x : a) sum += x;
//         System.out.println("Sum = " + sum);   // 150
//     }
// }