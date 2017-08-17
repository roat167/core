package core.java.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The try-with-resources statement (JSE 7 and later) is a try statement that
 * declares one or more resources.The try-with-resources statement ensures that
 * each resource is closed at the end of the statement. Any object that
 * implements java.lang.AutoCloseable, which includes all objects which
 * implement java.io.Closeable, can be used as a resource.
 *
 */
public class TryWithResourceStatement {

	public static String readFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	public static String readFileWithFinallyBlock(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			if (br != null) {
				br.close();
			}
		}
	}
}
