public interface User {
	
	public String getName();
	
	public int getId();
	
	public void setId(int id);
	
	public void register(Library library);
	
	public int getLibrary();
}