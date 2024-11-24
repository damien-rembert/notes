# jdupes


## advice


## shortcuts

## behaviour

## commands
jdupes -rLZA -X size-:600M /mnt/ReadyNAS/Videos
        scan files for duplicate files over 600Mo and hardlinks them
jdupes -rLZA /mnt/ReadyNAS/Music


### parameters
-H --hardlinks         treat any linked files as duplicate files. Normally linked files are treated as non-duplicates for safety
-m --summarize         summarize dupe information
 -M --printwithsummary  will print matches and --summarize at the end
 -N --noprompt          together with --delete, preserve the first file in
                        each set of duplicates and delete the rest without
                        prompting the user
 -o --order=BY          select sort order for output, linking and deleting; by
 -O --paramorder        Parameter order is more important than selected -O sort
                        mtime (BY=time) or filename (BY=name, the default)
-d --delete            prompt user for files to preserve and delete all
                        others; important: under particular circumstances,
                        data may be lost when using this option together
                        with -s or --symlinks, or when specifying a
                        particular directory more than once; refer to the
                        documentation for additional information
 -D --debug             output debug statistics after completion
 -f --omitfirst         omit the first file in each set of matches
 -L --linkhard          hard link all duplicate files without prompting
                        Windows allows a maximum of 1023 hard links per file
-Z --softabort         If the user aborts (i.e. CTRL-C) act on matches so far
                        You can send SIGUSR1 to the program to toggle this
 -S --size              show size of duplicate files
 Hard and soft (symbolic) linking status symbols and behavior

### linking
A set of arrows are used in file linking to show what action was taken on each link candidate. These arrows are as follows:
----> File was hard linked to the first file in the duplicate chain
-@@-> File was symlinked to the first file in the chain
-==-> Already a hard link to the first file in the chain
-//-> File linking failed due to an error during the linking process
If your data set has linked files and you do not use -H to always consider them as duplicates, you may still see linked files appear together in match sets. This is caused by a separate file that matches with linked files independently and is the correct behavior. See notes below on the "triangle problem" in jdupes for technical details.
