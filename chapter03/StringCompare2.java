package java_study.chapter03;

import javax.swing.JOptionPane;

public class StringCompare2 {

	public static void main(String[] args) {
		String id = "root";
		String pw = "pass";

		String inputId = JOptionPane.showInputDialog("아이디 입력");
		String inputPw = JOptionPane.showInputDialog("패스워드 입력");

		if (id.equals(inputId) && pw.equals(inputPw)) { // 내용을 검사할 때는 equals()
			System.out.println("로그인 ok");
		} else {
			System.out.println("로그인 not");
		}
	}
}
