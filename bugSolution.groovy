```groovy
def myMethod(Closure closure) {
    closure() 
}

myMethod {println "Hello"}

myMethod {arg -> println arg}

//Or, explicitly pass 'it' when the closure is defined:
myMethod {println it}
```
This corrected version addresses the issue by explicitly specifying an argument using `arg ->` in the second closure call.   This makes the intention clear and avoids the implicit parameter ambiguity. Alternatively, explicitly using `it` inside the closure definition, removes the ambiguity. 