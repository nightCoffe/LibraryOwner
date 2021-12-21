package tests;

import config.IphoneConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IphoneTest {


    @Test
    public void testConfig() {
        IphoneConfig config = ConfigFactory.create(IphoneConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11");
        assertThat(config.deviceName()).isEqualTo("iPhone 13 Pro Max XML Bust Must Have");
    }


}
