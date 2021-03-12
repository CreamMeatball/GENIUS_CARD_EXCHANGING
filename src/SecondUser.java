public class SecondUser {

	
		static String Card = "시민";
		String Name = "로버트";
		static float Score_greed = 5;
		static float Risky = 5;
		static float Lying = 5; //과거에 본인에게 행한 플레이어의 거짓말에 대한 민감도
						//Lying이 높을 수록 거짓말 안했을 때의 가산점↑, 거짓말 했을 때의 감점↑
		
		public float Exchanging(float a) {
			
			Builder3 Player = new Builder3();
			float Second_preference = Player.Second_preference;
			float Card_preference = a;
			
			SecondUser SecondUser = new SecondUser();
			float Score_greed = SecondUser.Score_greed;
			float Risky = SecondUser.Risky;
			float Lying = SecondUser.Lying;
			
			float Exchanging_percentage = Card_preference+((Score_greed+Risky-10)/4);
			//가산점 4점당 총 Exchanging_percentage는 1점 오름
			
			if(Lying>=7) {
				if(Player.Second_preference<=4) { // 거짓말 0번 봐줌
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Second_preference-5);
				}
			}
			else if((Lying==6)||(Lying==5)||(Lying==4)) {
				if(Player.Second_preference<=3) { // 거짓말 1번 봐줌
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Second_preference-5);
				}
			}
			else if(Lying<=3) {
				if(Player.Second_preference<=2) { // 거짓말 2번 봐줌
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Second_preference-5);
				}
			}
			
			return Exchanging_percentage;
		}
		

}