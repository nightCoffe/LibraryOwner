package tests;

import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MobileTest {

    @Test
    public void testAndroid() {
        System.setProperty("device", "pixel");
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("17.0");
        assertThat(config.deviceName()).isEqualTo("Google Pixel XL");
    }

    @Test
    public void testIOS() {
        System.setProperty("device", "iphone");
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11");
        assertThat(config.deviceName()).isEqualTo("iPhone 13 Pro Max XML Bust Must Have");
    }
}
