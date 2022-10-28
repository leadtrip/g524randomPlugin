package wood.mike

import org.springframework.context.annotation.Configuration
import org.springframework.boot.context.properties.ConfigurationProperties

@Configuration
@ConfigurationProperties(prefix = "random")
class RandomPluginConfiguration {
    String prefix
    String suffix
}
