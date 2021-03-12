public class ThirdUser {

	
		static String Card = "½Ã¹Î";
		String Name = "´Ù»þ";
		static float Score_greed = 5;
		static float Risky = 5;
		static float Lying = 5; //°ú°Å¿¡ º»ÀÎ¿¡°Ô ÇàÇÑ ÇÃ·¹ÀÌ¾îÀÇ °ÅÁþ¸»¿¡ ´ëÇÑ ¹Î°¨µµ
						//LyingÀÌ ³ôÀ» ¼ö·Ï °ÅÁþ¸» ¾ÈÇßÀ» ¶§ÀÇ °¡»êÁ¡¡è, °ÅÁþ¸» ÇßÀ» ¶§ÀÇ °¨Á¡¡è
		
		public float Exchanging(float a) {
			
			Builder3 Player = new Builder3();
			float Third_preference = Player.Third_preference;
			float Card_preference = a;
			
			ThirdUser ThirdUser = new ThirdUser();
			float Score_greed = ThirdUser.Score_greed;
			float Risky = ThirdUser.Risky;
			float Lying = ThirdUser.Lying;
			
			float Exchanging_percentage = Card_preference+((Score_greed+Risky-10)/4);
			//°¡»êÁ¡ 4Á¡´ç ÃÑ Exchanging_percentage´Â 1Á¡ ¿À¸§
			
			if(Lying>=7) {
				if(Player.Third_preference<=4) { // °ÅÁþ¸» 0¹ø ºÁÁÜ
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Third_preference-5);
				}
			}
			else if((Lying==6)||(Lying==5)||(Lying==4)) {
				if(Player.Third_preference<=3) { // °ÅÁþ¸» 1¹ø ºÁÁÜ
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Third_preference-5);
				}
			}
			else if(Lying<=3) {
				if(Player.Third_preference<=2) { // °ÅÁþ¸» 2¹ø ºÁÁÜ
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Third_preference-5);
				}
			}
			
			return Exchanging_percentage;
		}
		

}