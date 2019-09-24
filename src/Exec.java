public class Exec {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("上手");
		}
		// 第一引数はデータファイルのフルパス
		new DictionaryReader(args[0]).out();
	}
}
