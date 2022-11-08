# alias

## advice

## shortcuts

## behaviour

## commands

# Alias

cd && nano .zshrc

## OmegaT
alias omegat="bash /mnt/data/OmegaT/OmegaT_4.1.5_02/OmegaT"

## VPN

## Todo
alias tomo="bash todo.sh ls due:$(date --date=tomorrow +%Y-%m-%d)"
alias today="bash todo.sh ls due:$(date --date=today +%Y-%m-%d)"
alias -g due:today="due:`date --date=today +%Y-%m-%d`"
alias -g due:tomo="due:`date --date=tomorrow +%Y-%m-%d`"
alias todo="bash todo.sh"
alias yesterday="bash todo.sh ls due:$(date --date=yesterday +%Y-%m-%d)"
alias due="todo due"



## QTodotxt
alias qtodo='python3 "~/apps/py/QTodoTxt2/bin/qtodotxt.pyw"'

## Topydo

## SSH
alias sshnas="" Connect to NAS using key
alias sshpi="" Connect to RasPi using key
alias sshnuc="" Connect to NUC using key
alias sshmerlin="" Connect to router using key
alias server_name="ssh -v -l USERNAME IP ADDRESS"

## apt
alias aptup="apt update && sudo apt install/upgrade??? -y" + without confirmation

## look at:
https://askubuntu.com/questions/781345/vpn-one-liner-login-script/781348
https://lifehacker.com/270799/create-terminal-shortcuts
https://www.reddit.com/r/zsh/comments/9m2r8z/what_aliases_do_you_use/

## TinyMediaManager
alias tmm="bash /mnt/data/exe/tmm_3.0.1_linux/tinyMediaManager.sh"
alias tinymediamanager="bash /mnt/data/exe/tmm_3.0.1_linux/tinyMediaManager.sh"

## FileBot
alias filebot="bash /mnt/data/exe/FileBot_4.7-portable/filebot.sh"



## Todo
alias tomo="bash todo.sh ls due:$(date --date=tomorrow +%Y-%m-%d)"
alias today="bash todo.sh ls due:$(date --date=today +%Y-%m-%d)"
alias -g due:today="due:`date --date=today +%Y-%m-%d`"
alias -g due:tomo="due:`date --date=tomorrow +%Y-%m-%d`"
alias todo="bash todo.sh"
alias yesterday="bash todo.sh ls due:$(date --date=yesterday +%Y-%m-%d)"
alias due="todo due"



## QTodotxt
alias qtodo='python3 "~/apps/py/QTodoTxt2/bin/qtodotxt.pyw"'

## Topydo


