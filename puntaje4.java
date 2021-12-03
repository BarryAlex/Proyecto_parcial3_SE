import javax.swing.*;
import java.awt.*;

public class puntaje4 extends JFrame{
  public JLabel mensaje1,mensaje2,mensaje3;
  public JTextArea ResComp;
  public int valor=0;
  JPanel miPanel;
  JScrollPane scroll;

  public Font fuente1 = new Font("Arial Nova",Font.PLAIN,14);
  public Font fuente4 = new Font("Bahnschrift Light",1,14);

  public puntaje4(){
    //setLayout(null);
    setTitle("Resultado");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setIconImage(new ImageIcon(getClass().getResource("Imagenes/Inhalador.png")).getImage());

    miPanel = new JPanel();
    miPanel.setLayout(null);
    miPanel.setBackground(new Color(121,215,255));

    scroll = new JScrollPane(miPanel);
    miPanel.setPreferredSize(new Dimension(540,680));
    scroll.getVerticalScrollBar().setUnitIncrement(16);
    add(scroll);

    Proyecto ventanaPrincipal = new Proyecto();
    valor = ventanaPrincipal.puntaje;

    mensaje1 = new JLabel("El puntaje que usted obtuvo fue de ");
    mensaje1.setBounds(5,0,260,20);
    mensaje1.setFont(fuente4);
    mensaje1.setForeground(new Color(180,14,22));
    miPanel.add(mensaje1);

    mensaje2 =new JLabel("");
    mensaje2.setBounds(260,0,20,20);
    mensaje2.setFont(fuente4);
    mensaje2.setForeground(new Color(180,14,22));
    mensaje2.setText(String.valueOf(valor));
    miPanel.add(mensaje2);

    mensaje3 = new JLabel(" puntos de un total de 44 puntos.");
    mensaje3.setBounds(280,0,250,20);
    mensaje3.setFont(fuente4);
    mensaje3.setForeground(new Color(180,14,22));
    miPanel.add(mensaje3);

    ResComp = new JTextArea();
    ResComp.setBounds(5,30,610,650);
    ResComp.setEditable(false);
    ResComp.setFont(fuente4);
    ResComp.setBackground(new Color(121,215,255));
    ResComp.setForeground(Color.BLACK);
    ResComp.setText("Tener una puntuación entre 4 y 22 puntos en el test abarca probabilidades entre el\n9% al 50% de que usted padesca de asma o asma estacional, el cual solo se\npresenta en ciertos periodos del año bajo ciertas condiciónes dependiendo de las\npersonas. Es posible que usted haya seleccionado que tiene los principales\nsíntomas del asma, como pueden ser opresión en el pecho, dificultad para respirar,\nmúsculos tensos cerca de las vías respiratorias y tener mucha tos. Es importante\nque usted asista con personal médico para realizar la prueba de asma para saber\ncon exactitud si usted padece o no algunos de estos típos de asma.\nLas personas con asma estacional tienen que tomar los mísmos medicamentos que las\npersonas que tienen el asma común aunque solo se llegue a presentar en un periodo\ndel año, ya que puede darse el caso de que los detonantes de ese periodo se\npresenten en un periodocompletamente distinto al habitual.\nEs posible también que usted pueda ser de las personas que solo necesitan pocos\ndetonantes del asma para presentar un ataque del mismo, ya que no todas las\npersonas lo presentan igual.\n\nSi usted resulta tener asma, se le recetarán medicamentos que pueden ayudarle a\nprevenir ataques de asma, así como medicamentos para reducir la gravedad de los\n síntomas durante un ataque de asma.\n\nSu médico le ayudará a diseñar un plan de acción para realizar durante un ataque de\nasma, dicho plan le ayuda a usted para saber cómo reaccionar de manera segura\ny adecuada durante dichos ataques, además le indicará más recomendaciónes\nsobre que hacer para prevenir dichos ataques de asma. Es aconsejable que\nidentifique los detonantes que le provoquen los ataques de asma para tener un\ncontacto mínimo con ellos.\n\nSe le recomienda también que mantenga siempre limpio su casa y lugar de trabajo ya\nque una de las causas que provocan los ataques de asma son el polvo y los acaros.\n\nLas personas que padecen de asma tienen que vacunarse contra la influenza una vez\n al año, ya que son más propensas a contraer esta enfermedad por los síntomas que\nya padecen y porque con el asma, esta combinación de enfermedades puede ser muy\ngrave.");
    miPanel.add(ResComp);
  }

  public static void main(String args[]){
    puntaje4 ventana4 = new puntaje4();
    ventana4.setBounds(300,250,650,400);
    ventana4.setVisible(true);
    ventana4.setResizable(false);
  }
}