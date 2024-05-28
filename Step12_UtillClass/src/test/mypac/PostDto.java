package test.mypac;

public class PostDto {
	private int num;
	private String witer;
	private String title;
	
	public PostDto() {}

	public PostDto(int num, String witer, String title) {
		super();
		this.num = num;
		this.witer = witer;
		this.title = title;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWiter() {
		return witer;
	}

	public void setWiter(String witer) {
		this.witer = witer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	};
	
}
