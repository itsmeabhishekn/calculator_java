import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println(" Menu Driven Calculator \n --------------------  \n" +
                " Please enter the choice \n" + "1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Mod "
        );

        int ch = reader.nextInt();

        switch (ch)
        {
            case 1:
                int n1 = reader.nextInt();
                int n2 = reader.nextInt();
                System.out.println("the output is " +(n1+n2));
                break;

            case 2:
                int nn1= reader.nextInt();
                int nn2 = reader.nextInt();
                System.out.println("The output is "+(nn1-nn2));
                break;

        }

    }

}
