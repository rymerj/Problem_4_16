# Random letter Display
##Intro
This program with use math.random to display a random uppercase letter.
##Outline
//Declare range of numbers for random letter.
//Declare random number integer
//Declare equation for random number
//display random uppercase letter
##References 
Liang, Daniel y., Intro Java Programming 9th edition pg. 201
##Code

public class Random_Letter {

	public static void main(String[] args) {
		
		// "A" is 65
```
		int startingValue =65;
```
		// "Z" is 90 and we want to cover the range, so we added 
		//1 more to ensure we would cover a through z
```
		int endingValue = 90-startingValue+1;
```		
		/*a + Math.random()*b gives us random number between a and a+b excluding a+b
		 * 
		 */
```
		int randomNumber;
```
		/* Make a new make a new variable and then
		 fill it with a random number that is between our starting value 
		 and end value. then print it out. 
		*/
```
		randomNumber = (int)(startingValue + Math.random()*endingValue);
```
		//System.out.println(randomNumber); debugging statement
		
		//display random letter
```
		char letter = (char)randomNumber;
		System.out.println(letter);
	}
}
```
##Console
```
Y
```



##Comand prompt
```Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.
Switched to flash drive
```
C:\Users\LAB>e:
```
switched to my project
```
E:\>cd "Comp Science- workspace"

E:\Comp Science- workspace>cd Problem_4_16
```
initialized local repository
```
E:\Comp Science- workspace\Problem_4_16>git init
Initialized empty Git repository in E:/Comp Science- workspace/Problem_4_16/.git
/
```
added files to local repository
```
E:\Comp Science- workspace\Problem_4_16>git add .
```
added name
```

E:\Comp Science- workspace\Problem_4_16>git config user.name "Joe Rymer"
```
added email adress
```
E:\Comp Science- workspace\Problem_4_16>git config user.email "rymerj@student.sw
osu.edu"
```
commmited change
```
E:\Comp Science- workspace\Problem_4_16>git commit -m "initial commit"
[master (root-commit) 8369793] initial commit
 2 files changed, 23 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
```
added remote repository
E:\Comp Science- workspace\Problem_4_16>git remote add origin https://github.com
/rymerj/Problem_4_16.git
```
pushed to remote repository
```
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

E:\Comp Science- workspace\Problem_4_16>git checkout -b dev
M       README.md
Switched to a new branch 'dev'

E:\Comp Science- workspace\Problem_4_16>git branch
* dev
  master

E:\Comp Science- workspace\Problem_4_16>git add .

E:\Comp Science- workspace\Problem_4_16>git commit -m "added command prompt info
"
[dev 25f709f] added command prompt info
 1 file changed, 98 insertions(+), 1 deletion(-)

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

fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev


E:\Comp Science- workspace\Problem_4_16>git push --set-upstream origin dev
Username for 'https://github.com': rymerj
Password for 'https://rymerj@github.com':
Counting objects: 3, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 1.45 KiB | 0 bytes/s, done.
Total 3 (delta 1), reused 0 (delta 0)
To https://github.com/rymerj/Problem_4_16.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.

E:\Comp Science- workspace\Problem_4_16>

Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\LAB>E:

E:\>cd "Comp Science- workspace"

E:\Comp Science- workspace>cd Problem_4_16

E:\Comp Science- workspace\Problem_4_16>git status
On branch dev
Your branch is up-to-date with 'origin/dev'.
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")

E:\Comp Science- workspace\Problem_4_16>branch
'branch' is not recognized as an internal or external command,
operable program or batch file.

E:\Comp Science- workspace\Problem_4_16>git branch
* dev
  master

E:\Comp Science- workspace\Problem_4_16>git add .

E:\Comp Science- workspace\Problem_4_16>git commit -m "added code to generate le
tter"
[dev 34213e9] added code to generate letter
 3 files changed, 72 insertions(+)
 rewrite bin/Random_Letter.class (60%)

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
Counting objects: 7, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (5/5), done.
Writing objects: 100% (7/7), 1.66 KiB | 0 bytes/s, done.
Total 7 (delta 1), reused 0 (delta 0)
To https://github.com/rymerj/Problem_4_16.git
   25f709f..34213e9  dev -> dev

E:\Comp Science- workspace\Problem_4_16>
```
##Summary
I started off thinking that it would be prety easy to code, but it was a little more
complicated. used Git hub to keep a backup of my source code. I had to work out some
of the bugs with the range of the code to get the final code to work right.

#Part 2 



##Intro:
This is a math addition game with four rounds and keeps score. 
##Code:
```
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
	int score = 0;
	int dificulty = 10;
		
		//Generate random numbers
		int numb1 = (int)(Math.random() * dificulty);
		int numb2 = (int)(Math.random() * dificulty);
		
		
		//prompt user to input answer for question one
		System.out.println("--Round 1");
		System.out.print("What is " + numb1 +  " + " + numb2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
	//  Read in their response
		//  Check if the answer was correct		
			//		IF correct
	 if (numb1 + numb2 == answer){
		//			Give them points
		 score += 10;
        //	Make the next question harder
		 dificulty *= 10;
		 //			Tell them it was correct
		 System.out.println("That is correct!");
		 System.out.println("Your score is " + score + "!" );
		 System.out.println("Your Dificulty is " + dificulty + "!" );}
	 

	 
	 

   
	 //		IF not correct
			//			Tell them it was wrong	
	 		// 			Tell them the correct answer
else{
	if (dificulty > 10){
				dificulty /= 10;}
	System.out.println("Your answer is wrong\n" + numb1 + " + " + numb2 
			+ " is " + answer);
	System.out.println("The dificulty is " + dificulty);
	System.out.println("The score is " + score);
			//			Do not give them points
			//			Make the next question easier			
										Pg 1			
}
			
			//end round 1
			
			//Round 2
			//Generate random numbers
			numb1 = (int)(Math.random() * dificulty);
			numb2 = (int)(Math.random() * dificulty);
			
			
			//prompt user to input answer for question one
			System.out.println("--Round 2");
			System.out.print("What is " + numb1 +  " + " + numb2 + "? ");
			answer = input.nextInt();
		//  Read in their response
			//  Check if the answer was correct		
				//		IF correct
		 if (numb1 + numb2 == answer){
			// Give them points
			 score += 10;
	        //	Make the next question harder
			 dificulty *= 10;
			 //			Tell them it was correct
			 System.out.println("That is correct!");
			 System.out.println("Your score is " + score + "!" );
			 System.out.println("Your Dificulty is " + dificulty + "!" );
		 

		 }
		 

	   
		 //		IF not correct
				//			Tell them it was wrong	
		 		// 			Tell them the correct answer
	else{
		if (dificulty > 10){
					dificulty /= 10;}
		System.out.println("Your answer is wrong\n" + numb1 + " + " + numb2 
				+ " is " + answer);
		System.out.println("The dificulty is " + dificulty);
		System.out.println("The score is " + score);
				//			Do not give them points
				//			Make the next question easier			
												Pg 2
				
}
				//end round 2					
					
		//Round 3
			//Generate random numbers
			numb1 = (int)(Math.random() * dificulty);
			numb2 = (int)(Math.random() * dificulty);
			
			//prompt user to input answer for question one
			System.out.println("--Round 3");
			System.out.print("What is " + numb1 +  " + " + numb2 + "? ");
			answer = input.nextInt();
		//  Read in their response
			//  Check if the answer was correct		
				//		IF correct
		 if (numb1 + numb2 == answer){
			// Give them points
			 score += 10;
	        //	Make the next question harder
			 dificulty *= 10;
			 //			Tell them it was correct
			 System.out.println("That is correct!");
			 System.out.println("Your score is " + score + "!" );
			 System.out.println("Your Dificulty is " + dificulty + "!" );
		 

		 }
		 

	   
		 //		IF not correct
				//			Tell them it was wrong	
		 		// 			Tell them the correct answer
	else{
		if (dificulty > 10){
					dificulty /= 10;}
		System.out.println("Your answer is wrong\n" + numb1 + " + " + numb2 
				+ " is " + answer);
		System.out.println("The dificulty is " + dificulty);
		System.out.println("The score is " + score);
				//			Do not give them points
				//			Make the next question easier			
				}
				//end round 3					
		
		//Round 4
			//Generate random numbers
			numb1 = (int)(Math.random() * dificulty);
			numb2 = (int)(Math.random() * dificulty);
			
			
												Pg 3	
		
	//prompt user to input answer for question one
			System.out.println("--Round 4");
			System.out.print("What is " + numb1 +  " + " + numb2 + "? ");
			answer = input.nextInt();
		//  Read in their response
			//  Check if the answer was correct		
				//		IF correct
		 if (numb1 + numb2 == answer){
// Give them points
			 score += 10;
	        //	Make the next question harder
			 dificulty *= 10;
			 //			Tell them it was correct
			 System.out.println("That is correct!");
			 System.out.println("Your score is " + score + "!" );
			 System.out.println("Your Dificulty is " + dificulty + "!" );
		 

		 }
		 

	   
		 //		IF not correct
				//			Tell them it was wrong	
		 		// 			Tell them the correct answer
	else{
		 if (dificulty > 10){
					dificulty /= 10;}
		System.out.println("Your answer is wrong\n" + numb1 + " + " + numb2 
				+ " is " + answer);
		System.out.println("The dificulty is " + dificulty);
		System.out.println("The score is " + score);}
				//			Do not give them points
				//			Make the next question easier			
		
				//end round 4					



}
}
```	
##Console Output:
``` --Round 1
What is 1 + 3? 4
That is correct!
Your score is 10!
Your Difficulty is 100!
--Round 2
What is 42 + 64? 21
Your answer is wrong
42 + 64 is 21
												Pg 4

The Difficulty is 10
The score is 10
--Round 3
What is 7 + 3? 10
That is correct!
Your score is 20!
Your Difficulty is 100!
--Round 4
What is 96 + 1? 22
Your answer is wrong
96 + 1 is 22
The Difficulty is 10
The score is 20
```
##Final Summary:
The program runs an addition math game. Each question answered right increases 
the difficulty and adds ten points the players score. If the question is answered 
wrong, then the difficulty is lowered. I learned how to code random numbers. I had 
some problems with arrangement with code and brackets, but figured out what to do. 
In this program I used the git branches to help working out the errors in my code 
and merge the working code to the master branch (with the “git merge dev” command 
from the master branch) when code was solid. 

