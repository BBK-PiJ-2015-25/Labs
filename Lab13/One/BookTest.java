import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {
	
	private Book myBook;
	
	@Before
	public void buildUp() {
		this.myBook = new BookImpl("Dave Jones", "My Awesome Book");
	}
	
	@Test
	public void testAuthorsName() {
		assertEquals("Failure - Author name is not what we expect", this.myBook.getAuthor(), "Dave Jones");
	}
	
	@Test
	public void testBookTitle() {
		assertEquals("Faliure - Book title is not what we expect", this.myBook.getTitle(), "My Awesome Book");
	}
}