package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:iphone.properties")
public interface IphoneConfig extends Config {


    @Key("device.name")
    String deviceName();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();

}
