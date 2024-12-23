# ssh

## todo
adding keys

## advice

## shortcuts

## behaviour

## commands

## process



## ssh-copy-id

> Install your public key in a remote machine's authorized_keys.

- Copy your keys to the remote machine:

`ssh-copy-id {{username@remote_host}}`

- Copy the given public key to the remote:

`ssh-copy-id -i {{path/to/certificate}} {{username}}@{{remote_host}}`

- Copy the given public key to the remote with specific port:

`ssh-copy-id -i {{path/to/certificate}} -p {{port}} {{username}}@{{remote_host}}`

## ssh-keygen

> Generate ssh keys used for authentication, password-less logins, and other things.

- Generate a key interactively:

`ssh-keygen`

- Specify file in which to save the key:

`ssh-keygen -f ~/.ssh/{{filename}}`

- Generate an ed25519 key with 100 key derivation function rounds:

`ssh-keygen -t ed25519 -a 100`

- Generate an RSA 4096 bit key with your email as a comment:

`ssh-keygen -t rsa -b 4096 -C "{{email}}"`

- Retrieve the key fingerprint from a host (useful for confirming the authenticity of the host when first connecting to it via SSH):

`ssh-keygen -l -F {{remote_host}}`

- Retrieve the fingerprint of a key in MD5 Hex:

`ssh-keygen -l -E md5 -f ~/.ssh/{{filename}}`

- Change the password of a key:

`ssh-keygen -p -f ~/.ssh/{{filename}}`


