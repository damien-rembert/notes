# head/tail

Print 10 lines at the "head" or "tail" of a file

## options

-n 15 print 15 lines instead of the default 10

## examples

```bash
# print out the first 15 lines
head -n 15 names.txt

# print the file but leave out the LAST 15 lines using a negative number:
head -n -15 names.txt

# print out the last 15 lines
tail -n 15 names.txt

# print the file but leave out the FIRST 15 lines, useful to remove headers:
tail -n +16 names.txt
```
