package ups.edu.ec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ups.edu.ec.evaluacion.ContactosSeviceSOAp;
import ups.edu.ec.evaluacion.ContactosSeviceSOApService;
import ups.edu.ec.evaluacion.Vehiculo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VehiculoView extends JFrame {

	private JPanel contentPane;
	private JTextField textPlaca;
	private JTextField textMarca;
	private JTextField textModelo;
	private JTextField textPrecio;
	private static final QName SERVICE_NAME = new QName("http://bean.evaluacion.ec.edu.ups/", "ContactosSeviceSOApService");
	private URL wsdlURL = ContactosSeviceSOApService.WSDL_LOCATION;
	private JTextArea textArea;
    ContactosSeviceSOApService ss = new ContactosSeviceSOApService(wsdlURL, SERVICE_NAME);
    ContactosSeviceSOAp port = ss.getContactosSeviceSOApPort();
    private Vehiculo vehiculo;
    private List<Vehiculo> vehiculos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws java.lang.Exception {
		
		
        
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VehiculoView frame = new VehiculoView();
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
	public VehiculoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insertar Vehiculo");
		lblNewLabel.setBounds(78, 27, 96, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Placa");
		lblNewLabel_1.setBounds(10, 61, 46, 14);
		panel.add(lblNewLabel_1);
		
		textPlaca = new JTextField();
		textPlaca.setBounds(88, 58, 86, 20);
		panel.add(textPlaca);
		textPlaca.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Marca");
		lblNewLabel_1_1.setBounds(10, 104, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		textMarca = new JTextField();
		textMarca.setColumns(10);
		textMarca.setBounds(88, 101, 86, 20);
		panel.add(textMarca);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Modelo");
		lblNewLabel_1_1_1.setBounds(10, 143, 46, 14);
		panel.add(lblNewLabel_1_1_1);
		
		textModelo = new JTextField();
		textModelo.setColumns(10);
		textModelo.setBounds(88, 140, 86, 20);
		panel.add(textModelo);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Precio");
		lblNewLabel_1_1_1_1.setBounds(10, 186, 46, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(88, 183, 86, 20);
		panel.add(textPrecio);
		
		JButton btnNewButton = new JButton("Insertar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertar();
			}
		});
		btnNewButton.setBounds(50, 241, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Listart Vehiculos");
		lblNewLabel_2.setBounds(388, 27, 117, 14);
		panel.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(327, 104, 219, 96);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton_1 = new JButton("Listar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listar();
			}
		});
		btnNewButton_1.setBounds(378, 57, 89, 23);
		panel.add(btnNewButton_1);
	}
	
	public void insertar() {
		

        
		vehiculo = new Vehiculo();
        
        vehiculo.setPlaca(textPlaca.getText());
        vehiculo.setMarca(textMarca.getText());
        vehiculo.setModelo(textModelo.getText());
        vehiculo.setPrecio(Double.parseDouble(textPrecio.getText()));
        
        port.crearVehi(vehiculo);
        //System.out.println("insertarVehiculo.result=" + _insertarVehiculo__return);
	}
	
	public void listar() {
		
		
		//System.out.println("Invoking listarVehiculos...");
        vehiculos = port.getVehi();
        
        
        for (int i = 0; i < vehiculos.size(); i++) {
        	
        	textArea.append("\n"+vehiculos.get(i).getPlaca());
        	textArea.append("\n"+vehiculos.get(i).getMarca());
        	
        	textArea.append("\n"+vehiculos.get(i).getModelo());
        	textArea.append("\n"+vehiculos.get(i).getPrecio());
		}
        
        
       
	}
}
