import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;


public class ListExamplesTests {
	@Test 
	public void testMerge1() {
    		List<String> l1 = new ArrayList<String>(List.of("x", "y"));
		List<String> l2 = new ArrayList<String>(List.of("a", "b"));
		assertArrayEquals(new String[]{ "x", "y", "a", "b"}, ListExamples.merge(l1, l2).toArray());
	}
	
	@Test
        public void testMerge2() {
		List<String> l1 = new ArrayList<String>(List.of("a", "b", "c"));
		List<String> l2 = new ArrayList<String>(List.of("c", "d", "e"));
		assertArrayEquals(new String[]{ "a", "b", "c", "c", "d", "e" }, ListExamples.merge(l1, l2).toArray());
        }

}
