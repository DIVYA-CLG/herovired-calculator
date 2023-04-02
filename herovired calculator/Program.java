import java.util.*;

class Program {
    public static int fac(int n) {
        if(n==1) return 1;
        return n * fac(n-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("COMMAND LINE CALCULATOR");

        System.out.println();
        int x = 1;
        while(x != 0) {
            System.out.println("****SELECT THE OPERATORS SHOWN BELOW*********");
            System.out.println("+ ---> Addition        -  ---> Subraction");
            System.out.println("* ---> Multiplication  /  ---> Division");
            System.out.println("% ---> Percentage      F  ---> Factorial");
            System.out.println("2 ---> Square          C  ---> Cube");
            System.out.println("S ---> Square Root     p---> e Power f");
            System.out.println("R ---> a Root b(don't select)     X ----> Exit");
            System.out.println("SELECT THE SPECIFIC OPERAND");
            char s = sc.next().charAt(0);

            int e,f;
            try {
                switch(s) {
                    case '+': {
                        System.out.println("Enter the values of e and f");
                        e= sc.nextInt();
                        f = sc.nextInt();
                        System.out.println(e+f);
                        break;
                    }
                    case '-': {
                         System.out.println("Enter the values of e and f");
                        e = sc.nextInt();
                        f = sc.nextInt();
                        System.out.println(e-f);
                        break;
                    }
                    case '*': {
                         System.out.println("Enter the values of e and f");
                        e= sc.nextInt();
                        f = sc.nextInt();
                        System.out.println(e*f);
                        break;
                    }
                    case '/': {
                        System.out.println("Enter the values of e and f");
                        e = sc.nextInt();
                        f = sc.nextInt();
                        System.out.println(e/f);
                        break;
                    }
                    case '%': {
                         System.out.println("Enter the values of e and f");
                        e= sc.nextInt();
                        f = sc.nextInt();
                        System.out.println(e%f);
                        break;
                    }
                    case 'F': {
                        System.out.println("Enter the fact value");
                        e = sc.nextInt();
                        System.out.println(fac(e));
                        break;
                    }
                    case '2': {
                        System.out.println("Enter the value");
                        e = sc.nextInt();
                        System.out.println(e*e);
                        break;
                    }
                    case 'C': {
                        System.out.println("Enter the value");
                        e = sc.nextInt();
                        System.out.println(e*e*e);
                        break;
                    }
                    case 'S': {
                        System.out.println("Enter the values of e");
                        e = sc.nextInt();
                        System.out.println(Math.sqrt(e));
                        break;
                    }
                    case 'p': {
                        System.out.println("Enter the values of e and f");
                        e = sc.nextInt();
                        f = sc.nextInt();
                        System.out.println(Math.pow(e,f));
                        break;
                    }
                    case 'R': {
                        System.out.println("Enter the values of f and e");
                        int one = sc.nextInt();
                        int two = sc.nextInt();
                        double root = Math.round(Math.pow(two, 1.0/one));
                        System.out.println(root);
                        break;
                    }
                    case 'X': {
                        x = 0;
                        break;
                    }
                }
            } catch(ArithmeticException g) {
                System.out.println("An arithmetic exception occurred: " + g.getMessage());
            } catch(InputMismatchException g) {
                System.out.println("InputMismatchException occurred: " + g.getMessage());
            }
        }
    }


}

