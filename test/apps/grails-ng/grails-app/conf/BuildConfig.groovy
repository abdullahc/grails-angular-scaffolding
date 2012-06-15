grails.project.work.dir = 'target'
grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir = 'target/test-reports'
grails.project.target.level = 1.6

grails.project.dependency.resolution = {
    inherits 'global'
    log 'warn'
    repositories {
        grailsCentral()
        mavenCentral()
        mavenLocal()
        mavenRepo 'http://maven.springframework.org/milestone/'
    }
    dependencies {
    }

    plugins {
        build ":tomcat:$grailsVersion", ':cloud-foundry:1.2.2'
        runtime ":hibernate:$grailsVersion", ':resources:1.1.6', ':jquery:1.7.2'
        test ':spock:0.6'
    }
}

grails.plugin.location.'angular-scaffolding' = '../../..'