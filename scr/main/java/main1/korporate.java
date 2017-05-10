/**
* ��������� �� ��, ��� ����� ����������� ������ 
*/
package main1;

/**
*����������� �����, ������� ��������� ���� �� �����,��������, ��������, ��������� � ����������� �������  
*/
import java.awt.BorderLayout; 
/**
*����������� ����� ��� ������� ����� �� ������ ������� 
*/
import java.awt.EventQueue; 
import Calc.korporateCalc; // ����������� �����, ������� ������������ ����������� �����


/**
*����������� ����� ��� �������� ������ 
*/
import javax.swing.JFrame; 
/**
*����������� ����� ��� �������� ������ 
*/
import javax.swing.JPanel; 
/**
*����������� ����� ��� �������� ������ �����, ������� ��������� ������� ������� ������ ������ 
*/
import javax.swing.border.EmptyBorder; 

/**
*����������� ����� ��� ���������� ���� � ������������ ���������� ������ 
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
* ����������� ����� ������� ����� 
*/
import java.awt.Color; 
/**
* ����������� ����� ������� ���������� ����� 
*/
import java.awt.SystemColor; 
/**
* ����������� ����� � ���������� 
*/
import javax.swing.SwingConstants; 
/**
* ����������� ����� ��������������� ����� 
*/
import javax.swing.JFormattedTextField;  

public class korporate extends JFrame {
	/**
* ����� ���������� ��� ���������� ������ 
*/
	private JTextField textField; 
	/**
* ����� ���������� ��� ���������� ������ 
*/
	private JTextField textField_1; 
	/**
* ����� ���������� ��� ���������� ������ 
*/
	private JTextField textField_2; 

