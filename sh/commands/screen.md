# Screen

## options
screen cmd		          start a screen session running cmd
screen -ls		          list sessions
screen -r xxx	          resume a screen session called xxx
screen -R		          resume or create a session
screen -S xxx	          create a screen session called xxx
screen -X -S xxx quit     kill a detached screen

## keyboard shortcut
ctrl+A ?		help
ctrl+A d		detach current session
ctrl+A c		create another screen
ctrl+A n		show next screen
ctrl+A p		show previous screen
ctrl+A k        kill the current screen session

## advice

## shortcuts

## behaviour

## commands
 
# screen

> Hold a session open on a remote server. Manage multiple windows with a single SSH connection.

- Start a new screen session:

`screen`

- Start a new named screen session:

`screen -S {{session_name}}`

- Start a new daemon and log the output to screenlog.x:

`screen -dmLS {{session_name}} {{command}}`

- Show open screen sessions:

`screen -ls`

- Reattach to an open screen:

`screen -r {{session_name}}`

- Detach from inside a screen:

`Ctrl + A, D`

- Kill the current screen session:

`Ctrl + A, K`

- Kill a detached screen:

`screen -X -S {{session_name}} quit`
