package laptrinhmang;

import java.io.*;

//xuất file các file của folder có phần mở rộng và đường dẩn cho trước
public class findext {
	public static String res = "";

	public static String findextdoc(File file, String ext) {
		String ext1 = "." + ext;
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				if (f.isDirectory()) { // Kiểm tra mở tất cả thư mục con nếu có
					findextdoc(f, ext);
				}
			}
			for (File f : file.listFiles()) {
				if (f.getAbsolutePath().endsWith(ext1)) {
					res += f.getAbsolutePath() + "\n";
				}
			}
		}
		return res;

	}

	public static void main(String[] args) {

		String folder = "D://smartphone";
		File file = new File(folder);
		String ext = "jpg";
		System.out.println(findextdoc(file, ext));

	}
}
