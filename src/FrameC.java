import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class FrameC extends JFrame{
        private JButton n1 = new JButton("1");
        private JButton n2 = new JButton("2");
        private JButton n3 = new JButton("3");
        private JButton n4 = new JButton("4");
        private JButton n5 = new JButton("5");
        private JButton n6 = new JButton("6");
        private JButton n7 = new JButton("7");
        private JButton n8 = new JButton("8");
        private JButton n9 = new JButton("9");
        private JButton n0 = new JButton("0");
        private JButton s1 = new JButton("/");
        private JButton s2 = new JButton("*");
        private JButton s3 = new JButton("-");
        private JButton s4 = new JButton(".");
        private JButton s5 = new JButton("=");
        private JButton s6 = new JButton("+");
        private JLabel lb = new JLabel(" ");
        private Container cp ;
        private JPanel jp1 = new JPanel(new GridLayout(4,4,3,3));

        public FrameC(){
            init();
        }
        protected void init(){
            this.setBounds(100,100,425,500);
            this.setVisible(true);
            cp=this.getContentPane();
            cp.setLayout(new BorderLayout(4,4));
            cp.add(jp1,BorderLayout.CENTER);
            cp.add(lb,BorderLayout.NORTH);
            lb.setFont(new Font(null,Font.BOLD,40));

            jp1.add(n7); jp1.add(n8); jp1.add(n9); jp1.add(s1);
            jp1.add(n4); jp1.add(n5); jp1.add(n6); jp1.add(s2);
            jp1.add(n1); jp1.add(n2); jp1.add(n3); jp1.add(s3);
            jp1.add(n0); jp1.add(s4); jp1.add(s5); jp1.add(s6);

            n1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("1");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "1");
                    }
                }
            });

            n2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("2");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "2");
                    }
                }
            });

            n3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("3");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "3");
                    }
                }
            });

            n4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("4");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "4");
                    }
                }
            });

            n5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("5");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "5");
                    }
                }
            });

            n6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("6");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "6");
                    }
                }
            });

            n7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("7");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "7");
                    }
                }
            });

            n8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("8");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "8");
                    }
                }
            });

            n9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("9");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "9");
                    }
                }
            });

            n0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("0");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "0");
                    }
                }
            });

            s1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("/");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "/");
                    }
                }
            });

            s2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (lb.getText().equals(" ")){
                        lb.setText("*");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "*");
                    }
                }
            });

            s3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("-");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "-");
                    }
                }
            });

            s4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText(".");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + ".");
                    }
                }
            });

            s5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("=");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "=");
                    }
                }
            });

            s6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lb.getText().equals(" ")){
                        lb.setText("+");
                    }
                    else if (!lb.getText().equals(" ")) {
                        lb.setText(lb.getText() + "+");
                    }

                }
            });







        }
    }

