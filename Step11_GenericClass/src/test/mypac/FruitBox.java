package test.mypac;

public class FruitBox<T> {
	//필드
	private T item;
	//과일을 포장하는 메소드
	public void pack(T _item) {
		this.item=_item;//this 를 생략하기 위해서는 필드와 지역변수명을 다르게 해야한다
	}
	//과일을 꺼내는 메소드
	public T unPack() {
		return item;
	}
}
