# logging

ts: what package?
curl + pushover
mail sender

## handling logs
awk/grep
tail -F

The “cut -d” option is used to specify the delimiter (character) that is used to separate the fields in a text file. The “-f” option is used to specify the field number that we want to extract. In this example, we are extracting the sixth field from the line that contains the user’s home directory.
```bash
grep myuser /etc/passwd | cut -d: -f 6
```

## format things:
use python to format json:
```bash
docker container ls --all --format ‘{{ json . }}’ | python3 -m json.tool --json-lines
```
