grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {
		compile 'de.is24.util:junit-karma-testrunner:1.1'
	}

	plugins {
		build ':release:2.2.1', ':rest-client-builder:1.0.3', {
			export = false
		}
	}
}
