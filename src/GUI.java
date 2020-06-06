import javax.swing.*;
import java.util.*;
import java.awt.*;


public class GUI extends JFrame
{
    int spacing = 2;
    int [][]healthy = new int[10][10];
    Random rand = new Random();
    public GUI()
    {
        this.setTitle("Covid19-Simulator");
        this.setSize(1000,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


        for (int i = 0; i< 10;  i++)
        {
            for(int j=0; j <10; j++)
            {
                if(rand.nextInt(100)<60)
                {
                    healthy[i][j]=1;
                }
                if(rand.nextInt(100)<35)
                {
                    healthy[i][j]=0;
                }
                if(rand.nextInt(100)<60)
                {
                    healthy[i][j]=2;
                }

            }
        }


        Board board = new Board();
        this.setContentPane(board);
    }



    public class Board extends JPanel
    {
        public void paintComponent(Graphics g)
        {




            g.setColor(Color.darkGray);
            g.fillRect(0,0,1200,800);
            g.setColor(Color.white);
            for (int i=0;i<10;i++)
            {
                for (int j=0; j<10; j++)
                {


                    if (healthy[i][j]==1)
                    {
                        g.setColor(Color.blue);
                        g.fillRect(spacing + i * 35, spacing + j * 35 + 35, 35 - 2 * spacing, 35 - 2 * spacing);
                        int x = rand.nextInt(4);
                        if(x == 0)
                        {
                            if (healthy[i][j]==0 ||  healthy[i][j]==1)
                            {
                                if(healthy[i-1][j]==2)
                                {
                                    healthy[i-1][j]=1;
                                    healthy[i][j]=2;
                                }
                            }

                        }
                        if(x == 1)
                        {
                            if (healthy[i][j]==0 ||  healthy[i][j]==1)
                            {
                                if(healthy[i][j-1]==2)
                                {
                                    healthy[i][j-1]=1;
                                    healthy[i][j]=2;
                                }
                            }
                        }
                        if(x == 2)
                        {
                            if (healthy[i][j]==0 ||  healthy[i][j]==1)
                            {
                                if(healthy[i+1][j]==2)
                                {
                                    healthy[i+1][j]=1;
                                    healthy[i][j]=2;
                                }
                            }
                        }
                        if(x == 3)
                        {
                            if (healthy[i][j]==0 ||  healthy[i][j]==1)
                            {
                                if(healthy[i][j+1]==2)
                                {
                                    healthy[i][j+1]=1;
                                    healthy[i][j]=2;
                                }
                            }
                        }
                    }
                    else if(healthy[i][j]==0)
                    {
                        g.setColor(Color.red);
                        g.fillRect(spacing + i * 35, spacing + j * 35 + 35, 35 - 2 * spacing, 35 - 2 * spacing);

//                        int x = rand.nextInt(4);
//                        if(x == 0)
//                        {
//                            if (healthy[i][j]==0 ||  healthy[i][j]==1)
//                            {
//                                if(healthy[i-1][j]==2)
//                                {
//                                    healthy[i-1][j]=0;
//                                    healthy[i][j]=2;
//                                }
//                            }
//
//                        }
//                        if(x == 1)
//                        {
//                            if (healthy[i][j]==0 ||  healthy[i][j]==1)
//                            {
//                                if(healthy[i][j-1]==2)
//                                {
//                                    healthy[i][j-1]=0;
//                                    healthy[i][j]=2;
//                                }
//                            }
//                        }
//                        if(x == 2)
//                        {
//                            if (healthy[i][j]==0 ||  healthy[i][j]==1)
//                            {
//                                if(healthy[i+1][j]==2)
//                                {
//                                    healthy[i+1][j]=0;
//                                    healthy[i][j]=2;
//                                }
//                            }
//                        }
//                        if(x == 3)
//                        {
//                            if (healthy[i][j]==0 ||  healthy[i][j]==1)
//                            {
//                                if(healthy[i][j+1]==2)
//                                {
//                                    healthy[i][j+1]=0;
//                                    healthy[i][j]=2;
//                                }
//                            }
//                        }
                    }else if(healthy[i][j]==2)
                        {
                            g.setColor(Color.white);
                            g.fillRect(spacing + i * 35, spacing + j * 35 + 35, 35 - 2 * spacing, 35 - 2 * spacing);
                        }
                }

            }

        }
    }
}
