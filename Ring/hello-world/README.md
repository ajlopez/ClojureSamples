# hello-world

A Clojure library designed to ... well, that part is up to you.

From (Ring, Getting Started)[https://github.com/ring-clojure/ring/wiki/Getting-Started].

## Usage

Install dependencies:
```
lein deps
```

Run REPL:
```
lein repl
```

Then
```
(use 'ring.adapter.jetty)
(use 'hello-world.core)
(run-jetty handler {:port 3000})
```


## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
