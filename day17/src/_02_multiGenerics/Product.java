package _02_multiGenerics;

public class Product<K, M> {

	private K kind;
	private M model;
	
	// K get, set
	public K getKind(){
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	
	// M get, set
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

	
	
}