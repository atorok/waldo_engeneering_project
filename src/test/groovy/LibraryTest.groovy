/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'alpar' at '11/11/16 8:39 AM' with Gradle 3.1
 *
 * @author alpar, @date 11/11/16 8:39 AM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
