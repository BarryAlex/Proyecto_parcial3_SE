import javax.swing.*;
import java.awt.*;
import javax.swing.event.*; //Para eventos de Checkbox
import java.awt.event.*;
import javax.swing.JOptionPane;


public class Proyecto extends JFrame implements ChangeListener, ActionListener{
  JPanel miPanel;
  public JMenuBar barra;
  public JMenuItem volver;

  public JLabel intro1, intro2, intro3;
  public JLabel pregunta1,pregunta2,pregunta3,pregunta4,pregunta5,pregunta6,pregunta7,pregunta8,pregunta9,pregunta10,pregunta11,pregunta12,pregunta13;
  public JLabel sub1, sub2, sub3, sub4, sub5, sub6, sub7, sub8, sub9, sub10, sub11, sub12;

  JScrollPane scroll;

  public JRadioButton radio1_1, radio1_2, radio2_1, radio2_2, radio3_1, radio3_2, radio4_1, radio4_2, radio5_1, radio5_2, radio5_3, radio5_4, radio6_1, radio6_2, radio6_3, radio6_4, radio6_5, radio6_6, radio6_7, radio6_8, radio6_9, radio6_10, radio7_1, radio7_2, radio7_3, radio7_4, radio7_5, radio7_6, radio7_7, radio7_8, radio7_9, radio7_10, radio8_1, radio8_2, radio9_1, radio9_2, radio10_1, radio10_2, radio11_1, radio11_2, radio11_3, radio12_1, radio12_2, radio12_3, radio13_1, radio13_2;

  public ButtonGroup opc1, opc2, opc3, opc4, opc5, opc6, opc7, opc8, opc9, opc10, opc11,opc12,opc13,opc14,opc15,opc16,opc17,opc18,opc19,opc20,opc21,opc22;

  public Font fuente1 = new Font("Arial Nova",Font.PLAIN,14);
  public Font fuente2 = new Font("Arial Nova",Font.BOLD,14);
  public Font fuente3 = new Font("Bahnschrift",1,14);
  public Font fuente4 = new Font("Bahnschrift Light",1,14);

  public static int puntaje=0;

  public JButton resultado;

