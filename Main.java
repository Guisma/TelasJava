Cadastro
package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Cadastros {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastros window = new Cadastros();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBounds(162, 227, 89, 23);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	    	exibirMensagemFinalizacao();
    	        JOptionPane.showMessageDialog(frame, "Cadastro Efetuado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    	        frame.dispose();
    	        Login login = new Login();
    	        login.getFrame().setVisible(true); 
    	        
    	    }
			private void exibirMensagemFinalizacao() {

			}
			
    	});
		
		textField = new JTextField();
		textField.setBounds(61, 71, 127, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(61, 127, 127, 20);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(61, 183, 127, 20);
		panel.add(passwordField_1);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(61, 46, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(61, 102, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Confirmar Senha");
		lblNewLabel_2.setBounds(61, 158, 86, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cadastro");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(175, 11, 76, 14);
		panel.add(lblNewLabel_3);
	}
}



2) Login
package teste;
import java.awt.EventQueue;  // faz com que um e	vento ocorra no momento certo
import java.awt.event.ActionEvent; // de acordo com uma ação do usuario faz algo
import java.awt.event.ActionListener; // recebe uma ação do usuario
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Window;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import java.awt.Panel; //  formatação e validação de dados inseridos.
public class Login {
  private JFrame frame; // Janela principal
  private JPasswordField passwordField; // Campo de senha
  public JFrame getFrame() {
	   return frame;
  }
  public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
          public void run() {
              try {
                  Login window = new Login();
                  window.frame.setVisible(true);
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
      });
  }
  public Login() {
      initialize();
  }
  private void initialize() {
      frame = new JFrame();
      frame.getContentPane().setBackground(SystemColor.activeCaption); // Define a cor de fundo da janela
      frame.getContentPane().setForeground(Color.DARK_GRAY);
      frame.setBounds(100, 100, 450, 300); // Define a posição e o tamanho da janela
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento ao fechar a janela
      frame.getContentPane().setLayout(null); // Define o layout
     
      JLabel lblNewLabel_1 = new JLabel("Usuario"); // Label "Usuario"
      lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 11)); // Define a fonte do Label
      lblNewLabel_1.setBounds(84, 64, 46, 14); // Define a posição e o tamanho do Label
      frame.getContentPane().add(lblNewLabel_1);
      // Adiciona o Label à janela
      JLabel lblNewLabel_2 = new JLabel("Senha"); // Label "Senha"
      lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 11));
      lblNewLabel_2.setBounds(84, 111, 46, 14);
      frame.getContentPane().add(lblNewLabel_2);
      passwordField = new JPasswordField(); // Campo de senha
      passwordField.setBounds(84, 125, 124, 20); // Define a posição e o tamanho do campo de senha
      frame.getContentPane().add(passwordField); // Adiciona o campo de senha à janela
      JButton btnNewButton = new JButton("Confirmar"); // Botão "Confirmar"
      btnNewButton.setBounds(165, 215, 97, 23);// Define a posição e o tamanho do botão
      frame.getContentPane().add(btnNewButton);
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              frame.dispose(); // Fecha a janela ao clicar no botão
          }
      });
      btnNewButton.addActionListener(new ActionListener() {
   	    public void actionPerformed(ActionEvent e) {
   	    	exibirMensagemFinalizacao();
   	        JOptionPane.showMessageDialog(frame, "Login Efetuado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
   	        frame.dispose(); // Fecha a janela ao clicar no botão
   	       
   	    }
			private void exibirMensagemFinalizacao() {
			}
			
   	});
  
      JLabel lblNewLabel = new JLabel("Sistema"); // Label "Sistema"
      lblNewLabel.setBounds(165, 11, 138, 32);
      lblNewLabel.setFont(new Font("Dialog", Font.ITALIC, 29)); // Define a fonte do Label
      lblNewLabel.setBackground(new Color(139, 0, 0)); // Define a cor de fundo do Label
		frame.getContentPane().add(lblNewLabel); // Adiciona o Label à janela
		lblNewLabel.setBackground(new Color(139, 0, 0)); // Define a cor de fundo do Label
		frame.getContentPane().add(lblNewLabel); // Adiciona o Label à janela
		JFormattedTextField formattedTextField = new JFormattedTextField(); // Campo de texto formatado
	    formattedTextField.setBounds(84, 80, 124, 20); // Define a posição e o tamanho do campo de texto
	    frame.getContentPane().add(formattedTextField); // Adiciona o campo de texto à janela
	  
	    JCheckBox chckbxNewCheckBox = new JCheckBox("Lembrar Senha"); // Caixa de seleção "Lembrar Senha"
	    chckbxNewCheckBox.setFont(new Font("Arial", Font.ITALIC, 11)); // Define a fonte da caixa de seleção
	    chckbxNewCheckBox.setBackground(SystemColor.activeCaption); // Define a cor de fundo da caixa de seleção
	    chckbxNewCheckBox.setBounds(84, 169, 124, 23); // Define a posição e o tamanho da caixa de seleção
	    frame.getContentPane().add(chckbxNewCheckBox);
	
	}
}
