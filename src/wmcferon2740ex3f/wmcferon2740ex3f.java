package wmcferon2740ex3f;
									//EMPLOYEE FORM

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class wmcferon2740ex3f extends JFrame {

	private JPanel contentPane;
	private JTextField empIdTextField;
	private JTextField empNameTextField;
	private JTextField positionTextField;
	private JList employeeList;
	private DefaultListModel employeeListModel;
	private JComboBox deptComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wmcferon2740ex3f frame = new wmcferon2740ex3f();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public wmcferon2740ex3f() {
		setTitle("WMcFeron2740Ex3F:  Overloaded Constructors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 451, 136);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();           // added manually
		//employeeList = new JList();
		employeeList = new JList(employeeListModel);
		scrollPane.setViewportView(employeeList);
		
		JLabel lblNewLabel = new JLabel("Employee ID:");
		lblNewLabel.setBounds(12, 179, 101, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmployee = new JLabel("Employee name:");
		lblEmployee.setBounds(12, 208, 101, 16);
		contentPane.add(lblEmployee);
		
		JLabel lblNewLabel_1 = new JLabel("Department:");
		lblNewLabel_1.setBounds(12, 237, 101, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(12, 266, 56, 16);
		contentPane.add(lblPosition);
		
		empIdTextField = new JTextField();
		empIdTextField.setText("101");
		empIdTextField.setBounds(149, 176, 116, 22);
		contentPane.add(empIdTextField);
		empIdTextField.setColumns(10);
		
		empNameTextField = new JTextField();
		empNameTextField.setText("Wendy McFeron");
		empNameTextField.setBounds(149, 205, 116, 22);
		contentPane.add(empNameTextField);
		empNameTextField.setColumns(10);
		
		positionTextField = new JTextField();
		positionTextField.setText("Software Engineer");
		positionTextField.setBounds(149, 263, 116, 22);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		deptComboBox = new JComboBox();
		deptComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance"}));
		deptComboBox.setBounds(149, 234, 116, 22);
		contentPane.add(deptComboBox);
		
		JButton noArgButton = new JButton("No Arg");
		noArgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_noArgButton_actionPerformed(arg0);
			}
		});
		noArgButton.setBounds(38, 295, 97, 24);
		contentPane.add(noArgButton);
		
		JButton arg2Button = new JButton("2 Arg");
		arg2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_arg2Button_actionPerformed(e);
			}
		});
		arg2Button.setBounds(159, 294, 97, 25);
		contentPane.add(arg2Button);
		
		JButton arg4Button = new JButton("4 Arg");
		arg4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_arg4Button_actionPerformed(e);
			}
		});
		arg4Button.setBounds(281, 294, 97, 25);
		contentPane.add(arg4Button);
	}
	protected void do_noArgButton_actionPerformed(ActionEvent arg0) {
		// Call appropriate constructor
		// Add employee to employeeistModel
		// employeeListModel.addElement(emp);
	}
	protected void do_arg2Button_actionPerformed(ActionEvent e) {
		// get empID from empIdTextField, convert to int
		// call appropriate constructor
		// add employee to employeeListModel
		//	employeeListModel.addElement(emp);
	}
	protected void do_arg4Button_actionPerformed(ActionEvent e) {
		// Get empID from empIdTexField, convert to int
		// Get selected string from deptComboBox:
		//	String dept = (String) deptComboBox.getSelectedItem();
		// Call appropriate constructor
		// Add employee to employeeListModel
		//		employeeListModel.addElement(emp);
	}
}
