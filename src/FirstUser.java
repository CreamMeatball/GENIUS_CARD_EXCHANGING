import java.util.Random;

public class FirstUser {

	static String Card = "시민";
	String Name = "다니엘";
	static float Score_greed = 5;
	static float Risky = 5;
	static float Lying = 5; // 과거에 본인에게 행한 플레이어의 거짓말에 대한 민감도
						// Lying이 높을 수록 거짓말 안했을 때의 가산점↑, 거짓말 했을 때의 감점↑

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
		// 가산점 4점당 총 Exchanging_percentage는 1점 오름

		if (Lying >= 7) {
			if (Player.First_preference <= 4) { // 거짓말 0번 봐줌
				Exchanging_percentage = 0;
			} else {
				Exchanging_percentage += (Lying / 10) * (Player.First_preference - 5);
				System.out.println("지나감7");
			}
		} else if ((Lying == 6) || (Lying == 5) || (Lying == 4)) {
			if (Player.First_preference <= 3) { // 거짓말 1번 봐줌
				Exchanging_percentage = 0;
			} else {
				Exchanging_percentage += (Lying / 10) * (Player.First_preference - 5);
				System.out.println("지나감5");
			}
		} else if (Lying <= 3) {
			if (Player.First_preference <= 2) { // 거짓말 2번 봐줌
				Exchanging_percentage = 0;
			} else {
				Exchanging_percentage += (Lying / 10) * (Player.First_preference - 5);
			}
		}

		return Exchanging_percentage;
	}

}