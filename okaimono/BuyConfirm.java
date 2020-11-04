package okaimono;

public class BuyConfirm {
	public void buyConfirm(int i, int hbItem) {
		String selectItem = null;
		int selectPrice = 0;

		switch(i) {
			case 1:
				selectItem = "薬草";
				selectPrice = 100;
				break;
			case 2:
				selectItem = "消毒薬";
				selectPrice = 250;
				break;
			case 3:
				selectItem = "酒";
				selectPrice = 300;
				break;
			case 4:
				selectItem = "煙幕";
				selectPrice = 500;
				break;
			case 5:
				selectItem = "タバコ";
				selectPrice = 3000;
				break;
		}

		System.out.println
				("アイテム屋のおばちゃん：「" + selectItem + "1つでいいかい？」");
		System.out.println
				("[あなたの所持金] \\" + HeroBag.money);
		System.out.println();
		System.out.println
				(selectItem + "所持数：" + hbItem + "個");
		System.out.println
				("1.YES 2.NO");
		System.out.println();

		int j = new java.util.Scanner(System.in).nextInt();
			if(j == 1) { // 買う。YESを選択した場合
				switch(i) {
				case 1:
					if(HeroBag.money >= selectPrice) {
						System.out.println
								(selectItem + "を手に入れた！");
						HeroBag.yakuso++;
						HeroBag.money -= selectPrice;
					} else {
						System.out.println
								("アイテム屋のおばちゃん：「お金が足りないじゃないか。」");
					}
					break;
				case 2:
					if(HeroBag.money >= selectPrice) {
						System.out.println
								(selectItem + "を手に入れた！");
						HeroBag.shodoku++;
						HeroBag.money -= selectPrice;
					} else {
						System.out.println
								("アイテム屋のおばちゃん：「お金が足りないじゃないか。」");
					}
					break;
				case 3:
					if(HeroBag.money >= selectPrice) {
						System.out.println
								(selectItem + "を手に入れた！");
						HeroBag.sake++;
						HeroBag.money -= selectPrice;
					} else {
						System.out.println
								("アイテム屋のおばちゃん：「お金が足りないじゃないか。」");
					}
					break;
				case 4:
					if(HeroBag.money >= selectPrice) {
						System.out.println
								(selectItem + "を手に入れた！");
						HeroBag.enmaku++;
						HeroBag.money -= selectPrice;
					} else {
						System.out.println
								("アイテム屋のおばちゃん：「お金が足りないじゃないか。」");
					}
					break;
				case 5:
					if(HeroBag.money >= selectPrice) {
						System.out.println
								(selectItem + "を手に入れた！");
						HeroBag.tabako++;
						HeroBag.money -= selectPrice;
					} else {
						System.out.println
								("アイテム屋のおばちゃん：「お金が足りないじゃないか。」");
					}
					break;
			}
				System.out.println
						("[あなたの所持金] \\" + HeroBag.money);
				System.out.println();

			}
			if(j == 2) { // 買わない。NOを選択した場合
				System.out.println
						("アイテム屋のおばちゃん：「いらないのかい？わかったよ。」");
				System.out.println();

			}
	}
}
