public class CtoF {
    public static void main(String[] args) {
        //t will hold the input number

        double t;
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("Enter the number: ");
            t = sc.nextDouble();
        }
        while (t <= 0);
    }
}