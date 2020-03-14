# Java 8 Stream Tutorial 


- Streams bring functional programming to Java, and are supported starting in Java 8.
- Advantages of Streams:
    - Will make you a more efficient Java programmer
    - Make heavy use of lambda expressions
    - ParallelStreams make it very easy to multi-thread operations
- A stream pipeline consists of a source, followed by zero or more intermediate operations; and terminal operation.

- Source ---> Filter --> Sort --> Map --> Collect

- Streams Source: Streams can be created from Collections, Lists, Sets, Ints, Longs, doubles, lines of a file.
- Stream Operations are either intermediate or terminal.
    - **Intermediate operations** such as filter, mao, or sort return a stream so we can chain multiple intermediate operations.
    - **Terminal operations** such as forEach, collect or reduce are either void or return a non-stream result.
  