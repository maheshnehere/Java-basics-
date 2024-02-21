public class Fibonnaci {
    public static void main(String[] args) {
        int number = 10;
        int firstnum = 0;
        int secondnum = 1;

        for (int i = 1;i < number;i++)
        {
            System.out.print(firstnum+",");

            int nextterm = firstnum + secondnum;

            firstnum = secondnum;
            secondnum = nextterm;
        }
    }
}
