package SSD;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Guiwriter extends JFrame
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JPanel p1 = new JPanel();
JPanel p2 = new JPanel();

JLabel l = new JLabel("请输入内容：");

JTextField f = new JTextField();
JButton b = new JButton("执行");

public Guiwriter() //构造方法
{
this.setLayout(new BorderLayout());
p1.setLayout(new GridLayout(3, 2));
p1.add(l);
p1.add(f);

this.add(p1, BorderLayout.NORTH);
p2.add(b, BorderLayout.CENTER);
this.add(p2, BorderLayout.CENTER);

this.setSize(200, 200);
this.setVisible(true);

b.addActionListener(
new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String str =f.getText();
run(str);

}
});

}

public void run(String str){

String rtnFile1 = "d:/OK.txt";//输出文件路径
try {
BufferedWriter bw = new BufferedWriter(new FileWriter(rtnFile1));
String str1 = str ;
bw.write(str1);
bw.newLine();
bw.flush();
bw.close();

} catch (IOException e) {
e.printStackTrace();
}

}
public static void main (String args[]){
new Guiwriter();
}
}
