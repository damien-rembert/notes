# Nix-NixOS

entirely forego nix-env, don't use it. Use home-manager to install stuff for your user, and configuration.nix for your system

nix shell is nice for temporary one off tools.

use flakes (and the new flake only commands) instead of nix channels as soon as you reasonably can. They are so much nicer to work with.


# Flakes

```bash
nix flake show
nix flake info
nix flake new
nix flake new python
nix flake show templates
vi flake.nix
```


# Nix Shell
```bash
nix-shell
nix-shell -p cowsay lolcat
nix-shell -p dig

```



# Profiles

```bash
nix profile add lolcat
nix profile add nixpkgs#datasette
nix profile add nixpkgs#lolcat
nix profile install nixpkgs#lolcat
vi /home/damien/.local/state/nix/profiles/profile
```


# Install packages
```bash
nix search "https://flakehub.com/f/NixOS/nixpkgs/*" cargo
nix search nixpkgs nodejs
nixos search nodejs
# add/remove requirements
sudo vi /etc/nixos/configuration.nix
# apply changes
sudo nixos-rebuild switch
```

# Upgrade to a new version
``` bash
# check current channel
sudo nix-channel --list | grep nixos
# switch to a new main channel - watch the "nixos at the end
sudo nix-channel --add https://channels.nixos.org/nixos-26.05 nixos

# update channels and rebuild
sudo nix-channel --update && sudo nixos-rebuild switch && sudo reboot
# or update channels and rebuild in one command
sudo nixos-rebuild --upgrade switch  && sudo reboot
```

# Check how many versions exist
```bash
# list local versions
nixos-rebuild list-generations

```


# Clean Store
``` bash
nix-collect-garbage
nix-collect-garbage -d
``` 

# Files
``` bash
vi /etc/nixos/configuration.nix
vi /etc/nixos/smb-secrets
vi shell.nix
diff nixos/configuration.nix /etc/nixos/configuration.nix 
```

``` bash
echo "Hello Nix" | nix run "https://flakehub.com/f/NixOS/nixpkgs/*#ponysay"
nix --extra-experimental-features fmt  /etc/nixos/configuration.nix
nix build
nix build .#hello
nix develop
nix fmt  /etc/nixos/configuration.nix
nix formatter  /etc/nixos/configuration.nix

nix upgrade-nix 
nix-instantiate
nixfmt sh/commands/flak.nix 
npm install playwright@nixversion
```
