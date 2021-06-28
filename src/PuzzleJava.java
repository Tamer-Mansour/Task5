import java.util.Random;

public class PuzzleJava {
    static int MAX = 26;
    static String printRandomString(int n)
    {
        char []alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z' };

        String res = "";
        for (int i = 0; i < n; i++)
            res = res + alphabet[(int) (Math.random() * 10 % MAX)];

        return res;
    }



    public static void main(String[] args) {
	int sum=0;
	int []array = {3,5,1,2,9,8,13,2,5,32};
	for (int i =0 ; i <array.length; i++) {
        sum += array[i];
       // System.out.println(sum);
    }
	//String []={"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};

            String[] arr={"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
            Random r=new Random();
            int randomNumber=r.nextInt(arr.length);
            System.out.println(arr[randomNumber]);

        int n = 1;
        System.out.print(printRandomString(n));

    }
    }

