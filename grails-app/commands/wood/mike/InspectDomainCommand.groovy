package wood.mike

import grails.dev.commands.*

class InspectDomainCommand implements GrailsApplicationCommand {

    boolean handle() {
        println 'Hello world, I will do something with domain classes one day'
        return true
    }
}
