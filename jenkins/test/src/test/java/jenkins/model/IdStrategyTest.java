// test/src/test/java/jenkins/model
package jenkins.model;

import junit.framework.TestCase;
import org.junit.Test;

public class IdStrategyTest extends TestCase {
	//IdStrategy.CaseSensitive C;
	@Test
	public void filenameOf_1() throws Exception {
		IdStrategy.CaseSensitive x = new IdStrategy.CaseSensitive();
		assertEquals(x.idFromFilename("hello"), "hello");
		//assertNotEquals(x.idFromFilename("hello"), x.idFromFilename("HELLO"));
	}

	@Test
	public void filenameOf_2() throws Exception {
		IdStrategy.CaseSensitive x = new IdStrategy.CaseSensitive();
		assertEquals(x.idFromFilename("$asdf"), "$asdf");
	}
}
