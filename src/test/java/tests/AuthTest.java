package tests;

import config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthTest {

    @Test
    public void testLocalFile() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("eroshenkoam");
        assertThat(config.password()).isEqualTo("12345678");
    }

    @Test
    public void testRemoteFile() throws Exception {
        String content = "username=stnislav\npassword=qwerty";
        Path props = Paths.get("/tmp/auth.properties");

        Files.write(props, content.getBytes(StandardCharsets.UTF_8));

        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("stnislav");
        assertThat(config.password()).isEqualTo("qwerty");

        Files.delete(props);
    }
}
