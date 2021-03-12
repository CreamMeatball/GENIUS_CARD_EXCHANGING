public class SixthUser {

	
		static String Card = "½Ã¹Î";
		String Name = "¾Ø";
		static float Score_greed = 5;
		static float Risky = 5;
		static float Lying = 5; //°ú°Å¿¡ º»ÀÎ¿¡°Ô ÇàÇÑ ÇÃ·¹ÀÌ¾îÀÇ °ÅÁþ¸»¿¡ ´ëÇÑ ¹Î°¨µµ
						//LyingÀÌ ³ôÀ» ¼ö·Ï °ÅÁþ¸» ¾ÈÇßÀ» ¶§ÀÇ °¡»êÁ¡¡è, °ÅÁþ¸» ÇßÀ» ¶§ÀÇ °¨Á¡¡è
		
		public float Exchanging(float a) {
			
			Builder3 Player = new Builder3();
			float Sixth_preference = Player.Sixth_preference;
			float Card_preference = a;
			
			SixthUser SixthUser = new SixthUser();
			float Score_greed = SixthUser.Score_greed;
			float Risky = SixthUser.Risky;
			float Lying = SixthUser.Lying;
			
			float Exchanging_percentage = Card_preference+((Score_greed+Risky-10)/4);
			//°¡»êÁ¡ 4Á¡´ç ÃÑ Exchanging_percentage´Â 1Á¡ ¿À¸§
			
			if(Lying>=7) {
				if(Player.Sixth_preference<=4) { // °ÅÁþ¸» 0¹ø ºÁÁÜ
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Sixth_preference-5);
				}
			}
			else if((Lying==6)||(Lying==5)||(Lying==4)) {
				if(Player.Sixth_preference<=3) { // °ÅÁþ¸» 1¹ø ºÁÁÜ
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Sixth_preference-5);
				}
			}
			else if(Lying<=3) {
				if(Player.Sixth_preference<=2) { // °ÅÁþ¸» 2¹ø ºÁÁÜ
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Sixth_preference-5);
				}
			}
			
			return Exchanging_percentage;
		}
		

}