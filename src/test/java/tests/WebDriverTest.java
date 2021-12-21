package tests;

import config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testGithubTitle() {
        assertEquals("GitHub: Where the world builds software · GitHub", driver.getTitle());
        driver.quit();
    }
}
