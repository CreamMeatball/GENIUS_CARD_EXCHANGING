public class ThirdUser {

	
		static String Card = "�ù�";
		String Name = "�ٻ�";
		static float Score_greed = 5;
		static float Risky = 5;
		static float Lying = 5; //���ſ� ���ο��� ���� �÷��̾��� �������� ���� �ΰ���
						//Lying�� ���� ���� ������ ������ ���� ��������, ������ ���� ���� ������
		
		public float Exchanging(float a) {
			
			Builder3 Player = new Builder3();
			float Third_preference = Player.Third_preference;
			float Card_preference = a;
			
			ThirdUser ThirdUser = new ThirdUser();
			float Score_greed = ThirdUser.Score_greed;
			float Risky = ThirdUser.Risky;
			float Lying = ThirdUser.Lying;
			
			float Exchanging_percentage = Card_preference+((Score_greed+Risky-10)/4);
			//������ 4���� �� Exchanging_percentage�� 1�� ����
			
			if(Lying>=7) {
				if(Player.Third_preference<=4) { // ������ 0�� ����
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Third_preference-5);
				}
			}
			else if((Lying==6)||(Lying==5)||(Lying==4)) {
				if(Player.Third_preference<=3) { // ������ 1�� ����
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Third_preference-5);
				}
			}
			else if(Lying<=3) {
				if(Player.Third_preference<=2) { // ������ 2�� ����
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Third_preference-5);
				}
			}
			
			return Exchanging_percentage;
		}
		

}