package mvc;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class mvcexample extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mvcexample frame = new mvcexample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public mvcexample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btn_botao = new JButton("Mudar Cor");
		 btn_botao.setBackground(Color.GRAY);
		 
		 btn_botao.addMouseListener(new MouseAdapter() {
			 
			 @Override
			 public void mouseExited(MouseEvent e) {
				 btn_botao.setBackground(Color.YELLOW);
			 }
			 @Override
			 public void mouseEntered(MouseEvent e) {
				 btn_botao.setBackground(Color.BLUE);
			 }
			 
	
		 });
		
		

		contentPane.add( btn_botao);
	}

}
