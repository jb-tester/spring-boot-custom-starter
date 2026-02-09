The custom spring boot starter

there are 3 modules:
* custom-spring-boot-starter - the starter
* custom-imported-spring-boot-starter - the library imported by the starter
* use-custom-starter - the project using the starter

What is tested:
 - custom autoconfiguration annotation and corresponding `*.imports` file - OK
 - optional: prefix for the autoconfigurations in the `*.imports` file - OK
 - inner autoconfigurations - problem with gutter icon
 - before/after conditions - OK, but no inspections that check their correctness
 - autoconfiguration replacement, `org.springframework.boot.autoconfigure.AutoConfiguration.replacements` file - not supported
