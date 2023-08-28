import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    static String ans ="";
    static String[] num = new String[]{"", "", "", "", "", "", "", ""};

    static int i = 0;

    public static void main(String[] args) {
        createStructure();
    }

    static void createStructure(){


        JFrame frame = new JFrame();

        frame.setSize(400,640);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        ImageIcon icon = new ImageIcon("src/calculator.png");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(Color.cyan);


        //following for the output
        JPanel panelOutput = new JPanel();
        panelOutput.setVisible(true);
        panelOutput.setBounds(14,20,360, 140);

        JTextArea output = new JTextArea();
        output.setEditable(false);

        panelOutput.add(output);
        panelOutput.setVisible(true);


        //following for the input
        JPanel panelInput = new JPanel();
        panelInput.setVisible(true);
        panelInput.setBounds(14,175,360, 415);
        panelInput.setLayout(new GridLayout(4, 4));


        JButton button7 = new JButton("7");
        panelInput.add(button7, 0);
            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Code to be executed when the button is clicked
                    num[i] += "7";
                    output.append("7");
                }
            });



        JButton button8 = new JButton("8");
        panelInput.add(button8, 1);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                num[i] += "8";
                output.append("8");
            }
        });


        JButton button9 = new JButton("9");
        panelInput.add(button9, 2);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                num[i] += "9";
                output.append("9");
            }
        });


        JButton multiply = new JButton("X");
        panelInput.add(multiply, 3);
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                if(i==0){
                    i++;
                    num[i] = "X";
                    output.append(" X ");
                    i++;
                }
                else if (!num[i].equals("")) {
                    i++;
                    num[i] = "X";
                    output.append(" X ");
                    i++;

                }
            }
        });


        JButton button4 = new JButton("4");
        panelInput.add(button4, 4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                num[i] += "4";
                output.append("4");
            }
        });


        JButton button5 = new JButton("5");
        panelInput.add(button5, 5);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                num[i] += "5";
                output.append("5");
            }
        });


        JButton button6 = new JButton("6");
        panelInput.add(button6, 6);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                num[i] += "6";
                output.append("6");
            }
        });


        JButton minus = new JButton("-");
        panelInput.add(minus, 7);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(i==0){
                    num[i] += "-";
                    output.append("-");
//                    i++;
                }
                else if(!num[i].equals("")) {
                    i++;
                    num[i] = "-";
                    output.append(" - ");
                    i++;
                }
            }
        });


        JButton button1 = new JButton("1");
        panelInput.add(button1, 8);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                num[i] += "1";
                output.append("1");
            }
        });


        JButton button2 = new JButton("2");
        panelInput.add(button2, 9);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                num[i] += "2";
                output.append("2");
            }
        });


        JButton button3 = new JButton("3");
        panelInput.add(button3, 10);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                num[i] += "3";
                output.append("3");
            }
        });


        JButton add = new JButton("+");
        panelInput.add(add, 11);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if(i==0){
//                    i++;
//                    num[i] = "+";
//                    output.append(" + ");
//                    i++;
//                }
                if(!num[i].equals("")){
                    i++;
                    num[i] = "+";
                    output.append(" + ");
                    i++;
                }

            }
        });


        JButton button0 = new JButton("0");
        panelInput.add(button0, 12);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                num[i] += "0";
                output.append("0");
            }
        });

        JButton clear = new JButton("AC");
        panelInput.add(clear, 13);
//        clear.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Code to be executed when the button is clicked
//                num = 7;
//            }
//        });

        JButton divide = new JButton("÷");
        panelInput.add(divide, 14);
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                if(i==0){
                    i++;
                    num[i] = "÷";
                    output.append(" ÷ ");
                    i++;
                }
                if(!num[i].equals("")) {
                    i++;
                    num[i] = "÷";
                    output.append(" ÷ ");
                    i++;
                }
            }
        });

        JButton equals = new JButton("=");
        panelInput.add(equals, 15);
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int answer = calculateEquals();
                output.setText(Integer.toString(answer));

            } //do the rest for it
        });






        frame.add(panelInput);
        frame.add(panelOutput);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    static int calculateEquals(){

        int ret=Integer.parseInt(num[0]);
        int k;

        for(int j=1; j<i; j++){
//            if(!(num[i].equals("+") || num[i].equals("-") || num[i].equals("X") || num[i].equals("÷"))){
//                ret += Integer.parseInt(num[i]);
//            }
            k = j+1;
            switch(num[j]){
                case "+":
                   ret += Integer.parseInt(num[k]);
                   break;
                case "-":
                    ret -= Integer.parseInt(num[k]);
                    break;
                case "X":
                    ret *= Integer.parseInt(num[k]);
                    break;
                case "÷":
                    ret /= Integer.parseInt(num[k]);
                    break;
            }

        }


        return ret;
    }
}
