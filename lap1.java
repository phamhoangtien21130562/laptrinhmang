package laptrinhmang;

import java.io.File;

public class lap1 {
	public static boolean delete(String path) {
		File file = new File(path);
		for (File f : file.listFiles()) {
			if (f.isDirectory()) {
				String path1 = f.getAbsolutePath();
				delete(path1);
			} else {
				if (f.isFile()) {
					f.delete();
				}
			}
		}

		return file.delete();
	}

	public static void findAll(String path, String ext1) {
		File file = new File(path);
		String ext = "." + ext1;
		for (File f : file.listFiles()) {
			if (f.isDirectory()) {
				String path1 = f.getAbsolutePath();
				findAll(path1, ext1);
			} else {
				String path1 = f.getAbsolutePath();
				if (f.isFile() && path1.endsWith(ext)) {
					System.out.println(path1);
				}
			}
		}
	}

	public static void deleteAll(String path, String ext1) {
		File file = new File(path);
		String ext = "." + ext1;
		for (File f : file.listFiles()) {
			if (f.isDirectory()) {
				String path1 = f.getAbsolutePath();
				deleteAll(path1, ext1);
			} else {
				String path1 = f.getAbsolutePath();
				if (f.isFile() && path1.endsWith(ext)) {
					f.delete();
				}
			}
		}
	}

	public static void main(String[] args) {
		String path = "D://testltm";
//		delete(path);
		String ext = "bmp";
//		findAll(path, ext);
		deleteAll(path, ext);
	}

}
