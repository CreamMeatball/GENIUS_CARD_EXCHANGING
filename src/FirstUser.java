import java.util.Random;

public class FirstUser {

	static String Card = "�ù�";
	String Name = "�ٴϿ�";
	static float Score_greed = 5;
	static float Risky = 5;
	static float Lying = 5; // ���ſ� ���ο��� ���� �÷��̾��� �������� ���� �ΰ���
						// Lying�� ���� ���� ������ ������ ���� ��������, ������ ���� ���� ������

	public float Exchanging(float a) {

		System.out.println(Lying);
		Builder3 Player = new Builder3();
		float First_preference = Player.First_preference;
		float Card_preference = a;

		FirstUser FirstUser = new FirstUser();
		float Score_greed = FirstUser.Score_greed;
		float Risky = FirstUser.Risky;
		float Lying = FirstUser.Lying;

		float Exchanging_percentage = Card_preference + ((Score_greed + Risky - 10) / 4);
		// ������ 4���� �� Exchanging_percentage�� 1�� ����

		if (Lying >= 7) {
			if (Player.First_preference <= 4) { // ������ 0�� ����
				Exchanging_percentage = 0;
			} else {
				Exchanging_percentage += (Lying / 10) * (Player.First_preference - 5);
				System.out.println("������7");
			}
		} else if ((Lying == 6) || (Lying == 5) || (Lying == 4)) {
			if (Player.First_preference <= 3) { // ������ 1�� ����
				Exchanging_percentage = 0;
			} else {
				Exchanging_percentage += (Lying / 10) * (Player.First_preference - 5);
				System.out.println("������5");
			}
		} else if (Lying <= 3) {
			if (Player.First_preference <= 2) { // ������ 2�� ����
				Exchanging_percentage = 0;
			} else {
				Exchanging_percentage += (Lying / 10) * (Player.First_preference - 5);
			}
		}

		return Exchanging_percentage;
	}

}