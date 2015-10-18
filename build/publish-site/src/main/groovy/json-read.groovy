class Student {
    Number id
    String name
    Map results
}

class ClassReport {
    String testScore
    String projectScore
    String comment
}

import groovy.json.JsonSlurper

import java.nio.file.Paths

JsonSlurper slurper = new JsonSlurper()
def studentList

Paths.get('resources/report.json').withReader { reader ->
    studentList = slurper.parse(reader)
}

println studentList.dump()
