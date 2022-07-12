

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 
import javax.swing.JDesktopPane; 
import javax.swing.JInternalFrame;
  
public class ProgressBar_BankProject extends JFrame
{    
  JFrame f;
  JLabel l;
  JDesktopPane desktop1;
  JProgressBar pb;    
  int i=0;     
  ProgressBar_BankProject()
  {   
   f=new JFrame(); 
   pb=new JProgressBar(0,300);  
   desktop=new JDesktopPane();
   l=new JLabel("Your Bank portal Is Open After The Loading Bar : ");
   l.setForeground(Color.red);
  
 
   pb.setBounds(200,200,180,30);   
   l.setBounds(170,100,280,30);
   pb.setValue(0);    
   pb.setStringPainted(true);    
   desktop.add(pb);desktop.add(l);
   f.add(desktop);
   f.setSize(600,700);     
   f.setVisible(true);
   f.setLocationRelativeTo(null); 
}  
  
public void iterate()
{    
  while(i<=300){    
  pb.setValue(i);    
  i=i+20;    
  try
  {
    Thread.sleep(150);
  }
  catch(Exception e)
  {}
}
   

       JInternalFrame jf = new JInternalFrame(("BANK PORTAL"), true, true, true, true);
       desktop.add(jf);
       JTextField jt=new JTextField();
       JDesktopPane desktop1 = new JDesktopPane();
       jf.add(BorderLayout.CENTER,desktop1);
        
        
       
        JLabel l=new JLabel("Welcome To Punjab National Bank Portal ");
        

        JButton b1 = new JButton("Credit");
        JButton b2=new JButton("DEBIT");
        JButton b3=new JButton("CHECK_BALANCE");
        JButton b4=new JButton("TRANSFER");
        JButton reset=new JButton("RESET ACCOUNT NUMBER");
        JLabel l1=new JLabel("Account Number :  ");

        l1.setBounds(70,200,400,50);
        jt.setBounds(220,200,200,50);
        l.setBounds(140,100,400,50);
       
        
        
        b1.setBounds(100,340,160,50);
        b2.setBounds(100,430,160,50);
        b3.setBounds(300,430,160,50);
        b4.setBounds(300,340,160,50);
        reset.setBounds(160,540,260,50);
        
        b1.setBackground(Color.CYAN);
        b1.setForeground(Color.black);
        b2.setBackground(Color.CYAN);
        b2.setForeground(Color.black);
        
        b3.setBackground(Color.CYAN);
        b3.setForeground(Color.black);
        b4.setBackground(Color.CYAN);
        b4.setForeground(Color.black);

        reset.setBackground(Color.red);
        reset.setForeground(Color.black);
        
        l.setForeground(Color.red);

        desktop1.add(b1);
        desktop1.add(b3);
        desktop1.add(b2);desktop1.add(b4);desktop1.add(jt);
        desktop1.add(l1);desktop1.add(reset);desktop1.add(l);

       b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JInternalFrame f1 = new JInternalFrame(("Credit"), true, true, true, true);
                f1.setBackground( Color.orange);
                
                JLabel l=new JLabel("Amount : ");
                JTextField jt=new JTextField();
                
                JButton submit = new JButton("Submit");
                l.setBounds(100,200,400,50);
                jt.setBounds(200,200,200,50);
                submit.setBounds(190,350,160,50);
              
               
                desktop1.add(f1);
                f1.add(submit);f1.add(l);f1.add(jt);
                
                submit.setBackground(Color.CYAN);
                submit.setForeground(Color.black);
            
                f1.setVisible(true);
                f1.setLayout(null);
                f1.setSize(580,660);

                submit.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        JInternalFrame f1 = new JInternalFrame(("Succesfull"), true, true, true, true);
                        f1.setBackground( Color.LIGHT_GRAY);
                        
                        int amount=500000;
                        JLabel jl=new JLabel();
                        desktop1.add(f1);
                        f1.add(jl);
                        
                        jl.setBounds(100,200,300,50);
                        jl.setForeground(Color.red);
                        
                        int a = Integer.parseInt(jt.getText());
               
                        int credit=amount+a;
                        String s3=String.valueOf(credit);
                        jl.setText("Balance is  : "+ s3); 
                        jl.setForeground(Color.red);
                    
                        
                        f1.setVisible(true);
                        f1.setLayout(null);
                        f1.setSize(580,660);
                        
                    }
                    
                });
            }
                    
        });

        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JInternalFrame f1 = new JInternalFrame(("Debit"), true, true, true, true);
                f1.setBackground( Color.orange);
                
                JLabel l=new JLabel("Amount : ");
                JTextField jt=new JTextField();
                
                JButton submit = new JButton("Submit");
                l.setBounds(100,200,400,50);
                jt.setBounds(200,200,200,50);
                submit.setBounds(190,350,160,50);
              
               
                desktop.add(f1);
                f1.add(submit);f1.add(l);f1.add(jt);
                
                 
                submit.setBackground(Color.CYAN);
                submit.setForeground(Color.black);
                
            
                f1.setVisible(true);
                f1.setLayout(null);
                f1.setSize(580,660);


                submit.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        JInternalFrame f1 = new JInternalFrame(("Succesfull"), true, true, true, true);
                        f1.setBackground( Color.LIGHT_GRAY);
                        
                        int amount=500000;
                        JLabel jl=new JLabel();
                        desktop.add(f1);
                        f1.add(jl);
                        
                        jl.setBounds(100,200,300,50);
                        
                        int a = Integer.parseInt(jt.getText());
               
                        int credit=amount-a;
                        String s3=String.valueOf(credit);
                        jl.setText("Balance is  : "+ s3); 
                        jl.setForeground(Color.red);
                    
                        
                        f1.setVisible(true);
                        f1.setLayout(null);
                        f1.setSize(580,660);
                        
                    }
                    
                });
                
  
            }
            
        });

        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JInternalFrame f1 = new JInternalFrame(("Balance"), true, true, true, true);
                
                 JLabel jl=new JLabel("Balance is : 500000 ");
                 desktop.add(f1);
                 f1.add(jl);
                        
                jl.setBounds(100,200,300,50);
                jl.setForeground(Color.red);
                
                
               f1.setVisible(true);
               f1.setLayout(null);
               f1.setSize(580,660);
            }
            
        });

        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               JInternalFrame f1 = new JInternalFrame(("Transfer"), true, true, true, true);
                f1.setBackground( Color.orange);
                
                JTextField jt1=new JTextField();
                JTextField jt2=new JTextField();
                JLabel l1=new JLabel("Enter The Sender Account Number : ");
                JLabel l2=new JLabel("Enter The Reciever Account Number : ");
                
                JButton submit = new JButton("Submit");
                
                submit.setBounds(190,350,160,50);
                l1.setBounds(70,120,250,50);
                l2.setBounds(70,180,250,50);
                jt1.setBounds(300,120,200,50);
                jt2.setBounds(300,190,200,50);
              
               
                desktop.add(f1);
                f1.add(submit);f1.add(l1);f1.add(jt1);f1.add(l2);f1.add(jt2);
                
                 
                submit.setBackground(Color.CYAN);
                submit.setForeground(Color.black);
                
            
                f1.setVisible(true);
                f1.setLayout(null);
                f1.setSize(580,660);

                submit.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        JInternalFrame f1 = new JInternalFrame(("Transfer Amount"), true, true, true, true);
                        JLabel l=new JLabel("Amount : ");
                        JTextField jt=new JTextField();
                
                        JButton submit = new JButton("Submit");
                        l.setBounds(100,200,400,50);
                        jt.setBounds(200,200,200,50);
                        submit.setBounds(190,350,160,50);
              
               
                        desktop.add(f1);
                        f1.add(submit);f1.add(l);f1.add(jt);
                
                 
                        submit.setBackground(Color.CYAN);
                        submit.setForeground(Color.black);
                
            
                        f1.setVisible(true);
                        f1.setLayout(null);
                        f1.setSize(580,660);

                        submit.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                               JInternalFrame f1 = new JInternalFrame(("Succesfull"), true, true, true, true);
                               f1.setBackground( Color.LIGHT_GRAY);
                               JLabel l1=new JLabel("Amount Is Transfered : ");
                             
                               l1.setBounds(150,100,300,50);
                              
                        
                              int amount=500000;
                              JLabel jl=new JLabel();
                              desktop.add(f1);
                              f1.add(jl);
                              f1.add(l1);
                        
                              jl.setBounds(100,200,300,50);
                        
                              int a = Integer.parseInt(jt.getText());
               
                              int credit=amount-a;
                              String s3=String.valueOf(credit);
                              jl.setText("Balance is  : "+ s3); 
                              jl.setForeground(Color.red);
                    
                        
                              f1.setVisible(true);
                              f1.setLayout(null);
                              f1.setSize(580,660);
                                
                            }
                            
                        });
    
                    }
                    
                });
               
            }
            
        });
        
        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jt.setText(" ");
            }
            
        });
               

jf.setSize(580,660);
jf.setLayout(null);
jf.setVisible(true);
 
}  

  
public static void main(String[] args) 
{    
   ProgressBar_BankProject m=new ProgressBar_BankProject();    
    m.setVisible(true);    
    m.iterate();
}    
}    
