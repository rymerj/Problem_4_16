# Problem_4_16
##Comand prompt
```Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.
Switched to flash drive
``
C:\Users\LAB>e:
``
E:\>cd "Comp Science- workspace"

E:\Comp Science- workspace>cd Problem_4_16

E:\Comp Science- workspace\Problem_4_16>git init
Initialized empty Git repository in E:/Comp Science- workspace/Problem_4_16/.git
/

E:\Comp Science- workspace\Problem_4_16>git add .

E:\Comp Science- workspace\Problem_4_16>git config user.name "Joe Rymer"

E:\Comp Science- workspace\Problem_4_16>git config user.email "rymerj@student.sw
osu.edu"

E:\Comp Science- workspace\Problem_4_16>git commit -m "initial commit"
[master (root-commit) 8369793] initial commit
 2 files changed, 23 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project

E:\Comp Science- workspace\Problem_4_16>git remote add origin https://github.com
/rymerj/Problem_4_16.git

E:\Comp Science- workspace\Problem_4_16>git push -u origin master
Username for 'https://github.com': rymerj
Password for 'https://rymerj@github.com':
Counting objects: 4, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 594 bytes | 0 bytes/s, done.
Total 4 (delta 0), reused 0 (delta 0)
To https://github.com/rymerj/Problem_4_16.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

E:\Comp Science- workspace\Problem_4_16>git add .

E:\Comp Science- workspace\Problem_4_16>git commit -m "added class"
[master 26a3f21] added class
 2 files changed, 8 insertions(+)
 create mode 100644 bin/Random_Letter.class
 create mode 100644 src/Random_Letter.java

E:\Comp Science- workspace\Problem_4_16>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': rymerj
Password for 'https://rymerj@github.com':
Counting objects: 6, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (6/6), 780 bytes | 0 bytes/s, done.
Total 6 (delta 0), reused 0 (delta 0)
To https://github.com/rymerj/Problem_4_16.git
   8369793..26a3f21  master -> master

E:\Comp Science- workspace\Problem_4_16>git pull
remote: Counting objects: 3, done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), done.
From https://github.com/rymerj/Problem_4_16
   26a3f21..42ed8ea  master     -> origin/master
Updating 26a3f21..42ed8ea
Fast-forward
 README.md | 3 +++
 1 file changed, 3 insertions(+)
 create mode 100644 README.md

E:\Comp Science- workspace\Problem_4_16>
```

