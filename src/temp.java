import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
 class Main implements ActionListener{
   static JFrame frame;
   static JTextArea textArea;
   static JPanel panel;
   static JButton button;
    Main(){

    }
    public static void main(String[] args) {
        Main main1=new Main();
        frame = new JFrame("sortedSTrike");// frame create pannirken
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close aagurathukku
        frame.setSize(500,500);//frame size
        frame.setLayout(null);
        frame.setVisible(true);// visibilty
        JPanel panel = new JPanel();//panel creation
        panel.setBounds(50, 100, 250, 250);
        panel.setLayout(new GridLayout(5,5));// periya panel la chinna grid
        panel.setBackground(Color.gray);
        frame.add(panel);// frame kulla panel,panel kulla grid
        JTextArea textArea = new JTextArea();// textfield la score podrathukku
        textArea.setBounds(50, 25, 300, 50);
        frame.add(textArea);
        Random random = new Random();// ithukk
        Set<Integer> set = new LinkedHashSet<Integer>();
        HashMap<Integer,Object> hs = new HashMap<>();
//String s = "asdfsdf";
//char[]as =s.toCharArray();
//String cb = Arrays.toString(as);

//        double mint = 1234.12345;
//        float  sum  = 1234.12345f;
//        System.out.printf("%,.3f :: %,.5f", mint, sum);
//
//       // int a[] = {1,2,3,4,5};
//        double a = 12.567867889;
     //   System.out.printf("%,.5",a);



//System.out.println(cb);

        int i=0;
        while (set.size() != 25) {


        }
//        for (Integer s : set) {
//
//            JButton jb = new JButton (Integer.toString(s));
//
//            hs.put(jb,s);
//            panel.add(jb);
//            System.out.println();
//            //jb.addActionListener(main1);
//        }
        JButton b1 = new JButton ("1");
        panel.add(b1);
        JButton b2 = new JButton ("2");
        panel.add(b2);
        JButton b3 = new JButton ("3");
        panel.add(b3);
        JButton b4 = new JButton ("4");
        JButton b5 = new JButton ("5");
        JButton b6 = new JButton ("6");
        JButton b7 = new JButton ("7");
        JButton b8 = new JButton ("8");
        JButton b9 = new JButton ("9");
        JButton b10 = new JButton ("10");
        JButton b11= new JButton ("11");
        JButton b12 =  new JButton ("12");
        JButton b13 = new JButton ("13");
        JButton b14= new JButton ("14");
        JButton b15= new JButton ("15");
        JButton b16 = new JButton ("16");
        JButton b17= new JButton ("17");
        JButton b18= new JButton ("18");
        JButton b19= new JButton ("19");
        JButton b20= new JButton ("20");
        JButton b21= new JButton ("21");
        JButton b22= new JButton ("22");
        JButton b23= new JButton ("23");
        JButton b24= new JButton ("24");
        JButton b25= new JButton ("25");

        b1.setActionCommand("actionName1");
        b2.setActionCommand("actionName2");
        b3.setActionCommand("actionName3");
        b4.setActionCommand("actionName4");
        b5.setActionCommand("actionName5");
//        b1.setActionCommand("actionName6");
//        b1.setActionCommand("actionName7");
//        b1.setActionCommand("actionName8");
//        b1.setActionCommand("actionName9");
//        b1.setActionCommand("actionName10");
//        b1.setActionCommand("actionName11");
//        b1.setActionCommand("actionName12");
//        b1.setActionCommand("actionName13");
//        b1.setActionCommand("actionName14");
//        b1.setActionCommand("actionName15");
//        b1.setActionCommand("actionName16");
//        b1.setActionCommand("actionName17");
//        b1.setActionCommand("actionName18");
//        b1.setActionCommand("actionName19");
//        b1.setActionCommand("actionName20");
//        b1.setActionCommand("actionName21");
//        b1.setActionCommand("actionName22");
//        b1.setActionCommand("actionName23");
//        b1.setActionCommand("actionName24");
//        b1.setActionCommand("actionName25");


//        jb.setActionCommand("1");
//        button2.setActionCommand("actionName2");

     //   main1.addActionListener(main1);
//        String actionCommand = ((JButton) e.getSource()).getActionCommand();
//        switch (actionCommand) {
//            case "actionName1":
//                System.out.println(1);
//                break;
//            case "actionName2":
//                System.out.println(2);
//                break;
//        }
    }
     public void actionPerformed(ActionEvent e) {



     }

    //private int buttonClicks = 0; // Or public
//    public void actionPerformed(ActionEvent e)
//    {
//        if(buttonClicks == 25){
//            System.exit(0); // Or a different script
//        }else{
//            JButton s = (JButton)e.getSource();
//            System.out.println(s);
//            s.setEnabled( false );
//            buttonClicks++; // Record click
//            String x = Integer.toString(buttonClicks);
//            textArea.setText(x);
//
//        }
//    }



}
