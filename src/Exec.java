public class Exec {

	// データファイルの単語を読み込む場合は、第一引数にデータファイルのプルパスを指定する
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("上手");
		}
		new DictionaryReader(args[0]).out();
	}
}
