package wood.mike

import grails.artefact.Enhances

@Enhances('Service')
trait AppInfoTrait {

    def grailsApplication

    def domainInfo() {
        grailsApplication.domainClasses
    }

}