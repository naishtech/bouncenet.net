package com.covyne.bouncenet.apps;

import ch.vorburger.exec.ManagedProcessException;
import ch.vorburger.mariadb4j.springframework.MariaDB4jSpringService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
@ActiveProfiles("test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS) //otherwise mariadb is not cleaned up between tests
public class AppRepositoryTests {

    private static MariaDB4jSpringService DB;

    @BeforeAll
    public static void beforeEach() throws ManagedProcessException {
        DB = new MariaDB4jSpringService();
        DB.setDefaultPort(1234);
        DB.start();
        DB.getDB().createDB("bouncenet");

    }

    @Test
    void appIsCreated(){

    }

    @AfterAll
    public static void cleanup() {
        if (DB != null) DB.stop();
    }

}
