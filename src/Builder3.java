import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.JOptionPane.*;

public class Builder3 {

	private JFrame frame;
	public JTextField textField_FU;
	public JTextField textField_SecU;
	public JTextField textField_TU;
	public JTextField textField_ForU;
	public JTextField textField_FifU;
	public JTextField textField_SixU;
	public JTextField textField_SevU;
	public JTextField textField_EU;
	public JPanel Panel_FU;
	public JTextArea TextArea_FU;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Builder3 window = new Builder3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	String Card = "������";
	String pre_Card = "";
	int phase = 0;

	static float First_preference = 5; // FirstUser�� Player�� ���� ��ȣ��
	static float Second_preference = 5; // SecondUser�� Player�� ���� ��ȣ��
	static float Third_preference = 5; // ThirdUser�� Player�� ���� ��ȣ��
	static float Forth_preference = 5; // ForthUser�� Player�� ���� ��ȣ��
	static float Fifth_preference = 5; // FifthUser�� Player�� ���� ��ȣ��
	static float Sixth_preference = 5; // SixthUser�� Player�� ���� ��ȣ��
	static float Seventh_preference = 5; // SeventhUser�� Player�� ���� ��ȣ��
	static float Eighth_preference = 5; // EighthUser�� Player�� ���� ��ȣ��

	static float Card_preference = 5; // ������ Player�� Card�� ���� ��ȣ��
	int Score = 0; // �÷��̾� ����
	int User_choice = 0; // �� ��° �������� ��ȭ����

	float FU_Exchanging;
	float SecU_Exchanging;
	float TU_Exchanging;
	float ForU_Exchanging;
	float FifU_Exchanging;
	float SixU_Exchanging;
	float SevU_Exchanging;
	float EU_Exchanging;

	FirstUser FU = new FirstUser();
	String FU_Card = FU.Card;
	SecondUser SecU = new SecondUser();
	String SecU_Card = SecU.Card;
	ThirdUser TU = new ThirdUser();
	String TU_Card = TU.Card;
	ForthUser ForU = new ForthUser();
	String ForU_Card = ForU.Card;
	FifthUser FifU = new FifthUser();
	String FifU_Card = FifU.Card;
	SixthUser SixU = new SixthUser();
	String SixU_Card = SixU.Card;
	SeventhUser SevU = new SeventhUser();
	String SevU_Card = SevU.Card;
	EighthUser EU = new EighthUser();
	String EU_Card = EU.Card;

	String text;
	String text_Card;

	int CitizenCard_FU = 0;
	int NobilityCard_FU = 0;
	int DeathCard_FU = 0;
	int CitizenCard_SecU = 0;
	int NobilityCard_SecU = 0;
	int DeathCard_SecU = 0;
	int CitizenCard_TU = 0;
	int NobilityCard_TU = 0;
	int DeathCard_TU = 0;
	int CitizenCard_ForU = 0;
	int NobilityCard_ForU = 0;
	int DeathCard_ForU = 0;
	int CitizenCard_FifU = 0;
	int NobilityCard_FifU = 0;
	int DeathCard_FifU = 0;
	int CitizenCard_SixU = 0;
	int NobilityCard_SixU = 0;
	int DeathCard_SixU = 0;
	int CitizenCard_SevU = 0;
	int NobilityCard_SevU = 0;
	int DeathCard_SevU = 0;
	int CitizenCard_EU = 0;
	int NobilityCard_EU = 0;
	int DeathCard_EU = 0;

	int Count_FU = 0;
	int Count_SecU = 0;
	int Count_TU = 0;
	int Count_ForU = 0;
	int Count_FifU = 0;
	int Count_SixU = 0;
	int Count_SevU = 0;
	int Count_EU = 0;

	int clock = 0;
	int time = 300;

