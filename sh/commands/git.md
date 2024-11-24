# git

# Look at git flowchart in this folder

# look up meaning of:
-u flag
rebase
Stash

# commands

## git status
Check the status of the repo, compares local and remote

## git pull
get, "pull", the latest version from the remote repo

## git clone
Copies, "clone", a remote repo
Shallow clone for big repo, not cloning the whole history
git clone --depth 1 <url>

## git stash

## git fetch
tells your local git to retrieve the latest meta-data info from the original (yet doesn’t do any file transferring. Just checking to see if there are any changes available)

## git branch
list the branches and hightlights the current

## git branch newbranchname
create new branch named newbranchname


# glossary
## origin
"origin" is a shorthand name for the remote repository that a project was originally cloned from. More precisely, it is used instead of that original repository's URL - and thereby makes referencing much easier.
Note that origin is by no means a "magical" name, but just a standard convention.

## remote
A `remote` in Git is a common repository that all team members use to exchange their changes. In most cases, such a remote repository is stored on a code hosting service like GitHub or on an internal server.
In contrast to a **local** repository, a remote typically does not provide a file tree of the project's current state. Instead, it only consists of the .git versioning data.


# Initial process
## git init
Turn current folder into a git repo
## git add .
Tell git to "monitor" all the files
## git commit -m 'first commit'
Save, "commit", files to the default(?)/current(?)/local(?) repo
## git remote add origin <url>
Add a remote repo, (marking it as a copy?)
## git push -u origin main
send, "push", the current local version to the remote repo

# Creating a branch to work on a new function
# Commiting from a branch to main
# Resetting the local branch to be like the remote branch
# Rebasing?

# Examples
## Initial process 
``` bash
cd "/mnt/data/CN/week_4"
git init # Turn current folder into a git repo
git add . # Tell git to "monitor" all the files
git commit -m 'first commit' # Save, "commit", files to the default(?)/current(?)/local(?) repo with a message/comment
git remote add origin git@github.com:damien-rembert/CN-w4.git # Add a remote repo, (marking it as a copy?)
git push -u origin main #send, "push", the current local version to the remote repo
# OR (in case of problems?):
git push -u origin --all # pushes up the repo and its refs for the first time
git push -u origin --tags # pushes up any tags
```

# Workflows

## Collaborating
The repo owner adds other devs as collaborators.
Every one clones the repo locally.
```bash
git clone <url>
```
To work on the code, people create branches (naming them in a meaningful way, indicating who started working on what) and start editing the code there.
```bash
git pull # if needed
git branch -a # checking the existence of other branches
git branch dr_newfeature # creating the branch
git checkout dr_newfeature # switching branch
git branch -a # checking we're in the right branch
```
When the feature is implemented or the bug corrected, the branch is merged into the local `main` branch: first by switching to `main`, pulling from the remote main, then going back to the working branch and finally carrying out the actual merge. The updated branch is then pushed to GitHub.
```bash
git checkout main 
git pull origin main
git checkout branchname
git merge main # !!! locally merge the main into the working branch
git push origin dr_newfeature
```
The collaborator creates a new pull request on GitHub.
Other collaborators compare the new branch and the main one and if everything is good they will actually merge it into the main branch. 

## Contributing
Fork the repo on GitHub.
Clone the repo locally.
```bash
git clone <forkURL>
```
Create branches as needed (naming them in a meaningful way, indicating who started working on what) and start editing the code there.
```bash
git pull # if needed
git branch -a # checking the existence of other branches
git branch dr_newfeature # creating the branch
git checkout dr_newfeature # switching branch
git branch -a # checking we're in the right branch
```
When the feature is implemented or the bug corrected, the branch is merged into the local `main` branch: first by switching to `main`, pulling from the remote main, then going back to the working branch and finally carrying out the actual merge. The updated branch is then pushed to GitHub.
```bash
git checkout main 
git pull url main # !!! this pulls up-to-date code from the original repo (not the fork!)
git merge dr_newfeature # !!! merge the branch into main
git push origin main # !!! push to GitHub
```
In GitHub, create a new pull request, which will be sent to the owner of the original repo.