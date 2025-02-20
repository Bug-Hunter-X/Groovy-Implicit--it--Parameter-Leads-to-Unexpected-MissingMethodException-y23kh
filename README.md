# Groovy Implicit 'it' Parameter Bug
This repository demonstrates a subtle bug in Groovy related to the implicit `it` parameter in closures.  When a closure expects an implicit argument (`it`), but is called without providing one, and this closure is passed to another method as an argument, it leads to a `groovy.lang.MissingMethodException`.  The provided solution demonstrates how to resolve this using explicit argument declaration or proper closure handling.

## Bug Report
The original code involves a simple method taking a closure as an argument. The problem surfaces when calling this method with closures that use the implicit `it` parameter without providing a value.  This mismatch in expected and provided arguments causes the exception.