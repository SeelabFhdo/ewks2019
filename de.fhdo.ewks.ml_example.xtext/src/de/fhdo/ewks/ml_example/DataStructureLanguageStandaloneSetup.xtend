/*
 * generated by Xtext 2.16.0
 */
package de.fhdo.ewks.ml_example


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DataStructureLanguageStandaloneSetup extends DataStructureLanguageStandaloneSetupGenerated {

	def static void doSetup() {
		new DataStructureLanguageStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