	/**
	 * Create the application.
	 */
	public Builder3() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {

		// ������ ��ġ ����. ������ : �ռ� 3�� ������ ���� 7 ���뿡 ������� �� ����
		Random random = new Random();
		int RandomNumber_Lying3 = random.nextInt(14); // 14���� 8 Ȯ���� �� �� ������ ����
		switch (RandomNumber_Lying3) {
		case 0:
			FU.Lying = 3;
			break;
		case 1:
			SecU.Lying = 3;
			break;
		case 2:
			TU.Lying = 3;
			break;
		case 3:
			ForU.Lying = 3;
			break;
		case 4:
			FifU.Lying = 3;
			break;
		case 5:
			SixU.Lying = 3;
			break;
		case 6:
			SevU.Lying = 3;
			break;
		case 7:
			EU.Lying = 3;
			break;
		}
		int RandomNumber_Lying7 = random.nextInt(14); // 14���� 8 Ȯ���� �� �� ������ ����
		switch (RandomNumber_Lying7) {
		case 0:
			FU.Lying = 7;
			break;
		case 1:
			SecU.Lying = 7;
			break;
		case 2:
			TU.Lying = 7;
			break;
		case 3:
			ForU.Lying = 7;
			break;
		case 4:
			FifU.Lying = 7;
			break;
		case 5:
			SixU.Lying = 7;
			break;
		case 6:
			SevU.Lying = 7;
			break;
		case 7:
			EU.Lying = 7;
			break;
		}
		int RandomNumber_Risky3 = random.nextInt(12); // 12���� 8 Ȯ���� �� �� ������ ����
		switch (RandomNumber_Risky3) {
		case 0:
			FU.Risky = 3;
			break;
		case 1:
			SecU.Risky = 3;
			break;
		case 2:
			TU.Risky = 3;
			break;
		case 3:
			ForU.Risky = 3;
			break;
		case 4:
			FifU.Risky = 3;
			break;
		case 5:
			SixU.Risky = 3;
			break;
		case 6:
			SevU.Risky = 3;
			break;
		case 7:
			EU.Risky = 3;
			break;
		}
		int RandomNumber_Risky7 = random.nextInt(12); // 12���� 8 Ȯ���� �� �� ������ ����
		switch (RandomNumber_Risky7) {
		case 0:
			FU.Risky = 7;
			break;
		case 1:
			SecU.Risky = 7;
			break;
		case 2:
			TU.Risky = 7;
			break;
		case 3:
			ForU.Risky = 7;
			break;
		case 4:
			FifU.Risky = 7;
			break;
		case 5:
			SixU.Risky = 7;
			break;
		case 6:
			SevU.Risky = 7;
			break;
		case 7:
			EU.Risky = 7;
			break;
		}
		int RandomNumber_Score_greed3 = random.nextInt(12); // 12���� 8 Ȯ���� �� �� ������ ����
		switch (RandomNumber_Score_greed3) {
		case 0:
			FU.Score_greed = 3;
			break;
		case 1:
			SecU.Score_greed = 3;
			break;
		case 2:
			TU.Score_greed = 3;
			break;
		case 3:
			ForU.Score_greed = 3;
			break;
		case 4:
			FifU.Score_greed = 3;
			break;
		case 5:
			SixU.Score_greed = 3;
			break;
		case 6:
			SevU.Score_greed = 3;
			break;
		case 7:
			EU.Score_greed = 3;
			break;
		}
		int RandomNumber_Score_greed4 = random.nextInt(10); // 10���� 8 Ȯ���� �� �� ������ ����
		switch (RandomNumber_Score_greed4) {
		case 0:
			FU.Score_greed = 4;
			break;
		case 1:
			SecU.Score_greed = 4;
			break;
		case 2:
			TU.Score_greed = 4;
			break;
		case 3:
			ForU.Score_greed = 4;
			break;
		case 4:
			FifU.Score_greed = 4;
			break;
		case 5:
			SixU.Score_greed = 4;
			break;
		case 6:
			SevU.Score_greed = 4;
			break;
		case 7:
			EU.Score_greed = 4;
			break;
		}
		int RandomNumber_Score_greed6 = random.nextInt(8); // 8���� 8 Ȯ���� �� �� ������ ����
		switch (RandomNumber_Score_greed6) {
		case 0:
			FU.Score_greed = 6;
			break;
		case 1:
			SecU.Score_greed = 6;
			break;
		case 2:
			TU.Score_greed = 6;
			break;
		case 3:
			ForU.Score_greed = 6;
			break;
		case 4:
			FifU.Score_greed = 6;
			break;
		case 5:
			SixU.Score_greed = 6;
			break;
		case 6:
			SevU.Score_greed = 6;
			break;
		case 7:
			EU.Score_greed = 6;
			break;
		}
		int RandomNumber_Score_greed7 = random.nextInt(8); // 8���� 8 Ȯ���� �� �� ������ ����
		switch (RandomNumber_Score_greed7) {
		case 0:
			FU.Score_greed = 7;
			break;
		case 1:
			SecU.Score_greed = 7;
			break;
		case 2:
			TU.Score_greed = 7;
			break;
		case 3:
			ForU.Score_greed = 7;
			break;
		case 4:
			FifU.Score_greed = 7;
			break;
		case 5:
			SixU.Score_greed = 7;
			break;
		case 6:
			SevU.Score_greed = 7;
			break;
		case 7:
			EU.Score_greed = 7;
			break;
		}

		// GUI

		ImageIcon frame_background = new ImageIcon(this.getClass().getResource("/���� �ؽ��� �ϼ�.png"));

		frame = new JFrame();
		frame.setBounds(100, 100, 1070, 710); // 1080, 720 �̾��µ� setResizable�ϸ� â ũ�Ⱑ 10�� �þ�� ����
		frame.setTitle("THE GENIUS - CARD EXCHANGING GAME");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Font font = new Font("HY����B", Font.PLAIN, 15);
		Font font_End_Score = new Font("HY����B", Font.PLAIN, 70);
		Font font_Timer = new Font("Stencil", Font.PLAIN, 30);

		ImageIcon panel_background = new ImageIcon(this.getClass().getResource("/���Ͼ ��� �ϼ�.png"));
		ImageIcon panel_talkbackground = new ImageIcon(this.getClass().getResource("/���� ���� �ϼ�.png"));
		ImageIcon panel_prebackground = new ImageIcon(this.getClass().getResource("/��ȭâ �غ�.png"));

		// ��������
		ImageIcon Img_End = new ImageIcon(this.getClass().getResource("/��������.png"));
		JPanel panel_end = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(Img_End.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		panel_end.setBounds(12, 10, 540, 661);
		frame.getContentPane().add(panel_end);
		panel_end.setLayout(null); // �̰� ���ϸ� ���� lbl_End_Card ��ġ�� ������ �ȵ�

		JLabel lbl_End_Card = new JLabel(new ImageIcon(this.getClass().getResource("/�ù� �ϼ���.png")));
		lbl_End_Card.setBounds(297, 191, 88, 132);
		panel_end.add(lbl_End_Card);

		JLabel lbl_End_Score = new JLabel("New label");
		lbl_End_Score.setBounds(170, 347, 200, 200);
		lbl_End_Score.setHorizontalAlignment(JLabel.CENTER);
		lbl_End_Score.setFont(font_End_Score);
		panel_end.add(lbl_End_Score);

		// ���ӿ���
		ImageIcon Img_Over = new ImageIcon(this.getClass().getResource("/���ӿ���.png"));
		JPanel panel_over = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(Img_Over.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		panel_over.setBounds(12, 10, 540, 661);
		frame.getContentPane().add(panel_over);
		panel_over.setLayout(null); // �̰� ���ϸ� ���� lbl_Over_Card ��ġ�� ������ �ȵ�

		JLabel lbl_Over_Card = new JLabel(new ImageIcon(this.getClass().getResource("/������ �ϼ���.png")));
		lbl_Over_Card.setBounds(297, 191, 88, 132);
		panel_over.add(lbl_Over_Card);

		/*
		 * // �������� ī�屳ȯ �г� JPanel panel_UserExchanging = new JPanel();
		 * panel_UserExchanging.setBounds(62, 173, 440, 50);
		 * frame.getContentPane().add(panel_UserExchanging);
		 * panel_UserExchanging.setLayout(null);
		 */

		// Random random = new Random();

		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_background.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		// panel.setBackground(Color.PINK);
		panel.setBounds(12, 10, 540, 661);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btn_FU = new JButton(new ImageIcon(this.getClass().getResource("/�ٴϿ� �̸�ǥ.png")));
		btn_FU.setBounds(81, 143, 139, 23);
		panel.add(btn_FU);

		JButton btn_SecU = new JButton(new ImageIcon(this.getClass().getResource("/�ι�Ʈ �̸�ǥ.png")));
		btn_SecU.setBounds(318, 143, 139, 23);
		panel.add(btn_SecU);

		JButton btn_TU = new JButton(new ImageIcon(this.getClass().getResource("/�ٻ� �̸�ǥ.png")));
		btn_TU.setBounds(81, 297, 139, 23);
		panel.add(btn_TU);

		JButton btn_ForU = new JButton(new ImageIcon(this.getClass().getResource("/�������� �̸�ǥ.png")));
		btn_ForU.setBounds(318, 297, 139, 23);
		panel.add(btn_ForU);

		JButton btn_FifU = new JButton(new ImageIcon(this.getClass().getResource("/���������� �̸�ǥ.png")));
		btn_FifU.setBounds(81, 451, 139, 23);
		panel.add(btn_FifU);

		JButton btn_SixU = new JButton(new ImageIcon(this.getClass().getResource("/�� �̸�ǥ.png")));
		btn_SixU.setBounds(318, 451, 139, 23);
		panel.add(btn_SixU);

		JButton btn_SevU = new JButton(new ImageIcon(this.getClass().getResource("/����ÿ �̸�ǥ.png")));
		btn_SevU.setBounds(81, 605, 139, 23);
		panel.add(btn_SevU);

		JButton btn_EU = new JButton(new ImageIcon(this.getClass().getResource("/���׵�Ʈ �̸�ǥ.png")));
		btn_EU.setBounds(318, 605, 139, 23);
		panel.add(btn_EU);

		JLabel Img_FU = new JLabel("label_FU");
		Img_FU.setIcon(new ImageIcon(this.getClass().getResource("/�ٴϿ� �ϼ�_�׸���.png")));
		Img_FU.setBounds(90, 20, 120, 120);
		panel.add(Img_FU);

		JLabel Img_SecU = new JLabel("label_SecU");
		Img_SecU.setIcon(new ImageIcon(this.getClass().getResource("/�ι�Ʈ �ϼ�_�׸���.png")));
		Img_SecU.setBounds(327, 20, 120, 120);
		panel.add(Img_SecU);

		JLabel Img_TU = new JLabel("label_TU");
		Img_TU.setIcon(new ImageIcon(this.getClass().getResource("/�ٻ� �ϼ�_�׸���.png")));
		Img_TU.setBounds(90, 174, 120, 120);
		panel.add(Img_TU);

		JLabel Img_ForU = new JLabel("label_ForU");
		Img_ForU.setIcon(new ImageIcon(this.getClass().getResource("/�������� �ϼ�_�׸���.png")));
		Img_ForU.setBounds(327, 174, 120, 120);
		panel.add(Img_ForU);

		JLabel Img_FifU = new JLabel("label_FifU");
		Img_FifU.setIcon(new ImageIcon(this.getClass().getResource("/���������� �ϼ�_�׸���.png")));
		Img_FifU.setBounds(90, 328, 120, 120);
		panel.add(Img_FifU);

		JLabel Img_SixU = new JLabel("label_SixU");
		Img_SixU.setIcon(new ImageIcon(this.getClass().getResource("/�� �ϼ�_�׸���.png")));
		Img_SixU.setBounds(327, 328, 120, 120);
		panel.add(Img_SixU);

		JLabel Img_SevU = new JLabel("label_SevU");
		Img_SevU.setIcon(new ImageIcon(this.getClass().getResource("/����ÿ �ϼ�_�׸���.png")));
		Img_SevU.setBounds(90, 482, 120, 120);
		panel.add(Img_SevU);

		JLabel Img_EU = new JLabel("label_EU");
		Img_EU.setIcon(new ImageIcon(this.getClass().getResource("/���׵�Ʈ �ϼ�_�׸���.png")));
		Img_EU.setBounds(327, 482, 120, 120);
		panel.add(Img_EU);

		JButton btn_Test = new JButton(new ImageIcon(this.getClass().getResource("/������ ��ư.png")));
		btn_Test.setBounds(504, 633, 36, 27);
		btn_Test.setBorderPainted(false);
		panel.add(btn_Test);

		// Ÿ�̸�
		JLabel lbl_Timer = new JLabel("" + time);
		lbl_Timer.setBounds(10, 60, 60, 50);
		lbl_Timer.setFont(font_Timer);
		lbl_Timer.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lbl_Timer);

		JButton btn_CitizenCard_FU = new JButton(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
		btn_CitizenCard_FU.setBounds(230, 36, 22, 33);
		panel.add(btn_CitizenCard_FU);
		JButton btn_NobilityCard_FU = new JButton(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
		btn_NobilityCard_FU.setBounds(230, 76, 22, 33);
		panel.add(btn_NobilityCard_FU);
		JButton btn_DeathCard_FU = new JButton(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
		btn_DeathCard_FU.setBounds(230, 116, 22, 33);
		panel.add(btn_DeathCard_FU);
		btn_CitizenCard_FU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (CitizenCard_FU == 0) {
					CitizenCard_FU = 1;
					btn_CitizenCard_FU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�_����.png")));
				} else if (CitizenCard_FU == 1) {
					CitizenCard_FU = 0;
					btn_CitizenCard_FU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
				}
			}

		});
		btn_NobilityCard_FU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (NobilityCard_FU == 0) {
					NobilityCard_FU = 1;
					btn_NobilityCard_FU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�_����.png")));
				} else if (NobilityCard_FU == 1) {
					NobilityCard_FU = 0;
					btn_NobilityCard_FU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
				}
			}

		});
		btn_DeathCard_FU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (DeathCard_FU == 0) {
					DeathCard_FU = 1;
					btn_DeathCard_FU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�_����.png")));
				} else if (DeathCard_FU == 1) {
					DeathCard_FU = 0;
					btn_DeathCard_FU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
				}
			}

		});

		JButton btn_CitizenCard_SecU = new JButton(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
		btn_CitizenCard_SecU.setBounds(467, 36, 22, 33);
		panel.add(btn_CitizenCard_SecU);
		JButton btn_NobilityCard_SecU = new JButton(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
		btn_NobilityCard_SecU.setBounds(467, 76, 22, 33);
		panel.add(btn_NobilityCard_SecU);
		JButton btn_DeathCard_SecU = new JButton(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
		btn_DeathCard_SecU.setBounds(467, 116, 22, 33);
		panel.add(btn_DeathCard_SecU);
		btn_CitizenCard_SecU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (CitizenCard_SecU == 0) {
					CitizenCard_SecU = 1;
					btn_CitizenCard_SecU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�_����.png")));
				} else if (CitizenCard_SecU == 1) {
					CitizenCard_SecU = 0;
					btn_CitizenCard_SecU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
				}
			}

		});
		btn_NobilityCard_SecU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (NobilityCard_SecU == 0) {
					NobilityCard_SecU = 1;
					btn_NobilityCard_SecU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�_����.png")));
				} else if (NobilityCard_SecU == 1) {
					NobilityCard_SecU = 0;
					btn_NobilityCard_SecU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
				}
			}

		});
		btn_DeathCard_SecU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (DeathCard_SecU == 0) {
					DeathCard_SecU = 1;
					btn_DeathCard_SecU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�_����.png")));
				} else if (DeathCard_SecU == 1) {
					DeathCard_SecU = 0;
					btn_DeathCard_SecU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
				}
			}

		});

		JButton btn_CitizenCard_TU = new JButton(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
		btn_CitizenCard_TU.setBounds(230, 190, 22, 33);
		panel.add(btn_CitizenCard_TU);
		JButton btn_NobilityCard_TU = new JButton(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
		btn_NobilityCard_TU.setBounds(230, 230, 22, 33);
		panel.add(btn_NobilityCard_TU);
		JButton btn_DeathCard_TU = new JButton(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
		btn_DeathCard_TU.setBounds(230, 270, 22, 33);
		panel.add(btn_DeathCard_TU);
		btn_CitizenCard_TU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (CitizenCard_TU == 0) {
					CitizenCard_TU = 1;
					btn_CitizenCard_TU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�_����.png")));
				} else if (CitizenCard_TU == 1) {
					CitizenCard_TU = 0;
					btn_CitizenCard_TU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
				}
			}

		});
		btn_NobilityCard_TU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (NobilityCard_TU == 0) {
					NobilityCard_TU = 1;
					btn_NobilityCard_TU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�_����.png")));
				} else if (NobilityCard_TU == 1) {
					NobilityCard_TU = 0;
					btn_NobilityCard_TU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
				}
			}

		});
		btn_DeathCard_TU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (DeathCard_TU == 0) {
					DeathCard_TU = 1;
					btn_DeathCard_TU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�_����.png")));
				} else if (DeathCard_TU == 1) {
					DeathCard_TU = 0;
					btn_DeathCard_TU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
				}
			}

		});

		JButton btn_CitizenCard_ForU = new JButton(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
		btn_CitizenCard_ForU.setBounds(467, 190, 22, 33);
		panel.add(btn_CitizenCard_ForU);
		JButton btn_NobilityCard_ForU = new JButton(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
		btn_NobilityCard_ForU.setBounds(467, 230, 22, 33);
		panel.add(btn_NobilityCard_ForU);
		JButton btn_DeathCard_ForU = new JButton(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
		btn_DeathCard_ForU.setBounds(467, 270, 22, 33);
		panel.add(btn_DeathCard_ForU);
		btn_CitizenCard_ForU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (CitizenCard_ForU == 0) {
					CitizenCard_ForU = 1;
					btn_CitizenCard_ForU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�_����.png")));
				} else if (CitizenCard_ForU == 1) {
					CitizenCard_ForU = 0;
					btn_CitizenCard_ForU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
				}
			}

		});
		btn_NobilityCard_ForU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (NobilityCard_ForU == 0) {
					NobilityCard_ForU = 1;
					btn_NobilityCard_ForU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�_����.png")));
				} else if (NobilityCard_ForU == 1) {
					NobilityCard_ForU = 0;
					btn_NobilityCard_ForU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
				}
			}

		});
		btn_DeathCard_ForU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (DeathCard_ForU == 0) {
					DeathCard_ForU = 1;
					btn_DeathCard_ForU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�_����.png")));
				} else if (DeathCard_ForU == 1) {
					DeathCard_ForU = 0;
					btn_DeathCard_ForU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
				}
			}

		});

		JButton btn_CitizenCard_FifU = new JButton(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
		btn_CitizenCard_FifU.setBounds(230, 344, 22, 33);
		panel.add(btn_CitizenCard_FifU);
		JButton btn_NobilityCard_FifU = new JButton(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
		btn_NobilityCard_FifU.setBounds(230, 384, 22, 33);
		panel.add(btn_NobilityCard_FifU);
		JButton btn_DeathCard_FifU = new JButton(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
		btn_DeathCard_FifU.setBounds(230, 424, 22, 33);
		panel.add(btn_DeathCard_FifU);
		btn_CitizenCard_FifU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (CitizenCard_FifU == 0) {
					CitizenCard_FifU = 1;
					btn_CitizenCard_FifU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�_����.png")));
				} else if (CitizenCard_FifU == 1) {
					CitizenCard_FifU = 0;
					btn_CitizenCard_FifU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
				}
			}

		});
		btn_NobilityCard_FifU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (NobilityCard_FifU == 0) {
					NobilityCard_FifU = 1;
					btn_NobilityCard_FifU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�_����.png")));
				} else if (NobilityCard_FifU == 1) {
					NobilityCard_FifU = 0;
					btn_NobilityCard_FifU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
				}
			}

		});
		btn_DeathCard_FifU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (DeathCard_FifU == 0) {
					DeathCard_FifU = 1;
					btn_DeathCard_FifU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�_����.png")));
				} else if (DeathCard_FifU == 1) {
					DeathCard_FifU = 0;
					btn_DeathCard_FifU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
				}
			}

		});

		JButton btn_CitizenCard_SixU = new JButton(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
		btn_CitizenCard_SixU.setBounds(467, 344, 22, 33);
		panel.add(btn_CitizenCard_SixU);
		JButton btn_NobilityCard_SixU = new JButton(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
		btn_NobilityCard_SixU.setBounds(467, 384, 22, 33);
		panel.add(btn_NobilityCard_SixU);
		JButton btn_DeathCard_SixU = new JButton(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
		btn_DeathCard_SixU.setBounds(467, 424, 22, 33);
		panel.add(btn_DeathCard_SixU);
		btn_CitizenCard_SixU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (CitizenCard_SixU == 0) {
					CitizenCard_SixU = 1;
					btn_CitizenCard_SixU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�_����.png")));
				} else if (CitizenCard_SixU == 1) {
					CitizenCard_SixU = 0;
					btn_CitizenCard_SixU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
				}
			}

		});
		btn_NobilityCard_SixU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (NobilityCard_SixU == 0) {
					NobilityCard_SixU = 1;
					btn_NobilityCard_SixU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�_����.png")));
				} else if (NobilityCard_SixU == 1) {
					NobilityCard_SixU = 0;
					btn_NobilityCard_SixU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
				}
			}

		});
		btn_DeathCard_SixU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (DeathCard_SixU == 0) {
					DeathCard_SixU = 1;
					btn_DeathCard_SixU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�_����.png")));
				} else if (DeathCard_SixU == 1) {
					DeathCard_SixU = 0;
					btn_DeathCard_SixU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
				}
			}

		});

		JButton btn_CitizenCard_SevU = new JButton(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
		btn_CitizenCard_SevU.setBounds(230, 498, 22, 33);
		panel.add(btn_CitizenCard_SevU);
		JButton btn_NobilityCard_SevU = new JButton(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
		btn_NobilityCard_SevU.setBounds(230, 538, 22, 33);
		panel.add(btn_NobilityCard_SevU);
		JButton btn_DeathCard_SevU = new JButton(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
		btn_DeathCard_SevU.setBounds(230, 578, 22, 33);
		panel.add(btn_DeathCard_SevU);
		btn_CitizenCard_SevU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (CitizenCard_SevU == 0) {
					CitizenCard_SevU = 1;
					btn_CitizenCard_SevU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�_����.png")));
				} else if (CitizenCard_SevU == 1) {
					CitizenCard_SevU = 0;
					btn_CitizenCard_SevU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
				}
			}

		});
		btn_NobilityCard_SevU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (NobilityCard_SevU == 0) {
					NobilityCard_SevU = 1;
					btn_NobilityCard_SevU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�_����.png")));
				} else if (NobilityCard_SevU == 1) {
					NobilityCard_SevU = 0;
					btn_NobilityCard_SevU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
				}
			}

		});
		btn_DeathCard_SevU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (DeathCard_SevU == 0) {
					DeathCard_SevU = 1;
					btn_DeathCard_SevU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�_����.png")));
				} else if (DeathCard_SevU == 1) {
					DeathCard_SevU = 0;
					btn_DeathCard_SevU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
				}
			}

		});

		JButton btn_CitizenCard_EU = new JButton(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
		btn_CitizenCard_EU.setBounds(467, 498, 22, 33);
		panel.add(btn_CitizenCard_EU);
		JButton btn_NobilityCard_EU = new JButton(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
		btn_NobilityCard_EU.setBounds(467, 538, 22, 33);
		panel.add(btn_NobilityCard_EU);
		JButton btn_DeathCard_EU = new JButton(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
		btn_DeathCard_EU.setBounds(467, 578, 22, 33);
		panel.add(btn_DeathCard_EU);

		JButton btn_rule = new JButton(new ImageIcon(this.getClass().getResource("/å �� Ŀ�� �ϼ�_��.png")));
		btn_rule.setBounds(12, 500, 23, 120);
		panel.add(btn_rule);
		btn_rule.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new newWindow_rule();
			}

		});

		JButton btn_tips = new JButton(new ImageIcon(this.getClass().getResource("/å �� Ŀ�� �ϼ�_��.png")));
		btn_tips.setBounds(12, 370, 23, 120);
		panel.add(btn_tips);

		JLabel lbl_clock = new JLabel(new ImageIcon(this.getClass().getResource("/Ź��ð� �ϼ�_����.png")));
		lbl_clock.setBounds(11, 8, 60, 60);
		panel.add(lbl_clock);

		btn_tips.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new newWindow_tips();
			}

		});

		btn_CitizenCard_EU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (CitizenCard_EU == 0) {
					CitizenCard_EU = 1;
					btn_CitizenCard_EU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�_����.png")));
				} else if (CitizenCard_EU == 1) {
					CitizenCard_EU = 0;
					btn_CitizenCard_EU.setIcon(new ImageIcon(this.getClass().getResource("/�ù� �ϼ� �̴�.png")));
				}
			}

		});
		btn_NobilityCard_EU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (NobilityCard_EU == 0) {
					NobilityCard_EU = 1;
					btn_NobilityCard_EU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�_����.png")));
				} else if (NobilityCard_EU == 1) {
					NobilityCard_EU = 0;
					btn_NobilityCard_EU.setIcon(new ImageIcon(this.getClass().getResource("/���� �ϼ� �̴�.png")));
				}
			}

		});
		btn_DeathCard_EU.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (DeathCard_EU == 0) {
					DeathCard_EU = 1;
					btn_DeathCard_EU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�_����.png")));
				} else if (DeathCard_EU == 1) {
					DeathCard_EU = 0;
					btn_DeathCard_EU.setIcon(new ImageIcon(this.getClass().getResource("/������ �ϼ� �̴�.png")));
				}
			}

		});

		// Img_FU.setIcon(new ImageIcon(this.getClass().getResource("/�ٴϿ�
		// �ϼ�_�׸���.png"))));

		// ��ȭ �غ� �г�
		JPanel panel_pre = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_prebackground.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		panel_pre.setBounds(553, 10, 499, 661);
		frame.getContentPane().add(panel_pre);
		panel_pre.setLayout(null);

		// ù��° ���� ��ȭ �г�
		JPanel panel_FUtalk = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_talkbackground.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		// panel_FUtalk.setBackground(Color.ORANGE);
		panel_FUtalk.setBounds(553, 10, 499, 661);
		frame.getContentPane().add(panel_FUtalk);
		panel_FUtalk.setLayout(null);

		textField_FU = new JTextField();
		textField_FU.setFont(font);
		textField_FU.setBounds(38, 600, 315, 35);
		panel_FUtalk.add(textField_FU);
		textField_FU.setColumns(10);

		JTextArea textArea_FU = new JTextArea();
		textArea_FU.setFont(font);
		panel_FUtalk.add(textArea_FU);

		JScrollPane scrollPane_FU = new JScrollPane(textArea_FU);
		scrollPane_FU.setBounds(38, 178, 420, 395);
		panel_FUtalk.add(scrollPane_FU);

		JButton btn_Enter_FU = new JButton(new ImageIcon(this.getClass().getResource("/�Է� ��ư.png")));
		btn_Enter_FU.setBounds(361, 600, 97, 36);
		panel_FUtalk.add(btn_Enter_FU);

		// ���� �������̽�(���)
		JLabel lbl_Player_FU = new JLabel(new ImageIcon(this.getClass().getResource("/�÷��̾� �ϼ�_�׸���.png")));
		lbl_Player_FU.setBounds(336, 29, 120, 120);
		panel_FUtalk.add(lbl_Player_FU);

		JLabel lbl_PlayerCitizenCard_FU = new JLabel(new ImageIcon(this.getClass().getResource("/�ù� �ϼ���.png")));
		lbl_PlayerCitizenCard_FU.setBounds(252, 27, 88, 132);
		panel_FUtalk.add(lbl_PlayerCitizenCard_FU);
		JLabel lbl_PlayerNobilityCard_FU = new JLabel(new ImageIcon(this.getClass().getResource("/���� �ϼ���.png")));
		lbl_PlayerNobilityCard_FU.setBounds(252, 27, 88, 132);
		panel_FUtalk.add(lbl_PlayerNobilityCard_FU);
		JLabel lbl_PlayerDeathCard_FU = new JLabel(new ImageIcon(this.getClass().getResource("/������ �ϼ���.png")));
		lbl_PlayerDeathCard_FU.setBounds(252, 27, 88, 132);
		panel_FUtalk.add(lbl_PlayerDeathCard_FU);

		JLabel lbl_FU = new JLabel(new ImageIcon(this.getClass().getResource("/�ٴϿ� �ϼ�_�׸���.png")));
		lbl_FU.setBounds(57, 20, 120, 120);
		panel_FUtalk.add(lbl_FU);

		JLabel lbl_FU_Name = new JLabel(new ImageIcon(this.getClass().getResource("/�ٴϿ� �̸�ǥ.png")));
		lbl_FU_Name.setBounds(48, 143, 139, 23);
		panel_FUtalk.add(lbl_FU_Name);

		JLabel lbl_Speechbubble_FU = new JLabel(new ImageIcon(this.getClass().getResource("/��ǳ�� �ϼ���.png")));
		lbl_Speechbubble_FU.setBounds(189, 76, 57, 35);
		panel_FUtalk.add(lbl_Speechbubble_FU);

		// �ι�° ���� ��ȭ �г�
		JPanel panel_SecUtalk = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_talkbackground.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		panel_SecUtalk.setBackground(Color.GREEN);
		panel_SecUtalk.setBounds(553, 10, 499, 661);
		frame.getContentPane().add(panel_SecUtalk);
		panel_SecUtalk.setLayout(null);

		textField_SecU = new JTextField();
		textField_SecU.setFont(font);
		textField_SecU.setBounds(38, 600, 315, 35);
		panel_SecUtalk.add(textField_SecU);
		textField_SecU.setColumns(10);

		JTextArea textArea_SecU = new JTextArea();
		textArea_SecU.setFont(font);
		panel_SecUtalk.add(textArea_SecU);

		JScrollPane scrollPane_SecU = new JScrollPane(textArea_SecU);
		scrollPane_SecU.setBounds(38, 178, 420, 395);
		panel_SecUtalk.add(scrollPane_SecU);

		JButton btn_Enter_SecU = new JButton(new ImageIcon(this.getClass().getResource("/�Է� ��ư.png")));
		btn_Enter_SecU.setBounds(361, 600, 97, 36);
		panel_SecUtalk.add(btn_Enter_SecU);

		// ���� �������̽�(���)
		JLabel lbl_Player_SecU = new JLabel(new ImageIcon(this.getClass().getResource("/�÷��̾� �ϼ�_�׸���.png")));
		lbl_Player_SecU.setBounds(336, 29, 120, 120);
		panel_SecUtalk.add(lbl_Player_SecU);

		JLabel lbl_PlayerCitizenCard_SecU = new JLabel(new ImageIcon(this.getClass().getResource("/�ù� �ϼ���.png")));
		lbl_PlayerCitizenCard_SecU.setBounds(252, 27, 88, 132);
		panel_SecUtalk.add(lbl_PlayerCitizenCard_SecU);
		JLabel lbl_PlayerNobilityCard_SecU = new JLabel(new ImageIcon(this.getClass().getResource("/���� �ϼ���.png")));
		lbl_PlayerNobilityCard_SecU.setBounds(252, 27, 88, 132);
		panel_SecUtalk.add(lbl_PlayerNobilityCard_SecU);
		JLabel lbl_PlayerDeathCard_SecU = new JLabel(new ImageIcon(this.getClass().getResource("/������ �ϼ���.png")));
		lbl_PlayerDeathCard_SecU.setBounds(252, 27, 88, 132);
		panel_SecUtalk.add(lbl_PlayerDeathCard_SecU);

		JLabel lbl_SecU = new JLabel(new ImageIcon(this.getClass().getResource("/�ι�Ʈ �ϼ�_�׸���.png")));
		lbl_SecU.setBounds(57, 20, 120, 120);
		panel_SecUtalk.add(lbl_SecU);

		JLabel lbl_SecU_Name = new JLabel(new ImageIcon(this.getClass().getResource("/�ι�Ʈ �̸�ǥ.png")));
		lbl_SecU_Name.setBounds(48, 143, 139, 23);
		panel_SecUtalk.add(lbl_SecU_Name);

		JLabel lbl_Speechbubble_SecU = new JLabel(new ImageIcon(this.getClass().getResource("/��ǳ�� �ϼ���.png")));
		lbl_Speechbubble_SecU.setBounds(189, 76, 57, 35);
		panel_SecUtalk.add(lbl_Speechbubble_SecU);

		// ����° ���� ��ȭ �г�
		JPanel panel_TUtalk = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_talkbackground.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		panel_TUtalk.setBackground(Color.PINK);
		panel_TUtalk.setBounds(553, 10, 499, 661);
		frame.getContentPane().add(panel_TUtalk);
		panel_TUtalk.setLayout(null);

		textField_TU = new JTextField();
		textField_TU.setFont(font);
		textField_TU.setBounds(38, 600, 315, 35);
		panel_TUtalk.add(textField_TU);
		textField_TU.setColumns(10);

		JTextArea textArea_TU = new JTextArea();
		textArea_TU.setFont(font);
		panel_TUtalk.add(textArea_TU);

		JScrollPane scrollPane_TU = new JScrollPane(textArea_TU);
		scrollPane_TU.setBounds(38, 178, 420, 395);
		panel_TUtalk.add(scrollPane_TU);

		JButton btn_Enter_TU = new JButton(new ImageIcon(this.getClass().getResource("/�Է� ��ư.png")));
		btn_Enter_TU.setBounds(361, 600, 97, 36);
		panel_TUtalk.add(btn_Enter_TU);

		// ���� �������̽�(���)
		JLabel lbl_Player_TU = new JLabel(new ImageIcon(this.getClass().getResource("/�÷��̾� �ϼ�_�׸���.png")));
		lbl_Player_TU.setBounds(336, 29, 120, 120);
		panel_TUtalk.add(lbl_Player_TU);

		JLabel lbl_PlayerCitizenCard_TU = new JLabel(new ImageIcon(this.getClass().getResource("/�ù� �ϼ���.png")));
		lbl_PlayerCitizenCard_TU.setBounds(252, 27, 88, 132);
		panel_TUtalk.add(lbl_PlayerCitizenCard_TU);
		JLabel lbl_PlayerNobilityCard_TU = new JLabel(new ImageIcon(this.getClass().getResource("/���� �ϼ���.png")));
		lbl_PlayerNobilityCard_TU.setBounds(252, 27, 88, 132);
		panel_TUtalk.add(lbl_PlayerNobilityCard_TU);
		JLabel lbl_PlayerDeathCard_TU = new JLabel(new ImageIcon(this.getClass().getResource("/������ �ϼ���.png")));
		lbl_PlayerDeathCard_TU.setBounds(252, 27, 88, 132);
		panel_TUtalk.add(lbl_PlayerDeathCard_TU);

		JLabel lbl_TU = new JLabel(new ImageIcon(this.getClass().getResource("/�ٻ� �ϼ�_�׸���.png")));
		lbl_TU.setBounds(57, 20, 120, 120);
		panel_TUtalk.add(lbl_TU);

		JLabel lbl_TU_Name = new JLabel(new ImageIcon(this.getClass().getResource("/�ٻ� �̸�ǥ.png")));
		lbl_TU_Name.setBounds(48, 143, 139, 23);
		panel_TUtalk.add(lbl_TU_Name);

		JLabel lbl_Speechbubble_TU = new JLabel(new ImageIcon(this.getClass().getResource("/��ǳ�� �ϼ���.png")));
		lbl_Speechbubble_TU.setBounds(189, 76, 57, 35);
		panel_TUtalk.add(lbl_Speechbubble_TU);

		// �׹�° ���� ��ȭ �г�
		JPanel panel_ForUtalk = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_talkbackground.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		panel_ForUtalk.setBackground(Color.MAGENTA);
		panel_ForUtalk.setBounds(553, 10, 499, 661);
		frame.getContentPane().add(panel_ForUtalk);
		panel_ForUtalk.setLayout(null);

		textField_ForU = new JTextField();
		textField_ForU.setFont(font);
		textField_ForU.setBounds(38, 600, 315, 35);
		panel_ForUtalk.add(textField_ForU);
		textField_ForU.setColumns(10);

		JTextArea textArea_ForU = new JTextArea();
		textArea_ForU.setFont(font);
		panel_ForUtalk.add(textArea_ForU);

		JScrollPane scrollPane_ForU = new JScrollPane(textArea_ForU);
		scrollPane_ForU.setBounds(38, 178, 420, 395);
		panel_ForUtalk.add(scrollPane_ForU);

		JButton btn_Enter_ForU = new JButton(new ImageIcon(this.getClass().getResource("/�Է� ��ư.png")));
		btn_Enter_ForU.setBounds(361, 600, 97, 36);
		panel_ForUtalk.add(btn_Enter_ForU);

		// ���� �������̽�(���)
		JLabel lbl_Player_ForU = new JLabel(new ImageIcon(this.getClass().getResource("/�÷��̾� �ϼ�_�׸���.png")));
		lbl_Player_ForU.setBounds(336, 29, 120, 120);
		panel_ForUtalk.add(lbl_Player_ForU);

		JLabel lbl_PlayerCitizenCard_ForU = new JLabel(new ImageIcon(this.getClass().getResource("/�ù� �ϼ���.png")));
		lbl_PlayerCitizenCard_ForU.setBounds(252, 27, 88, 132);
		panel_ForUtalk.add(lbl_PlayerCitizenCard_ForU);
		JLabel lbl_PlayerNobilityCard_ForU = new JLabel(new ImageIcon(this.getClass().getResource("/���� �ϼ���.png")));
		lbl_PlayerNobilityCard_ForU.setBounds(252, 27, 88, 132);
		panel_ForUtalk.add(lbl_PlayerNobilityCard_ForU);
		JLabel lbl_PlayerDeathCard_ForU = new JLabel(new ImageIcon(this.getClass().getResource("/������ �ϼ���.png")));
		lbl_PlayerDeathCard_ForU.setBounds(252, 27, 88, 132);
		panel_ForUtalk.add(lbl_PlayerDeathCard_ForU);

		JLabel lbl_ForU = new JLabel(new ImageIcon(this.getClass().getResource("/�������� �ϼ�_�׸���.png")));
		lbl_ForU.setBounds(57, 20, 120, 120);
		panel_ForUtalk.add(lbl_ForU);

		JLabel lbl_ForU_Name = new JLabel(new ImageIcon(this.getClass().getResource("/�������� �̸�ǥ.png")));
		lbl_ForU_Name.setBounds(48, 143, 139, 23);
		panel_ForUtalk.add(lbl_ForU_Name);

		JLabel lbl_Speechbubble_ForU = new JLabel(new ImageIcon(this.getClass().getResource("/��ǳ�� �ϼ���.png")));
		lbl_Speechbubble_ForU.setBounds(189, 76, 57, 35);
		panel_ForUtalk.add(lbl_Speechbubble_ForU);

		// �ټ���° ���� ��ȭ �г�
		JPanel panel_FifUtalk = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_talkbackground.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		panel_FifUtalk.setBackground(Color.CYAN);
		panel_FifUtalk.setBounds(553, 10, 499, 661);
		frame.getContentPane().add(panel_FifUtalk);
		panel_FifUtalk.setLayout(null);

		textField_FifU = new JTextField();
		textField_FifU.setFont(font);
		textField_FifU.setBounds(38, 600, 315, 35);
		panel_FifUtalk.add(textField_FifU);
		textField_FifU.setColumns(10);

		JTextArea textArea_FifU = new JTextArea();
		textArea_FifU.setFont(font);
		panel_FifUtalk.add(textArea_FifU);

		JScrollPane scrollPane_FifU = new JScrollPane(textArea_FifU);
		scrollPane_FifU.setBounds(38, 178, 420, 395);
		panel_FifUtalk.add(scrollPane_FifU);

		JButton btn_Enter_FifU = new JButton(new ImageIcon(this.getClass().getResource("/�Է� ��ư.png")));
		btn_Enter_FifU.setBounds(361, 600, 97, 36);
		panel_FifUtalk.add(btn_Enter_FifU);

		// ���� �������̽�(���)
		JLabel lbl_Player_FifU = new JLabel(new ImageIcon(this.getClass().getResource("/�÷��̾� �ϼ�_�׸���.png")));
		lbl_Player_FifU.setBounds(336, 29, 120, 120);
		panel_FifUtalk.add(lbl_Player_FifU);

		JLabel lbl_PlayerCitizenCard_FifU = new JLabel(new ImageIcon(this.getClass().getResource("/�ù� �ϼ���.png")));
		lbl_PlayerCitizenCard_FifU.setBounds(252, 27, 88, 132);
		panel_FifUtalk.add(lbl_PlayerCitizenCard_FifU);
		JLabel lbl_PlayerNobilityCard_FifU = new JLabel(new ImageIcon(this.getClass().getResource("/���� �ϼ���.png")));
		lbl_PlayerNobilityCard_FifU.setBounds(252, 27, 88, 132);
		panel_FifUtalk.add(lbl_PlayerNobilityCard_FifU);
		JLabel lbl_PlayerDeathCard_FifU = new JLabel(new ImageIcon(this.getClass().getResource("/������ �ϼ���.png")));
		lbl_PlayerDeathCard_FifU.setBounds(252, 27, 88, 132);
		panel_FifUtalk.add(lbl_PlayerDeathCard_FifU);

		JLabel lbl_FifU = new JLabel(new ImageIcon(this.getClass().getResource("/���������� �ϼ�_�׸���.png")));
		lbl_FifU.setBounds(57, 20, 120, 120);
		panel_FifUtalk.add(lbl_FifU);

		JLabel lbl_FifU_Name = new JLabel(new ImageIcon(this.getClass().getResource("/���������� �̸�ǥ.png")));
		lbl_FifU_Name.setBounds(48, 143, 139, 23);
		panel_FifUtalk.add(lbl_FifU_Name);

		JLabel lbl_Speechbubble_FifU = new JLabel(new ImageIcon(this.getClass().getResource("/��ǳ�� �ϼ���.png")));
		lbl_Speechbubble_FifU.setBounds(189, 76, 57, 35);
		panel_FifUtalk.add(lbl_Speechbubble_FifU);

		// ������° ���� ��ȭ �г�
		JPanel panel_SixUtalk = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_talkbackground.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		panel_SixUtalk.setBackground(Color.BLUE);
		panel_SixUtalk.setBounds(553, 10, 499, 661);
		frame.getContentPane().add(panel_SixUtalk);
		panel_SixUtalk.setLayout(null);

		textField_SixU = new JTextField();
		textField_SixU.setFont(font);
		textField_SixU.setBounds(38, 600, 315, 35);
		panel_SixUtalk.add(textField_SixU);
		textField_SixU.setColumns(10);

		JTextArea textArea_SixU = new JTextArea();
		textArea_SixU.setFont(font);
		panel_SixUtalk.add(textArea_SixU);

		JScrollPane scrollPane_SixU = new JScrollPane(textArea_SixU);
		scrollPane_SixU.setBounds(38, 178, 420, 395);
		panel_SixUtalk.add(scrollPane_SixU);

		JButton btn_Enter_SixU = new JButton(new ImageIcon(this.getClass().getResource("/�Է� ��ư.png")));
		btn_Enter_SixU.setBounds(361, 600, 97, 36);
		panel_SixUtalk.add(btn_Enter_SixU);

		// ���� �������̽�(���)
		JLabel lbl_Player_SixU = new JLabel(new ImageIcon(this.getClass().getResource("/�÷��̾� �ϼ�_�׸���.png")));
		lbl_Player_SixU.setBounds(336, 29, 120, 120);
		panel_SixUtalk.add(lbl_Player_SixU);

		JLabel lbl_PlayerCitizenCard_SixU = new JLabel(new ImageIcon(this.getClass().getResource("/�ù� �ϼ���.png")));
		lbl_PlayerCitizenCard_SixU.setBounds(252, 27, 88, 132);
		panel_SixUtalk.add(lbl_PlayerCitizenCard_SixU);
		JLabel lbl_PlayerNobilityCard_SixU = new JLabel(new ImageIcon(this.getClass().getResource("/���� �ϼ���.png")));
		lbl_PlayerNobilityCard_SixU.setBounds(252, 27, 88, 132);
		panel_SixUtalk.add(lbl_PlayerNobilityCard_SixU);
		JLabel lbl_PlayerDeathCard_SixU = new JLabel(new ImageIcon(this.getClass().getResource("/������ �ϼ���.png")));
		lbl_PlayerDeathCard_SixU.setBounds(252, 27, 88, 132);
		panel_SixUtalk.add(lbl_PlayerDeathCard_SixU);

		JLabel lbl_SixU = new JLabel(new ImageIcon(this.getClass().getResource("/�� �ϼ�_�׸���.png")));
		lbl_SixU.setBounds(57, 20, 120, 120);
		panel_SixUtalk.add(lbl_SixU);

		JLabel lbl_SixU_Name = new JLabel(new ImageIcon(this.getClass().getResource("/�� �̸�ǥ.png")));
		lbl_SixU_Name.setBounds(48, 143, 139, 23);
		panel_SixUtalk.add(lbl_SixU_Name);

		JLabel lbl_Speechbubble_SixU = new JLabel(new ImageIcon(this.getClass().getResource("/��ǳ�� �ϼ���.png")));
		lbl_Speechbubble_SixU.setBounds(189, 76, 57, 35);
		panel_SixUtalk.add(lbl_Speechbubble_SixU);

		// �ϰ���° ���� ��ȭ �г�
		JPanel panel_SevUtalk = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_talkbackground.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		panel_SevUtalk.setBackground(Color.YELLOW);
		panel_SevUtalk.setBounds(553, 10, 499, 661);
		frame.getContentPane().add(panel_SevUtalk);
		panel_SevUtalk.setLayout(null);

		textField_SevU = new JTextField();
		textField_SevU.setFont(font);
		textField_SevU.setBounds(38, 600, 315, 35);
		panel_SevUtalk.add(textField_SevU);
		textField_SevU.setColumns(10);

		JTextArea textArea_SevU = new JTextArea();
		textArea_SevU.setFont(font);
		panel_SevUtalk.add(textArea_SevU);

		JScrollPane scrollPane_SevU = new JScrollPane(textArea_SevU);
		scrollPane_SevU.setBounds(38, 178, 420, 395);
		panel_SevUtalk.add(scrollPane_SevU);

		JButton btn_Enter_SevU = new JButton(new ImageIcon(this.getClass().getResource("/�Է� ��ư.png")));
		btn_Enter_SevU.setBounds(361, 600, 97, 36);
		panel_SevUtalk.add(btn_Enter_SevU);

		// ���� �������̽�(���)
		JLabel lbl_Player_SevU = new JLabel(new ImageIcon(this.getClass().getResource("/�÷��̾� �ϼ�_�׸���.png")));
		lbl_Player_SevU.setBounds(336, 29, 120, 120);
		panel_SevUtalk.add(lbl_Player_SevU);

		JLabel lbl_PlayerCitizenCard_SevU = new JLabel(new ImageIcon(this.getClass().getResource("/�ù� �ϼ���.png")));
		lbl_PlayerCitizenCard_SevU.setBounds(252, 27, 88, 132);
		panel_SevUtalk.add(lbl_PlayerCitizenCard_SevU);
		JLabel lbl_PlayerNobilityCard_SevU = new JLabel(new ImageIcon(this.getClass().getResource("/���� �ϼ���.png")));
		lbl_PlayerNobilityCard_SevU.setBounds(252, 27, 88, 132);
		panel_SevUtalk.add(lbl_PlayerNobilityCard_SevU);
		JLabel lbl_PlayerDeathCard_SevU = new JLabel(new ImageIcon(this.getClass().getResource("/������ �ϼ���.png")));
		lbl_PlayerDeathCard_SevU.setBounds(252, 27, 88, 132);
		panel_SevUtalk.add(lbl_PlayerDeathCard_SevU);

		JLabel lbl_SevU = new JLabel(new ImageIcon(this.getClass().getResource("/����ÿ �ϼ�_�׸���.png")));
		lbl_SevU.setBounds(57, 20, 120, 120);
		panel_SevUtalk.add(lbl_SevU);

		JLabel lbl_SevU_Name = new JLabel(new ImageIcon(this.getClass().getResource("/����ÿ �̸�ǥ.png")));
		lbl_SevU_Name.setBounds(48, 143, 139, 23);
		panel_SevUtalk.add(lbl_SevU_Name);

		JLabel lbl_Speechbubble_SevU = new JLabel(new ImageIcon(this.getClass().getResource("/��ǳ�� �ϼ���.png")));
		lbl_Speechbubble_SevU.setBounds(189, 76, 57, 35);
		panel_SevUtalk.add(lbl_Speechbubble_SevU);

		// ������° ���� ��ȭ �г�
		JPanel panel_EUtalk = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_talkbackground.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		panel_EUtalk.setBackground(Color.RED);
		panel_EUtalk.setBounds(553, 10, 499, 661);
		frame.getContentPane().add(panel_EUtalk);
		panel_EUtalk.setLayout(null);

		textField_EU = new JTextField();
		textField_EU.setFont(font);
		textField_EU.setBounds(38, 600, 315, 35);
		panel_EUtalk.add(textField_EU);
		textField_EU.setColumns(10);

		JTextArea textArea_EU = new JTextArea();
		textArea_EU.setFont(font);
		panel_EUtalk.add(textArea_EU);

		JScrollPane scrollPane_EU = new JScrollPane(textArea_EU);
		scrollPane_EU.setBounds(38, 178, 420, 395);
		panel_EUtalk.add(scrollPane_EU);

		JButton btn_Enter_EU = new JButton(new ImageIcon(this.getClass().getResource("/�Է� ��ư.png")));
		btn_Enter_EU.setBounds(361, 600, 97, 36);
		panel_EUtalk.add(btn_Enter_EU);

		// ���� �������̽�(���)
		JLabel lbl_Player_EU = new JLabel(new ImageIcon(this.getClass().getResource("/�÷��̾� �ϼ�_�׸���.png")));
		lbl_Player_EU.setBounds(336, 29, 120, 120);
		panel_EUtalk.add(lbl_Player_EU);

		JLabel lbl_PlayerCitizenCard_EU = new JLabel(new ImageIcon(this.getClass().getResource("/�ù� �ϼ���.png")));
		lbl_PlayerCitizenCard_EU.setBounds(252, 27, 88, 132);
		panel_EUtalk.add(lbl_PlayerCitizenCard_EU);
		JLabel lbl_PlayerNobilityCard_EU = new JLabel(new ImageIcon(this.getClass().getResource("/���� �ϼ���.png")));
		lbl_PlayerNobilityCard_EU.setBounds(252, 27, 88, 132);
		panel_EUtalk.add(lbl_PlayerNobilityCard_EU);
		JLabel lbl_PlayerDeathCard_EU = new JLabel(new ImageIcon(this.getClass().getResource("/������ �ϼ���.png")));
		lbl_PlayerDeathCard_EU.setBounds(252, 27, 88, 132);
		panel_EUtalk.add(lbl_PlayerDeathCard_EU);

		JLabel lbl_EU = new JLabel(new ImageIcon(this.getClass().getResource("/���׵�Ʈ �ϼ�_�׸���.png")));
		lbl_EU.setBounds(57, 20, 120, 120);
		panel_EUtalk.add(lbl_EU);

		JLabel lbl_EU_Name = new JLabel(new ImageIcon(this.getClass().getResource("/���׵�Ʈ �̸�ǥ.png")));
		lbl_EU_Name.setBounds(48, 143, 139, 23);
		panel_EUtalk.add(lbl_EU_Name);

		JLabel lbl_Speechbubble_EU = new JLabel(new ImageIcon(this.getClass().getResource("/��ǳ�� �ϼ���.png")));
		lbl_Speechbubble_EU.setBounds(189, 76, 57, 35);
		panel_EUtalk.add(lbl_Speechbubble_EU);

		JLabel lbl_Background = new JLabel(new ImageIcon(this.getClass().getResource("/���� �ؽ��� �ϼ�.png")));
		lbl_Background.setVerticalAlignment(SwingConstants.TOP);
		lbl_Background.setBounds(0, 0, 1064, 681);
		lbl_Background.setVerticalTextPosition(JLabel.CENTER);
		lbl_Background.setHorizontalTextPosition(JLabel.RIGHT);
		frame.getContentPane().add(lbl_Background);

		// �Է¹�ư
		btn_Enter_FU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Count_FU == 0) {
					FirstUser FU = new FirstUser();

					int phase1_return = 0;
					int phase2_return = 0;

					if (phase == 0) {
						textArea_FU.append("\n" + textField_FU.getText());
						textField_FU.setText("");
					}

					// phase1(���� ī�� ����)
					if (phase == 1) {
						phase1_return = phase1();
						textArea_FU.append("\n���� : " + text_Card);

						// �ù� ���ý�
						if (phase1_return == 1) {

							textArea_FU.append("\n�ù��Դϴ�.");

							// �ù� ���ý�, ��밡 �ù��� ��
							if (FU.Card.equals("�ù�")) {
								textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(2));
								textArea_FU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_FU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// �ù� ���ý�, ��밡 ������ ��
							else if (FU.Card.equals("����")) {
								textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(1));
								textArea_FU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_FU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// �ù� ���ý�, ��밡 �������� ��
							else if (FU.Card.equals("������")) {
								textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(1));
								textArea_FU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_FU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 7;
								phase = 2;
							} else {
								;
							}
						}
						// ���� ���ý�
						else if (phase1_return == 2) {

							textArea_FU.append("\n�����Դϴ�.");

							// ���� ���ý�, ��밡 �ù��� ��
							if (FU.Card.equals("�ù�")) {
								textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(1));
								textArea_FU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_FU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// ���� ���ý�, ��밡 ������ ��
							else if (FU.Card.equals("����")) {
								textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(2));
								textArea_FU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_FU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// ���� ���ý�, ��밡 �������� ��
							else if (FU.Card.equals("������")) {
								if (FU.Risky <= 3) {
									textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(1));
									textArea_FU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_FU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (FU.Risky > 3) {
									textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(2));
									textArea_FU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_FU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 5;
									phase = 0;
								}
							} else {
								;
							}
						}
						// ������ ���ý�
						else if (phase1_return == 3) {

							textArea_FU.append("\n�������Դϴ�.");

							// ������ ���ý�, ��밡 �ù��� ��
							if (FU.Card.equals("�ù�")) {
								textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(2));
								textArea_FU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_FU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							}
							// ������ ���ý�, ��밡 ������ ��
							else if (FU.Card.equals("����")) {
								if (FU.Risky >= 7) {
									textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(1));
									textArea_FU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_FU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (FU.Risky < 7) {
									textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(2));
									textArea_FU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_FU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 4;
									phase = 0;
								} else {
									;
								}
							}
							// ������ ���ý�, ��밡 �������� ��
							else if (FU.Card.equals("������")) {
								textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(2));
								textArea_FU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_FU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							} else {
								;
							}
						}
						// �߸��� ī�� �Է½�
						else {
							textArea_FU.append("\n�߸��� �Է��Դϴ�.");
							phase = 0;
						}
					}

					// phase2(��ȯ ���)
					else if (phase == 2) {

						int Score_result = 0;
						int Exchanging_result = 0;

						phase2_return = phase2();

						if (phase2_return == 0) {
							textArea_FU.append("�ƴϿ�");
							textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(5));
							textArea_FU.append("\n��ȯ �����Ͽ����ϴ�.");
							phase = 0;
						} else if (phase2_return == 1) {
							textArea_FU.append("��");
							textArea_FU.append("\n��ȯ �����Ͽ����ϴ�.");

							// �����Լ� �����ϰ� ī�屳ȯ�Լ�(+���Ǳ�ȯ, ������ȯ) ����
							Score_result = Score_gaining();
							Exchanging_result = Exchanging();

							// Count �Լ� ����
							Count(1);
							Img_FU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٴϿ� �ϼ�_�׸���_���úҰ�.png"))));
							if (Count_FU == 0) {
								Img_FU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٴϿ� �ϼ�_�׸���.png"))));
							}
							if (Count_SecU == 0) {
								Img_SecU.setIcon(new ImageIcon(this.getClass().getResource(("/�ι�Ʈ �ϼ�_�׸���.png"))));
							}
							if (Count_TU == 0) {
								Img_TU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٻ� �ϼ�_�׸���.png"))));
							}
							if (Count_ForU == 0) {
								Img_ForU.setIcon(new ImageIcon(this.getClass().getResource(("/�������� �ϼ�_�׸���.png"))));
							}
							if (Count_FifU == 0) {
								Img_FifU.setIcon(new ImageIcon(this.getClass().getResource(("/���������� �ϼ�_�׸���.png"))));
							}
							if (Count_SixU == 0) {
								Img_SixU.setIcon(new ImageIcon(this.getClass().getResource(("/�� �ϼ�_�׸���.png"))));
							}
							if (Count_SevU == 0) {
								Img_SevU.setIcon(new ImageIcon(this.getClass().getResource(("/����ÿ �ϼ�_�׸���.png"))));
							}
							if (Count_EU == 0) {
								Img_EU.setIcon(new ImageIcon(this.getClass().getResource(("/���׵�Ʈ �ϼ�_�׸���.png"))));
							}

							// �������̽� �÷��̾� ī�� ����
							int Card_show = Card_showing();
							if (Card_show == 1) {
								lbl_PlayerCitizenCard_FU.setVisible(true);
								lbl_PlayerNobilityCard_FU.setVisible(false);
								lbl_PlayerDeathCard_FU.setVisible(false);
							} else if (Card_show == 2) {
								lbl_PlayerCitizenCard_FU.setVisible(false);
								lbl_PlayerNobilityCard_FU.setVisible(true);
								lbl_PlayerDeathCard_FU.setVisible(false);
							} else if (Card_show == 3) {
								lbl_PlayerCitizenCard_FU.setVisible(false);
								lbl_PlayerNobilityCard_FU.setVisible(false);
								lbl_PlayerDeathCard_FU.setVisible(true);
							} else {
								;
							}

							if (Exchanging_result == 1) {
								textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(3));
								textArea_FU.append("\n��Ǳ�ȯ�Ͽ����ϴ�.");
								textArea_FU.append("\n����� ȣ������ ����Ͽ����ϴ�.");

							} else if (Exchanging_result == 2) {
								textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(4));
								textArea_FU.append("\n������ȯ�Ͽ����ϴ�.");
								textArea_FU.append("\n����� ȣ������ �����Ͽ����ϴ�.");
							} else {
								;
							}

							if (Score_result == 1) {
								textArea_FU.append("\n������ 1�� ȹ���߽��ϴ�.");
								textArea_FU.append("\n�� ���� : " + Score);
							} else if (Score_result == 2) {
								textArea_FU.append("\n������ 2�� ȹ���߽��ϴ�.");
								textArea_FU.append("\n�� ���� : " + Score);
							} else if (Score_result == 0) {
								textArea_FU.append("\n������ ȹ������ ���߽��ϴ�.");
								textArea_FU.append("\n�� ���� : " + Score);
							} else {
								;
							}

							phase = 0;
						} else if (phase2_return == 2) {
							textArea_FU.append("\n\n �� " + FU.Name + " : " + Random_talk(6));
							textArea_FU.append("\n��ȯ ��ȣ���� �����մϴ�.");
							phase = 0;
						} else {
							textArea_FU.append("\n���߸��� �Է��Դϴ�.");
							phase = 0;
						}

					}
				}
			}
		});

		btn_Enter_SecU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Count_SecU == 0) {
					SecondUser SecU = new SecondUser();

					int phase1_return = 0;
					int phase2_return = 0;

					if (phase == 0) {
						textArea_SecU.append("\n" + textField_SecU.getText());
						textField_SecU.setText("");
					}

					// phase1(���� ī�� ����)
					if (phase == 1) {
						phase1_return = phase1();
						textArea_SecU.append("\n���� : " + text_Card);

						// �ù� ���ý�
						if (phase1_return == 1) {

							textArea_SecU.append("\n�ù��Դϴ�.");

							// �ù� ���ý�, ��밡 �ù��� ��
							if (SecU.Card.equals("�ù�")) {
								textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(2));
								textArea_SecU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SecU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// �ù� ���ý�, ��밡 ������ ��
							else if (SecU.Card.equals("����")) {
								textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(1));
								textArea_SecU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_SecU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// �ù� ���ý�, ��밡 �������� ��
							else if (SecU.Card.equals("������")) {
								textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(1));
								textArea_SecU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_SecU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 7;
								phase = 2;
							} else {
								;
							}
						}
						// ���� ���ý�
						else if (phase1_return == 2) {

							textArea_SecU.append("\n�����Դϴ�.");

							// ���� ���ý�, ��밡 �ù��� ��
							if (SecU.Card.equals("�ù�")) {
								textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(1));
								textArea_SecU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_SecU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// ���� ���ý�, ��밡 ������ ��
							else if (SecU.Card.equals("����")) {
								textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(2));
								textArea_SecU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SecU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// ���� ���ý�, ��밡 �������� ��
							else if (SecU.Card.equals("������")) {
								if (SecU.Risky <= 3) {
									textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(1));
									textArea_SecU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_SecU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (SecU.Risky > 3) {
									textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(2));
									textArea_SecU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_SecU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 5;
									phase = 0;
								}
							} else {
								;
							}
						}
						// ������ ���ý�
						else if (phase1_return == 3) {

							textArea_SecU.append("\n�������Դϴ�.");

							// ������ ���ý�, ��밡 �ù��� ��
							if (SecU.Card.equals("�ù�")) {
								textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(2));
								textArea_SecU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SecU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							}
							// ������ ���ý�, ��밡 ������ ��
							else if (SecU.Card.equals("����")) {
								if (SecU.Risky >= 7) {
									textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(1));
									textArea_SecU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_SecU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (SecU.Risky < 7) {
									textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(2));
									textArea_SecU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_SecU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 4;
									phase = 0;
								} else {
									;
								}
							}
							// ������ ���ý�, ��밡 �������� ��
							else if (SecU.Card.equals("������")) {
								textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(2));
								textArea_SecU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SecU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							} else {
								;
							}
						}
						// �߸��� ī�� �Է½�
						else {
							textArea_SecU.append("\n�߸��� �Է��Դϴ�.");
							phase = 0;
						}
					}

					// phase2(��ȯ ���)
					else if (phase == 2) {

						int Score_result = 0;
						int Exchanging_result = 0;

						phase2_return = phase2();

						if (phase2_return == 0) {
							textArea_SecU.append("�ƴϿ�");
							textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(5));
							textArea_SecU.append("\n��ȯ �����Ͽ����ϴ�.");
							phase = 0;
						} else if (phase2_return == 1) {
							textArea_SecU.append("��");
							textArea_SecU.append("\n��ȯ �����Ͽ����ϴ�.");

							// �����Լ� �����ϰ� ī�屳ȯ�Լ�(+���Ǳ�ȯ, ������ȯ) ����
							Score_result = Score_gaining();
							Exchanging_result = Exchanging();

							// Count �Լ� ����
							Count(2);
							Img_SecU.setIcon(new ImageIcon(this.getClass().getResource(("/�ι�Ʈ �ϼ�_�׸���_���úҰ�.png"))));
							if (Count_FU == 0) {
								Img_FU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٴϿ� �ϼ�_�׸���.png"))));
							}
							if (Count_SecU == 0) {
								Img_SecU.setIcon(new ImageIcon(this.getClass().getResource(("/�ι�Ʈ �ϼ�_�׸���.png"))));
							}
							if (Count_TU == 0) {
								Img_TU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٻ� �ϼ�_�׸���.png"))));
							}
							if (Count_ForU == 0) {
								Img_ForU.setIcon(new ImageIcon(this.getClass().getResource(("/�������� �ϼ�_�׸���.png"))));
							}
							if (Count_FifU == 0) {
								Img_FifU.setIcon(new ImageIcon(this.getClass().getResource(("/���������� �ϼ�_�׸���.png"))));
							}
							if (Count_SixU == 0) {
								Img_SixU.setIcon(new ImageIcon(this.getClass().getResource(("/�� �ϼ�_�׸���.png"))));
							}
							if (Count_SevU == 0) {
								Img_SevU.setIcon(new ImageIcon(this.getClass().getResource(("/����ÿ �ϼ�_�׸���.png"))));
							}
							if (Count_EU == 0) {
								Img_EU.setIcon(new ImageIcon(this.getClass().getResource(("/���׵�Ʈ �ϼ�_�׸���.png"))));
							}

							// �������̽� �÷��̾� ī�� ����
							int Card_show = Card_showing();
							if (Card_show == 1) {
								lbl_PlayerCitizenCard_SecU.setVisible(true);
								lbl_PlayerNobilityCard_SecU.setVisible(false);
								lbl_PlayerDeathCard_SecU.setVisible(false);
							} else if (Card_show == 2) {
								lbl_PlayerCitizenCard_SecU.setVisible(false);
								lbl_PlayerNobilityCard_SecU.setVisible(true);
								lbl_PlayerDeathCard_SecU.setVisible(false);
							} else if (Card_show == 3) {
								lbl_PlayerCitizenCard_SecU.setVisible(false);
								lbl_PlayerNobilityCard_SecU.setVisible(false);
								lbl_PlayerDeathCard_SecU.setVisible(true);
							} else {
								;
							}

							if (Exchanging_result == 1) {
								textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(3));
								textArea_SecU.append("\n��Ǳ�ȯ�Ͽ����ϴ�.");
								textArea_SecU.append("\n����� ȣ������ ����Ͽ����ϴ�.");

							} else if (Exchanging_result == 2) {
								textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(4));
								textArea_SecU.append("\n������ȯ�Ͽ����ϴ�.");
								textArea_SecU.append("\n����� ȣ������ �����Ͽ����ϴ�.");
							} else {
								;
							}

							if (Score_result == 1) {
								textArea_SecU.append("\n������ 1�� ȹ���߽��ϴ�.");
								textArea_SecU.append("\n�� ���� : " + Score);
							} else if (Score_result == 2) {
								textArea_SecU.append("\n������ 2�� ȹ���߽��ϴ�.");
								textArea_SecU.append("\n�� ���� : " + Score);
							} else if (Score_result == 0) {
								textArea_SecU.append("\n������ ȹ������ ���߽��ϴ�.");
								textArea_SecU.append("\n�� ���� : " + Score);
							} else {
								;
							}

							phase = 0;
						} else if (phase2_return == 2) {
							textArea_SecU.append("\n\n �� " + SecU.Name + " : " + Random_talk(6));
							textArea_SecU.append("\n��ȯ ��ȣ���� �����մϴ�.");
							phase = 0;
						} else {
							textArea_SecU.append("\n���߸��� �Է��Դϴ�.");
							phase = 0;
						}

					}
				}
			}

		});

		btn_Enter_TU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Count_TU == 0) {
					ThirdUser TU = new ThirdUser();

					int phase1_return = 0;
					int phase2_return = 0;

					if (phase == 0) {
						textArea_TU.append("\n" + textField_TU.getText());
						textField_TU.setText("");
					}

					// phase1(���� ī�� ����)
					if (phase == 1) {
						phase1_return = phase1();
						textArea_TU.append("\n���� : " + text_Card);

						// �ù� ���ý�
						if (phase1_return == 1) {

							textArea_TU.append("\n�ù��Դϴ�.");

							// �ù� ���ý�, ��밡 �ù��� ��
							if (TU.Card.equals("�ù�")) {
								textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(2));
								textArea_TU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_TU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// �ù� ���ý�, ��밡 ������ ��
							else if (TU.Card.equals("����")) {
								textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(1));
								textArea_TU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_TU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// �ù� ���ý�, ��밡 �������� ��
							else if (TU.Card.equals("������")) {
								textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(1));
								textArea_TU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_TU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 7;
								phase = 2;
							} else {
								;
							}
						}
						// ���� ���ý�
						else if (phase1_return == 2) {

							textArea_TU.append("\n�����Դϴ�.");

							// ���� ���ý�, ��밡 �ù��� ��
							if (TU.Card.equals("�ù�")) {
								textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(1));
								textArea_TU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_TU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// ���� ���ý�, ��밡 ������ ��
							else if (TU.Card.equals("����")) {
								textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(2));
								textArea_TU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_TU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// ���� ���ý�, ��밡 �������� ��
							else if (TU.Card.equals("������")) {
								if (TU.Risky <= 3) {
									textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(1));
									textArea_TU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_TU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (TU.Risky > 3) {
									textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(2));
									textArea_TU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_TU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 5;
									phase = 0;
								}
							} else {
								;
							}
						}
						// ������ ���ý�
						else if (phase1_return == 3) {

							textArea_TU.append("\n�������Դϴ�.");

							// ������ ���ý�, ��밡 �ù��� ��
							if (TU.Card.equals("�ù�")) {
								textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(2));
								textArea_TU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_TU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							}
							// ������ ���ý�, ��밡 ������ ��
							else if (TU.Card.equals("����")) {
								if (TU.Risky >= 7) {
									textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(1));
									textArea_TU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_TU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (TU.Risky < 7) {
									textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(2));
									textArea_TU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_TU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 4;
									phase = 0;
								} else {
									;
								}
							}
							// ������ ���ý�, ��밡 �������� ��
							else if (TU.Card.equals("������")) {
								textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(2));
								textArea_TU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_TU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							} else {
								;
							}
						}
						// �߸��� ī�� �Է½�
						else {
							textArea_TU.append("\n�߸��� �Է��Դϴ�.");
							phase = 0;
						}
					}

					// phase2(��ȯ ���)
					else if (phase == 2) {

						int Score_result = 0;
						int Exchanging_result = 0;

						phase2_return = phase2();

						if (phase2_return == 0) {
							textArea_TU.append("�ƴϿ�");
							textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(5));
							textArea_TU.append("\n��ȯ �����Ͽ����ϴ�.");
							phase = 0;
						} else if (phase2_return == 1) {
							textArea_TU.append("��");
							textArea_TU.append("\n��ȯ �����Ͽ����ϴ�.");

							// �����Լ� �����ϰ� ī�屳ȯ�Լ�(+���Ǳ�ȯ, ������ȯ) ����
							Score_result = Score_gaining();
							Exchanging_result = Exchanging();

							// Count �Լ� ����
							Count(3);
							Img_TU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٻ� �ϼ�_�׸���_���úҰ�.png"))));
							if (Count_FU == 0) {
								Img_FU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٴϿ� �ϼ�_�׸���.png"))));
							}
							if (Count_SecU == 0) {
								Img_SecU.setIcon(new ImageIcon(this.getClass().getResource(("/�ι�Ʈ �ϼ�_�׸���.png"))));
							}
							if (Count_TU == 0) {
								Img_TU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٻ� �ϼ�_�׸���.png"))));
							}
							if (Count_ForU == 0) {
								Img_ForU.setIcon(new ImageIcon(this.getClass().getResource(("/�������� �ϼ�_�׸���.png"))));
							}
							if (Count_FifU == 0) {
								Img_FifU.setIcon(new ImageIcon(this.getClass().getResource(("/���������� �ϼ�_�׸���.png"))));
							}
							if (Count_SixU == 0) {
								Img_SixU.setIcon(new ImageIcon(this.getClass().getResource(("/�� �ϼ�_�׸���.png"))));
							}
							if (Count_SevU == 0) {
								Img_SevU.setIcon(new ImageIcon(this.getClass().getResource(("/����ÿ �ϼ�_�׸���.png"))));
							}
							if (Count_EU == 0) {
								Img_EU.setIcon(new ImageIcon(this.getClass().getResource(("/���׵�Ʈ �ϼ�_�׸���.png"))));
							}

							// �������̽� �÷��̾� ī�� ����
							int Card_show = Card_showing();
							if (Card_show == 1) {
								lbl_PlayerCitizenCard_TU.setVisible(true);
								lbl_PlayerNobilityCard_TU.setVisible(false);
								lbl_PlayerDeathCard_TU.setVisible(false);
							} else if (Card_show == 2) {
								lbl_PlayerCitizenCard_TU.setVisible(false);
								lbl_PlayerNobilityCard_TU.setVisible(true);
								lbl_PlayerDeathCard_TU.setVisible(false);
							} else if (Card_show == 3) {
								lbl_PlayerCitizenCard_TU.setVisible(false);
								lbl_PlayerNobilityCard_TU.setVisible(false);
								lbl_PlayerDeathCard_TU.setVisible(true);
							} else {
								;
							}

							if (Exchanging_result == 1) {
								textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(3));
								textArea_TU.append("\n��Ǳ�ȯ�Ͽ����ϴ�.");
								textArea_TU.append("\n����� ȣ������ ����Ͽ����ϴ�.");

							} else if (Exchanging_result == 2) {
								textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(4));
								textArea_TU.append("\n������ȯ�Ͽ����ϴ�.");
								textArea_TU.append("\n����� ȣ������ �����Ͽ����ϴ�.");
							} else {
								;
							}

							if (Score_result == 1) {
								textArea_TU.append("\n������ 1�� ȹ���߽��ϴ�.");
								textArea_TU.append("\n�� ���� : " + Score);
							} else if (Score_result == 2) {
								textArea_TU.append("\n������ 2�� ȹ���߽��ϴ�.");
								textArea_TU.append("\n�� ���� : " + Score);
							} else if (Score_result == 0) {
								textArea_TU.append("\n������ ȹ������ ���߽��ϴ�.");
								textArea_TU.append("\n�� ���� : " + Score);
							} else {
								;
							}

							phase = 0;
						} else if (phase2_return == 2) {
							textArea_TU.append("\n\n �� " + TU.Name + " : " + Random_talk(6));
							textArea_TU.append("\n��ȯ ��ȣ���� �����մϴ�.");
							phase = 0;
						} else {
							textArea_TU.append("\n���߸��� �Է��Դϴ�.");
							phase = 0;
						}

					}
				}
			}
		});

		btn_Enter_ForU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Count_ForU == 0) {
					ForthUser ForU = new ForthUser();

					int phase1_return = 0;
					int phase2_return = 0;

					if (phase == 0) {
						textArea_ForU.append("\n" + textField_ForU.getText());
						textField_ForU.setText("");
					}

					// phase1(���� ī�� ����)
					if (phase == 1) {
						phase1_return = phase1();
						textArea_ForU.append("\n���� : " + text_Card);

						// �ù� ���ý�
						if (phase1_return == 1) {

							textArea_ForU.append("\n�ù��Դϴ�.");

							// �ù� ���ý�, ��밡 �ù��� ��
							if (ForU.Card.equals("�ù�")) {
								textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(2));
								textArea_ForU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_ForU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// �ù� ���ý�, ��밡 ������ ��
							else if (ForU.Card.equals("����")) {
								textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(1));
								textArea_ForU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_ForU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// �ù� ���ý�, ��밡 �������� ��
							else if (ForU.Card.equals("������")) {
								textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(1));
								textArea_ForU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_ForU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 7;
								phase = 2;
							} else {
								;
							}
						}
						// ���� ���ý�
						else if (phase1_return == 2) {

							textArea_ForU.append("\n�����Դϴ�.");

							// ���� ���ý�, ��밡 �ù��� ��
							if (ForU.Card.equals("�ù�")) {
								textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(1));
								textArea_ForU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_ForU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// ���� ���ý�, ��밡 ������ ��
							else if (ForU.Card.equals("����")) {
								textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(2));
								textArea_ForU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_ForU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// ���� ���ý�, ��밡 �������� ��
							else if (ForU.Card.equals("������")) {
								if (TU.Risky <= 3) {
									textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(1));
									textArea_ForU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_ForU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (ForU.Risky > 3) {
									textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(2));
									textArea_ForU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_ForU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 5;
									phase = 0;
								}
							} else {
								;
							}
						}
						// ������ ���ý�
						else if (phase1_return == 3) {

							textArea_ForU.append("\n�������Դϴ�.");

							// ������ ���ý�, ��밡 �ù��� ��
							if (ForU.Card.equals("�ù�")) {
								textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(2));
								textArea_ForU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_ForU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							}
							// ������ ���ý�, ��밡 ������ ��
							else if (ForU.Card.equals("����")) {
								if (ForU.Risky >= 7) {
									textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(1));
									textArea_ForU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_ForU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (ForU.Risky < 7) {
									textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(2));
									textArea_ForU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_ForU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 4;
									phase = 0;
								} else {
									;
								}
							}
							// ������ ���ý�, ��밡 �������� ��
							else if (ForU.Card.equals("������")) {
								textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(2));
								textArea_ForU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_ForU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							} else {
								;
							}
						}
						// �߸��� ī�� �Է½�
						else {
							textArea_ForU.append("\n�߸��� �Է��Դϴ�.");
							phase = 0;
						}
					}

					// phase2(��ȯ ���)
					else if (phase == 2) {

						int Score_result = 0;
						int Exchanging_result = 0;

						phase2_return = phase2();

						if (phase2_return == 0) {
							textArea_ForU.append("�ƴϿ�");
							textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(5));
							textArea_ForU.append("\n��ȯ �����Ͽ����ϴ�.");
							phase = 0;
						} else if (phase2_return == 1) {
							textArea_ForU.append("��");
							textArea_ForU.append("\n��ȯ �����Ͽ����ϴ�.");

							// �����Լ� �����ϰ� ī�屳ȯ�Լ�(+���Ǳ�ȯ, ������ȯ) ����
							Score_result = Score_gaining();
							Exchanging_result = Exchanging();

							// Count �Լ� ����
							Count(4);
							Img_ForU.setIcon(new ImageIcon(this.getClass().getResource(("/�������� �ϼ�_�׸���_���úҰ�.png"))));
							if (Count_FU == 0) {
								Img_FU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٴϿ� �ϼ�_�׸���.png"))));
							}
							if (Count_SecU == 0) {
								Img_SecU.setIcon(new ImageIcon(this.getClass().getResource(("/�ι�Ʈ �ϼ�_�׸���.png"))));
							}
							if (Count_TU == 0) {
								Img_TU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٻ� �ϼ�_�׸���.png"))));
							}
							if (Count_ForU == 0) {
								Img_ForU.setIcon(new ImageIcon(this.getClass().getResource(("/�������� �ϼ�_�׸���.png"))));
							}
							if (Count_FifU == 0) {
								Img_FifU.setIcon(new ImageIcon(this.getClass().getResource(("/���������� �ϼ�_�׸���.png"))));
							}
							if (Count_SixU == 0) {
								Img_SixU.setIcon(new ImageIcon(this.getClass().getResource(("/�� �ϼ�_�׸���.png"))));
							}
							if (Count_SevU == 0) {
								Img_SevU.setIcon(new ImageIcon(this.getClass().getResource(("/����ÿ �ϼ�_�׸���.png"))));
							}
							if (Count_EU == 0) {
								Img_EU.setIcon(new ImageIcon(this.getClass().getResource(("/���׵�Ʈ �ϼ�_�׸���.png"))));
							}

							// �������̽� �÷��̾� ī�� ����
							int Card_show = Card_showing();
							if (Card_show == 1) {
								lbl_PlayerCitizenCard_ForU.setVisible(true);
								lbl_PlayerNobilityCard_ForU.setVisible(false);
								lbl_PlayerDeathCard_ForU.setVisible(false);
							} else if (Card_show == 2) {
								lbl_PlayerCitizenCard_ForU.setVisible(false);
								lbl_PlayerNobilityCard_ForU.setVisible(true);
								lbl_PlayerDeathCard_ForU.setVisible(false);
							} else if (Card_show == 3) {
								lbl_PlayerCitizenCard_ForU.setVisible(false);
								lbl_PlayerNobilityCard_ForU.setVisible(false);
								lbl_PlayerDeathCard_ForU.setVisible(true);
							} else {
								;
							}

							if (Exchanging_result == 1) {
								textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(3));
								textArea_ForU.append("\n��Ǳ�ȯ�Ͽ����ϴ�.");
								textArea_ForU.append("\n����� ȣ������ ����Ͽ����ϴ�.");

							} else if (Exchanging_result == 2) {
								textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(4));
								textArea_ForU.append("\n������ȯ�Ͽ����ϴ�.");
								textArea_ForU.append("\n����� ȣ������ �����Ͽ����ϴ�.");
							} else {
								;
							}

							if (Score_result == 1) {
								textArea_ForU.append("\n������ 1�� ȹ���߽��ϴ�.");
								textArea_ForU.append("\n�� ���� : " + Score);
							} else if (Score_result == 2) {
								textArea_ForU.append("\n������ 2�� ȹ���߽��ϴ�.");
								textArea_ForU.append("\n�� ���� : " + Score);
							} else if (Score_result == 0) {
								textArea_ForU.append("\n������ ȹ������ ���߽��ϴ�.");
								textArea_ForU.append("\n�� ���� : " + Score);
							} else {
								;
							}

							phase = 0;
						} else if (phase2_return == 2) {
							textArea_ForU.append("\n\n �� " + ForU.Name + " : " + Random_talk(6));
							textArea_ForU.append("\n��ȯ ��ȣ���� �����մϴ�.");
							phase = 0;
						} else {
							textArea_ForU.append("\n���߸��� �Է��Դϴ�.");
							phase = 0;
						}

					}
				}
			}

		});

		btn_Enter_FifU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Count_FifU == 0) {
					FifthUser FifU = new FifthUser();

					int phase1_return = 0;
					int phase2_return = 0;

					if (phase == 0) {
						textArea_FifU.append("\n" + textField_FifU.getText());
						textField_FifU.setText("");
					}

					// phase1(���� ī�� ����)
					if (phase == 1) {
						phase1_return = phase1();
						textArea_FifU.append("\n���� : " + text_Card);

						// �ù� ���ý�
						if (phase1_return == 1) {

							textArea_FifU.append("\n�ù��Դϴ�.");

							// �ù� ���ý�, ��밡 �ù��� ��
							if (FifU.Card.equals("�ù�")) {
								textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(2));
								textArea_FifU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_FifU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// �ù� ���ý�, ��밡 ������ ��
							else if (FifU.Card.equals("����")) {
								textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(1));
								textArea_FifU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_FifU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// �ù� ���ý�, ��밡 �������� ��
							else if (FifU.Card.equals("������")) {
								textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(1));
								textArea_FifU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_FifU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 7;
								phase = 2;
							} else {
								;
							}
						}
						// ���� ���ý�
						else if (phase1_return == 2) {

							textArea_FifU.append("\n�����Դϴ�.");

							// ���� ���ý�, ��밡 �ù��� ��
							if (FifU.Card.equals("�ù�")) {
								textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(1));
								textArea_FifU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_FifU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// ���� ���ý�, ��밡 ������ ��
							else if (FifU.Card.equals("����")) {
								textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(2));
								textArea_FifU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_FifU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// ���� ���ý�, ��밡 �������� ��
							else if (FifU.Card.equals("������")) {
								if (TU.Risky <= 3) {
									textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(1));
									textArea_FifU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_FifU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (FifU.Risky > 3) {
									textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(2));
									textArea_FifU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_FifU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 5;
									phase = 0;
								}
							} else {
								;
							}
						}
						// ������ ���ý�
						else if (phase1_return == 3) {

							textArea_FifU.append("\n�������Դϴ�.");

							// ������ ���ý�, ��밡 �ù��� ��
							if (FifU.Card.equals("�ù�")) {
								textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(2));
								textArea_FifU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_FifU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							}
							// ������ ���ý�, ��밡 ������ ��
							else if (FifU.Card.equals("����")) {
								if (FifU.Risky >= 7) {
									textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(1));
									textArea_FifU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_FifU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (FifU.Risky < 7) {
									textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(2));
									textArea_FifU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_FifU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 4;
									phase = 0;
								} else {
									;
								}
							}
							// ������ ���ý�, ��밡 �������� ��
							else if (FifU.Card.equals("������")) {
								textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(2));
								textArea_FifU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_FifU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							} else {
								;
							}
						}
						// �߸��� ī�� �Է½�
						else {
							textArea_FifU.append("\n�߸��� �Է��Դϴ�.");
							phase = 0;
						}
					}

					// phase2(��ȯ ���)
					else if (phase == 2) {

						int Score_result = 0;
						int Exchanging_result = 0;

						phase2_return = phase2();

						if (phase2_return == 0) {
							textArea_FifU.append("�ƴϿ�");
							textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(5));
							textArea_FifU.append("\n��ȯ �����Ͽ����ϴ�.");
							phase = 0;
						} else if (phase2_return == 1) {
							textArea_FifU.append("��");
							textArea_FifU.append("\n��ȯ �����Ͽ����ϴ�.");

							// �����Լ� �����ϰ� ī�屳ȯ�Լ�(+���Ǳ�ȯ, ������ȯ) ����
							Score_result = Score_gaining();
							Exchanging_result = Exchanging();

							// Count �Լ� ����
							Count(5);
							Img_FifU.setIcon(new ImageIcon(this.getClass().getResource(("/���������� �ϼ�_�׸���_���úҰ�.png"))));
							if (Count_FU == 0) {
								Img_FU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٴϿ� �ϼ�_�׸���.png"))));
							}
							if (Count_SecU == 0) {
								Img_SecU.setIcon(new ImageIcon(this.getClass().getResource(("/�ι�Ʈ �ϼ�_�׸���.png"))));
							}
							if (Count_TU == 0) {
								Img_TU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٻ� �ϼ�_�׸���.png"))));
							}
							if (Count_ForU == 0) {
								Img_ForU.setIcon(new ImageIcon(this.getClass().getResource(("/�������� �ϼ�_�׸���.png"))));
							}
							if (Count_FifU == 0) {
								Img_FifU.setIcon(new ImageIcon(this.getClass().getResource(("/���������� �ϼ�_�׸���.png"))));
							}
							if (Count_SixU == 0) {
								Img_SixU.setIcon(new ImageIcon(this.getClass().getResource(("/�� �ϼ�_�׸���.png"))));
							}
							if (Count_SevU == 0) {
								Img_SevU.setIcon(new ImageIcon(this.getClass().getResource(("/����ÿ �ϼ�_�׸���.png"))));
							}
							if (Count_EU == 0) {
								Img_EU.setIcon(new ImageIcon(this.getClass().getResource(("/���׵�Ʈ �ϼ�_�׸���.png"))));
							}

							// �������̽� �÷��̾� ī�� ����
							int Card_show = Card_showing();
							if (Card_show == 1) {
								lbl_PlayerCitizenCard_FifU.setVisible(true);
								lbl_PlayerNobilityCard_FifU.setVisible(false);
								lbl_PlayerDeathCard_FifU.setVisible(false);
							} else if (Card_show == 2) {
								lbl_PlayerCitizenCard_FifU.setVisible(false);
								lbl_PlayerNobilityCard_FifU.setVisible(true);
								lbl_PlayerDeathCard_FifU.setVisible(false);
							} else if (Card_show == 3) {
								lbl_PlayerCitizenCard_FifU.setVisible(false);
								lbl_PlayerNobilityCard_FifU.setVisible(false);
								lbl_PlayerDeathCard_FifU.setVisible(true);
							} else {
								;
							}

							if (Exchanging_result == 1) {
								textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(3));
								textArea_FifU.append("\n��Ǳ�ȯ�Ͽ����ϴ�.");
								textArea_FifU.append("\n����� ȣ������ ����Ͽ����ϴ�.");

							} else if (Exchanging_result == 2) {
								textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(4));
								textArea_FifU.append("\n������ȯ�Ͽ����ϴ�.");
								textArea_FifU.append("\n����� ȣ������ �����Ͽ����ϴ�.");
							} else {
								;
							}

							if (Score_result == 1) {
								textArea_FifU.append("\n������ 1�� ȹ���߽��ϴ�.");
								textArea_FifU.append("\n�� ���� : " + Score);
							} else if (Score_result == 2) {
								textArea_FifU.append("\n������ 2�� ȹ���߽��ϴ�.");
								textArea_FifU.append("\n�� ���� : " + Score);
							} else if (Score_result == 0) {
								textArea_FifU.append("\n������ ȹ������ ���߽��ϴ�.");
								textArea_FifU.append("\n�� ���� : " + Score);
							} else {
								;
							}

							phase = 0;
						} else if (phase2_return == 2) {
							textArea_FifU.append("\n\n �� " + FifU.Name + " : " + Random_talk(6));
							textArea_FifU.append("\n��ȯ ��ȣ���� �����մϴ�.");
							phase = 0;
						} else {
							textArea_FifU.append("\n���߸��� �Է��Դϴ�.");
							phase = 0;
						}

					}
				}
			}

		});

		btn_Enter_SixU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Count_SixU == 0) {
					SixthUser SixU = new SixthUser();

					int phase1_return = 0;
					int phase2_return = 0;

					if (phase == 0) {
						textArea_SixU.append("\n" + textField_SixU.getText());
						textField_SixU.setText("");
					}

					// phase1(���� ī�� ����)
					if (phase == 1) {
						phase1_return = phase1();
						textArea_SixU.append("\n���� : " + text_Card);

						// �ù� ���ý�
						if (phase1_return == 1) {

							textArea_SixU.append("\n�ù��Դϴ�.");

							// �ù� ���ý�, ��밡 �ù��� ��
							if (SixU.Card.equals("�ù�")) {
								textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(2));
								textArea_SixU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SixU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// �ù� ���ý�, ��밡 ������ ��
							else if (SixU.Card.equals("����")) {
								textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(1));
								textArea_SixU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_SixU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// �ù� ���ý�, ��밡 �������� ��
							else if (SixU.Card.equals("������")) {
								textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(1));
								textArea_SixU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_SixU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 7;
								phase = 2;
							} else {
								;
							}
						}
						// ���� ���ý�
						else if (phase1_return == 2) {

							textArea_SixU.append("\n�����Դϴ�.");

							// ���� ���ý�, ��밡 �ù��� ��
							if (SixU.Card.equals("�ù�")) {
								textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(1));
								textArea_SixU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_SixU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// ���� ���ý�, ��밡 ������ ��
							else if (SixU.Card.equals("����")) {
								textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(2));
								textArea_SixU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SixU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// ���� ���ý�, ��밡 �������� ��
							else if (SixU.Card.equals("������")) {
								if (TU.Risky <= 3) {
									textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(1));
									textArea_SixU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_SixU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (SixU.Risky > 3) {
									textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(2));
									textArea_SixU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_SixU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 5;
									phase = 0;
								}
							} else {
								;
							}
						}
						// ������ ���ý�
						else if (phase1_return == 3) {

							textArea_SixU.append("\n�������Դϴ�.");

							// ������ ���ý�, ��밡 �ù��� ��
							if (SixU.Card.equals("�ù�")) {
								textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(2));
								textArea_SixU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SixU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							}
							// ������ ���ý�, ��밡 ������ ��
							else if (SixU.Card.equals("����")) {
								if (SixU.Risky >= 7) {
									textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(1));
									textArea_SixU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_SixU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (SixU.Risky < 7) {
									textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(2));
									textArea_SixU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_SixU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 4;
									phase = 0;
								} else {
									;
								}
							}
							// ������ ���ý�, ��밡 �������� ��
							else if (SixU.Card.equals("������")) {
								textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(2));
								textArea_SixU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SixU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							} else {
								;
							}
						}
						// �߸��� ī�� �Է½�
						else {
							textArea_SixU.append("\n�߸��� �Է��Դϴ�.");
							phase = 0;
						}
					}

					// phase2(��ȯ ���)
					else if (phase == 2) {

						int Score_result = 0;
						int Exchanging_result = 0;

						phase2_return = phase2();

						if (phase2_return == 0) {
							textArea_SixU.append("�ƴϿ�");
							textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(5));
							textArea_SixU.append("\n��ȯ �����Ͽ����ϴ�.");
							phase = 0;
						} else if (phase2_return == 1) {
							textArea_SixU.append("��");
							textArea_SixU.append("\n��ȯ �����Ͽ����ϴ�.");

							// �����Լ� �����ϰ� ī�屳ȯ�Լ�(+���Ǳ�ȯ, ������ȯ) ����
							Score_result = Score_gaining();
							Exchanging_result = Exchanging();

							// Count �Լ� ����
							Count(6);
							Img_SixU.setIcon(new ImageIcon(this.getClass().getResource(("/�� �ϼ�_�׸���_���úҰ�.png"))));
							if (Count_FU == 0) {
								Img_FU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٴϿ� �ϼ�_�׸���.png"))));
							}
							if (Count_SecU == 0) {
								Img_SecU.setIcon(new ImageIcon(this.getClass().getResource(("/�ι�Ʈ �ϼ�_�׸���.png"))));
							}
							if (Count_TU == 0) {
								Img_TU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٻ� �ϼ�_�׸���.png"))));
							}
							if (Count_ForU == 0) {
								Img_ForU.setIcon(new ImageIcon(this.getClass().getResource(("/�������� �ϼ�_�׸���.png"))));
							}
							if (Count_FifU == 0) {
								Img_FifU.setIcon(new ImageIcon(this.getClass().getResource(("/���������� �ϼ�_�׸���.png"))));
							}
							if (Count_SixU == 0) {
								Img_SixU.setIcon(new ImageIcon(this.getClass().getResource(("/�� �ϼ�_�׸���.png"))));
							}
							if (Count_SevU == 0) {
								Img_SevU.setIcon(new ImageIcon(this.getClass().getResource(("/����ÿ �ϼ�_�׸���.png"))));
							}
							if (Count_EU == 0) {
								Img_EU.setIcon(new ImageIcon(this.getClass().getResource(("/���׵�Ʈ �ϼ�_�׸���.png"))));
							}

							// �������̽� �÷��̾� ī�� ����
							int Card_show = Card_showing();
							if (Card_show == 1) {
								lbl_PlayerCitizenCard_SixU.setVisible(true);
								lbl_PlayerNobilityCard_SixU.setVisible(false);
								lbl_PlayerDeathCard_SixU.setVisible(false);
							} else if (Card_show == 2) {
								lbl_PlayerCitizenCard_SixU.setVisible(false);
								lbl_PlayerNobilityCard_SixU.setVisible(true);
								lbl_PlayerDeathCard_SixU.setVisible(false);
							} else if (Card_show == 3) {
								lbl_PlayerCitizenCard_SixU.setVisible(false);
								lbl_PlayerNobilityCard_SixU.setVisible(false);
								lbl_PlayerDeathCard_SixU.setVisible(true);
							} else {
								;
							}

							if (Exchanging_result == 1) {
								textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(3));
								textArea_SixU.append("\n��Ǳ�ȯ�Ͽ����ϴ�.");
								textArea_SixU.append("\n����� ȣ������ ����Ͽ����ϴ�.");

							} else if (Exchanging_result == 2) {
								textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(4));
								textArea_SixU.append("\n������ȯ�Ͽ����ϴ�.");
								textArea_SixU.append("\n����� ȣ������ �����Ͽ����ϴ�.");
							} else {
								;
							}

							if (Score_result == 1) {
								textArea_SixU.append("\n������ 1�� ȹ���߽��ϴ�.");
								textArea_SixU.append("\n�� ���� : " + Score);
							} else if (Score_result == 2) {
								textArea_SixU.append("\n������ 2�� ȹ���߽��ϴ�.");
								textArea_SixU.append("\n�� ���� : " + Score);
							} else if (Score_result == 0) {
								textArea_SixU.append("\n������ ȹ������ ���߽��ϴ�.");
								textArea_SixU.append("\n�� ���� : " + Score);
							} else {
								;
							}

							phase = 0;
						} else if (phase2_return == 2) {
							textArea_SixU.append("\n\n �� " + SixU.Name + " : " + Random_talk(6));
							textArea_SixU.append("\n��ȯ ��ȣ���� �����մϴ�.");
							phase = 0;
						} else {
							textArea_SixU.append("\n���߸��� �Է��Դϴ�.");
							phase = 0;
						}

					}
				}
			}

		});

		btn_Enter_SevU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Count_SevU == 0) {
					SeventhUser SevU = new SeventhUser();

					int phase1_return = 0;
					int phase2_return = 0;

					if (phase == 0) {
						textArea_SevU.append("\n" + textField_SevU.getText());
						textField_SevU.setText("");
					}

					// phase1(���� ī�� ����)
					if (phase == 1) {
						phase1_return = phase1();
						textArea_SevU.append("\n���� : " + text_Card);

						// �ù� ���ý�
						if (phase1_return == 1) {

							textArea_SevU.append("\n�ù��Դϴ�.");

							// �ù� ���ý�, ��밡 �ù��� ��
							if (SevU.Card.equals("�ù�")) {
								textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(2));
								textArea_SevU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SevU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// �ù� ���ý�, ��밡 ������ ��
							else if (SevU.Card.equals("����")) {
								textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(1));
								textArea_SevU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_SevU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// �ù� ���ý�, ��밡 �������� ��
							else if (SevU.Card.equals("������")) {
								textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(1));
								textArea_SevU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_SevU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 7;
								phase = 2;
							} else {
								;
							}
						}
						// ���� ���ý�
						else if (phase1_return == 2) {

							textArea_SevU.append("\n�����Դϴ�.");

							// ���� ���ý�, ��밡 �ù��� ��
							if (SevU.Card.equals("�ù�")) {
								textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(1));
								textArea_SevU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_SevU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// ���� ���ý�, ��밡 ������ ��
							else if (SevU.Card.equals("����")) {
								textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(2));
								textArea_SevU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SevU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// ���� ���ý�, ��밡 �������� ��
							else if (SevU.Card.equals("������")) {
								if (TU.Risky <= 3) {
									textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(1));
									textArea_SevU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_SevU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (SevU.Risky > 3) {
									textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(2));
									textArea_SevU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_SevU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 5;
									phase = 0;
								}
							} else {
								;
							}
						}
						// ������ ���ý�
						else if (phase1_return == 3) {

							textArea_SevU.append("\n�������Դϴ�.");

							// ������ ���ý�, ��밡 �ù��� ��
							if (SevU.Card.equals("�ù�")) {
								textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(2));
								textArea_SevU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SevU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							}
							// ������ ���ý�, ��밡 ������ ��
							else if (SevU.Card.equals("����")) {
								if (SevU.Risky >= 7) {
									textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(1));
									textArea_SevU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_SevU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (SevU.Risky < 7) {
									textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(2));
									textArea_SevU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_SevU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 4;
									phase = 0;
								} else {
									;
								}
							}
							// ������ ���ý�, ��밡 �������� ��
							else if (SevU.Card.equals("������")) {
								textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(2));
								textArea_SevU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_SevU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							} else {
								;
							}
						}
						// �߸��� ī�� �Է½�
						else {
							textArea_SevU.append("\n�߸��� �Է��Դϴ�.");
							phase = 0;
						}
					}

					// phase2(��ȯ ���)
					else if (phase == 2) {

						int Score_result = 0;
						int Exchanging_result = 0;

						phase2_return = phase2();

						if (phase2_return == 0) {
							textArea_SevU.append("�ƴϿ�");
							textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(5));
							textArea_SevU.append("\n��ȯ �����Ͽ����ϴ�.");
							phase = 0;
						} else if (phase2_return == 1) {
							textArea_SevU.append("��");
							textArea_SevU.append("\n��ȯ �����Ͽ����ϴ�.");

							// �����Լ� �����ϰ� ī�屳ȯ�Լ�(+���Ǳ�ȯ, ������ȯ) ����
							Score_result = Score_gaining();
							Exchanging_result = Exchanging();

							// Count �Լ� ����
							Count(7);
							Img_SevU.setIcon(new ImageIcon(this.getClass().getResource(("/����ÿ �ϼ�_�׸���_���úҰ�.png"))));
							if (Count_FU == 0) {
								Img_FU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٴϿ� �ϼ�_�׸���.png"))));
							}
							if (Count_SecU == 0) {
								Img_SecU.setIcon(new ImageIcon(this.getClass().getResource(("/�ι�Ʈ �ϼ�_�׸���.png"))));
							}
							if (Count_TU == 0) {
								Img_TU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٻ� �ϼ�_�׸���.png"))));
							}
							if (Count_ForU == 0) {
								Img_ForU.setIcon(new ImageIcon(this.getClass().getResource(("/�������� �ϼ�_�׸���.png"))));
							}
							if (Count_FifU == 0) {
								Img_FifU.setIcon(new ImageIcon(this.getClass().getResource(("/���������� �ϼ�_�׸���.png"))));
							}
							if (Count_SixU == 0) {
								Img_SixU.setIcon(new ImageIcon(this.getClass().getResource(("/�� �ϼ�_�׸���.png"))));
							}
							if (Count_SevU == 0) {
								Img_SevU.setIcon(new ImageIcon(this.getClass().getResource(("/����ÿ �ϼ�_�׸���.png"))));
							}
							if (Count_EU == 0) {
								Img_EU.setIcon(new ImageIcon(this.getClass().getResource(("/���׵�Ʈ �ϼ�_�׸���.png"))));
							}

							// �������̽� �÷��̾� ī�� ����
							int Card_show = Card_showing();
							if (Card_show == 1) {
								lbl_PlayerCitizenCard_SevU.setVisible(true);
								lbl_PlayerNobilityCard_SevU.setVisible(false);
								lbl_PlayerDeathCard_SevU.setVisible(false);
							} else if (Card_show == 2) {
								lbl_PlayerCitizenCard_SevU.setVisible(false);
								lbl_PlayerNobilityCard_SevU.setVisible(true);
								lbl_PlayerDeathCard_SevU.setVisible(false);
							} else if (Card_show == 3) {
								lbl_PlayerCitizenCard_SevU.setVisible(false);
								lbl_PlayerNobilityCard_SevU.setVisible(false);
								lbl_PlayerDeathCard_SevU.setVisible(true);
							} else {
								;
							}

							if (Exchanging_result == 1) {
								textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(3));
								textArea_SevU.append("\n��Ǳ�ȯ�Ͽ����ϴ�.");
								textArea_SevU.append("\n����� ȣ������ ����Ͽ����ϴ�.");

							} else if (Exchanging_result == 2) {
								textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(4));
								textArea_SevU.append("\n������ȯ�Ͽ����ϴ�.");
								textArea_SevU.append("\n����� ȣ������ �����Ͽ����ϴ�.");
							} else {
								;
							}

							if (Score_result == 1) {
								textArea_SevU.append("\n������ 1�� ȹ���߽��ϴ�.");
								textArea_SevU.append("\n�� ���� : " + Score);
							} else if (Score_result == 2) {
								textArea_SevU.append("\n������ 2�� ȹ���߽��ϴ�.");
								textArea_SevU.append("\n�� ���� : " + Score);
							} else if (Score_result == 0) {
								textArea_SevU.append("\n������ ȹ������ ���߽��ϴ�.");
								textArea_SevU.append("\n�� ���� : " + Score);
							} else {
								;
							}

							phase = 0;
						} else if (phase2_return == 2) {
							textArea_SevU.append("\n\n �� " + SevU.Name + " : " + Random_talk(6));
							textArea_SevU.append("\n��ȯ ��ȣ���� �����մϴ�.");
							phase = 0;
						} else {
							textArea_SevU.append("\n���߸��� �Է��Դϴ�.");
							phase = 0;
						}

					}
				}
			}

		});

		btn_Enter_EU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Count_EU == 0) {
					EighthUser EU = new EighthUser();

					int phase1_return = 0;
					int phase2_return = 0;

					if (phase == 0) {
						textArea_EU.append("\n" + textField_EU.getText());
						textField_EU.setText("");
					}

					// phase1(���� ī�� ����)
					if (phase == 1) {
						phase1_return = phase1();
						textArea_EU.append("\n���� : " + text_Card);

						// �ù� ���ý�
						if (phase1_return == 1) {

							textArea_EU.append("\n�ù��Դϴ�.");

							// �ù� ���ý�, ��밡 �ù��� ��
							if (EU.Card.equals("�ù�")) {
								textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(2));
								textArea_EU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_EU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// �ù� ���ý�, ��밡 ������ ��
							else if (EU.Card.equals("����")) {
								textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(1));
								textArea_EU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_EU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// �ù� ���ý�, ��밡 �������� ��
							else if (EU.Card.equals("������")) {
								textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(1));
								textArea_EU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_EU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 7;
								phase = 2;
							} else {
								;
							}
						}
						// ���� ���ý�
						else if (phase1_return == 2) {

							textArea_EU.append("\n�����Դϴ�.");

							// ���� ���ý�, ��밡 �ù��� ��
							if (EU.Card.equals("�ù�")) {
								textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(1));
								textArea_EU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
								textArea_EU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
								Card_preference = 6;
								phase = 2;
							}
							// ���� ���ý�, ��밡 ������ ��
							else if (EU.Card.equals("����")) {
								textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(2));
								textArea_EU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_EU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 5;
								phase = 0;
							}
							// ���� ���ý�, ��밡 �������� ��
							else if (EU.Card.equals("������")) {
								if (TU.Risky <= 3) {
									textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(1));
									textArea_EU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_EU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (EU.Risky > 3) {
									textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(2));
									textArea_EU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_EU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 5;
									phase = 0;
								}
							} else {
								;
							}
						}
						// ������ ���ý�
						else if (phase1_return == 3) {

							textArea_EU.append("\n�������Դϴ�.");

							// ������ ���ý�, ��밡 �ù��� ��
							if (EU.Card.equals("�ù�")) {
								textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(2));
								textArea_EU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_EU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							}
							// ������ ���ý�, ��밡 ������ ��
							else if (EU.Card.equals("����")) {
								if (EU.Risky >= 7) {
									textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(1));
									textArea_EU.append("\n��밡 ī�带 ��ȣ�մϴ�.");
									textArea_EU.append("\n��ȯ�Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�) : ");
									Card_preference = 7;
									phase = 2;
								} else if (EU.Risky < 7) {
									textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(2));
									textArea_EU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
									textArea_EU.append("\n��ȯ �����Ͽ����ϴ�.");
									Card_preference = 4;
									phase = 0;
								} else {
									;
								}
							}
							// ������ ���ý�, ��밡 �������� ��
							else if (EU.Card.equals("������")) {
								textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(2));
								textArea_EU.append("\n��밡 ī�带 ��ȣ���� �ʽ��ϴ�.");
								textArea_EU.append("\n��ȯ �����Ͽ����ϴ�.");
								Card_preference = 3;
								phase = 0;
							} else {
								;
							}
						}
						// �߸��� ī�� �Է½�
						else {
							textArea_EU.append("\n�߸��� �Է��Դϴ�.");
							phase = 0;
						}
					}

					// phase2(��ȯ ���)
					else if (phase == 2) {

						int Score_result = 0;
						int Exchanging_result = 0;

						phase2_return = phase2();

						if (phase2_return == 0) {
							textArea_EU.append("�ƴϿ�");
							textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(5));
							textArea_EU.append("\n��ȯ �����Ͽ����ϴ�.");
							phase = 0;
						} else if (phase2_return == 1) {
							textArea_EU.append("��");
							textArea_EU.append("\n��ȯ �����Ͽ����ϴ�.");

							// �����Լ� �����ϰ� ī�屳ȯ�Լ�(+���Ǳ�ȯ, ������ȯ) ����
							Score_result = Score_gaining();
							Exchanging_result = Exchanging();

							// Count �Լ� ����
							Count(8);
							Img_EU.setIcon(new ImageIcon(this.getClass().getResource(("/���׵�Ʈ �ϼ�_�׸���_���úҰ�.png"))));
							if (Count_FU == 0) {
								Img_FU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٴϿ� �ϼ�_�׸���.png"))));
							}
							if (Count_SecU == 0) {
								Img_SecU.setIcon(new ImageIcon(this.getClass().getResource(("/�ι�Ʈ �ϼ�_�׸���.png"))));
							}
							if (Count_TU == 0) {
								Img_TU.setIcon(new ImageIcon(this.getClass().getResource(("/�ٻ� �ϼ�_�׸���.png"))));
							}
							if (Count_ForU == 0) {
								Img_ForU.setIcon(new ImageIcon(this.getClass().getResource(("/�������� �ϼ�_�׸���.png"))));
							}
							if (Count_FifU == 0) {
								Img_FifU.setIcon(new ImageIcon(this.getClass().getResource(("/���������� �ϼ�_�׸���.png"))));
							}
							if (Count_SixU == 0) {
								Img_SixU.setIcon(new ImageIcon(this.getClass().getResource(("/�� �ϼ�_�׸���.png"))));
							}
							if (Count_SevU == 0) {
								Img_SevU.setIcon(new ImageIcon(this.getClass().getResource(("/����ÿ �ϼ�_�׸���.png"))));
							}
							if (Count_EU == 0) {
								Img_EU.setIcon(new ImageIcon(this.getClass().getResource(("/���׵�Ʈ �ϼ�_�׸���.png"))));
							}

							// �������̽� �÷��̾� ī�� ����
							int Card_show = Card_showing();
							if (Card_show == 1) {
								lbl_PlayerCitizenCard_EU.setVisible(true);
								lbl_PlayerNobilityCard_EU.setVisible(false);
								lbl_PlayerDeathCard_EU.setVisible(false);
							} else if (Card_show == 2) {
								lbl_PlayerCitizenCard_EU.setVisible(false);
								lbl_PlayerNobilityCard_EU.setVisible(true);
								lbl_PlayerDeathCard_EU.setVisible(false);
							} else if (Card_show == 3) {
								lbl_PlayerCitizenCard_EU.setVisible(false);
								lbl_PlayerNobilityCard_EU.setVisible(false);
								lbl_PlayerDeathCard_EU.setVisible(true);
							} else {
								;
							}

							if (Exchanging_result == 1) {
								textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(3));
								textArea_EU.append("\n��Ǳ�ȯ�Ͽ����ϴ�.");
								textArea_EU.append("\n����� ȣ������ ����Ͽ����ϴ�.");

							} else if (Exchanging_result == 2) {
								textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(4));
								textArea_EU.append("\n������ȯ�Ͽ����ϴ�.");
								textArea_EU.append("\n����� ȣ������ �����Ͽ����ϴ�.");
							} else {
								;
							}

							if (Score_result == 1) {
								textArea_EU.append("\n������ 1�� ȹ���߽��ϴ�.");
								textArea_EU.append("\n�� ���� : " + Score);
							} else if (Score_result == 2) {
								textArea_EU.append("\n������ 2�� ȹ���߽��ϴ�.");
								textArea_EU.append("\n�� ���� : " + Score);
							} else if (Score_result == 0) {
								textArea_EU.append("\n������ ȹ������ ���߽��ϴ�.");
								textArea_EU.append("\n�� ���� : " + Score);
							} else {
								;
							}

							phase = 0;
						} else if (phase2_return == 2) {
							textArea_EU.append("\n\n �� " + EU.Name + " : " + Random_talk(6));
							textArea_EU.append("\n��ȯ ��ȣ���� �����մϴ�.");
							phase = 0;
						} else {
							textArea_EU.append("\n���߸��� �Է��Դϴ�.");
							phase = 0;
						}

					}
				}
			}

		});

		// ��ȭ �غ�â�� ó���� ǥ�õǰ�
		panel_pre.setVisible(true);
		panel_FUtalk.setVisible(false);
		panel_SecUtalk.setVisible(false);
		panel_TUtalk.setVisible(false);
		panel_ForUtalk.setVisible(false);
		panel_FifUtalk.setVisible(false);
		panel_SixUtalk.setVisible(false);
		panel_SevUtalk.setVisible(false);
		panel_EUtalk.setVisible(false);
		panel_end.setVisible(false);
		panel_over.setVisible(false);

		btn_Test.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				/*
				 * System.out.println("<<�÷��̾� ī�� : " + Card + ">>");
				 * System.out.println("<<ù��° ���� ī�� : " + FU.Card + ">>");
				 * System.out.println("<<�ι�° ���� ī�� : " + SecU.Card + ">>");
				 * System.out.println("<<����° ���� ī�� : " + TU.Card + ">>");
				 * System.out.println("<<�׹�° ���� ī�� : " + ForU.Card + ">>");
				 * System.out.println("<<�ټ���° ���� ī�� : " + FifU.Card + ">>");
				 * System.out.println("<<������° ���� ī�� : " + SixU.Card + ">>");
				 * System.out.println("<<�ϰ���° ���� ī�� : " + SevU.Card + ">>");
				 * System.out.println("<<������° ���� ī�� : " + EU.Card + ">>");
				 */

				/*
				 * System.out.println("<<ù��° ���� Score_greed : " + FU.Score_greed + ">>");
				 * System.out.println("<<ù��° ���� Risky : " + FU.Risky + ">>");
				 * System.out.println("<<ù��° ���� Lying : " + FU.Lying + ">>");
				 * System.out.println("<<�ι�° ���� Score_greed : " + SecU.Score_greed + ">>");
				 * System.out.println("<<�ι�° ���� Risky : " + SecU.Risky + ">>");
				 * System.out.println("<<�ι�° ���� Lying : " + SecU.Lying + ">>");
				 * System.out.println("<<����° ���� Score_greed : " + TU.Score_greed + ">>");
				 * System.out.println("<<����° ���� Risky : " + TU.Risky + ">>");
				 * System.out.println("<<����° ���� Lying : " + TU.Lying + ">>");
				 * System.out.println("<<�׹�° ���� Score_greed : " + ForU.Score_greed + ">>");
				 * System.out.println("<<�׹�° ���� Risky : " + ForU.Risky + ">>");
				 * System.out.println("<<�׹�° ���� Lying : " + ForU.Lying + ">>");
				 */

				showMessageDialog(null, "�÷��̾� ī�� : " + Card + "\nù��° ���� ī�� : " + FU.Card + "\n�ι�° ���� ī�� : " + SecU.Card
						+ "\n����° ���� ī�� : " + TU.Card + "\n�׹�° ���� ī�� : " + ForU.Card + "\n�ټ���° ���� ī�� : " + FifU.Card
						+ "\n������° ���� ī�� : " + SixU.Card + "\n�ϰ���° ���� ī�� : " + SevU.Card + "\n������° ���� ī�� : " + EU.Card);
			}
		});

		// n��° ���� ��ȭ ��ư

		btn_FU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				panel_pre.setVisible(false);
				panel_FUtalk.setVisible(true);
				panel_SecUtalk.setVisible(false);
				panel_TUtalk.setVisible(false);
				panel_ForUtalk.setVisible(false);
				panel_FifUtalk.setVisible(false);
				panel_SixUtalk.setVisible(false);
				panel_SevUtalk.setVisible(false);
				panel_EUtalk.setVisible(false);

				if (Count_FU == 0) {
					textArea_FU.append("\n\n������ ī���? ");
					phase = 1;
					User_choice = 1;
				} else if (Count_FU > 0) {
					textArea_FU.append("\n\n���� ��ȯ �Ұ��մϴ�.");
					textArea_FU.append("\n�ٸ� ������ ���� ��ȯ�ϼ���.");
				} else {
					;
				}

				if (clock == 0) {

					// ���� ī�� �ֱ�
					RandomUserCard();

					clock = 1;
					lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�.gif"))));

					Timer timer1 = new Timer();
					TimerTask task1 = new TimerTask() {
						@Override
						public void run() {
							--time;
							lbl_Timer.setText("" + time);

							if (time == 0) {
								if (pre_Card.equals("������")) {
									Score += 3;
								}

								lbl_End_Score.setText("" + Score);

								panel.setVisible(false);

								if (!Card.equals("������")) {
									if (Card.equals("����")) {
										lbl_End_Card
												.setIcon(new ImageIcon(this.getClass().getResource(("/���� �ϼ���.png"))));
									}
									panel_end.setVisible(true);
									panel_over.setVisible(false);
								} else if (Card.equals("������")) {
									panel_end.setVisible(false);
									panel_over.setVisible(true);
									System.out.println("������ �ƴ�");
								} else {
									;
								}

								panel_pre.setVisible(true);
								panel_FUtalk.setVisible(false);
								panel_SecUtalk.setVisible(false);
								panel_TUtalk.setVisible(false);
								panel_ForUtalk.setVisible(false);
								panel_FifUtalk.setVisible(false);
								panel_SixUtalk.setVisible(false);
								panel_SevUtalk.setVisible(false);
								panel_EUtalk.setVisible(false);

								timer1.cancel();
								lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�_����.png"))));
							}
						}
					};
					timer1.schedule(task1, 1000, 1000);
				}

				// �������̽� �÷��̾� ī�� ����
				int Card_show = Card_showing();
				if (Card_show == 1) {
					lbl_PlayerCitizenCard_FU.setVisible(true);
					lbl_PlayerNobilityCard_FU.setVisible(false);
					lbl_PlayerDeathCard_FU.setVisible(false);
				} else if (Card_show == 2) {
					lbl_PlayerCitizenCard_FU.setVisible(false);
					lbl_PlayerNobilityCard_FU.setVisible(true);
					lbl_PlayerDeathCard_FU.setVisible(false);
				} else if (Card_show == 3) {
					lbl_PlayerCitizenCard_FU.setVisible(false);
					lbl_PlayerNobilityCard_FU.setVisible(false);
					lbl_PlayerDeathCard_FU.setVisible(true);
				} else {
					;
				}

			}

		});

		btn_SecU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				panel_pre.setVisible(false);
				panel_FUtalk.setVisible(false);
				panel_SecUtalk.setVisible(true);
				panel_TUtalk.setVisible(false);
				panel_ForUtalk.setVisible(false);
				panel_FifUtalk.setVisible(false);
				panel_SixUtalk.setVisible(false);
				panel_SevUtalk.setVisible(false);
				panel_EUtalk.setVisible(false);

				if (Count_SecU == 0) {
					textArea_SecU.append("\n\n������ ī���? ");
					phase = 1;
					User_choice = 2;
				} else if (Count_SecU > 0) {
					textArea_SecU.append("\n\n���� ��ȯ �Ұ��մϴ�.");
					textArea_SecU.append("\n�ٸ� ������ ���� ��ȯ�ϼ���.");
				} else {
					;
				}

				if (clock == 0) {

					// ���� ī�� �ֱ�
					RandomUserCard();

					clock = 1;
					lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�.gif"))));

					Timer timer1 = new Timer();
					TimerTask task1 = new TimerTask() {
						@Override
						public void run() {
							--time;
							lbl_Timer.setText("" + time);

							if (time == 0) {
								if (pre_Card.equals("������")) {
									Score += 3;
								}

								lbl_End_Score.setText("" + Score);

								panel.setVisible(false);

								if (!Card.equals("������")) {
									if (Card.equals("����")) {
										lbl_End_Card
												.setIcon(new ImageIcon(this.getClass().getResource(("/���� �ϼ���.png"))));
									}
									panel_end.setVisible(true);
									panel_over.setVisible(false);
								} else if (Card.equals("������")) {
									panel_end.setVisible(false);
									panel_over.setVisible(true);
									System.out.println("������ �ƴ�");
								} else {
									;
								}

								panel_pre.setVisible(true);
								panel_FUtalk.setVisible(false);
								panel_SecUtalk.setVisible(false);
								panel_TUtalk.setVisible(false);
								panel_ForUtalk.setVisible(false);
								panel_FifUtalk.setVisible(false);
								panel_SixUtalk.setVisible(false);
								panel_SevUtalk.setVisible(false);
								panel_EUtalk.setVisible(false);

								timer1.cancel();
								lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�_����.png"))));
							}
						}
					};
					timer1.schedule(task1, 1000, 1000);
				}

				// �������̽� �÷��̾� ī�� ����
				int Card_show = Card_showing();
				if (Card_show == 1) {
					lbl_PlayerCitizenCard_SecU.setVisible(true);
					lbl_PlayerNobilityCard_SecU.setVisible(false);
					lbl_PlayerDeathCard_SecU.setVisible(false);
				} else if (Card_show == 2) {
					lbl_PlayerCitizenCard_SecU.setVisible(false);
					lbl_PlayerNobilityCard_SecU.setVisible(true);
					lbl_PlayerDeathCard_SecU.setVisible(false);
				} else if (Card_show == 3) {
					lbl_PlayerCitizenCard_SecU.setVisible(false);
					lbl_PlayerNobilityCard_SecU.setVisible(false);
					lbl_PlayerDeathCard_SecU.setVisible(true);
				} else {
					;
				}
			}

		});

		btn_TU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				panel_pre.setVisible(false);
				panel_FUtalk.setVisible(false);
				panel_SecUtalk.setVisible(false);
				panel_TUtalk.setVisible(true);
				panel_ForUtalk.setVisible(false);
				panel_FifUtalk.setVisible(false);
				panel_SixUtalk.setVisible(false);
				panel_SevUtalk.setVisible(false);
				panel_EUtalk.setVisible(false);

				if (Count_TU == 0) {
					textArea_TU.append("\n\n������ ī���? ");
					phase = 1;
					User_choice = 3;
				} else if (Count_TU > 0) {
					textArea_TU.append("\n\n���� ��ȯ �Ұ��մϴ�.");
					textArea_TU.append("\n�ٸ� ������ ���� ��ȯ�ϼ���.");
				} else {
					;
				}

				if (clock == 0) {

					// ���� ī�� �ֱ�
					RandomUserCard();

					clock = 1;
					lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�.gif"))));

					Timer timer1 = new Timer();
					TimerTask task1 = new TimerTask() {
						@Override
						public void run() {
							--time;
							lbl_Timer.setText("" + time);

							if (time == 0) {
								if (pre_Card.equals("������")) {
									Score += 3;
								}

								lbl_End_Score.setText("" + Score);

								panel.setVisible(false);

								if (!Card.equals("������")) {
									if (Card.equals("����")) {
										lbl_End_Card
												.setIcon(new ImageIcon(this.getClass().getResource(("/���� �ϼ���.png"))));
									}
									panel_end.setVisible(true);
									panel_over.setVisible(false);
								} else if (Card.equals("������")) {
									panel_end.setVisible(false);
									panel_over.setVisible(true);
									System.out.println("������ �ƴ�");
								} else {
									;
								}

								panel_pre.setVisible(true);
								panel_FUtalk.setVisible(false);
								panel_SecUtalk.setVisible(false);
								panel_TUtalk.setVisible(false);
								panel_ForUtalk.setVisible(false);
								panel_FifUtalk.setVisible(false);
								panel_SixUtalk.setVisible(false);
								panel_SevUtalk.setVisible(false);
								panel_EUtalk.setVisible(false);

								timer1.cancel();
								lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�_����.png"))));
							}
						}
					};
					timer1.schedule(task1, 1000, 1000);
				}

				// �������̽� �÷��̾� ī�� ����
				int Card_show = Card_showing();
				if (Card_show == 1) {
					lbl_PlayerCitizenCard_TU.setVisible(true);
					lbl_PlayerNobilityCard_TU.setVisible(false);
					lbl_PlayerDeathCard_TU.setVisible(false);
				} else if (Card_show == 2) {
					lbl_PlayerCitizenCard_TU.setVisible(false);
					lbl_PlayerNobilityCard_TU.setVisible(true);
					lbl_PlayerDeathCard_TU.setVisible(false);
				} else if (Card_show == 3) {
					lbl_PlayerCitizenCard_TU.setVisible(false);
					lbl_PlayerNobilityCard_TU.setVisible(false);
					lbl_PlayerDeathCard_TU.setVisible(true);
				} else {
					;
				}
			}

		});

		btn_ForU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				panel_pre.setVisible(false);
				panel_FUtalk.setVisible(false);
				panel_SecUtalk.setVisible(false);
				panel_TUtalk.setVisible(false);
				panel_ForUtalk.setVisible(true);
				panel_FifUtalk.setVisible(false);
				panel_SixUtalk.setVisible(false);
				panel_SevUtalk.setVisible(false);
				panel_EUtalk.setVisible(false);

				if (Count_ForU == 0) {
					textArea_ForU.append("\n\n������ ī���? ");
					phase = 1;
					User_choice = 4;
				} else if (Count_ForU > 0) {
					textArea_ForU.append("\n\n���� ��ȯ �Ұ��մϴ�.");
					textArea_ForU.append("\n�ٸ� ������ ���� ��ȯ�ϼ���.");
				} else {
					;
				}

				if (clock == 0) {

					// ���� ī�� �ֱ�
					RandomUserCard();

					clock = 1;
					lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�.gif"))));

					Timer timer1 = new Timer();
					TimerTask task1 = new TimerTask() {
						@Override
						public void run() {
							--time;
							lbl_Timer.setText("" + time);

							if (time == 0) {
								if (pre_Card.equals("������")) {
									Score += 3;
								}

								lbl_End_Score.setText("" + Score);

								panel.setVisible(false);

								if (!Card.equals("������")) {
									if (Card.equals("����")) {
										lbl_End_Card
												.setIcon(new ImageIcon(this.getClass().getResource(("/���� �ϼ���.png"))));
									}
									panel_end.setVisible(true);
									panel_over.setVisible(false);
								} else if (Card.equals("������")) {
									panel_end.setVisible(false);
									panel_over.setVisible(true);
									System.out.println("������ �ƴ�");
								} else {
									;
								}

								panel_pre.setVisible(true);
								panel_FUtalk.setVisible(false);
								panel_SecUtalk.setVisible(false);
								panel_TUtalk.setVisible(false);
								panel_ForUtalk.setVisible(false);
								panel_FifUtalk.setVisible(false);
								panel_SixUtalk.setVisible(false);
								panel_SevUtalk.setVisible(false);
								panel_EUtalk.setVisible(false);

								timer1.cancel();
								lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�_����.png"))));
							}
						}
					};
					timer1.schedule(task1, 1000, 1000);
				}

				// �������̽� �÷��̾� ī�� ����
				int Card_show = Card_showing();
				if (Card_show == 1) {
					lbl_PlayerCitizenCard_ForU.setVisible(true);
					lbl_PlayerNobilityCard_ForU.setVisible(false);
					lbl_PlayerDeathCard_ForU.setVisible(false);
				} else if (Card_show == 2) {
					lbl_PlayerCitizenCard_ForU.setVisible(false);
					lbl_PlayerNobilityCard_ForU.setVisible(true);
					lbl_PlayerDeathCard_ForU.setVisible(false);
				} else if (Card_show == 3) {
					lbl_PlayerCitizenCard_ForU.setVisible(false);
					lbl_PlayerNobilityCard_ForU.setVisible(false);
					lbl_PlayerDeathCard_ForU.setVisible(true);
				} else {
					;
				}
			}

		});

		btn_FifU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				panel_pre.setVisible(false);
				panel_FUtalk.setVisible(false);
				panel_SecUtalk.setVisible(false);
				panel_TUtalk.setVisible(false);
				panel_ForUtalk.setVisible(false);
				panel_FifUtalk.setVisible(true);
				panel_SixUtalk.setVisible(false);
				panel_SevUtalk.setVisible(false);
				panel_EUtalk.setVisible(false);

				if (Count_FifU == 0) {
					textArea_FifU.append("\n\n������ ī���? ");
					phase = 1;
					User_choice = 5;
				} else if (Count_FifU > 0) {
					textArea_FifU.append("\n\n���� ��ȯ �Ұ��մϴ�.");
					textArea_FifU.append("\n�ٸ� ������ ���� ��ȯ�ϼ���.");
				} else {
					;
				}

				if (clock == 0) {

					// ���� ī�� �ֱ�
					RandomUserCard();

					clock = 1;
					lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�.gif"))));

					Timer timer1 = new Timer();
					TimerTask task1 = new TimerTask() {
						@Override
						public void run() {
							--time;
							lbl_Timer.setText("" + time);

							if (time == 0) {
								if (pre_Card.equals("������")) {
									Score += 3;
								}

								lbl_End_Score.setText("" + Score);

								panel.setVisible(false);

								if (!Card.equals("������")) {
									if (Card.equals("����")) {
										lbl_End_Card
												.setIcon(new ImageIcon(this.getClass().getResource(("/���� �ϼ���.png"))));
									}
									panel_end.setVisible(true);
									panel_over.setVisible(false);
								} else if (Card.equals("������")) {
									panel_end.setVisible(false);
									panel_over.setVisible(true);
									System.out.println("������ �ƴ�");
								} else {
									;
								}

								panel_pre.setVisible(true);
								panel_FUtalk.setVisible(false);
								panel_SecUtalk.setVisible(false);
								panel_TUtalk.setVisible(false);
								panel_ForUtalk.setVisible(false);
								panel_FifUtalk.setVisible(false);
								panel_SixUtalk.setVisible(false);
								panel_SevUtalk.setVisible(false);
								panel_EUtalk.setVisible(false);

								timer1.cancel();
								lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�_����.png"))));
							}
						}
					};
					timer1.schedule(task1, 1000, 1000);
				}

				// �������̽� �÷��̾� ī�� ����
				int Card_show = Card_showing();
				if (Card_show == 1) {
					lbl_PlayerCitizenCard_FifU.setVisible(true);
					lbl_PlayerNobilityCard_FifU.setVisible(false);
					lbl_PlayerDeathCard_FifU.setVisible(false);
				} else if (Card_show == 2) {
					lbl_PlayerCitizenCard_FifU.setVisible(false);
					lbl_PlayerNobilityCard_FifU.setVisible(true);
					lbl_PlayerDeathCard_FifU.setVisible(false);
				} else if (Card_show == 3) {
					lbl_PlayerCitizenCard_FifU.setVisible(false);
					lbl_PlayerNobilityCard_FifU.setVisible(false);
					lbl_PlayerDeathCard_FifU.setVisible(true);
				} else {
					;
				}
			}

		});

		btn_SixU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				panel_pre.setVisible(false);
				panel_FUtalk.setVisible(false);
				panel_SecUtalk.setVisible(false);
				panel_TUtalk.setVisible(false);
				panel_ForUtalk.setVisible(false);
				panel_FifUtalk.setVisible(false);
				panel_SixUtalk.setVisible(true);
				panel_SevUtalk.setVisible(false);
				panel_EUtalk.setVisible(false);

				if (Count_SixU == 0) {
					textArea_SixU.append("\n\n������ ī���? ");
					phase = 1;
					User_choice = 6;
				} else if (Count_SixU > 0) {
					textArea_SixU.append("\n\n���� ��ȯ �Ұ��մϴ�.");
					textArea_SixU.append("\n�ٸ� ������ ���� ��ȯ�ϼ���.");
				} else {
					;
				}

				if (clock == 0) {

					// ���� ī�� �ֱ�
					RandomUserCard();

					clock = 1;
					lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�.gif"))));

					Timer timer1 = new Timer();
					TimerTask task1 = new TimerTask() {
						@Override
						public void run() {
							--time;
							lbl_Timer.setText("" + time);

							if (time == 0) {
								if (pre_Card.equals("������")) {
									Score += 3;
								}

								lbl_End_Score.setText("" + Score);

								panel.setVisible(false);

								if (!Card.equals("������")) {
									if (Card.equals("����")) {
										lbl_End_Card
												.setIcon(new ImageIcon(this.getClass().getResource(("/���� �ϼ���.png"))));
									}
									panel_end.setVisible(true);
									panel_over.setVisible(false);
								} else if (Card.equals("������")) {
									panel_end.setVisible(false);
									panel_over.setVisible(true);
									System.out.println("������ �ƴ�");
								} else {
									;
								}

								panel_pre.setVisible(true);
								panel_FUtalk.setVisible(false);
								panel_SecUtalk.setVisible(false);
								panel_TUtalk.setVisible(false);
								panel_ForUtalk.setVisible(false);
								panel_FifUtalk.setVisible(false);
								panel_SixUtalk.setVisible(false);
								panel_SevUtalk.setVisible(false);
								panel_EUtalk.setVisible(false);

								timer1.cancel();
								lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�_����.png"))));
							}
						}
					};
					timer1.schedule(task1, 1000, 1000);
				}

				// �������̽� �÷��̾� ī�� ����
				int Card_show = Card_showing();
				if (Card_show == 1) {
					lbl_PlayerCitizenCard_SixU.setVisible(true);
					lbl_PlayerNobilityCard_SixU.setVisible(false);
					lbl_PlayerDeathCard_SixU.setVisible(false);
				} else if (Card_show == 2) {
					lbl_PlayerCitizenCard_SixU.setVisible(false);
					lbl_PlayerNobilityCard_SixU.setVisible(true);
					lbl_PlayerDeathCard_SixU.setVisible(false);
				} else if (Card_show == 3) {
					lbl_PlayerCitizenCard_SixU.setVisible(false);
					lbl_PlayerNobilityCard_SixU.setVisible(false);
					lbl_PlayerDeathCard_SixU.setVisible(true);
				} else {
					;
				}
			}

		});

		btn_SevU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				panel_pre.setVisible(false);
				panel_FUtalk.setVisible(false);
				panel_SecUtalk.setVisible(false);
				panel_TUtalk.setVisible(false);
				panel_ForUtalk.setVisible(false);
				panel_FifUtalk.setVisible(false);
				panel_SixUtalk.setVisible(false);
				panel_SevUtalk.setVisible(true);
				panel_EUtalk.setVisible(false);

				if (Count_SevU == 0) {
					textArea_SevU.append("\n\n������ ī���? ");
					phase = 1;
					User_choice = 7;
				} else if (Count_SevU > 0) {
					textArea_SevU.append("\n\n���� ��ȯ �Ұ��մϴ�.");
					textArea_SevU.append("\n�ٸ� ������ ���� ��ȯ�ϼ���.");
				} else {
					;
				}

				if (clock == 0) {

					// ���� ī�� �ֱ�
					RandomUserCard();

					clock = 1;
					lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�.gif"))));

					Timer timer1 = new Timer();
					TimerTask task1 = new TimerTask() {
						@Override
						public void run() {
							--time;
							lbl_Timer.setText("" + time);

							if (time == 0) {
								if (pre_Card.equals("������")) {
									Score += 3;
								}

								lbl_End_Score.setText("" + Score);

								panel.setVisible(false);

								if (!Card.equals("������")) {
									if (Card.equals("����")) {
										lbl_End_Card
												.setIcon(new ImageIcon(this.getClass().getResource(("/���� �ϼ���.png"))));
									}
									panel_end.setVisible(true);
									panel_over.setVisible(false);
								} else if (Card.equals("������")) {
									panel_end.setVisible(false);
									panel_over.setVisible(true);
									System.out.println("������ �ƴ�");
								} else {
									;
								}

								panel_pre.setVisible(true);
								panel_FUtalk.setVisible(false);
								panel_SecUtalk.setVisible(false);
								panel_TUtalk.setVisible(false);
								panel_ForUtalk.setVisible(false);
								panel_FifUtalk.setVisible(false);
								panel_SixUtalk.setVisible(false);
								panel_SevUtalk.setVisible(false);
								panel_EUtalk.setVisible(false);

								timer1.cancel();
								lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�_����.png"))));
							}
						}
					};
					timer1.schedule(task1, 1000, 1000);
				}

				// �������̽� �÷��̾� ī�� ����
				int Card_show = Card_showing();
				if (Card_show == 1) {
					lbl_PlayerCitizenCard_SevU.setVisible(true);
					lbl_PlayerNobilityCard_SevU.setVisible(false);
					lbl_PlayerDeathCard_SevU.setVisible(false);
				} else if (Card_show == 2) {
					lbl_PlayerCitizenCard_SevU.setVisible(false);
					lbl_PlayerNobilityCard_SevU.setVisible(true);
					lbl_PlayerDeathCard_SevU.setVisible(false);
				} else if (Card_show == 3) {
					lbl_PlayerCitizenCard_SevU.setVisible(false);
					lbl_PlayerNobilityCard_SevU.setVisible(false);
					lbl_PlayerDeathCard_SevU.setVisible(true);
				} else {
					;
				}
			}

		});

		btn_EU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				panel_pre.setVisible(false);
				panel_FUtalk.setVisible(false);
				panel_SecUtalk.setVisible(false);
				panel_TUtalk.setVisible(false);
				panel_ForUtalk.setVisible(false);
				panel_FifUtalk.setVisible(false);
				panel_SixUtalk.setVisible(false);
				panel_SevUtalk.setVisible(false);
				panel_EUtalk.setVisible(true);

				if (Count_EU == 0) {
					textArea_EU.append("\n\n������ ī���? ");
					phase = 1;
					User_choice = 8;
				} else if (Count_EU > 0) {
					textArea_EU.append("\n\n���� ��ȯ �Ұ��մϴ�.");
					textArea_EU.append("\n�ٸ� ������ ���� ��ȯ�ϼ���.");
				} else {
					;
				}

				if (clock == 0) {

					// ���� ī�� �ֱ�
					RandomUserCard();

					clock = 1;
					lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�.gif"))));

					Timer timer1 = new Timer();
					TimerTask task1 = new TimerTask() {
						@Override
						public void run() {
							--time;
							lbl_Timer.setText("" + time);

							if (time == 0) {
								if (pre_Card.equals("������")) {
									Score += 3;
								}

								lbl_End_Score.setText("" + Score);

								panel.setVisible(false);

								if (!Card.equals("������")) {
									if (Card.equals("����")) {
										lbl_End_Card
												.setIcon(new ImageIcon(this.getClass().getResource(("/���� �ϼ���.png"))));
									}
									panel_end.setVisible(true);
									panel_over.setVisible(false);
								} else if (Card.equals("������")) {
									panel_end.setVisible(false);
									panel_over.setVisible(true);
									System.out.println("������ �ƴ�");
								} else {
									;
								}

								panel_pre.setVisible(true);
								panel_FUtalk.setVisible(false);
								panel_SecUtalk.setVisible(false);
								panel_TUtalk.setVisible(false);
								panel_ForUtalk.setVisible(false);
								panel_FifUtalk.setVisible(false);
								panel_SixUtalk.setVisible(false);
								panel_SevUtalk.setVisible(false);
								panel_EUtalk.setVisible(false);

								timer1.cancel();
								lbl_clock.setIcon(new ImageIcon(this.getClass().getResource(("/Ź��ð� �ϼ�_����.png"))));
							}
						}
					};
					timer1.schedule(task1, 1000, 1000);
				}

				// �������̽� �÷��̾� ī�� ����
				int Card_show = Card_showing();
				if (Card_show == 1) {
					lbl_PlayerCitizenCard_EU.setVisible(true);
					lbl_PlayerNobilityCard_EU.setVisible(false);
					lbl_PlayerDeathCard_EU.setVisible(false);
				} else if (Card_show == 2) {
					lbl_PlayerCitizenCard_EU.setVisible(false);
					lbl_PlayerNobilityCard_EU.setVisible(true);
					lbl_PlayerDeathCard_EU.setVisible(false);
				} else if (Card_show == 3) {
					lbl_PlayerCitizenCard_EU.setVisible(false);
					lbl_PlayerNobilityCard_EU.setVisible(false);
					lbl_PlayerDeathCard_EU.setVisible(true);
				} else {
					;
				}
			}

		});
		
		// ���� ���
		Music introMusic = new Music("introMusic.mp3", true);
		introMusic.start();
		
	}

	public void RandomUserCard() {
		int[] numbers = new int[9];

		for (int insertCur = 0; insertCur < numbers.length; insertCur++) {
			numbers[insertCur] = (int) (Math.random() * 9);

			for (int searchCur = 0; searchCur < insertCur; searchCur++) {
				if (numbers[insertCur] == numbers[searchCur]) {
					insertCur--;
					break;
				}
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (i > 0) {
			}
		}

		// String[] UserCard = { Card, FU.Card, SecU.Card, TU.Card, ForU.Card,
		// FifU.Card, SixU.Card, SevU.Card, EU.Card };

		switch (numbers[0]) {
		case 0:
			Card = "������";
			break;
		case 1:
			Card = "����";
			break;
		case 2:
			Card = "����";
			break;
		case 3:
			Card = "����";
			break;
		case 4:
			Card = "�ù�";
			break;
		case 5:
			Card = "�ù�";
			break;
		case 6:
			Card = "�ù�";
			break;
		case 7:
			Card = "�ù�";
			break;
		case 8:
			Card = "�ù�";
			break;
		}
		switch (numbers[1]) {
		case 0:
			FU.Card = "������";
			break;
		case 1:
			FU.Card = "����";
			break;
		case 2:
			FU.Card = "����";
			break;
		case 3:
			FU.Card = "����";
			break;
		case 4:
			FU.Card = "�ù�";
			break;
		case 5:
			FU.Card = "�ù�";
			break;
		case 6:
			FU.Card = "�ù�";
			break;
		case 7:
			FU.Card = "�ù�";
			break;
		case 8:
			FU.Card = "�ù�";
			break;
		}
		switch (numbers[2]) {
		case 0:
			SecU.Card = "������";
			break;
		case 1:
			SecU.Card = "����";
			break;
		case 2:
			SecU.Card = "����";
			break;
		case 3:
			SecU.Card = "����";
			break;
		case 4:
			SecU.Card = "�ù�";
			break;
		case 5:
			SecU.Card = "�ù�";
			break;
		case 6:
			SecU.Card = "�ù�";
			break;
		case 7:
			SecU.Card = "�ù�";
			break;
		case 8:
			SecU.Card = "�ù�";
			break;
		}
		switch (numbers[3]) {
		case 0:
			TU.Card = "������";
			break;
		case 1:
			TU.Card = "����";
			break;
		case 2:
			TU.Card = "����";
			break;
		case 3:
			TU.Card = "����";
			break;
		case 4:
			TU.Card = "�ù�";
			break;
		case 5:
			TU.Card = "�ù�";
			break;
		case 6:
			TU.Card = "�ù�";
			break;
		case 7:
			TU.Card = "�ù�";
			break;
		case 8:
			TU.Card = "�ù�";
			break;
		}
		switch (numbers[4]) {
		case 0:
			ForU.Card = "������";
			break;
		case 1:
			ForU.Card = "����";
			break;
		case 2:
			ForU.Card = "����";
			break;
		case 3:
			ForU.Card = "����";
			break;
		case 4:
			ForU.Card = "�ù�";
			break;
		case 5:
			ForU.Card = "�ù�";
			break;
		case 6:
			ForU.Card = "�ù�";
			break;
		case 7:
			ForU.Card = "�ù�";
			break;
		case 8:
			ForU.Card = "�ù�";
			break;
		}
		switch (numbers[5]) {
		case 0:
			FifU.Card = "������";
			break;
		case 1:
			FifU.Card = "����";
			break;
		case 2:
			FifU.Card = "����";
			break;
		case 3:
			FifU.Card = "����";
			break;
		case 4:
			FifU.Card = "�ù�";
			break;
		case 5:
			FifU.Card = "�ù�";
			break;
		case 6:
			FifU.Card = "�ù�";
			break;
		case 7:
			FifU.Card = "�ù�";
			break;
		case 8:
			FifU.Card = "�ù�";
			break;
		}
		switch (numbers[6]) {
		case 0:
			SixU.Card = "������";
			break;
		case 1:
			SixU.Card = "����";
			break;
		case 2:
			SixU.Card = "����";
			break;
		case 3:
			SixU.Card = "����";
			break;
		case 4:
			SixU.Card = "�ù�";
			break;
		case 5:
			SixU.Card = "�ù�";
			break;
		case 6:
			SixU.Card = "�ù�";
			break;
		case 7:
			SixU.Card = "�ù�";
			break;
		case 8:
			SixU.Card = "�ù�";
			break;
		}
		switch (numbers[7]) {
		case 0:
			SevU.Card = "������";
			break;
		case 1:
			SevU.Card = "����";
			break;
		case 2:
			SevU.Card = "����";
			break;
		case 3:
			SevU.Card = "����";
			break;
		case 4:
			SevU.Card = "�ù�";
			break;
		case 5:
			SevU.Card = "�ù�";
			break;
		case 6:
			SevU.Card = "�ù�";
			break;
		case 7:
			SevU.Card = "�ù�";
			break;
		case 8:
			SevU.Card = "�ù�";
			break;
		}
		switch (numbers[8]) {
		case 0:
			EU.Card = "������";
			break;
		case 1:
			EU.Card = "����";
			break;
		case 2:
			EU.Card = "����";
			break;
		case 3:
			EU.Card = "����";
			break;
		case 4:
			EU.Card = "�ù�";
			break;
		case 5:
			EU.Card = "�ù�";
			break;
		case 6:
			EU.Card = "�ù�";
			break;
		case 7:
			EU.Card = "�ù�";
			break;
		case 8:
			EU.Card = "�ù�";
			break;
		}

	}

	public int phase1() {

		// ù��° ����
		if (User_choice == 1) {

			text_Card = textField_FU.getText();
			textField_FU.setText("");

			if (text_Card.equals("�ù�")) {
				return 1;
			} else if (text_Card.equals("����")) {
				return 2;
			} else if (text_Card.equals("������")) {
				return 3;
			} else {
				return 4;
			}
		}
		// �ι�° ����
		else if (User_choice == 2) {

			text_Card = textField_SecU.getText();
			textField_SecU.setText("");

			if (text_Card.equals("�ù�")) {
				return 1;
			} else if (text_Card.equals("����")) {
				return 2;
			} else if (text_Card.equals("������")) {
				return 3;
			} else {
				return 4;
			}
		}
		// ����° ����
		else if (User_choice == 3) {

			text_Card = textField_TU.getText();
			textField_TU.setText("");

			if (text_Card.equals("�ù�")) {
				return 1;
			} else if (text_Card.equals("����")) {
				return 2;
			} else if (text_Card.equals("������")) {
				return 3;
			} else {
				return 4;
			}
		}
		// �׹�° ����
		else if (User_choice == 4) {

			text_Card = textField_ForU.getText();
			textField_ForU.setText("");

			if (text_Card.equals("�ù�")) {
				return 1;
			} else if (text_Card.equals("����")) {
				return 2;
			} else if (text_Card.equals("������")) {
				return 3;
			} else {
				return 4;
			}
		}
		// �ټ���° ����
		else if (User_choice == 5) {

			text_Card = textField_FifU.getText();
			textField_FifU.setText("");

			if (text_Card.equals("�ù�")) {
				return 1;
			} else if (text_Card.equals("����")) {
				return 2;
			} else if (text_Card.equals("������")) {
				return 3;
			} else {
				return 4;
			}
		}
		// ������° ����
		else if (User_choice == 6) {

			text_Card = textField_SixU.getText();
			textField_SixU.setText("");

			if (text_Card.equals("�ù�")) {
				return 1;
			} else if (text_Card.equals("����")) {
				return 2;
			} else if (text_Card.equals("������")) {
				return 3;
			} else {
				return 4;
			}
		}
		// �ϰ���° ����
		else if (User_choice == 7) {

			text_Card = textField_SevU.getText();
			textField_SevU.setText("");

			if (text_Card.equals("�ù�")) {
				return 1;
			} else if (text_Card.equals("����")) {
				return 2;
			} else if (text_Card.equals("������")) {
				return 3;
			} else {
				return 4;
			}
		}
		// �ϰ���° ����
		else if (User_choice == 8) {

			text_Card = textField_EU.getText();
			textField_EU.setText("");

			if (text_Card.equals("�ù�")) {
				return 1;
			} else if (text_Card.equals("����")) {
				return 2;
			} else if (text_Card.equals("������")) {
				return 3;
			} else {
				return 4;
			}
		} else {
			return 4;
		}
	}

	public int phase2() {

		// ù��° ������ ��
		if (User_choice == 1) {

			text = textField_FU.getText();
			textField_FU.setText("");

			if (text.equals("��")) {
				FU_Exchanging = FU.Exchanging(Card_preference);
				if (FU.Exchanging(Card_preference) >= 5) { // 5����, ���� 5���� �ŷ� ���� ����.
					// ��ȯ ����
					return 1;
				} else {
					// ��ȯ ��ȣ�� ����
					return 2;
				}
			} else if (text.equals("�ƴϿ�")) {
				// ��ȯ ����
				return 0;
			} else {
				// �߸��� �Է�
				return 4;
			}

		}
		// �ι�° ������ ��
		else if (User_choice == 2) {

			text = textField_SecU.getText();
			textField_SecU.setText("");

			if (text.equals("��")) {
				SecU_Exchanging = SecU.Exchanging(Card_preference);
				if (SecU.Exchanging(Card_preference) >= 5) { // 5����, ���� 5���� �ŷ� ���� ����.
					// ��ȯ ����
					return 1;
				} else {
					// ��ȯ ��ȣ�� ����
					return 2;
				}
			} else if (text.equals("�ƴϿ�")) {
				// ��ȯ ����
				return 0;
			} else {
				// �߸��� �Է�
				return 4;
			}

		}
		// ����° ������ ��
		else if (User_choice == 3) {

			text = textField_TU.getText();
			textField_TU.setText("");

			if (text.equals("��")) {
				TU_Exchanging = TU.Exchanging(Card_preference);
				if (TU.Exchanging(Card_preference) >= 5) { // 5����, ���� 5���� �ŷ� ���� ����.
					// ��ȯ ����
					return 1;
				} else {
					// ��ȯ ��ȣ�� ����
					return 2;
				}
			} else if (text.equals("�ƴϿ�")) {
				// ��ȯ ����
				return 0;
			} else {
				// �߸��� �Է�
				return 4;
			}

		}
		// �׹�° ������ ��
		else if (User_choice == 4) {

			text = textField_ForU.getText();
			textField_ForU.setText("");

			if (text.equals("��")) {
				ForU_Exchanging = ForU.Exchanging(Card_preference);
				if (ForU.Exchanging(Card_preference) >= 5) { // 5����, ���� 5���� �ŷ� ���� ����.
					// ��ȯ ����
					return 1;
				} else {
					// ��ȯ ��ȣ�� ����
					return 2;
				}
			} else if (text.equals("�ƴϿ�")) {
				// ��ȯ ����
				return 0;
			} else {
				// �߸��� �Է�
				return 4;
			}

		}
		// �ټ���° ����
		else if (User_choice == 5) {

			text = textField_FifU.getText();
			textField_FifU.setText("");

			if (text.equals("��")) {
				FifU_Exchanging = FifU.Exchanging(Card_preference);
				if (FifU.Exchanging(Card_preference) >= 5) { // 5����, ���� 5���� �ŷ� ���� ����.
					// ��ȯ ����
					return 1;
				} else {
					// ��ȯ ��ȣ�� ����
					return 2;
				}
			} else if (text.equals("�ƴϿ�")) {
				// ��ȯ ����
				return 0;
			} else {
				// �߸��� �Է�
				return 4;
			}

		}
		// ������° ����
		else if (User_choice == 6) {

			text = textField_SixU.getText();
			textField_SixU.setText("");

			if (text.equals("��")) {
				SixU_Exchanging = SixU.Exchanging(Card_preference);
				if (SixU.Exchanging(Card_preference) >= 5) { // 5����, ���� 5���� �ŷ� ���� ����.
					// ��ȯ ����
					return 1;
				} else {
					// ��ȯ ��ȣ�� ����
					return 2;
				}
			} else if (text.equals("�ƴϿ�")) {
				// ��ȯ ����
				return 0;
			} else {
				// �߸��� �Է�
				return 4;
			}

		}
		// �ϰ���° ����
		else if (User_choice == 7) {

			text = textField_SevU.getText();
			textField_SevU.setText("");

			if (text.equals("��")) {
				SevU_Exchanging = SevU.Exchanging(Card_preference);
				if (SevU.Exchanging(Card_preference) >= 5) { // 5����, ���� 5���� �ŷ� ���� ����.
					// ��ȯ ����
					return 1;
				} else {
					// ��ȯ ��ȣ�� ����
					return 2;
				}
			} else if (text.equals("�ƴϿ�")) {
				// ��ȯ ����
				return 0;
			} else {
				// �߸��� �Է�
				return 4;
			}

		}
		// ������° ����
		else if (User_choice == 8) {

			text = textField_EU.getText();
			textField_EU.setText("");

			if (text.equals("��")) {
				EU_Exchanging = EU.Exchanging(Card_preference);
				if (EU.Exchanging(Card_preference) >= 5) { // 5����, ���� 5���� �ŷ� ���� ����.
					// ��ȯ ����
					return 1;
				} else {
					// ��ȯ ��ȣ�� ����
					return 2;
				}
			} else if (text.equals("�ƴϿ�")) {
				// ��ȯ ����
				return 0;
			} else {
				// �߸��� �Է�
				return 4;
			}

		}
		// �߸��� ������ ��
		else {
			return 4;
		}
	}

	// ������ȭ �Լ�
	public String Random_talk(int a) {
		Random random = new Random();
		// ��ȣ�� ��
		if (a == 1) {
			int Random_result;
			Random_result = random.nextInt(5); // 0 ~ 4 ������ ����
			if (Random_result == 0) {
				return "��.. ����";
			} else if (Random_result == 1) {
				return "����!";
			} else if (Random_result == 2) {
				return "���� ���";
			} else if (Random_result == 3) {
				return "���� ������ �ʿ��� ī���";
			} else if (Random_result == 4) {
				return "�� ���� ��°�?";
			} else {
				return "����";
			}
		}
		// ��ȣ���� ���� ��
		else if (a == 2) {
			int Random_result;
			Random_result = random.nextInt(5); // 0 ~ 4 ������ ����
			if (Random_result == 0) {
				return "���ξ�";
			} else if (Random_result == 1) {
				return "�� �ٸ� ī�尡 �ʿ���";
			} else if (Random_result == 2) {
				return "���� �ȵ��";
			} else if (Random_result == 3) {
				return "������ ���� �ʿ����";
			} else if (Random_result == 4) {
				return "�ٸ� ��� �˾ƺ�";
			} else {
				return "����";
			}
		}
		// ��Ǳ�ȯ��
		else if (a == 3) {
			int Random_result;
			Random_result = random.nextInt(5); // 0 ~ 4 ������ ����
			if (Random_result == 0) {
				return "����!";
			} else if (Random_result == 1) {
				return "�������� ��ȯ����";
			} else if (Random_result == 2) {
				return "��Ǵ�� �����༭ ����";
			} else if (Random_result == 3) {
				return "���� ��ȯ�̾���";
			} else if (Random_result == 4) {
				return "���� �� ī���. ����";
			} else {
				return "����";
			}
		}
		// ������ȯ��
		else if (a == 4) {
			int Random_result;
			Random_result = random.nextInt(5); // 0 ~ 4 ������ ����
			if (Random_result == 0) {
				return "�� �峭��? �ϰ� ���� ī��� �ٸ��ݾ�";
			} else if (Random_result == 1) {
				return "��, �������Ѱž�?";
			} else if (Random_result == 2) {
				return "�ٸ� ī���ݾ�..? ��� �Ȱž�?";
			} else if (Random_result == 3) {
				return "�̷� �Ӿ��ݾ�!";
			} else if (Random_result == 4) {
				return "����� ī��� �ٸ��ݾ�..?";
			} else {
				return "����";
			}
		}
		// ��ȯ ������
		else if (a == 5) {
			int Random_result;
			Random_result = random.nextInt(5); // 0 ~ 4 ������ ����
			if (Random_result == 0) {
				return "�ƽ���";
			} else if (Random_result == 1) {
				return "���� �ȵ��?";
			} else if (Random_result == 2) {
				return "��¿ �� ����";
			} else if (Random_result == 3) {
				return "�ƽ��� �Ƴ�";
			} else if (Random_result == 4) {
				return "�׷�? ������ �ٽ� ��ȭ����";
			} else {
				return "����";
			}
		}
		// ȣ���� ������
		else if (a == 6) {
			int Random_result;
			Random_result = random.nextInt(5); // 0 ~ 4 ������ ����
			if (Random_result == 0) {
				return "����δ��� Ŀ";
			} else if (Random_result == 1) {
				return "ī��� ��������.. �ƽ���";
			} else if (Random_result == 2) {
				return "���δ�� ��ȯ�ϱ� �� �׷�";
			} else if (Random_result == 3) {
				return "Ȯ���� �ȵ��";
			} else if (Random_result == 4) {
				return "��Ÿ������ ������ �� ����";
			} else {
				return "����";
			}
		} else {
			return "����";
		}

	}

	// ������� �Լ�, ī�� ��ȯ�Ǳ� ������ ���
	public int Score_gaining() {

		// ù��° ������ ��
		if (User_choice == 1) {
			if (Card.equals("����") && FU.Card.equals("�ù�")) {
				Score += 1;
				return 1;
			} else if (Card.equals("������") && FU.Card.equals("�ù�")) {
				Score += 2;
				return 2;
			}
			// ���� ȹ�� ����
			else {
				return 0;
			}
		}
		// �ι�° ������ ��
		else if (User_choice == 2) {
			if (Card.equals("����") && SecU.Card.equals("�ù�")) {
				Score += 1;
				return 1;
			} else if (Card.equals("������") && SecU.Card.equals("�ù�")) {
				Score += 2;
				return 2;
			}
			// ���� ȹ�� ����
			else {
				return 0;
			}
		}
		// ����° ������ ��
		else if (User_choice == 3) {
			if (Card.equals("����") && TU.Card.equals("�ù�")) {
				Score += 1;
				return 1;
			} else if (Card.equals("������") && TU.Card.equals("�ù�")) {
				Score += 2;
				return 2;
			}
			// ���� ȹ�� ����
			else {
				return 0;
			}
		}
		// �׹�° ������ ��
		else if (User_choice == 4) {
			if (Card.equals("����") && ForU.Card.equals("�ù�")) {
				Score += 1;
				return 1;
			} else if (Card.equals("������") && ForU.Card.equals("�ù�")) {
				Score += 2;
				return 2;
			}
			// ���� ȹ�� ����
			else {
				return 0;
			}
		}
		// �ټ���° ������ ��
		else if (User_choice == 5) {
			if (Card.equals("����") && FifU.Card.equals("�ù�")) {
				Score += 1;
				return 1;
			} else if (Card.equals("������") && FifU.Card.equals("�ù�")) {
				Score += 2;
				return 2;
			}
			// ���� ȹ�� ����
			else {
				return 0;
			}
		}
		// ������° ������ ��
		else if (User_choice == 6) {
			if (Card.equals("����") && SixU.Card.equals("�ù�")) {
				Score += 1;
				return 1;
			} else if (Card.equals("������") && SixU.Card.equals("�ù�")) {
				Score += 2;
				return 2;
			}
			// ���� ȹ�� ����
			else {
				return 0;
			}
		}
		// �ϰ���° ������ ��
		else if (User_choice == 7) {
			if (Card.equals("����") && SevU.Card.equals("�ù�")) {
				Score += 1;
				return 1;
			} else if (Card.equals("������") && SevU.Card.equals("�ù�")) {
				Score += 2;
				return 2;
			}
			// ���� ȹ�� ����
			else {
				return 0;
			}
		}
		// ������° ������ ��
		else if (User_choice == 8) {
			if (Card.equals("����") && EU.Card.equals("�ù�")) {
				Score += 1;
				return 1;
			} else if (Card.equals("������") && EU.Card.equals("�ù�")) {
				Score += 2;
				return 2;
			}
			// ���� ȹ�� ����
			else {
				return 0;
			}
		}
		// �߸��� ������ ��
		else {
			return 0;
		}

	}

	// ī�屳ȯ�Լ�
	public int Exchanging() {

		// ù��° ������ ��
		if (User_choice == 1) {
			if (text_Card.equals(Card)) {
				++First_preference;
				String temp = Card;
				Card = FU.Card;
				FU.Card = temp;
				pre_Card = temp;
				return 1;
			} else {
				--First_preference;
				String temp = Card;
				Card = FU.Card;
				FU.Card = temp;
				pre_Card = temp;
				return 2;
			}
		}
		// �ι�° ������ ��
		if (User_choice == 2) {
			if (text_Card.equals(Card)) {
				++Second_preference;
				String temp = Card;
				Card = SecU.Card;
				SecU.Card = temp;
				pre_Card = temp;
				return 1;
			} else {
				--Second_preference;
				String temp = Card;
				Card = SecU.Card;
				SecU.Card = temp;
				pre_Card = temp;
				return 2;
			}
		}
		// ����° ������ ��
		if (User_choice == 3) {
			if (text_Card.equals(Card)) {
				++Third_preference;
				String temp = Card;
				Card = TU.Card;
				TU.Card = temp;
				pre_Card = temp;
				return 1;
			} else {
				--Third_preference;
				String temp = Card;
				Card = TU.Card;
				TU.Card = temp;
				pre_Card = temp;
				return 2;
			}
		}
		// �׹�° ������ ��
		if (User_choice == 4) {
			if (text_Card.equals(Card)) {
				++Forth_preference;
				String temp = Card;
				Card = ForU.Card;
				ForU.Card = temp;
				pre_Card = temp;
				return 1;
			} else {
				--Forth_preference;
				String temp = Card;
				Card = ForU.Card;
				ForU.Card = temp;
				pre_Card = temp;
				return 2;
			}
		}
		// �ټ���° ������ ��
		if (User_choice == 5) {
			if (text_Card.equals(Card)) {
				++Fifth_preference;
				String temp = Card;
				Card = FifU.Card;
				FifU.Card = temp;
				pre_Card = temp;
				return 1;
			} else {
				--Fifth_preference;
				String temp = Card;
				Card = FifU.Card;
				FifU.Card = temp;
				pre_Card = temp;
				return 2;
			}
		}
		// ������° ������ ��
		if (User_choice == 6) {
			if (text_Card.equals(Card)) {
				++Sixth_preference;
				String temp = Card;
				Card = SixU.Card;
				SixU.Card = temp;
				pre_Card = temp;
				return 1;
			} else {
				--Sixth_preference;
				String temp = Card;
				Card = SixU.Card;
				SixU.Card = temp;
				pre_Card = temp;
				return 2;
			}
		}
		// �ϰ���° ������ ��
		if (User_choice == 7) {
			if (text_Card.equals(Card)) {
				++Seventh_preference;
				String temp = Card;
				Card = SevU.Card;
				SevU.Card = temp;
				pre_Card = temp;
				return 1;
			} else {
				--Seventh_preference;
				String temp = Card;
				Card = SevU.Card;
				SevU.Card = temp;
				pre_Card = temp;
				return 2;
			}
		}
		// ������° ������ ��
		if (User_choice == 8) {
			if (text_Card.equals(Card)) {
				++Eighth_preference;
				String temp = Card;
				Card = EU.Card;
				EU.Card = temp;
				pre_Card = temp;
				return 1;
			} else {
				--Eighth_preference;
				String temp = Card;
				Card = EU.Card;
				EU.Card = temp;
				pre_Card = temp;
				return 2;
			}
		}
		// �߸��� ������ ��
		else {
			return 0;
		}
	}

	public int Card_showing() {
		if (Card.equals("�ù�")) {
			return 1;
		} else if (Card.equals("����")) {
			return 2;
		} else if (Card.equals("������")) {
			return 3;
		} else {
			return 4;
		}
	}

	public void Count(int a) {
		if (a == 1) {
			Count_FU = 2;
			--Count_SecU;
			--Count_TU;
			--Count_ForU;
			--Count_FifU;
			--Count_SixU;
			--Count_SevU;
			--Count_EU;
		} else if (a == 2) {
			Count_SecU = 2;
			--Count_FU;
			--Count_TU;
			--Count_ForU;
			--Count_FifU;
			--Count_SixU;
			--Count_SevU;
			--Count_EU;
		} else if (a == 3) {
			Count_TU = 2;
			--Count_FU;
			--Count_SecU;
			--Count_ForU;
			--Count_FifU;
			--Count_SixU;
			--Count_SevU;
			--Count_EU;
		} else if (a == 4) {
			Count_ForU = 2;
			--Count_FU;
			--Count_SecU;
			--Count_TU;
			--Count_FifU;
			--Count_SixU;
			--Count_SevU;
			--Count_EU;
		} else if (a == 5) {
			Count_FifU = 2;
			--Count_FU;
			--Count_SecU;
			--Count_TU;
			--Count_ForU;
			--Count_SixU;
			--Count_SevU;
			--Count_EU;
		}
		if (a == 6) {
			Count_SixU = 2;
			--Count_FU;
			--Count_SecU;
			--Count_TU;
			--Count_ForU;
			--Count_FifU;
			--Count_SevU;
			--Count_EU;
		} else if (a == 7) {
			Count_SevU = 2;
			--Count_ForU;
			--Count_SecU;
			--Count_TU;
			--Count_ForU;
			--Count_FifU;
			--Count_SixU;
			--Count_EU;
		} else if (a == 8) {
			Count_EU = 2;
			--Count_FU;
			--Count_SecU;
			--Count_TU;
			--Count_ForU;
			--Count_FifU;
			--Count_SixU;
			--Count_SevU;
		} else {
			;
		}

		if (Count_FU < 0) {
			Count_FU = 0;
		}
		if (Count_SecU < 0) {
			Count_SecU = 0;
		}
		if (Count_TU < 0) {
			Count_TU = 0;
		}
		if (Count_ForU < 0) {
			Count_ForU = 0;
		}
		if (Count_FifU < 0) {
			Count_FifU = 0;
		}
		if (Count_SixU < 0) {
			Count_SixU = 0;
		}
		if (Count_SevU < 0) {
			Count_SevU = 0;
		}
		if (Count_EU < 0) {
			Count_EU = 0;
		}

	}

	public void UserExchanging() {

	}

}

class newWindow_rule extends JFrame {
	newWindow_rule() {
		setTitle("RULE");

		ImageIcon panel_rulebackground = new ImageIcon(this.getClass().getResource("/�� �̹���.png"));

		JPanel panel_rule = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_rulebackground.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		setContentPane(panel_rule);

		setBounds(33, 165, 390, 710); // Resizable �ϸ� ũ�� 10�� �þ
		setResizable(false);
		// setLocationRelativeTo(null); // ��� ����
		setVisible(true);
	}
}

class newWindow_tips extends JFrame {
	newWindow_tips() {
		setTitle("TIPS");

		ImageIcon panel_tipsbackground = new ImageIcon(this.getClass().getResource("/�� �̹���.png"));

		JPanel panel_tips = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(panel_tipsbackground.getImage(), 0, 0, null);
				setOpaque(false); // true�� ����̹����� �����
				super.paintComponent(g);
			}
		};
		setContentPane(panel_tips);

		setBounds(1497, 165, 390, 710); // Resizable �ϸ� ũ�� 10�� �þ
		setResizable(false);
		// setLocationRelativeTo(null); // ��� ����
		setVisible(true);
	}
}
