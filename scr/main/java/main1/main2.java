/**
* ��������� �� ��, ��� ����� ����������� ������  
*/
package main1;

/**
* ����������� ����� ��� �������� ������ 
*/
import javax.swing.JFrame; 
 /**
* ����������� ����� � ������������� ��� ������� ��� 
*/
import main1.physhical;
/**
* ����������� ����� � ������������� ��� ������������� �������� 
*/
import main1.korporate; 
/**
* ����������� ����� ��� ���������� ���� � ������������ ���������� ������ 
*/
import javax.swing.JTextArea; 
/**
* ����������� ����� ��� ������������� ������ 
*/
import javax.swing.JLabel; 
/**
* ����������� ����� ���  ���������� ���� 
*/
import javax.swing.JTextField; 
/**
* ����������� ����� ��� ����������� ������ � ���� ������ 
*/
import javax.swing.JList; 
/**
* ����������� ����� ����������� ������ 
*/
import javax.swing.JComboBox; 
/**
*����������� ����� �������� �� ��������� ��� ����������� ������ 
*/
import javax.swing.DefaultComboBoxModel; 
/**
* ����������� ����� ��� ���-����� 
*/
import javax.swing.JRadioButton; 
/**
* ����������� ����� ��� ������ 
*/
import javax.swing.JButton; 
/**
* ����������� ����� ������� 
*/
import java.awt.Font; 
/**
* ����������� ����� ��� ��������� ������� �� ������ 
*/
import java.awt.event.ActionListener; 
/**
* ����������� ����� ��� ��������� ������� 
*/
import java.awt.event.ActionEvent; 
/**
* ����������� ����� ��������� ����� 
*/
import java.awt.TextField; 
/**
* ����������� ����� ��������� ������� 
*/
import javax.swing.JTextPane; 
/**
* ����������� ����� ������ 
*/
import java.awt.Button; 
/**
* ����������� ����� ������� ���������� ����� 
*/
import java.awt.SystemColor;  

public class main2 extends JFrame {

	public main2() {
		/**
* ����� ��������� ��� ������ 
*/
		setTitle("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0432\u0438\u0434\u0435\u043E\u0437\u0430\u043F\u0438\u0441\u0435\u0439 \u0441 \u043A\u0430\u043C\u0435\u0440 \u043D\u0430\u0431\u043B\u044E\u0434\u0435\u043D\u0438\u044F"); 
		/**
* ��������� ��������, ������� ���������� ��������� ����� ������������ ��������� ����� �������� �� �������. � ������ ������ ������� ����� 
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* ����� ����������  
*/
		setBounds(100, 100, 450, 260); 
	/**
*  ������������� �������� ���������� 
*/
		getContentPane().setLayout(null); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane txtpnDsthbnt = new JTextPane(); 
		/**
* ����� ���� 
*/
		txtpnDsthbnt.setBackground(SystemColor.control); 
		/**
* ����� ����� ������ 
*/
		txtpnDsthbnt.setFont(new Font("Tahoma", Font.PLAIN, 26));
		/**
* ����� ����� 
*/
		txtpnDsthbnt.setText("\u0412\u044B\u0431\u0435\u0440\u0438\u0442\u0435 \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F");
		/**
* ����� ���������� 
*/
		txtpnDsthbnt.setBounds(74, 31, 302, 38); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(txtpnDsthbnt); 
		
		/**
* ����� ����� 
*/
		JButton btnNewButton = new JButton("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0442\u0438\u0432\u043D\u044B\u0439 \u043A\u043B\u0438\u0435\u043D\u0442");
		
		btnNewButton.addActionListener(new ActionListener() {
			/**
* ������� ��� ������� �� ������ 
*/
			public void actionPerformed(ActionEvent arg0) {
				/**
* ��������� ���� � �������� ��� ������������� �������� 
*/
				korporate nc = new korporate(); 
				/**
* ����� ��������� 
*/
				nc.setVisible(true); 
			}
		});
		/**
* ����� ���������� 
*/
		btnNewButton.setBounds(25, 97, 196, 38); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(btnNewButton); 
		
		/**
* ����� ����� 
*/
		JButton button = new JButton("\u0427\u0430\u0441\u0442\u043D\u044B\u0439 \u043A\u043B\u0438\u0435\u043D\u0442");
		
		button.addActionListener(new ActionListener() {
			/**
* ������� ��� ������� �� ������ 
*/
			public void actionPerformed(ActionEvent e) {
				/**
* ��������� ���� � �������� ��� ������� �������� 
*/
				physhical bc = new physhical(); 
				/**
* ����� ��������� 
*/
				bc.setVisible(true); 
			}
		});
		/**
* ����� ���������� 
*/
		button.setBounds(228, 97, 196, 38); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(button); 
		
		/**
* ����� ����� 
*/
		JButton btnNewButton_1 = new JButton("\u0412\u044B\u0445\u043E\u0434");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/**
*����� �� �������� ���� 
*/
				setVisible(false); 
			}
		});
		/**
* ����� ����������  
*/
		btnNewButton_1.setBounds(335, 188, 89, 23); 
		/**
* ��������� �� ���� ������  
*/
		getContentPane().add(btnNewButton_1); 
	}
}
