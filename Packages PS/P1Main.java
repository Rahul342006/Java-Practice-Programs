import Calculator.*;
import java.util.Scanner;

public class P1Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose Calculator:");
            System.out.println("1. Normal Calculator");
            System.out.println("2. Scientific Calculator");
            System.out.println("3. Hybrid Calculator");
            System.out.println("4. Exit");

            int ch = sc.nextInt();

            switch (ch) {

                // ================= NORMAL CALCULATOR =================
                case 1:
                    boolean calc = true;
                    while (calc) {
                        System.out.println("\n1.Add 2.Sub 3.Mul 4.Div 5.Back");
                        int op = sc.nextInt();

                        if (op == 5) {
                            calc = false;
                            break;
                        }

                        System.out.print("Enter num1: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter num2: ");
                        double b = sc.nextDouble();

                        Calc obj = new Calc(a, b);

                        if (op == 1) System.out.println("Result: " + obj.addition());
                        else if (op == 2) System.out.println("Result: " + obj.subraction());
                        else if (op == 3) System.out.println("Result: " + obj.multiplication());
                        else if (op == 4) System.out.println("Result: " + obj.division());
                        else System.out.println("Invalid option");
                    }
                    break;

                // ================= SCIENTIFIC CALCULATOR =================
                case 2:
                    boolean sci = true;
                    while (sci) {
                        System.out.println("\n1.Power 2.Sqrt 3.Log 4.Factorial 5.Trig 6.Back");
                        int op = sc.nextInt();

                        if (op == 6) {
                            sci = false;
                            break;
                        }

                        System.out.print("Enter number: ");
                        double n = sc.nextDouble();

                        HybridCalc s = new HybridCalc(n);

                        if (op == 1) System.out.println("Result: " + s.power());
                        else if (op == 2) System.out.println("Result: " + s.squareroot());
                        else if (op == 3) System.out.println("Result: " + s.log());
                        else if (op == 4) System.out.println("Result: " + s.factorial(n));
                        else if (op == 5) {
                            System.out.println("1.Sin 2.Cos 3.Tan");
                            int t = sc.nextInt();
                            System.out.println("Result: " + s.trignomentary(t));
                        }
                    }
                    break;

                // ================= HYBRID CALCULATOR =================
                case 3:
                    boolean hybrid = true;
                    while (hybrid) {
                        System.out.println("\n1.Add 2.Sub 3.Mul 4.Div");
                        System.out.println("5.Power 6.Sqrt 7.Log 8.Factorial 9.Trig 10.Back");

                        int op = sc.nextInt();

                        if (op == 10) {
                            hybrid = false;
                            break;
                        }

                        if (op <= 4) {
                            System.out.print("Enter num1: ");
                            double a = sc.nextDouble();
                            System.out.print("Enter num2: ");
                            double b = sc.nextDouble();

                            HybridCalc h = new HybridCalc(a, b);

                            if (op == 1) System.out.println(h.addition());
                            else if (op == 2) System.out.println(h.subraction());
                            else if (op == 3) System.out.println(h.multiplication());
                            else if (op == 4) System.out.println(h.division());

                        } else {
                            System.out.print("Enter number: ");
                            double n = sc.nextDouble();

                            HybridCalc h = new HybridCalc(n);

                            if (op == 5) System.out.println(h.power());
                            else if (op == 6) System.out.println(h.squareroot());
                            else if (op == 7) System.out.println(h.log());
                            else if (op == 8) System.out.println(h.factorial(n));
                            else if (op == 9) {
                                System.out.println("1.Sin 2.Cos 3.Tan");
                                int t = sc.nextInt();
                                System.out.println(h.trignomentary(t));
                            }
                        }
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
