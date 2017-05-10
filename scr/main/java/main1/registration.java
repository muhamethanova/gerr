/**
* ��������� �� ��, ��� ����� ����������� ������ 
*/
package main1; 
/**
* ����������� ����� ��� ������� ����� �� ������ �������
*/
import java.awt.EventQueue; 

/**
* ����������� ����� ��� �������� ������
*/
import javax.swing.JFrame; 
/**
* ����������� ����� ��� �������� ������
*/
import javax.swing.JPanel; 
/**
* ����������� ����� ��� �������� ������ �����, ������� ��������� ������� ������� ������ ������
*/
import javax.swing.border.EmptyBorder; 
/**
* ����������� ����� � ������ �� ������
*/
import main1.error; 
/**
* ����������� ����� � �������� ���� ���������
*/
import main1.main2; 
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
* ����������� �����-��������� ��� �������� ���������� � �������
*/
import java.awt.event.ActionListener; 
/**
* ����������� ����� ��� ��������� ������� �� ������
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
/**
* ����������� ����� ������
*/
import javax.swing.JEditorPane; 
/**
* ����������� ����� ������� �����
*/
import java.awt.Color; 
/**
* ����������� ����� ��������������� �����
*/
import javax.swing.JFormattedTextField; 

public class registration extends JFrame {
	/**
* ������ �����, ������� ����� �����������
*/
	public static void main(String[] args) { 
		/**
* ��������� ����� �� ������� �������
*/
		EventQueue.invokeLater(new Runnable() { 
		 /**
* ������
*/
			public void run() {
			
				try {
				/**
* ������ ���������� ��� ����� �����������
*/
					registration frame = new registration(); 
					/**
* ����� ��������� ��� ������
*/
					frame.setVisible(true); 
				/**
* �������� �� ����������
*/
				} catch (Exception e) { 
				/**
* ���������� ����������� �����
*/
					e.printStackTrace(); 
				}
			}
		});
	}

	/**
**
	 * Create the frame.
	 
*/
	public registration () {
		/**
* ����� ��������� ��� ������
*/
		setTitle("\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F");
		/**
* ��������� ��������, ������� ���������� ��������� ����� ������������ ��������� ����� �������� �� �������. � ������ ������ ������� �����
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* ����� ���������� � ������� ������. � ������ ������ ����������: 100 �� � � 100 �� � ���������� ����� ����� ������� ����� ����������; 450 �������� - ������ 273 ������
*/
		setBounds(100, 100, 450, 273);  
		/**
*  ������������� �������� ����������
*/
		getContentPane().setLayout(null); 
		
		/**
* ������ ��������� ������
*/
		JTextPane textPane = new JTextPane(); 
		textPane.setEditable(false);
		/**
* ����� ����
*/
		textPane.setBackground(SystemColor.control); 
		/**
* ����� �����
*/
		textPane.setText("\u0427\u0442\u043E\u0431\u044B \u0432\u043E\u0439\u0442\u0438 \u0432 \u043B\u0438\u0447\u043D\u044B\u0439 \u043A\u0430\u0431\u0438\u043D\u0435\u0442 \u0434\u043B\u044F \u0440\u0430\u0441\u0447\u0435\u0442\u0430 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0432\u0438\u0434\u0435\u043E\u0437\u0430\u043F\u0438\u0441\u0435\u0439 \u0441 \u043A\u0430\u043C\u0435\u0440 \u043D\u0430\u0431\u043B\u044E\u0434\u0435\u043D\u0438\u044F, \u0432\u0432\u0435\u0434\u0438\u0442\u0435 \u043B\u043E\u0433\u0438\u043D \u043F\u0430\u0440\u043E\u043B\u044C\r\n\u041B\u043E\u0433\u0438\u043D \u0434\u043B\u044F \u0430\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440\u0430: 1\r\n\u041F\u0430\u0440\u043E\u043B\u044C: 1"); 
		/**
* ����� ����������
*/
		textPane.setBounds(24, 11, 387, 97); 
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
		textPane_1.setText("\u0415\u0441\u043B\u0438 \u0432\u044B \u0437\u0430\u0431\u044B\u043B\u0438 \u043B\u043E\u0433\u0438\u043D/\u043F\u0430\u0440\u043E\u043B\u044C, \u043E\u0431\u0440\u0430\u0442\u0438\u0442\u0435\u0441\u044C \u043A \u0430\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440\u0443");
		/**
* ����� ����������
*/
		textPane_1.setBounds(77, 204, 335, 20); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(textPane_1); 
		
		 /**
* ������ ��������� ������
*/
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		/**
* ����� ����
*/
		textPane_2.setBackground(SystemColor.control); 
		/**
* ����� �����
*/
		textPane_2.setText("\u041B\u043E\u0433\u0438\u043D:"); 
		/**
* ����� ����������
*/
		textPane_2.setBounds(77, 119, 65, 20); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(textPane_2); 
		
		/**
* ������ ��������� ������
*/
		JTextPane textPane_3 = new JTextPane(); 
		textPane_3.setEditable(false);
		/**
* ����� �����
*/
		textPane_3.setText("\u041F\u0430\u0440\u043E\u043B\u044C:"); 
		/**
* ����� ����
*/
		textPane_3.setBackground(SystemColor.menu);
		/**
* ����� ����������
*/
		textPane_3.setBounds(77, 150, 65, 20); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(textPane_3); 
		
		/**
* ������ ���� ��� ����� ������
*/
		final JFormattedTextField formattedTextField = new JFormattedTextField(); 
		/**
* ����� ����������
*/
		formattedTextField.setBounds(152, 119, 106, 20); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(formattedTextField);
		
		/**
* ������ ���� ��� ����� ������
*/
		final JFormattedTextField formattedTextField_1 = new JFormattedTextField(); 
		/**
* ����� ����������
*/
		formattedTextField_1.setBounds(152, 150, 106, 20); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(formattedTextField_1); 
		/**
* ������ ������ ��� �����������
*/
		JButton btnNewButton_1 = new JButton("\u0412\u043E\u0439\u0442\u0438"); 
		/**
* ������ ������� �� ������
*/
		btnNewButton_1.addActionListener(new ActionListener() { 
		
			public void actionPerformed(ActionEvent e) {
			/**
* ����� ���������� ��� ������
*/
				int L = 0; 
				/**
* ����� ���������� ��� ������
*/
				int P = 0; 
				
				/**
* ��������� �����
*/
				L=Integer.parseInt(formattedTextField.getText()); 
				/**
* 	��������� ������
*/
				P=Integer.parseInt(formattedTextField_1.getText());	
						/**
* �������� �������� ������ � ������
*/
				if ((L == 1) && (P == 1)){ 
				/**
* � ������ ����������, ��������� ���� � �������� ���� ���������
*/
					main2 nc = new main2(); 
					/**
* ����� ���������
*/
					nc.setVisible(true); 
				
				}else{
				/**
* ���� ����� ������ ��������, �� ����� ��������� �� ������
*/
					error bc = new error(); 
				/**
* ����� ���������
*/
					bc.setVisible(true);  
				}
				
			}
		});
		/**
* ����� ����������
*/
		btnNewButton_1.setBounds(162, 176, 89, 23); 
		/**
* ��������� �� ���� ������
*/
		getContentPane().add(btnNewButton_1); 
	}
}
