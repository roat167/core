## Builder Pattern

- The Builder pattern creates objects in a stepwise manner without knowing or caring how those
objects are constructed. Instead of constructing an object directly (or via a factory), you instantiate
a Builder and let it create the object on your behalf.
- Builders are particularly useful for initializing objects that require multiple constructor parameters,
especially parameters of the same or similar types.
- Separate the construction of a complex object from its representation so that the same construction process can create different representations.
- We don't need to remember which parameter does what, we let the builder to encapsulate that knowledge by using builder instance to define new object state.

- When: use builder for objects that has many fields, are complex to construct and reconstruct in several steps. Otherwise use a simpler pattern <a href="https://github.com/roat167/core/tree/master/src/io/kapp/core/designpattern/abstractfactory">Abstract Factory</a>.