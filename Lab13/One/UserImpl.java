public class UserImpl implements User {
	
	private String name;
	private int id;
	private Library library;
	
	UserImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void register(Library library) {
		this.library = library;
	}
	
	public int getLibrary() {
		return this.library.getId();
	}
}