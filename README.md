# brujeria

## Usage

Pattern file example:

```
[[["a" "b"]
  ["c"]
  ["d" "e"]]
 [["x" "y" "z"]
  ["f" "g"]]]
```

Produces:

```
acd
ace
bcd
bce
xf
xg
yf
yg
zf
zg
```

Pipe to ethereum wallet decryption tool:

```
lein run ~/patterns.edn | python ~/prj/ethereum-presale-cracker/ethcrack.py ~/Downloads/ethereum-wallet.json
```

## License

Copyright © 2017 Robert P. Levy

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
