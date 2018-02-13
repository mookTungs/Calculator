import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
//import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;


public class Calculator extends JFrame{
	static final String[] nameList = {"0", "1", "2", "3", "4",
										"5", "6", "7", "8", "9",
										"+", "-", "*", "/", "=", "."};
	JPanel panel = (JPanel) getContentPane();
	JTextField text = new JTextField();
	JButton[] buttons = new JButton[16];
	
	public Calculator(){
		initUI();
	}
	
	private void initUI(){		
		createLayout();
		setTitle("Calculator");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout(){
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,4,5,5));
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new GridLayout());
		
		//set textfield to can't edit
		text.setEditable(false);
		
		//initialize buttons
		for(int i = 0; i < nameList.length; i++){
			buttons[i] = new JButton(nameList[i]);
		}
		
		//add textfield
		textPanel.add(text);
		textPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		//add buttons
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
		buttonPanel.add(buttons[7]);
		buttonPanel.add(buttons[8]);
		buttonPanel.add(buttons[9]);
		buttonPanel.add(buttons[13]);
		buttonPanel.add(buttons[4]);
		buttonPanel.add(buttons[5]);
		buttonPanel.add(buttons[6]);
		buttonPanel.add(buttons[12]);
		buttonPanel.add(buttons[1]);
		buttonPanel.add(buttons[2]);
		buttonPanel.add(buttons[3]);
		buttonPanel.add(buttons[11]);
		buttonPanel.add(buttons[15]);
		buttonPanel.add(buttons[0]);
		buttonPanel.add(buttons[14]);
		buttonPanel.add(buttons[10]);
		
		
		panel.add(textPanel, BorderLayout.NORTH);
		panel.add(buttonPanel, BorderLayout.SOUTH);
		
		
		pack();
	}
	
	public static void main(String[] args){
		EventQueue.invokeLater(() -> {
			Calculator c = new Calculator();
			c.setVisible(true);
		});
	}
}