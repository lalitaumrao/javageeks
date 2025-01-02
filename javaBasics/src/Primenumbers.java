public class Primenumbers {

    public static void main(String[] args)
    {

        int n = 654567347;
        boolean prime = true;
        if (n == 1)
            prime = false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                prime = false;
        }

        System.out.println(prime);
    }
}
