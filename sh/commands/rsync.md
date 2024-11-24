# rsync

## advice

## shortcuts

## behaviour

## commands


## example
-a, --archive  archive mode; equals -rlptgoD
-r, recursive, -l, copy links, -p, preserve permissions, -t, preserve Times/dates, -g, preserve Group, -o, preserve Owner, -D, preserve Device files and special files
-u, update
-h human readable numbers (and progress?)
-P same as --partial --progress ???
 `sudo rsync -auhP /mnt/ReadyNAS/Pictures /mnt/rescue1/`
`sudo screen rsync sudo rsync -auhP /mnt/ReadyNAS/Pictures /mnt/rescue1/`
