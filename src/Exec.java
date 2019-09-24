import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exec {

	static final String DIC_DATA_PATH = "data/dictionary-data.txt";

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("上手");
		}

		// TODO ファイルから辞書を読み取る
		try (InputStream is = new FileInputStream(DIC_DATA_PATH)) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