	public korporate() {
		/**
* ����� ��������� ��� ������ 
*/
		setTitle("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0432\u0438\u0434\u0435\u043E\u0437\u0430\u043F\u0438\u0441\u0435\u0439 \u0441 \u043A\u0430\u043C\u0435\u0440 \u043D\u0430\u0431\u043B\u044E\u0434\u0435\u043D\u0438\u044F");
		/**
* ��������� ��������, ������� ���������� ��������� ����� ������������ ��������� ����� �������� �� �������. � ������ ������ ������� ����� 
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* ��������� ���������� 
*/
		setBounds(100, 100, 450, 450);
	/**
*  ������������� �������� ���������� 
*/
		getContentPane().setLayout(null);  
		
		/**
* ����� ����� 
*/
		JButton btnNewButton_1 = new JButton("\u0412\u044B\u0445\u043E\u0434"); 
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/**
*����� �� �������� ���� 
*/
				setVisible(false); 
			}
		});
		/**
* ��������� ���������� 
*/
		btnNewButton_1.setBounds(335, 379, 89, 23);
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(btnNewButton_1); 
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		/**
* ����� ����� ��� ������� 
*/
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		/**
* ����� ���� 
*/
		textPane.setBackground(SystemColor.control); 
		/**
* ����� ����� 
*/
		textPane.setText("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0432\u0438\u0434\u0435\u043E\u0437\u0430\u043F\u0438\u0441\u0435\u0439 \u0441 \u043A\u0430\u043C\u0435\u0440 \u043D\u0430\u0431\u043B\u044E\u0434\u0435\u043D\u0438\u044F \u0434\u043B\u044F \u043A\u043E\u0440\u043F\u043E\u0440\u0430\u0442\u0438\u0432\u043D\u044B\u0445 \u043A\u043B\u0438\u0435\u043D\u0442\u043E\u0432"); 
		/**
* ����� ���������� 
*/
		textPane.setBounds(10, 11, 414, 43); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		/**
* ����� ���� 
*/
		textPane_1.setBackground(SystemColor.control); 
		/**
* ����� ����� 
*/
		textPane_1.setText("\u0420\u0430\u0437\u0440\u0435\u0448\u0435\u043D\u0438\u0435 \u043A\u0430\u043C\u0435\u0440\u044B:"); 
		/**
* ����� ���������� 
*/
		textPane_1.setBounds(20, 73, 120, 20); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_1); 
		
		/**
* ������ ���������� ������ 
*/
		final JComboBox comboBox = new JComboBox();  
		/**
* ����� ����������� �������� ��� ������������ 
*/
		comboBox.setEditable(true); 
		/**
* ����� �������� ��� ����������� ������ 
*/
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"QCIF (176x120)", "CIF (352x240)", "2CIF (704x240)", "4CIF (704x480)", "1 Mpx. (1280x1024)",  "2 Mpx. (1600x1200)" ,  "3 Mpx. (2048x1536)"})); 
		/**
* ����� ���������� 
*/
		comboBox.setBounds(150, 73, 149, 20); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(comboBox); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		/**
* ����� ����� 
*/
		textPane_2.setText("\u0424\u043E\u0440\u043C\u0430\u0442 \u0441\u0436\u0430\u0442\u0438\u044F"); 
		/**
* ����� ���� 
*/
		textPane_2.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_2.setBounds(20, 104, 120, 20); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_2); 
		
		/**
* ������ ���������� ������ 
*/
		final JComboBox comboBox_1 = new JComboBox(); 
		/**
* ����� ����������� �������� ��� ������������ 
*/
		comboBox_1.setEditable(true); 
		/**
* ����� �������� ��� ����������� ������ 
*/
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"H.264", "MPEG-4", "MPEG-2", "MJPEG"})); 
		/**
* ����� ���������� 
*/
		comboBox_1.setBounds(150, 104, 149, 20); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(comboBox_1); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		/**
* ����� ����� 
*/
		textPane_3.setText("\u0412\u0440\u0435\u043C\u044F \u0440\u0430\u0431\u043E\u0442\u044B \u043A\u0430\u043C\u0435\u0440 (\u0447)"); 
		/**
* ����� ���� 
*/
		textPane_3.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_3.setBounds(20, 138, 120, 34); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_3); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		/**
* ����� ����� 
*/
		textPane_4.setText("\u0412\u0440\u0435\u043C\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0434\u0430\u043D\u043D\u044B\u0445 (\u043A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0434\u043D\u0435\u0439)"); 
		/**
* ����� ���� 
*/
		textPane_4.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_4.setBounds(20, 183, 120, 48); 
		 /**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_4);
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setEditable(false);
		/**
* ����� ����� 
*/
		textPane_6.setText("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043A\u0430\u043C\u0435\u0440"); 
		/**
* ����� ���� 
*/
		textPane_6.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_6.setBounds(20, 242, 120, 34); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_6); 
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setEditable(false);
		/**
* ����� ����� 
*/
		textPane_7.setText("\u0412\u0430\u043C \u043D\u0435\u043E\u0431\u0445\u043E\u0434\u0438\u043C\u043E "); 
		/**
* ����� ����� ��� ������ 
*/
		textPane_7.setFont(new Font("Tahoma", Font.PLAIN, 12)); 
		/**
* ����� ���� 
*/
		textPane_7.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_7.setBounds(30, 320, 110, 23); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_7); 
		
		/**
* ������ ���� ��� ������ ���������� 
*/
		final JFormattedTextField formattedTextField = new JFormattedTextField(); 
		/**
* ��������� ��� �������������� 
*/
		formattedTextField.setEditable(false); 
		 /**
* ����� ����� 
*/
		formattedTextField.setText("1169");
		/**
* ����� ���������� 
*/
		formattedTextField.setBounds(150, 320, 145, 20); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(formattedTextField); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setEditable(false);
		/**
* ����� ����� 
*/
		textPane_8.setText("\u0413\u0411 \u043F\u0430\u043C\u044F\u0442\u0438");
		/**
* ����� ����� ��� ������ 
*/
		textPane_8.setFont(new Font("Tahoma", Font.PLAIN, 12)); 
		/**
* ����� ���� 
*/
		textPane_8.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_8.setBounds(305, 320, 75, 23); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_8); 
		/**
* ����� ����� 
*/
		JButton button = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
