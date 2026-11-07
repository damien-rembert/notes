# Nix-NixOS


```bash
# ???
sudo nixos-rebuild switch --upgrade
# ???
sudo nix-channel --update
```

# Flakes

# Install packages
```bash
# add/remove requirements
sudo vi /etc/nixos/configuration.nix
# apply changes
sudo nixos-rebuild switch
```

# Upgrade to a new version
``` bash
# check current channel
sudo nix-channel --list | grep nixos
# switch to a new channel - watch the "nixos at the end
sudo nix-channel --add https://channels.nixos.org/nixos-26.05 nixos
sudo nix-channel --update && sudo nixos-rebuild switch && sudo reboot
```