# guestbook

FIXME

## Prerequisites

You will need [Leiningen][1] 1.7.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

```
lein ring server
```

## Using REPL

To start a web server for the application using the REPL, run:

```
lein repl
```

Then run
```
(use 'guestbook.repl)
(start-server)
```

Creating an standalone jar
```
lein ring uberjar
```

Running the standalone jar
```
cd target
java -jar guestbook-0.1.0-SNAPSHOT-standalone.jar
```

## License

Copyright © 2014 FIXME
