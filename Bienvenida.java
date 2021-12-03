import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class Bienvenida extends JFrame implements ActionListener{
	JPanel miPanel;
	JScrollPane scroll;

	public JTextArea contenido;
	public JScrollPane scrollp;
	public JLabel hola, mensaje1, mensaje2, mensaje3, mensaje4, mensaje5, mensaje6, foto;
	public JButton Inicio;

	public Font fuente1 = new Font("Arial Nova",Font.PLAIN,14);
	public Font fuente2 = new Font("Bahnschrift",3,40);
	public Font fuente3 = new Font("Bahnschrift",1,14);

	public Bienvenida(){
		//setLayout(null);
	  	setTitle("Bienvenida");
	  	setDefaultCloseOperation(EXIT_ON_CLOSE);
	  	setIconImage(new ImageIcon(getClass().getResource("Imagenes/in_p.png")).getImage());

		miPanel = new JPanel();
		miPanel.setLayout(null);
		miPanel.setBackground(new Color(121,215,255));

		scroll = new JScrollPane(miPanel);
		miPanel.setPreferredSize(new Dimension(560,400));
		scroll.getVerticalScrollBar().setUnitIncrement(16);
		add(scroll);

		hola = new JLabel("Saludos");
		hola.setBounds(200,10,500,60);
		hola.setFont(fuente2);
		hola.setForeground(Color.BLACK);
		miPanel.add(hola);

	  	ImageIcon imagen = new ImageIcon("Imagenes/in_p.png");
	  	foto = new JLabel(imagen);
	  	foto.setBounds(150,60,220,220);
	  	Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),Image.SCALE_DEFAULT));
	  	foto.setIcon(icono);
	  	miPanel.add(foto);

		mensaje1 = new JLabel("El siguiente test es una prueba para detectar el posible padecimiento de");
	    mensaje1.setBounds(5,290,550,20);
	    mensaje1.setFont(fuente3);
	    mensaje1.setForeground(Color.BLACK);
	    miPanel.add(mensaje1);

	    mensaje2 = new JLabel("asma en las personas. Este test no está avalado por ningún médico o alguna");
	    mensaje2.setBounds(5,310,550,20);
	    mensaje2.setFont(fuente3);
	    mensaje2.setForeground(Color.BLACK);
	    miPanel.add(mensaje2);

	    mensaje3 = new JLabel("institución médica, por lo que la recomendación principal es acudir a un centro");
	    mensaje3.setBounds(5,330,550,20);
	    mensaje3.setFont(fuente3);
	    mensaje3.setForeground(Color.BLACK);
	    miPanel.add(mensaje3);

	    mensaje4 = new JLabel("de salud para realizarse una prueba efectiva y saber con presición si usted");
	    mensaje4.setBounds(5,350,550,20);
	    mensaje4.setFont(fuente3);
	    mensaje4.setForeground(Color.BLACK);
	    miPanel.add(mensaje4);

	    mensaje5 = new JLabel("llegase a padecer o no de asma.");
	    mensaje5.setBounds(5,370,550,20);
	    mensaje5.setFont(fuente3);
	    mensaje5.setForeground(Color.BLACK);
	    miPanel.add(mensaje5);

	    mensaje6 = new JLabel("Para empezar el test, presione el siguiente botón.");
	    mensaje6.setBounds(5,410,550,20);
	    mensaje6.setFont(fuente3);
	    mensaje6.setForeground(Color.BLACK);
	    miPanel.add(mensaje6);

	    Inicio = new JButton("Empezar");
	  	Inicio.setForeground(Color.BLACK);
	  	Inicio.setBounds(230,440,100,25);
	  	Inicio.setBackground(new Color(255,255,80));
	  	Inicio.setFont(fuente3);
	  	miPanel.add(Inicio);

	  	Inicio.addActionListener(this);

	}

	public void actionPerformed(ActionEvent accion){
		if(accion.getSource() == Inicio){
			Proyecto ventanaP = new Proyecto();
		    ventanaP.setBounds(200,50,600,500);
		    ventanaP.setVisible(true);
		    ventanaP.setResizable(false);
		    this.setVisible(false);
		}
	}

	public static void main(String[] args) {
  	Bienvenida ingreso = new Bienvenida();
  	ingreso.setBounds(500,200,600,530);
  	ingreso.setVisible(true);
  	ingreso.setResizable(false);
  	ingreso.setLocationRelativeTo(null);
  }//fin del main
}