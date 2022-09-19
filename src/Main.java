public class Main {

    public static void main(String[] args) {
	double[] myList= {1.2,1.3,1.4};
double total=0;
        for (double list : myList
        ){
            total=total+list;
            System.out.println(list);
        }
        System.out.println("Sayıların toplamı "+total);
    }
}
