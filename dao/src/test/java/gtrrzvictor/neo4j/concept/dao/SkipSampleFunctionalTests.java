package gtrrzvictor.neo4j.concept.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "resources/META-INF/spring/application-context.xml"})
public class SkipSampleFunctionalTests{

    @Test
    public void testReader() {
        // The reader is initialized and bound to the input data
    }

}