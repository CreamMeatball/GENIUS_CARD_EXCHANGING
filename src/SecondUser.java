public class SecondUser {

	
		static String Card = "�ù�";
		String Name = "�ι�Ʈ";
		static float Score_greed = 5;
		static float Risky = 5;
		static float Lying = 5; //���ſ� ���ο��� ���� �÷��̾��� �������� ���� �ΰ���
						//Lying�� ���� ���� ������ ������ ���� ��������, ������ ���� ���� ������
		
		public float Exchanging(float a) {
			
			Builder3 Player = new Builder3();
			float Second_preference = Player.Second_preference;
			float Card_preference = a;
			
			SecondUser SecondUser = new SecondUser();
			float Score_greed = SecondUser.Score_greed;
			float Risky = SecondUser.Risky;
			float Lying = SecondUser.Lying;
			
			float Exchanging_percentage = Card_preference+((Score_greed+Risky-10)/4);
			//������ 4���� �� Exchanging_percentage�� 1�� ����
			
			if(Lying>=7) {
				if(Player.Second_preference<=4) { // ������ 0�� ����
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Second_preference-5);
				}
			}
			else if((Lying==6)||(Lying==5)||(Lying==4)) {
				if(Player.Second_preference<=3) { // ������ 1�� ����
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Second_preference-5);
				}
			}
			else if(Lying<=3) {
				if(Player.Second_preference<=2) { // ������ 2�� ����
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Second_preference-5);
				}
			}
			
			return Exchanging_percentage;
		}
		

}