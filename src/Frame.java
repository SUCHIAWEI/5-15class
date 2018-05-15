import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private JButton jb[] = new JButton[20];
    private JLabel lb = new JLabel("0");
    private Container cp;
    private JPanel jp1 = new JPanel(new GridLayout(4,5,3,3));
    int op =-1;
    Double v1=0.0;
    Double v2=0.0;
    public  Frame(){
        init();
    }

    private void init(){
        this.setBounds(100,100,425,525);

        cp=this.getContentPane();
        cp.add(jp1,BorderLayout.CENTER);
        cp.add(lb,BorderLayout.NORTH);

        lb.setFont(new Font(null,Font.BOLD,40));

        for (int i=0 ;i<20 ;i++){

            switch (i){
                case 0:
                    jb[i]=new JButton("0");
                    jp1.add(jb[i]);
                    break;

                case 1:
                    jb[i]=new JButton("1");
                    jp1.add(jb[i]);
                    break;

                case 2:
                    jb[i]=new JButton("2");
                    jp1.add(jb[i]);
                    break;

                case 3:
                    jb[i]=new JButton("3");
                    jp1.add(jb[i]);
                    break;

                case 4:
                    jb[i]=new JButton("4");
                    jp1.add(jb[i]);
                    break;

                case 5:
                    jb[i]=new JButton("5");
                    jp1.add(jb[i]);
                    break;

                case 6:
                    jb[i]=new JButton("6");
                    jp1.add(jb[i]);
                    break;

                case 7:
                    jb[i]=new JButton("7");
                    jp1.add(jb[i]);
                    break;

                case 8:
                    jb[i]=new JButton("8");
                    jp1.add(jb[i]);
                    break;

                case 9:
                    jb[i]=new JButton("9");
                    jp1.add(jb[i]);
                    break;

                case 10:
                    jb[i]=new JButton("+");
                    jp1.add(jb[i]);
                    break;

                case 11:
                    jb[i]=new JButton("-");
                    jp1.add(jb[i]);
                    break;

                case 12:
                    jb[i]=new JButton("*");
                    jp1.add(jb[i]);
                    break;

                case 13:
                    jb[i]=new JButton("/");
                    jp1.add(jb[i]);
                    break;

                case 14:
                    jb[i]=new JButton("PI");
                    jp1.add(jb[i]);
                    break;

                case 15:
                    jb[i]=new JButton("Sqrz");
                    jp1.add(jb[i]);
                    break;

                case 16:
                    jb[i]=new JButton(".");
                    jp1.add(jb[i]);
                    break;

                case 17:
                    jb[i]=new JButton("=");
                    jp1.add(jb[i]);
                    break;

                case 18:
                    jb[i]=new JButton("Exit");
                    jp1.add(jb[i]);
                    break;

                case 19:
                    jb[i]=new JButton("Ac");
                    jp1.add(jb[i]);
                    break;

            }
            jb[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmp = (JButton) e.getSource();

                    switch (tmp.getText()) {
                        case "Ac":
                            lb.setText("0");
                            op = -1;
                            break;

                        case "PI":
                            lb.setText(Double.toString(Math.PI));
                            break;
                        case "+":
                            op = 0;
                            v1 = Double.parseDouble(lb.getText());
                            break;
                        case "-":
                            op = 1;
                            v1 = Double.parseDouble(lb.getText());
                            break;
                        case "*":
                            op = 2;
                            v1 = Double.parseDouble(lb.getText());
                            break;
                        case "/":
                            op = 3;
                            v1 = Double.parseDouble(lb.getText());
                            break;

                        case "Sqrz":
                            v1 = Double.parseDouble(lb.getText());
                            lb.setText(Double.toString(Math.sqrt(v1)));
                            break;

                        case "=":
                            v2 = Double.parseDouble(lb.getText());
                            Double v3 = 0.0;
                            switch (op) {
                                case 0:
                                    v3 = v1 + v2;
                                    break;
                                case 1:
                                    v3 = v1 - v2;
                                    break;
                                case 2:
                                    v3 = v1 * v2;
                                    break;
                                case 3:
                                    v3 = v1 / v2;
                                    break;

                            }
                            lb.setText(Double.toString(v3));
                                break;

                            default:
                                if (lb.getText().equals("0")  ){
                                    lb.setText(tmp.getText());
                                }
                                else if (op > -1){}

                                else if (!lb.getText().equals("0") ){
                                    lb.setText(lb.getText()+tmp.getText());

                                }

                                break;

                    }

                }
            });

        }






    }
}
