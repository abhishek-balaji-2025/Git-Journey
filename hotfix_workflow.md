## 🔧 Hotfix Git Workflow Guide

This guide outlines the standard procedure for addressing urgent production issues using a `hotfix` branch in Git.

---

## ✅ Step 1: Switch to `main` and pull the latest code

Make sure your local `main` is up to date:

`git checkout main`  
`git pull origin main`

---

## ✅ Step 2: Create a `hotfix` branch from `main`

Create a new branch to isolate your fix:

`git checkout -b hotfix/<hotfix-name>`

---

## ✅ Step 3: Make the fix and commit changes

After making changes to resolve the issue:

`git add .`  
`git commit -m "Hotfix: <brief description>"`

---

## ✅ Step 4: Merge `hotfix` into `main` and push to remote

Move back to `main` and merge the fix:

`git checkout main`  
`git merge hotfix/<hotfix-name>`  
`git push origin main`

> 🔑 **Key Note:**  
> If your branch is named just `hotfix`, use `git merge hotfix`.  
> If it's namespaced like `hotfix/login-bug`, use the full name: `git merge hotfix/login-bug`.  
> Git uses `/` to organize branches like folders. Always use the **full branch name** during merge.

---

## ✅ Step 5: Merge `hotfix` into other branches (e.g., `develop`, `feature`)

Update the development or feature branches to include the hotfix:

`git checkout develop`  
`git merge hotfix/<hotfix-name>`  
`git push origin develop`

> Repeat for any other relevant branches as needed.

---

## ✅ Step 6: (Optional) Delete the `hotfix` branch

Once merged and pushed, clean up the hotfix branch:

`git branch -d hotfix/<hotfix-name>`  
`git push origin --delete hotfix/<hotfix-name>`

---

## 💡 Bonus: Tag the hotfix commit (optional)

To mark the hotfix release in version history:

`git tag -a v1.0.1 -m "Hotfix release v1.0.1"`  
`git push origin v1.0.1`

---
