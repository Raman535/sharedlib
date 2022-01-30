#!/usr/bin/env groovy

def call(String name = 'human') {
    result = false
    if (name =~ /feature\/[0-9]+\.[0-9]+\.[0-9]+/) {
        result=true
    }
    echo "Hello, ${name}."
    echo "result, ${result}"
    return result
}
