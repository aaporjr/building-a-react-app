package com.example

import grails.rest.Resource

@Resource(uri = "/make")
class Make {

	String name

    static constraints = {
    }
}
