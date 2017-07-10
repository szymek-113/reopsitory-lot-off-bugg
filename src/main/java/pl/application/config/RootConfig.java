package pl.application.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Class used to configure beans not connected with web part of an application
 * Created by Aleksander on 2017-07-10.
 */
@Configuration
@ComponentScan(basePackages = {"pl.application"})
public class RootConfig {
}
