#!/usr/bin/env groovy

def call(String name = 'human') {
    result = !(name =~ /feature\/[0-9]+\.[0-9]+\.[0-9]+/)
    echo "Hello, ${name}."
    return result
}
