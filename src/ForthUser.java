public class ForthUser {

	
		static String Card = "½Ã¹Î";
		String Name = "¾ÈÁ©¸®³ª";
		static float Score_greed = 5;
		static float Risky = 5;
		static float Lying = 5; //°ú°Å¿¡ º»ÀÎ¿¡°Ô ÇàÇÑ ÇÃ·¹ÀÌ¾îÀÇ °ÅÁþ¸»¿¡ ´ëÇÑ ¹Î°¨µµ
						//LyingÀÌ ³ôÀ» ¼ö·Ï °ÅÁþ¸» ¾ÈÇßÀ» ¶§ÀÇ °¡»êÁ¡¡è, °ÅÁþ¸» ÇßÀ» ¶§ÀÇ °¨Á¡¡è
		
		public float Exchanging(float a) {
			
			Builder3 Player = new Builder3();
			float Forth_preference = Player.Forth_preference;
			float Card_preference = a;
			
			ForthUser ForthUser = new ForthUser();
			float Score_greed = ForthUser.Score_greed;
			float Risky = ForthUser.Risky;
			float Lying = ForthUser.Lying;
			
			float Exchanging_percentage = Card_preference+((Score_greed+Risky-10)/4);
			//°¡»êÁ¡ 4Á¡´ç ÃÑ Exchanging_percentage´Â 1Á¡ ¿À¸§
			
			if(Lying>=7) {
				if(Player.Forth_preference<=4) { // °ÅÁþ¸» 0¹ø ºÁÁÜ
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Forth_preference-5);
				}
			}
			else if((Lying==6)||(Lying==5)||(Lying==4)) {
				if(Player.Forth_preference<=3) { // °ÅÁþ¸» 1¹ø ºÁÁÜ
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Forth_preference-5);
				}
			}
			else if(Lying<=3) {
				if(Player.Forth_preference<=2) { // °ÅÁþ¸» 2¹ø ºÁÁÜ
					Exchanging_percentage = 0;
				}
				else {
					Exchanging_percentage += (Lying/10)*(Player.Forth_preference-5);
				}
			}
			
			return Exchanging_percentage;
		}
		

}