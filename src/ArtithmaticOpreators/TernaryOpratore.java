package ArtithmaticOpreators;

public class TernaryOpratore {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;
        int smallest,temp;

        // for smallest number
        temp = (a<b) ? a:b;
        smallest = (c<temp) ? c:temp;
        System.out.println("smallest number is :" + smallest);

        //for gretest number
        temp = (a>b) ? a:b;
        int gretest = (c>temp) ? c:temp;
        System.out.println("gretest number is :" + gretest);

    }
}