*	������������� ���������� ��� �������� ������������� ������	 
*/
				double f = 0;
				/**
*	������������� ���������� ��� ������� ������ ����� 
*/
				int t = 0;
				/**
*	������������� ���������� ��� ���������� ����� 
*/
				int k = 0;
				/**
*	������������� ���������� ��� ������� �������� ���� 
*/
				int d = 0;
				/**
*	������������� ���������� ��� ���������� �������� � ������ � ����������� �� �������� ������	 
*/
				double q = 0;
				/**
*	������������� ���������� ��� ������ ��������� ���������� 
*/
				double V = 0;
				
				/**
* ��������� �������� ������ 
*/
				int quality = comboBox.getSelectedIndex();
				/**
* ��������� ������ ������ 
*/
				int Format = comboBox_1.getSelectedIndex();
			
				/**
* � ����������� �� �������� ������ ���������� ����� ������ ����� ������ 
*/
				switch(quality){ 
				/**
* ���� ������� ������ �������� ������, �� ����������� ��������� �������� 
*/
					case 0: q = 0.1; break; 
				/**
* ���� ������� ������ �������� ������, �� ����������� ��������� �������� 
*/
					case 1: q = 0.3; break;
				/**
* ���� ������� ������ �������� ������, �� ����������� ��������� �������� 
*/
					case 2: q = 0.7; break;
				/**
* ���� ������� �������� �������� ������, �� ����������� ��������� �������� 
*/
					case 3: q = 0.9; break;
				/**
* ���� ������� ����� �������� ������, �� ����������� ��������� �������� 
*/
					case 4: q = 1.1; break;
				/**
* ���� ������� ������ �������� ������, �� ����������� ��������� �������� 
*/
					case 5: q = 4; break;
				/**
* ���� ������� ������ �������� ������, �� ����������� ��������� �������� 
*/
					case 6: q = 6; break; 
				}
				
				/**
* � ����������� �� ������� ������ ���������� ����������� ������ 
*/
				switch(Format){ 
				/**
* ���� ������ ������ ������ ������ �� ����������� ��������� ����������� 
*/
				case 0: f = 0.9; break;
				/**
* ���� ������ ������ ������ ������ �� ����������� ��������� ����������� 
*/
				case 1: f = 0.8; break; 
				/**
* ���� ������ ������ ������ ������ �� ����������� ��������� ����������� 
*/
				case 2: f = 0.5; break;
				/**
* ���� ������ �������� ������ ������ �� ����������� ��������� ����������� 
*/
				case 3: f = 0.03; break; 
			}
				/**
* ����� ���������� ��� ������� ������ ����� 
*/
				t = Integer.parseInt(textField.getText());
				/**
* ����� ���������� ��� ���������� ����� 
*/
				k = Integer.parseInt(textField_1.getText());
				/**
* ����� ���������� ��� ������� �������� ���� 
*/
				d = Integer.parseInt(textField_2.getText());
				/**
* ������� ����������� ����� ����������� 
*/
				
				/**
* ��������� �� ����� ������� ������ ����������� 
*/
				korporateCalc cc = new korporateCalc();
				
				/**
* ������� ��������� � ��������� ���� � ���������� � ������ ��� ������� ����������� 
*/
				formattedTextField.setText("" + cc.getP(t, k, d, f, q));  
			}
		});
		/**
* ����� ���������� 
*/
		button.setBounds(160, 274, 120, 23); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(button);
		
		/**
* ������ ��������� ���� ��� ����� ������ 
*/
		textField = new JTextField(); 
		/**
* ����� ����� 
*/
		textField.setText("24"); 
		 /**
* ����� ���������� 
*/
		textField.setBounds(150, 139, 48, 20);
		/**
* ����� ���������� �������� 
*/
		getContentPane().add(textField); 
		/**
* ��������� �� ���� ������ 
*/
		textField.setColumns(10);
		
		/**
* ������ ��������� ���� ��� ����� ������ 
*/
		textField_1 = new JTextField(); 
		/**
* ����� ����� 
*/
		textField_1.setText("7"); 
		/**
* ����� ���������� �������� 
*/
		textField_1.setColumns(10);  
		/**
* ����� ���������� 
*/
		textField_1.setBounds(150, 189, 48, 20); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textField_1);
		
		/**
* ������ ��������� ���� ��� ����� ������ 
*/
		textField_2 = new JTextField(); 
		/**
* ����� ����� 
*/
		textField_2.setText("2"); 
		/**
* ����� ���������� �������� 
*/
		textField_2.setColumns(10);  
		/**
* ����� ���������� 
*/
		textField_2.setBounds(150, 242, 48, 20); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textField_2);
	}
}
