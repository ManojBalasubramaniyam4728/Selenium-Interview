package Cucumber.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class hooks {
	
	//Scenario-level hooks
	@Before
    public void before_each_scenario() {
        System.out.println("===> Before: Launch browser and open application <===");
        // e.g. open browser, navigate to base URL
    }

    @After
    public void after_each_scenario() {
        System.out.println("===> After: Close browser and clean up <===");
        // e.g. close browser, clear data
    }
    
    // Step-level hooks
    @BeforeStep
    public void before_each_step() {
        System.out.println(">>> BeforeStep: about to execute a step <<<");
    }

    @AfterStep
    public void after_each_step() {
        System.out.println(">>> AfterStep: step execution finished <<<");
    }
    
    // BEFORE hooks – lower order runs FIRST
    @Before(order = 1)
    public void before_scenario_open_browser() {
        System.out.println("Before-1: Open browser");
    }

    @Before(order = 2)
    public void before_scenario_login_test_user() {
        System.out.println("Before-2: Login as test user");
    }

    // AFTER hooks – higher order runs FIRST (reverse order)
    @After(order = 2)
    public void after_scenario_logout() {
        System.out.println("After-2: Logout user");
    }

    @After(order = 1)
    public void after_scenario_close_browser() {
        System.out.println("After-1: Close browser");
    }
    
    // Runs ONLY for scenarios tagged with @db
    @Before("@db")
    public void before_db_scenarios() {
        System.out.println("Before @db: Setup test database state");
    }

    // Runs ONLY for scenarios tagged with @api
    @Before("@api")
    public void before_api_scenarios() {
        System.out.println("Before @api: Setup API client");
    }
    
    // Conditional After hooks
    @After("@db")
    public void after_db_scenarios() {
        System.out.println("After @db: Clean DB test data");
    }

    @After("@api")
    public void after_api_scenarios() {
        System.out.println("After @api: Close API connections");
    }
    
    // Runs ONCE before ALL scenarios in the suite
    @BeforeAll
    public static void setup_suite() {
        System.out.println("=== BeforeAll: Starting test database server ===");
        // Start DB, test server, etc. (expensive operations)
    }

    // Runs ONCE after ALL scenarios finish
    @AfterAll  
    public static void teardown_suite() {
        System.out.println("=== AfterAll: Shutting down test database server ===");
        // Stop DB, cleanup suite data
    }
}
