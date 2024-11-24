# logging


The “cut -d” option is used to specify the delimiter (character) that is used to separate the fields in a text file. The “-f” option is used to specify the field number that we want to extract. In this example, we are extracting the sixth field from the line that contains the user’s home directory.
```bash
grep ocp /etc/passwd|cut -d: -f 6
```