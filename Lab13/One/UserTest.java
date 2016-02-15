import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {
	
	private User myUser;
	
	@Before
	public void buildUp() {
		this.myUser = new UserImpl("Dave Jones");
	}
	
	@Test
	public void testUsersName() {
		assertEquals("Failure - The users name was not what we expect", this.myUser.getName(), "Dave Jones");
	}
	
	@Test
	public void testUserId() {
		this.myUser.setId(123456);
		assertEquals("Failure - The users ID was not what we expect", this.myUser.getId(), 123456);
	}
	
	@Test
	public void testRegister() {
		Library lib = new LibraryMock();
		this.myUser.register(lib);
		
		assertEquals("Failure - The library ID is not what we expect", this.myUser.getLibrary(), 98765);
	}
}