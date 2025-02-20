```groovy
def myMethod(Closure closure) {
    closure() 
}

myMethod {println "Hello"}

myMethod {println it}
```
This code will print "Hello" and then throw a `groovy.lang.MissingMethodException: No signature of method: Script1$_run_closure1.call() is applicable for argument types: (Script1$_run_closure2) values: [Script1$_run_closure2@1e66b97]` because the second closure is not provided with an argument, but implicitly expects the implicit `it` parameter to be passed.