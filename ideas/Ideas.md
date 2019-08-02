# Ideas

### Throwing exceptions as a form of return value
Funny "hack" that uses exceptions to make a method return a value.

#### Implementation ideas

- Boring interface void methodName();
- throw custom subclass of runtime exception that has return data as field
- in caller: try and catch this special runtimeException
