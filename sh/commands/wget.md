# wget
cd /mnt/data/wget/CS106 && wget -r -nc -np -e robots=off --accept zip,pdf,txt,jar https://web.stanford.edu/class/cs106a/handouts && wget -r -nc -np -e robots=off --accept zip,pdf,txt,jar https://web.stanford.edu/class/cs106a/lectures && wget -r -nc -np -e robots=off --accept zip,pdf,txt,jar https://web.stanford.edu/class/cs106a/assignments

## switches
--no-parent -np
-nc no clobber (do not update)
-r recursive


## local copy whole website
wget -m -k -E -p -np -e robots=off
wget --mirror --convert-links --adjust-extension --page-requisites --no-parent -e robots=off "https://bloc-note-culinaire.blogspot.com/"
cd /mnt/data/wget/Bloc-note-culinaire && wget -m -k -E -p -np -e robots=off "https://bloc-note-culinaire.blogspot.com/"
wget -m -k -E -p -np -e robots=off


https://web.stanford.edu/class/cs106a/lectures/index.html
https://web.stanford.edu/class/cs106a/assignments/index.html
https://web.stanford.edu/class/cs106a/handouts/index.html


cd /mnt/data/wget/Wolf_university && wget -r -nc -np -e robots=off "https://wolf.university/goalkicker/PythonBook/"
cd /mnt/data/wget/comics_pinkasimov && wget -r -nc -np -e robots=off "http://www.pinkasimov.com/Livres/Bandes%20dessinees/"
cd /mnt/data/wget/Bloc-note-culinaire && wget -r -nc -np -e robots=off "https://bloc-note-culinaire.blogspot.com/"




  - Download a file, saving the output under the filename indicated by the URL:
    curl -O http://example.com/filename

  - Download a file, following [L]ocation redirects, and automatically [C]ontinuing (resuming) a previous file transfer:
    curl -O -L -C - http://example.com/filename

  - Send form-encoded data (POST request of type application/x-www-form-urlencoded):
    curl -d 'name=bob' http://example.com/form

  - Send a request with an extra header, using a custom HTTP method:
    curl -H 'X-My-Header: 123' -X PUT http://example.com

  - Send data in JSON format, specifying the appropriate content-type header:
    curl -d '{"name":"bob"}' -H 'Content-Type: application/json' http://example.com/users/1234

  - Pass a user name and password for server authentication:
    curl -u myusername:mypassword http://example.com

  - Pass client certificate and key for a resource, skipping certificate validation:
    curl --cert client.pem --key key.pem --insecure https://example.com
.

# wget

> Download files from the Web.
> Supports HTTP, HTTPS, and FTP.
> More information: <https://www.gnu.org/software/wget>.

- Download the contents of an URL to a file (named "foo" in this case):

`wget {{https://example.com/foo}}`

- Download the contents of an URL to a file (named "bar" in this case):

`wget -O {{bar}} {{https://example.com/foo}}`

- Download a single web page and all its resources with 3-second intervals between requests (scripts, stylesheets, images, etc.):

`wget --page-requisites --convert-links --wait=3 {{https://example.com/somepage.html}}`

- Download all listed files within a directory and its sub-directories (does not download embedded page elements):

`wget --mirror --no-parent {{https://example.com/somepath/}}`

- Limit the download speed and the number of connection retries:

`wget --limit-rate={{300k}} --tries={{100}} {{https://example.com/somepath/}}`

- Download a file from an HTTP server using Basic Auth (also works for FTP):

`wget --user={{username}} --password={{password}} {{https://example.com}}`

- Continue an incomplete download:

`wget -c {{https://example.com}}`

- Download all URLs stored in a text file to a specific directory:

`wget -P {{path/to/directory}} -i {{URLs.txt}}`
