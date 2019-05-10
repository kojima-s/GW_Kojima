package web;

public class EmpBean {

	//変数を定義
	private String name = null;
	private int age = 0;

	public int getAge() {
		return age;
	}
	//引数として受け取ったageをカプセル化した値に代入
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	//引数として受け取ったnameをカプセル化した値に代入
	public void setName(String name) {
		this.name = name;
	}


}
