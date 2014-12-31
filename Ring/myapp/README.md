# myapp

Based on [Clojure Web Development with Ring](https://mmcgrana.github.io/2010/03/clojure-web-development-ring.html)

## Prerequisites

You will need [Leiningen][1] 1.7.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

```
lein ring server
```

## Run from the REPL

To start a web server for the application from the REPL:

```
lein repl
```

Then
```
(use 'myapp.handler)
(boot)
```

## License

Copyright © 2014 FIXME
