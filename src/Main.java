import java.util.*;

public class Main implements  Runnable
{
    GUI gui = new GUI();



    public static void main(String[] args)
    {

//        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
//        System.out.print("Enter Size of Population ");
//        int sizeofPopulation= sc.nextInt();
//        System.out.print("Enter Size of World ");
//        int sizeofWorld= sc.nextInt();
//        System.out.print("Enter Infection Rate ");
//        int infectionRate= sc.nextInt();
//        System.out.print("Enter Number of Iteration ");
//        int numofIteration= sc.nextInt();
//        System.out.print("Enter Initial Number of Infected Individuals ");
//        int infectedIndividuals= sc.nextInt();
//        System.out.print("Enter Probability of having Chronic Disease ");
//        int probabilityofDisease= sc.nextInt();


        new Thread(new Main()).start();
    }

    @Override
    public void run()
    {

        while(true)
        {
            gui.repaint();
        }
    }

}
