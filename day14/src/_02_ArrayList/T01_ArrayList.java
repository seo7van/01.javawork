package _02_ArrayList;

public class T01_ArrayList {

	private String title;
	private String content;
	private String writer;
	
	public T01_ArrayList() { }
	public T01_ArrayList(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "Board[title = " + title + ", content = " + content + ", writer = " + writer;
	}

	
}