package pg_ex01_1;

public class pg_ex01_1 {

	public static void main(String[] arg) {

		String ans[] = new String[100];

		for (int i = 0; i < ans.length; i++) {

			// 数値代入
			ans[i] = String.valueOf(i+1);

			// 3の倍数
			if ((i + 1) % 3 == 0) {
				ans[i] = "△";
			}
			// 4の倍数
			if ((i + 1) % 4 == 0) {
				ans[i] = "□";
			}
			// 3、4の最大公約数
			if ((i + 1) % 12 == 0) {
				ans[i] = "◆";
			}

			// 出力
			System.out.print(ans[i]);

		}

	}
}