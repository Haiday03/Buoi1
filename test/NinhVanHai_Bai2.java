package test;

public class NinhVanHai_Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tl,tn,tg;
		for(tl = 1;tl < 20;tl++) {
			for(tn = 1;tn < 32;tn++) {
				tg = 100 -  (tl + tn);
				if(tl + tn + tg == 100 && 15*tl + 9*tn + tg == 300) {
					System.out.println("So trau lon la:" + tl);
					System.out.println("So trau nam la:" + tn);
					System.out.println("So trau gia la:" + tg);
					return ;
				}
			}
		}
	}

}
