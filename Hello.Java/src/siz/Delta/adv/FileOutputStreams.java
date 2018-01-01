package siz.Delta.adv;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileOutputStreams {

	public static void main(String[] args) {

		// 바이트 기반 스트림 -파일쓰기
		// 객체를 바이트 기반 스트림으로 파일에 저장
		// 즉, 클래스에 대한 객체를 직렬화해서 파일에 저장함.
		String name = "지현";
		int age = 57;
		Users u = new Users("asqd", "passwd123", "카카", 30);

		String fpath = "c:/java/data01.dat";

		try (FileOutputStream fos = new FileOutputStream(fpath); // 어떤 파일로 만들것인지
				ObjectOutputStream oos = new ObjectOutputStream(fos);) { // 앞선 fos 객체로 outputstream을 만듦
			oos.writeUTF(name);// 직렬화로 문자형을 파일에 저장
			oos.writeObject(u);// 직렬화로 객체를 파일에 저장
			oos.writeInt(age);// 직렬화로 숫자를 파일에 저장

		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

}

// 클래스를 직렬화해서 파일에 저장하려면 해당클래스는 serializable 인터페이스를 구현해야함.
class Users implements Serializable {

	private static final long serialVersionUID = -6544132882443272110L;
	String userid;
	String passwd;
	String name;
	int age;

	public Users(String userid, String passwd, String name, int age) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
	}

}
