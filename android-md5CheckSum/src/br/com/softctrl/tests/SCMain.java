/**
 * 
 */
package br.com.softctrl.tests;

import java.io.File;

import br.com.softctrl.io.util.MD5;

/**
 * @author timoshenko
 *
 */
public class SCMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File fileUsr = new File("/usr/bin");
		if (fileUsr.isDirectory()) {
			for (File file : fileUsr.listFiles()) {
				if (file.isFile() && file.canRead())
					System.out.println(String.format("Hash MD5 for:%s is %s", file.getName(), MD5.getMD5CheckSum(file)));
			}
		}

	}

}
