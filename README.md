# Git-Journey
 A personal learning repository documenting Git concepts, intermediate-level commands, and beginner-friendly diagrams to visually explain how Git works.

# 📘 Git Commands Cheat Sheet

A beginner-friendly reference for commonly used Git commands with simple definitions.

---

## 🔧 Basic Git Commands

| Command | Description |
|--------|-------------|
| `git init` | Initializes a new Git repository. |
| `git clone <url>` | Clones a remote repository to your local machine. |
| `git status` | Displays the status of working directory and staging area. |
| `git add <file>` | Stages a file for the next commit. |
| `git add .` | Stages all changed files in the directory. |
| `git commit -m "message"` | Commits staged changes with a message. |
| `git log` | Shows a list of all previous commits. |
| `git diff` | Shows changes in your working directory (unstaged). |
| `git diff --staged` | Shows staged changes to be committed. |

---

## 🔄 Branching & Merging

| Command | Description |
|--------|-------------|
| `git branch` | Lists all local branches. |
| `git branch <name>` | Creates a new branch. |
| `git checkout <name>` | Switches to a different branch. |
| `git switch <name>` | Switches branches (newer alternative to `checkout`). |
| `git merge <branch>` | Merges the specified branch into the current one. |
| `git branch -d <name>` | Deletes a branch if it’s fully merged. |

---

## 🚀 Working with Remotes

| Command | Description |
|--------|-------------|
| `git remote -v` | Lists remote repositories. |
| `git push` | Pushes local commits to the remote repository. |
| `git push -u origin <branch>` | Pushes and sets the upstream branch. |
| `git pull` | Fetches and merges updates from the remote repo. |
| `git fetch` | Downloads changes from the remote, but doesn’t merge. |

---

## 🔁 Reset & Undo

| Command | Description |
|--------|-------------|
| `git reset --soft <commit>` | Resets commit history; keeps changes staged. |
| `git reset --mixed <commit>` | Resets history and unstages changes (default). |
| `git reset --hard <commit>` | Resets history and discards all changes. |
| `git checkout -- <file>` | Discards changes in the specified file. |
| `git revert <commit>` | Reverts a commit by creating a new opposite commit. |

---

## 📂 Stashing Changes

| Command | Description |
|--------|-------------|
| `git stash` | Saves uncommitted changes temporarily. |
| `git stash pop` | Applies the most recent stash and removes it from stash list. |
| `git stash list` | Lists all stashed changes. |

---

## ✅ Tip

Use `git help <command>` (e.g., `git help reset`) to get detailed documentation for any command.

---
