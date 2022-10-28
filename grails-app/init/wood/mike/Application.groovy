package wood.mike

import grails.boot.*
import grails.boot.config.GrailsAutoConfiguration
import grails.plugins.metadata.*
import org.springframework.context.annotation.ComponentScan

@ComponentScan
@PluginSource
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}