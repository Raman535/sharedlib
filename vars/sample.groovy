#!/usr/bin/env groovy

def call(String name = 'human') {
    result = true
    if (name =~ /feature\/[0-9]+\.[0-9]+\.[0-9]+/) {
        result=false
    }
    echo "Hello, ${name}."
    echo "result, ${result}"
    return result
}
