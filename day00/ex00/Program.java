public class Program {
    public static void main(String[] args)  {
        int num = 479598;
        
        int ris = 0;
        
        ris += num % 10;
        num /= 10;
        ris += num % 10;
        num /= 10;
        ris += num % 10;
        num /= 10;
        ris += num % 10;
        num /= 10;
        ris += num % 10;
        num /= 10;
        ris += num % 10;
        num /= 10;

        System.out.println(ris);
    }
}