  //constructor
  public Proyecto(){
    //setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Test de asma");
    setIconImage(new ImageIcon(getClass().getResource("Imagenes/in_p.png")).getImage());

    barra = new JMenuBar();
    setJMenuBar(barra);
    volver = new JMenuItem("Volver a hacer");
    barra.add(volver);


    miPanel = new JPanel();
    miPanel.setLayout(null);
    miPanel.setBackground(new Color(121,215,255));

    scroll = new JScrollPane(miPanel);
    miPanel.setPreferredSize(new Dimension(560,1100));
    scroll.getVerticalScrollBar().setUnitIncrement(16);
    add(scroll);

    /*intro1 = new JLabel("Este test sirve para dar una idea a la persona sobre si los síntomas que presentan puedan coincidir con los que se presenta el Asma.");
    intro1.setBounds(5,0,850,20);
    intro1.setFont(fuente1);
    miPanel.add(intro1);

    intro2 = new JLabel("Nota: DADO QUE ESTE TEST NO ESTA AVALADO POR NINGUN HOPITAL O MEDICO, SE RECOMIENDA ACUDIR CON UN MEDICO");
    intro2.setBounds(5,20,870,20);
    intro2.setFont(fuente2);
    miPanel.add(intro2);

    intro3 = new JLabel("PARA REALIZAR UNA PRUEBA DE ASMA.");
    intro3.setBounds(5,40,780,20);
    intro3.setFont(fuente2);
    miPanel.add(intro3);*/

////////////////////////////////////////////////////////////////////// pregunta 1
    pregunta1=new JLabel("1) ¿Suele tener ataques de tos?");
    pregunta1.setBounds(5,0, 230,20);
    pregunta1.setFont(fuente4);
    pregunta1.setForeground(Color.BLACK);
    miPanel.add(pregunta1);

    radio1_1 = new JRadioButton("Sí");
    radio1_1.setBounds(5,20,50,20);
    radio1_1.setBackground(new Color(121,215,255));
    radio1_1.setFont(fuente3);
    radio1_1.setForeground(new Color(180,14,22));
    miPanel.add(radio1_1);

    radio1_2 = new JRadioButton("No");
    radio1_2.setBounds(65,20,50,20);
    radio1_2.setBackground(new Color(121,215,255));
    radio1_2.setForeground(new Color(180,14,22));
    radio1_2.setFont(fuente3);
    miPanel.add(radio1_2);

    opc1 = new ButtonGroup();
    opc1.add(radio1_1);
    opc1.add(radio1_2);

///////////////////////////////////////////////////////////////////////////////////////// pregunta 2
    pregunta2=new JLabel("2) ¿Suele tener mucha tos por las mañanas y/o noches?");
    pregunta2.setBounds(5,60, 400,20);
    pregunta2.setFont(fuente4);
    pregunta2.setForeground(Color.BLACK);
    miPanel.add(pregunta2);

    radio2_1 = new JRadioButton("Sí");
    radio2_1.setBounds(5,80,50,20);
    radio2_1.setBackground(new Color(121,215,255));
    radio2_1.setFont(fuente3);
    radio2_1.setForeground(new Color(180,14,22));
    miPanel.add(radio2_1);

    radio2_2 = new JRadioButton("No");
    radio2_2.setBounds(65,80,50,20);
    radio2_2.setBackground(new Color(121,215,255));
    radio2_2.setFont(fuente3);
    radio2_2.setForeground(new Color(180,14,22));
    miPanel.add(radio2_2);

    opc2 = new ButtonGroup();
    opc2.add(radio2_1);
    opc2.add(radio2_2);

/////////////////////////////////////////////////////////////////////////////////////////// pregunta 3
    pregunta3=new JLabel("3) ¿Presenta alguna dificultad para respirar cuando tiene tos?");
    pregunta3.setBounds(5,120, 450,20);
    pregunta3.setFont(fuente4);
    pregunta3.setForeground(Color.BLACK);
    miPanel.add(pregunta3);

    radio3_1 = new JRadioButton("Sí");
    radio3_1.setBounds(5,140,50,20);
    radio3_1.setBackground(new Color(121,215,255));
    radio3_1.setForeground(new Color(180,14,22));
    radio3_1.setFont(fuente3);
    miPanel.add(radio3_1);

    radio3_2 = new JRadioButton("No");
    radio3_2.setBounds(65,140,50,20);
    radio3_2.setBackground(new Color(121,215,255));
    radio3_2.setForeground(new Color(180,14,22));
    radio3_2.setFont(fuente3);
    miPanel.add(radio3_2);

    opc3 = new ButtonGroup();
    opc3.add(radio3_1);
    opc3.add(radio3_2);

//////////////////////////////////////////////////////////////////////////////////////////////// pregunta 4
    pregunta4=new JLabel("4) ¿Hacer ejercicio le provoca mucha tos?");
    pregunta4.setBounds(5,180, 400,20);
    pregunta4.setFont(fuente4);
    pregunta4.setForeground(Color.BLACK);
    miPanel.add(pregunta4);

    radio4_1 = new JRadioButton("Sí");
    radio4_1.setBounds(5,200,50,20);
    radio4_1.setBackground(new Color(121,215,255));
    radio4_1.setForeground(new Color(180,14,22));
    radio4_1.setFont(fuente3);
    miPanel.add(radio4_1);

    radio4_2 = new JRadioButton("No");
    radio4_2.setBounds(65,200,50,20);
    radio4_2.setBackground(new Color(121,215,255));
    radio4_2.setForeground(new Color(180,14,22));
    radio4_2.setFont(fuente3);
    miPanel.add(radio4_2);

    opc4 = new ButtonGroup();
    opc4.add(radio4_1);
    opc4.add(radio4_2);

////////////////////////////////////////////////////////////////////////////////////////////////// pregunta 5
    pregunta5=new JLabel("5) ¿Antes de tener un ataque de tos, presenta alguno de estos síntomas?");
    pregunta5.setBounds(5,240, 520,20);
    pregunta5.setFont(fuente4);
    pregunta5.setForeground(Color.BLACK);
    miPanel.add(pregunta5);

    sub1=new JLabel("Sibilancias (Silvar al respirar)");
    sub1.setBounds(30, 260, 230, 20);
    sub1.setFont(fuente4);
    sub1.setForeground(Color.BLACK);
    miPanel.add(sub1);

    radio5_1 = new JRadioButton("Sí");
    radio5_1.setBounds(240,260,50,20);
    radio5_1.setBackground(new Color(121,215,255));
    radio5_1.setForeground(new Color(180,14,22));
    radio5_1.setFont(fuente3);
    miPanel.add(radio5_1);

    radio5_2 = new JRadioButton("No");
    radio5_2.setBounds(300,260,50,20);
    radio5_2.setBackground(new Color(121,215,255));
    radio5_2.setForeground(new Color(180,14,22));
    radio5_2.setFont(fuente3);
    miPanel.add(radio5_2);

    opc5 = new ButtonGroup();
    opc5.add(radio5_1);
    opc5.add(radio5_2);

    sub2=new JLabel("Opresión en el pecho");
    sub2.setBounds(30, 290, 190, 20);
    sub2.setFont(fuente4);
    sub2.setForeground(Color.BLACK);
    miPanel.add(sub2);

    radio5_3 = new JRadioButton("Sí");
    radio5_3.setBounds(240,290,50,20);
    radio5_3.setBackground(new Color(121,215,255));
    radio5_3.setForeground(new Color(180,14,22));
    radio5_3.setFont(fuente3);
    miPanel.add(radio5_3);

    radio5_4 = new JRadioButton("No");
    radio5_4.setBounds(300,290,50,20);
    radio5_4.setBackground(new Color(121,215,255));
    radio5_4.setForeground(new Color(180,14,22));
    radio5_4.setFont(fuente3);
    miPanel.add(radio5_4);

    opc6 = new ButtonGroup();
    opc6.add(radio5_3);
    opc6.add(radio5_4);

//////////////////////////////////////////////////////////////////////////////////////////////////////// pregunta 6
    pregunta6=new JLabel("6) Cuando tiene ataques de tos, ¿presenta alguno de estos síntomas?");
    pregunta6.setBounds(5,330, 500,20);
    pregunta6.setFont(fuente4);
    pregunta6.setForeground(Color.BLACK);
    miPanel.add(pregunta6);

    sub3=new JLabel("Falta de aire");
    sub3.setBounds(30, 350, 190, 20);
    sub3.setFont(fuente4);
    sub3.setForeground(Color.BLACK);
    miPanel.add(sub3);

    radio6_1 = new JRadioButton("Sí");
    radio6_1.setBounds(230,350,50,20);
    radio6_1.setBackground(new Color(121,215,255));
    radio6_1.setForeground(new Color(180,14,22));
    radio6_1.setFont(fuente3);
    miPanel.add(radio6_1);

    radio6_2 = new JRadioButton("No");
    radio6_2.setBounds(290,350,50,20);
    radio6_2.setBackground(new Color(121,215,255));
    radio6_2.setForeground(new Color(180,14,22));
    radio6_2.setFont(fuente3);
    miPanel.add(radio6_2);

    opc7 = new ButtonGroup();
    opc7.add(radio6_1);
    opc7.add(radio6_2);

    sub4=new JLabel("Opresión en el pecho");
    sub4.setBounds(30, 380, 190, 20);
    sub4.setForeground(Color.BLACK);
    sub4.setFont(fuente4);
    miPanel.add(sub4);

    radio6_3 = new JRadioButton("Sí");
    radio6_3.setBounds(230,380,50,20);
    radio6_3.setBackground(new Color(121,215,255));
    radio6_3.setForeground(new Color(180,14,22));
    radio6_3.setFont(fuente3);
    miPanel.add(radio6_3);

    radio6_4 = new JRadioButton("No");
    radio6_4.setBounds(290,380,50,20);
    radio6_4.setBackground(new Color(121,215,255));
    radio6_4.setForeground(new Color(180,14,22));
    radio6_4.setFont(fuente3);
    miPanel.add(radio6_4);

    opc8 = new ButtonGroup();
    opc8.add(radio6_3);
    opc8.add(radio6_4);

    sub5=new JLabel("Mucosidad en garganta y/o nariz");
    sub5.setBounds(30, 410, 230, 20);
    sub5.setFont(fuente4);
    sub5.setForeground(Color.BLACK);
    miPanel.add(sub5);

    radio6_5 = new JRadioButton("Sí");
    radio6_5.setBounds(270,410,50,20);
    radio6_5.setBackground(new Color(121,215,255));
    radio6_5.setForeground(new Color(180,14,22));
    radio6_5.setFont(fuente3);
    miPanel.add(radio6_5);

    radio6_6 = new JRadioButton("No");
    radio6_6.setBounds(330,410,50,20);
    radio6_6.setBackground(new Color(121,215,255));
    radio6_6.setForeground(new Color(180,14,22));
    radio6_6.setFont(fuente3);
    miPanel.add(radio6_6);

    opc9 = new ButtonGroup();
    opc9.add(radio6_5);
    opc9.add(radio6_6);

    sub6=new JLabel("Músculos tensos cerca de vías respiratorias");
    sub6.setBounds(30, 440, 320, 20);
    sub6.setFont(fuente4);
    sub6.setForeground(Color.BLACK);
    miPanel.add(sub6);

    radio6_7 = new JRadioButton("Sí");
    radio6_7.setBounds(360,440,50,20);
    radio6_7.setBackground(new Color(121,215,255));
    radio6_7.setForeground(new Color(180,14,22));
    radio6_7.setFont(fuente3);
    miPanel.add(radio6_7);

    radio6_8 = new JRadioButton("No");
    radio6_8.setBounds(420,440,50,20);
    radio6_8.setBackground(new Color(121,215,255));
    radio6_8.setForeground(new Color(180,14,22));
    radio6_8.setFont(fuente3);
    miPanel.add(radio6_8);

    opc10 = new ButtonGroup();
    opc10.add(radio6_7);
    opc10.add(radio6_8);

    sub7=new JLabel("Estrés");
    sub7.setBounds(30, 470, 50, 20);
    sub7.setFont(fuente4);
    sub7.setForeground(Color.BLACK);
    miPanel.add(sub7);

    radio6_9 = new JRadioButton("Sí");
    radio6_9.setBounds(80,470,50,20);
    radio6_9.setBackground(new Color(121,215,255));
    radio6_9.setForeground(new Color(180,14,22));
    radio6_9.setFont(fuente3);
    miPanel.add(radio6_9);

    radio6_10 = new JRadioButton("No");
    radio6_10.setBounds(140,470,50,20);
    radio6_10.setBackground(new Color(121,215,255));
    radio6_10.setForeground(new Color(180,14,22));
    radio6_10.setFont(fuente3);
    miPanel.add(radio6_10);

    opc11 = new ButtonGroup();
    opc11.add(radio6_9);
    opc11.add(radio6_10);

////////////////////////////////////////////////////////////////////////////////////////////////// pregunta 7
    pregunta7=new JLabel("7) ¿Ha inhalado alguna de estas sustancias?");
    pregunta7.setBounds(5,510, 480,20);
    pregunta7.setFont(fuente4);
    pregunta7.setForeground(Color.BLACK);
    miPanel.add(pregunta7);

    sub8=new JLabel("Químicos");
    sub8.setBounds(30, 530, 80, 20);
    sub8.setFont(fuente4);
    sub8.setForeground(Color.BLACK);
    miPanel.add(sub8);

    radio7_1 = new JRadioButton("Sí");
    radio7_1.setBounds(120,530,50,20);
    radio7_1.setBackground(new Color(121,215,255));
    radio7_1.setForeground(new Color(180,14,22));
    radio7_1.setFont(fuente3);
    miPanel.add(radio7_1);

    radio7_2 = new JRadioButton("No");
    radio7_2.setBounds(180,530,50,20);
    radio7_2.setBackground(new Color(121,215,255));
    radio7_2.setForeground(new Color(180,14,22));
    radio7_2.setFont(fuente3);
    miPanel.add(radio7_2);

    opc12 = new ButtonGroup();
    opc12.add(radio7_1);
    opc12.add(radio7_2);

    sub9=new JLabel("Humo de tabaco");
    sub9.setBounds(30, 560, 120, 20);
    sub9.setFont(fuente4);
    sub9.setForeground(Color.BLACK);
    miPanel.add(sub9);

    radio7_3 = new JRadioButton("Sí");
    radio7_3.setBounds(160,560,50,20);
    radio7_3.setBackground(new Color(121,215,255));
    radio7_3.setForeground(new Color(180,14,22));
    radio7_3.setFont(fuente3);
    miPanel.add(radio7_3);

    radio7_4 = new JRadioButton("No");
    radio7_4.setBounds(220,560,50,20);
    radio7_4.setBackground(new Color(121,215,255));
    radio7_4.setForeground(new Color(180,14,22));
    radio7_4.setFont(fuente3);
    miPanel.add(radio7_4);

    opc13 = new ButtonGroup();
    opc13.add(radio7_3);
    opc13.add(radio7_4);

    sub10=new JLabel("Polvo");
    sub10.setBounds(30, 590, 40, 20);
    sub10.setFont(fuente4);
    sub10.setForeground(Color.BLACK);
    miPanel.add(sub10);

    radio7_5 = new JRadioButton("Sí");
    radio7_5.setBounds(80,590,50,20);
    radio7_5.setBackground(new Color(121,215,255));
    radio7_5.setForeground(new Color(180,14,22));
    radio7_5.setFont(fuente3);
    miPanel.add(radio7_5);

    radio7_6 = new JRadioButton("No");
    radio7_6.setBounds(140,590,50,20);
    radio7_6.setBackground(new Color(121,215,255));
    radio7_6.setForeground(new Color(180,14,22));
    radio7_6.setFont(fuente3);
    miPanel.add(radio7_6);

    opc14 = new ButtonGroup();
    opc14.add(radio7_5);
    opc14.add(radio7_6);

    sub11=new JLabel("Humo de automóvil");
    sub11.setBounds(30, 620, 150, 20);
    sub11.setFont(fuente4);
    sub11.setForeground(Color.BLACK);
    miPanel.add(sub11);

    radio7_7 = new JRadioButton("Sí");
    radio7_7.setBounds(200,620,50,20);
    radio7_7.setBackground(new Color(121,215,255));
    radio7_7.setForeground(new Color(180,14,22));
    radio7_7.setFont(fuente3);
    miPanel.add(radio7_7);

    radio7_8 = new JRadioButton("No");
    radio7_8.setBounds(260,620,50,20);
    radio7_8.setBackground(new Color(121,215,255));
    radio7_8.setForeground(new Color(180,14,22));
    radio7_8.setFont(fuente3);
    miPanel.add(radio7_8);

    opc15 = new ButtonGroup();
    opc15.add(radio7_7);
    opc15.add(radio7_8);

    sub12=new JLabel("Pelaje de animales");
    sub12.setBounds(30, 650, 150, 20);
    sub12.setFont(fuente4);
    sub12.setForeground(Color.BLACK);
    miPanel.add(sub12);

    radio7_9 = new JRadioButton("Sí");
    radio7_9.setBounds(200,650,50,20);
    radio7_9.setBackground(new Color(121,215,255));
    radio7_9.setForeground(new Color(180,14,22));
    radio7_9.setFont(fuente3);
    miPanel.add(radio7_9);

    radio7_10 = new JRadioButton("No");
    radio7_10.setBounds(260,650,50,20);
    radio7_10.setBackground(new Color(121,215,255));
    radio7_10.setForeground(new Color(180,14,22));
    radio7_10.setFont(fuente3);
    miPanel.add(radio7_10);

    opc16 = new ButtonGroup();
    opc16.add(radio7_9);
    opc16.add(radio7_10);

///////////////////////////////////////////////////////////////////////////////////////////////////// pregunta 8
    pregunta8=new JLabel("8) ¿La inhalación de las sustancias anteriores u otras le provoca mucha tos?");
    pregunta8.setBounds(5,690, 540,20);
    pregunta8.setFont(fuente4);
    pregunta8.setForeground(Color.BLACK);
    miPanel.add(pregunta8);

    radio8_1 = new JRadioButton("Sí");
    radio8_1.setBounds(5,710,50,20);
    radio8_1.setBackground(new Color(121,215,255));
    radio8_1.setForeground(new Color(180,14,22));
    radio8_1.setFont(fuente3);
    miPanel.add(radio8_1);

    radio8_2 = new JRadioButton("No");
    radio8_2.setBounds(65,710,50,20);
    radio8_2.setBackground(new Color(121,215,255));
    radio8_2.setForeground(new Color(180,14,22));
    radio8_2.setFont(fuente3);
    miPanel.add(radio8_2);

    opc17 = new ButtonGroup();
    opc17.add(radio8_1);
    opc17.add(radio8_2);

//////////////////////////////////////////////////////////////////////////////////////////////////// pregunta 9
    pregunta9=new JLabel("9) ¿Respirar aire frío le provoca tos?");
    pregunta9.setBounds(5,750, 490,20);
    pregunta9.setFont(fuente4);
    pregunta9.setForeground(Color.BLACK);
    miPanel.add(pregunta9);

    radio9_1 = new JRadioButton("Sí");
    radio9_1.setBounds(5,770,50,20);
    radio9_1.setBackground(new Color(121,215,255));
    radio9_1.setForeground(new Color(180,14,22));
    radio9_1.setFont(fuente3);
    miPanel.add(radio9_1);

    radio9_2 = new JRadioButton("No");
    radio9_2.setBounds(65,770,50,20);
    radio9_2.setBackground(new Color(121,215,255));
    radio9_2.setForeground(new Color(180,14,22));
    radio9_2.setFont(fuente3);
    miPanel.add(radio9_2);

    opc18 = new ButtonGroup();
    opc18.add(radio9_1);
    opc18.add(radio9_2);

/////////////////////////////////////////////////////////////////////////////////////////////// pregunta 10
    pregunta10=new JLabel("10) ¿Tiene resfríos de más de 10 días?");
    pregunta10.setBounds(5,810, 490,20);
    pregunta10.setFont(fuente4);
    pregunta10.setForeground(Color.BLACK);
    miPanel.add(pregunta10);

    radio10_1 = new JRadioButton("Sí");
    radio10_1.setBounds(5,830,50,20);
    radio10_1.setBackground(new Color(121,215,255));
    radio10_1.setForeground(new Color(180,14,22));
    radio10_1.setFont(fuente3);
    miPanel.add(radio10_1);

    radio10_2 = new JRadioButton("No");
    radio10_2.setBounds(65,830,50,20);
    radio10_2.setBackground(new Color(121,215,255));
    radio10_2.setForeground(new Color(180,14,22));
    radio10_2.setFont(fuente3);
    miPanel.add(radio10_2);

    opc19 = new ButtonGroup();
    opc19.add(radio10_1);
    opc19.add(radio10_2);

/////////////////////////////////////////////////////////////////////////////////////////////////////// pregunta 11
    pregunta11=new JLabel("11) ¿Alguno de sus familiares tiene asma?");
    pregunta11.setBounds(5,870, 490,20);
    pregunta11.setFont(fuente4);
    pregunta11.setForeground(Color.BLACK);
    miPanel.add(pregunta11);

    radio11_1 = new JRadioButton("Sí");
    radio11_1.setBounds(5,890,50,20);
    radio11_1.setBackground(new Color(121,215,255));
    radio11_1.setForeground(new Color(180,14,22));
    radio11_1.setFont(fuente3);
    miPanel.add(radio11_1);

    radio11_2 = new JRadioButton("No");
    radio11_2.setBounds(65,890,50,20);
    radio11_2.setBackground(new Color(121,215,255));
    radio11_2.setForeground(new Color(180,14,22));
    radio11_2.setFont(fuente3);
    miPanel.add(radio11_2);

    radio11_3 = new JRadioButton("No lo se");
    radio11_3.setBounds(130,890,100,20);
    radio11_3.setBackground(new Color(121,215,255));
    radio11_3.setForeground(new Color(180,14,22));
    radio11_3.setFont(fuente3);
    miPanel.add(radio11_3);

    opc20 = new ButtonGroup();
    opc20.add(radio11_1);
    opc20.add(radio11_2);
    opc20.add(radio11_3);

///////////////////////////////////////////////////////////////////////////////////////////////// pregunta 12
    pregunta12=new JLabel("12) ¿Usted tiene alguna alergia?");
    pregunta12.setBounds(5,930, 490,20);
    pregunta12.setFont(fuente4);
    pregunta12.setForeground(Color.BLACK);
    miPanel.add(pregunta12);

    radio12_1 = new JRadioButton("Sí");
    radio12_1.setBounds(5,950,50,20);
    radio12_1.setBackground(new Color(121,215,255));
    radio12_1.setForeground(new Color(180,14,22));
    radio12_1.setFont(fuente3);
    miPanel.add(radio12_1);

    radio12_2 = new JRadioButton("No");
    radio12_2.setBounds(65,950,50,20);
    radio12_2.setBackground(new Color(121,215,255));
    radio12_2.setForeground(new Color(180,14,22));
    radio12_2.setFont(fuente3);
    miPanel.add(radio12_2);

    radio12_3 = new JRadioButton("No lo se");
    radio12_3.setBounds(130,950,100,20);
    radio12_3.setBackground(new Color(121,215,255));
    radio12_3.setForeground(new Color(180,14,22));
    radio12_3.setFont(fuente3);
    miPanel.add(radio12_3);

    opc21 = new ButtonGroup();
    opc21.add(radio12_1);
    opc21.add(radio12_2);
    opc21.add(radio12_3);

///////////////////////////////////////////////////////////////////////////////////////////////////////// pregunta 13
    pregunta13=new JLabel("13) ¿Suele faltar a la escuela/trabajo cuando tiene ataques de tos?");
    pregunta13.setBounds(5,990, 490,20);
    pregunta13.setFont(fuente4);
    pregunta13.setForeground(Color.BLACK);
    miPanel.add(pregunta13);

    radio13_1 = new JRadioButton("Sí");
    radio13_1.setBounds(5,1010,50,20);
    radio13_1.setBackground(new Color(121,215,255));
    radio13_1.setForeground(new Color(180,14,22));
    radio13_1.setFont(fuente3);
    miPanel.add(radio13_1);

    radio13_2 = new JRadioButton("No");
    radio13_2.setBounds(65,1010,50,20);
    radio13_2.setBackground(new Color(121,215,255));
    radio13_2.setForeground(new Color(180,14,22));
    radio13_2.setFont(fuente3);
    miPanel.add(radio13_2);

    opc22 = new ButtonGroup();
    opc22.add(radio13_1);
    opc22.add(radio13_2);

/////////////////////////////////////////////////////////////////////////////////////// Mostrar resultado
    resultado = new JButton("Mostrar resultado");
    resultado.setBounds(200,1050,180,25);
    resultado.setFont(fuente4);
    resultado.setForeground(Color.BLACK);
    resultado.setBackground(new Color(255,255,80));
    resultado.setEnabled(false);
    miPanel.add(resultado);
    
////////////////////////////////////////////////////////////////////////////////////// Configuraciones listener
    radio1_1.addChangeListener(this);
    radio1_2.addChangeListener(this);
    radio2_1.addChangeListener(this);
    radio2_2.addChangeListener(this);
    radio3_1.addChangeListener(this);
    radio3_2.addChangeListener(this);
    radio4_1.addChangeListener(this);
    radio4_2.addChangeListener(this);
    radio5_1.addChangeListener(this);
    radio5_2.addChangeListener(this);
    radio5_3.addChangeListener(this);
    radio5_4.addChangeListener(this);
    radio6_1.addChangeListener(this);
    radio6_2.addChangeListener(this);
    radio6_3.addChangeListener(this);
    radio6_4.addChangeListener(this);
    radio6_5.addChangeListener(this);
    radio6_6.addChangeListener(this);
    radio6_7.addChangeListener(this);
    radio6_8.addChangeListener(this);
    radio6_9.addChangeListener(this);
    radio6_10.addChangeListener(this);
    radio7_1.addChangeListener(this);
    radio7_2.addChangeListener(this);
    radio7_3.addChangeListener(this);
    radio7_4.addChangeListener(this);
    radio7_5.addChangeListener(this);
    radio7_6.addChangeListener(this);
    radio7_7.addChangeListener(this);
    radio7_8.addChangeListener(this);
    radio7_9.addChangeListener(this);
    radio7_10.addChangeListener(this);
    radio8_1.addChangeListener(this);
    radio8_2.addChangeListener(this);
    radio9_1.addChangeListener(this);
    radio9_2.addChangeListener(this);
    radio10_1.addChangeListener(this);
    radio10_2.addChangeListener(this);
    radio11_1.addChangeListener(this);
    radio11_2.addChangeListener(this);
    radio11_3.addChangeListener(this);
    radio12_1.addChangeListener(this);
    radio12_2.addChangeListener(this);
    radio12_3.addChangeListener(this);
    radio13_1.addChangeListener(this);
    radio13_2.addChangeListener(this);
    resultado.addActionListener(this);
    volver.addActionListener(this);
  }//fin del constructor

////////////////////////////////////////////////////////// Listener de radios
  public void stateChanged(ChangeEvent accion){
    int r1=0,r2=0,r3=0,r4=0,r5=0,r6=0,r7=0,r8=0,r9=0,r10=0,r11=0,r12=0,r13=0,r14=0,r15=0,r16=0,r17=0,r18=0,r19=0,r20=0,r21=0,r22=0;

    //////////////////////////////////////////// respuesta a opc 1
    if(radio1_1.isSelected() == true){
      r1=1;
    }
    if(radio1_2.isSelected() == true){
      r1=0;
    }

    //////////////////////////////////////////// respuesta a opc 2
    if(radio2_1.isSelected() == true){
      r2=1;
    }
    if(radio2_2.isSelected() == true){
      r2=0;
    }

    //////////////////////////////////////////// respuesta a opc 3
    if(radio3_1.isSelected() == true){
      r3=3;
    }
    if(radio3_2.isSelected() == true){
      r3=0;
    }

    //////////////////////////////////////////// respuesta a opc 4
    if(radio4_1.isSelected() == true){
      r4=2;
    }
    if(radio4_2.isSelected() == true){
      r4=0;
    }

    //////////////////////////////////////////// respuesta a opc 5
    if(radio5_1.isSelected() == true){
      r5=1;
    }
    if(radio5_2.isSelected() == true){
      r5=0;
    }

    //////////////////////////////////////////// respuesta a opc 6
    if(radio5_3.isSelected() == true){
      r6=3;
    }
    if(radio5_4.isSelected() == true){
      r6=0;
    }

    //////////////////////////////////////////// respuesta a opc 7
    if(radio6_1.isSelected() == true){
      r7=3;
    }
    if(radio6_2.isSelected() == true){
      r7=0;
    }

    //////////////////////////////////////////// respuesta a opc 8
    if(radio6_3.isSelected() == true){
      r8=3;
    }
    if(radio6_4.isSelected() == true){
      r8=0;
    }

    //////////////////////////////////////////// respuesta a opc 9
    if(radio6_5.isSelected() == true){
      r9=1;
    }
    if(radio6_6.isSelected() == true){
      r9=0;
    }

    //////////////////////////////////////////// respuesta a opc 10
    if(radio6_7.isSelected() == true){
      r10=2;
    }
    if(radio6_8.isSelected() == true){
      r10=0;
    }

    //////////////////////////////////////////// respuesta a opc 11
    if(radio6_9.isSelected() == true){
      r11=2;
    }
    if(radio6_10.isSelected() == true){
      r11=0;
    }
    
    //////////////////////////////////////////// respuesta a opc 12
    if(radio7_1.isSelected() == true){
      r12=2;
    }
    if(radio7_2.isSelected() == true){
      r12=0;
    }

    //////////////////////////////////////////// respuesta a opc 13
    if(radio7_3.isSelected() == true){
      r13=2;
    }
    if(radio7_4.isSelected() == true){
      r13=0;
    }

    //////////////////////////////////////////// respuesta a opc 14
    if(radio7_5.isSelected() == true){
      r14=1;
    }
    if(radio7_6.isSelected() == true){
      r14=0;
    }

    //////////////////////////////////////////// respuesta a opc 15
    if(radio7_7.isSelected() == true){
      r15=2;
    }
    if(radio7_8.isSelected() == true){
      r15=0;
    }

    //////////////////////////////////////////// respuesta a opc 16
    if(radio7_9.isSelected() == true){
      r16=1;
    }
    if(radio7_10.isSelected() == true){
      r16=0;
    }

    //////////////////////////////////////////// respuesta a opc 17
    if(radio8_1.isSelected() == true){
      r17=3;
    }
    if(radio8_2.isSelected() == true){
      r17=0;
    }

    //////////////////////////////////////////// respuesta a opc 18
    if(radio9_1.isSelected() == true){
      r18=1;
    }
    if(radio9_2.isSelected() == true){
      r18=0;
    }

    //////////////////////////////////////////// respuesta a opc 19
    if(radio10_1.isSelected() == true){
      r19=2;
    }
    if(radio10_2.isSelected() == true){
      r19=0;
    }

    //////////////////////////////////////////// respuesta a opc 20
    if(radio11_1.isSelected() == true){
      r20=3;
    }
    if(radio11_2.isSelected() == true){
      r20=0;
    }
    if(radio11_3.isSelected() == true){
      r20=1;
    }

    //////////////////////////////////////////// respuesta a opc 21
    if(radio12_1.isSelected() == true){
      r21=2;
    }
    if(radio12_2.isSelected() == true){
      r21=0;
    }
    if(radio12_3.isSelected() == true){
      r21=1;
    }

    //////////////////////////////////////////// respuesta a opc 22
    if(radio13_1.isSelected() == true){
      r22=3;
    }
    if(radio13_2.isSelected() == true){
      r22=0;
    }

    //////////////////////////////////////////// operación para tener un puntaje
    puntaje = r1+r2+r3+r4+r5+r6+r7+r8+r9+r10+r11+r12+r13+r14+r15+r16+r17+r18+r19+r20+r21+r22;

    if(((radio1_1.isSelected()||radio1_2.isSelected()) & (radio2_1.isSelected()||radio2_2.isSelected()) & (radio3_1.isSelected()||radio3_2.isSelected()) & (radio4_1.isSelected()||radio4_2.isSelected()) & (radio5_1.isSelected()||radio5_2.isSelected()) & (radio5_3.isSelected()||radio5_4.isSelected()) & (radio6_1.isSelected()||radio6_2.isSelected()) & (radio6_3.isSelected()||radio6_4.isSelected()) & (radio6_5.isSelected()||radio6_6.isSelected()) & (radio6_7.isSelected()||radio6_8.isSelected()) & (radio6_9.isSelected()||radio6_10.isSelected()) & (radio7_1.isSelected()||radio7_2.isSelected()) & (radio7_3.isSelected()||radio7_4.isSelected()) & (radio7_5.isSelected()||radio7_6.isSelected()) & (radio7_7.isSelected()||radio7_8.isSelected()) & (radio7_9.isSelected()||radio7_10.isSelected()) & (radio8_1.isSelected()||radio8_2.isSelected()) & (radio9_1.isSelected()||radio9_2.isSelected()) & (radio10_1.isSelected()||radio10_2.isSelected()) & (radio11_1.isSelected()||radio11_2.isSelected()||radio11_3.isSelected()) & (radio12_1.isSelected()||radio12_2.isSelected()||radio12_3.isSelected()) & (radio13_1.isSelected()||radio13_2.isSelected()))==true){
      resultado.setEnabled(true);
    }
  }//fin del metodo

////////////////////////////////////////////////////////// Listener de botón
  public void actionPerformed(ActionEvent accion){

    if(accion.getSource() == resultado){
       JOptionPane.showMessageDialog(null,"Antes que nada es necesario recordar que las respuestas de este test no son exactas, por lo que se recomienda acudir con un médico para realizar la prueba de asma\ny así saber con total seguridad si usted padece o no de asma.\nNo todas las personas que padecen de asma muestran los mismos síntomas ni la misma cantidad de los mismos, ya que hay personas que con solo presentar uno de\nvarios síntomas, comienzan a tener un ataque de asma, mientras que otras personas necesitan presentar varios síntomas para tener un ataque de asma.\nRecuerde también que el asma no es curable, solo se puede tratar para prevenir los ataques con más frecuencia\ny que en caso de que tenga uno, los síntomas no sean tan fuertes.");

       if(puntaje>=40){
        puntaje40 resultado1 = new puntaje40();
        resultado1.setBounds(300,250,600,400);
        resultado1.setVisible(true);
       }

       else if(puntaje>=23 & puntaje<=39){
        puntaje23 resultado2 = new puntaje23();
        resultado2.setBounds(300,250,600,400);
        resultado2.setVisible(true);
       }

       /*else if(puntaje>=13 & puntaje<=23){
        JOptionPane.showMessageDialog(null,"Hola 13");
       }*/

       else if(puntaje>=4 & puntaje<=22){
        puntaje4 resultado4 = new puntaje4();
        resultado4.setBounds(300,250,600,400);
        resultado4.setVisible(true);
       }

       else if(puntaje<=3 & puntaje>=1){
        puntaje3 resultado5 = new puntaje3();
        resultado5.setBounds(300,250,600,400);
        resultado5.setVisible(true);
       }
       else{
        JOptionPane.showMessageDialog(null,"Dado que usted obtuvo un puntaje de 0, siendo 44 el máximo puntaje, se considera que usted no padece de asma,\nya que no presenta ningún sintoma o situación que el test considera para padecer de asma.");
       }
    }

    if(accion.getSource()==volver){
        Bienvenida ingreso1 = new Bienvenida();
        ingreso1.setBounds(500,200,600,530);
        ingreso1.setVisible(true);
        ingreso1.setResizable(false);
        this.setVisible(false);
    }
  }

//////////////////////////////////////////////////////// Main
  public static void main(String args[]){
    Proyecto ventana = new Proyecto();
    ventana.setBounds(200,50,600,500);
    ventana.setVisible(true);
    ventana.setResizable(false);
  }
}//fin de la clase