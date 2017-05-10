/**
* ��������� �� ��, ��� ����� ����������� ������ 
*/
package main1;
/**
* ����������� ����� ��� �������� ������ 
*/
import javax.swing.JFrame; 
/**
* ����������� ����� � ������ ����������� 
*/
import main1.registration; 
/**
* ����������� ����� ��� ������ 
*/
import javax.swing.JButton; 
/**
* ����������� ����� ��� ��������� ������� �� ������ 
*/
import java.awt.event.ActionListener; 
/**
* ����������� ����� ��� ��������� ������� 
*/
import java.awt.event.ActionEvent; 
/**
* ����������� ����� ��������� ������� 
*/
import javax.swing.JTextPane; 
/**
* ����������� ����� ������� ���������� ����� 
*/
import java.awt.SystemColor; 

public class error extends JFrame {

	public error () {
		/**
* ����� ��������� ��� ������ 
*/
		setTitle("\u041E\u0448\u0438\u0431\u043A\u0430 \u0430\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u0438\r\n");
		/**
* ��������� ��������, ������� ���������� ��������� ����� ������������ ��������� ����� �������� �� �������. � ������ ������ ������� ����� 
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* ����� ���������� 
*/
		setBounds(100, 100, 450, 160); 
		/**
*  ������������� �������� ���������� 
*/
		getContentPane().setLayout(null); 

		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane = new JTextPane(); 
		/**
* ����� ���� 
*/
		textPane.setBackground(SystemColor.control); 
		/**
* ����� ����� 
*/
		textPane.setText("\u0412\u0432\u0435\u0434\u0451\u043D\u043D\u044B\u0439 \u043B\u043E\u0433\u0438\u043D/\u043F\u0430\u0440\u043E\u043B\u044C \u043D\u0435\u0432\u0435\u0440\u043D\u044B\u0435.\r\n\u0415\u0441\u043B\u0438 \u0432\u044B \u0437\u0430\u0431\u044B\u043B\u0438 \u043B\u043E\u0433\u0438\u043D/\u043F\u0430\u0440\u043E\u043B\u044C, \u0442\u043E \u043E\u0431\u0440\u0430\u0442\u0438\u0442\u0435\u0441\u044C \u043A \u0430\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440\u0443");  
		/**
* ����� ���������� 
*/
		textPane.setBounds(24, 37, 387, 40); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane); 
		
		/**
* ����� ����� 
*/
		JButton button = new JButton("\u041F\u043E\u043F\u0440\u043E\u0431\u043E\u0432\u0430\u0442\u044C \u0435\u0449\u0451 \u0440\u0430\u0437");  
		
		button.addActionListener(new ActionListener() {
		/**
* ������ ������� ��� ������� �� ������ 
*/
			public void actionPerformed(ActionEvent e) { 
			/**
* ��������� ���� � ������������ 
*/
				registration nc = new registration(); 
				/**
* ����� ��������� 
*/
				nc.setVisible(true); 
			}
		});
		/**
* ����� ���������� 
*/
		button.setBounds(106, 88, 181, 23); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(button); 
	}
}
