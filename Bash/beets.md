# beets


beet -c ~/.config/beets/config_manual.yaml import "/mnt/ReadyNAS/Music/beets_old/+44/"

screen -S beets beet -c ~/.config/beets/config_auto.yaml import /mnt/ReadyNAS/Music/beets_old



1) folder structure
2) a quiet and user driven import, a qbittorrent triggered import?
3) resume from last scan?
4) move/hard-link?
5) plugins?
6) don't log in home

https://beets.readthedocs.io/en/stable/guides/main.html#configuring
https://beets.readthedocs.io/en/stable/guides/advanced.html
https://beets.readthedocs.io/en/stable/reference/config.html
https://beets.readthedocs.io/en/stable/plugins/index.html


In logs, look for:
"unreadable" files
"This album is already in the library!"

beet -c ~/.config/beets/config_quiet.yaml import -ql ~/scripts/logs/beets_logs.txt "/mnt/ReadyNAS/Music/111 All/"

screen -S beets beet -c ~/.config/beets/config.yaml import -l ~/scripts/logs/beets_logs.txt "/mnt/ReadyNAS/Music/111 All/"

~/.config/beets/config_no-resume.yaml



"                                                                                                          >






## config file
~/.config/beets/config.yaml
change "move" to "hardlink" for when adding from DL folder
switch "incremental_skip_later" to "no" when done with initial import

## library location
/mnt/ReadyNAS/Music/beets/

## architecture
/VA/Album_title/CD1
/Artist/Year Album title/CD1/Track number - Track name 

# Template
/Album Genre/
/Album Artist, The/
/Year - Album title/
/N° - Track title.mp3

/VA (OST/mix/)/
/Year - Album title/
/N° - Track title - Artist.mp3

%the{$albumartist}/$year - $album/$track - $title

## Structure
Artist, the/ Year - Album title/ cd N°/ Song number - title - artist.mp3
VA/ OST/ Album title (year)/ cd N°/ Song number - title - artist.mp3

mv "/mnt/torrents/DLed/music" "/mnt/ReadyNAS/Music/111 All"

/usr/bin/beet import /mnt/ReadyNAS/Music/Very\ messy/000\ ordi\ portable/


## advice

## shortcuts

## behaviour
### beet import -ql ~/.config/beets/logs.txt 
quiet, skipping hard choices l 
### beet import -s
run in singleton mode, tagging individual tracks instead of whole albums at a time. See the “as Tracks” choice below. This means you can use beet import -AC to quickly add a bunch of files to your library without doing anything to them.
### beet import -g
assume there are multiple albums contained in each directory. The tracks contained a directory are grouped by album artist and album name and you will be asked to import each of these groups separately. See the “Group albums” choice below.
### beet missing
uses the missing plugin
finds and lists, for every album in your collection, which or how many tracks are missing. Listing missing files requires one network call to MusicBrainz. Merely counting missing files avoids any network calls.
### beet missing -a "artist Name"
uses the missing plugin
lists missing albums for the artist



## commands

beet import --config ~/.config/beets -ql ~/.config/beets/logs.txt /mnt/ReadyNAS/Music/beets-old



Usage: 
  beet COMMAND [ARGS...]
  beet help COMMAND

Options:
  --format-item=FORMAT_ITEM
                        print with custom format
  --format-album=FORMAT_ALBUM
                        print with custom format
  -l LIBRARY, --library=LIBRARY
                        library database file to use
  -d DIRECTORY, --directory=DIRECTORY
                        destination music directory
  -v, --verbose         log more details (use twice for even more)
  -c CONFIG, --config=CONFIG
                        path to configuration file
  -h, --help            show this help message and exit

Commands:
  config            show or edit the user configuration
  fields            show fields available for queries and format strings
  help (?)          give detailed help on a specific sub-command
  import (imp, im)  import new music
  list (ls)         query the library
  modify (mod)      change metadata fields
  move (mv)         move or copy items
  remove (rm)       remove matching items from the library
  stats             show statistics about the library or a query
  update (upd, up)  update the library
  version           output version information
  write             write tag information to files


# config


# for quiet auto import
import:
    resume: yes
    quiet: yes
    quiet_fallback: skip
    log: directory: /mnt/ReadyNAS/Music/beets_logs/quiet_auto_import.log
    duplicate_action: skip

# import messy folders with tracks from multiple albums
import:
    group_albums: yes

# for manual import
import:
    resume: ask
    log: directory: /mnt/ReadyNAS/Music/beets_logs/manual_import.log
    bell: yes

ui:
    color: yes
    colors:
        text_success: green
        text_warning: yellow
        text_error: red
        text_highlight: red
        text_highlight_minor: lightgray
        action_default: turquoise
        action: blue

# basic setting
directory: /mnt/ReadyNAS/Music/beets
import:
    incremental: yes
    incremental_skip_later: yes
    move: yes
    log: directory: /mnt/ReadyNAS/Music/beets_logs/default_import.log
    languages: en fr es

paths:
    default: %the{$albumartist}/$year - $album%aunique{}/$track - $title
    singleton: 111_Non_Album/$artist/$title ($year)
    comp: 111_VA/$album%aunique{} ($year)/$track - $title
    albumtype:soundtrack: 111_VA/$album%aunique{} ($year)/$track - $title

plugins: ftintitle the fromfilename missing duplicates kodi

kodi:
    host: 192.168.1.229
    port: 8080
    user: damien
    pwd: XXXXX



include

A space-separated list of extra configuration files to include. Filenames are relative to the directory containing config.yaml.
