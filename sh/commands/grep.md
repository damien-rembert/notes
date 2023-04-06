# grep

Global Regular Expression Print
Matches patterns in input text.
Supports simple patterns and regular expressions.

## options

-i for case insensitive search
-E for regex (or use egrep)
-c count matches
-v invert match to exclude some strings

## examples

```bash
grep "search string" path/to/file

# Search recursively (ignoring non-text files) in current directory for an exact string:
grep -RI "search string"

# Print 3 lines of [C]ontext around, [B]efore, or [A]fter each match:
grep -C 3 "search string" path/to/file
grep -B 3 -A 3 "search string" path/to/file

# Print file name with the corresponding line number for each match:
grep -Hn "search string" path/to/file
```
