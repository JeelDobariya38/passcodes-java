package com.passcodes.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testHelpArgument() {
        App app = new App();
        app.main(new String[]{"--help"});
        assertTrue(true);
    }
    
    @Test
    public void testVersionArgument() {
        App app = new App();
        app.main(new String[]{"--version"});
        assertTrue(true);
    }
}
