# CS-451-001-Checkers
A Networked Checkers Game. All documentation and no code makes Jack a Software Engineer!

# Group Members

* Mark Blaho (cpb49@drexel.edu)
* Khoi Tran (knt36@drexel.edu)
* Rachel Goeken (rmg92@drexel.edu)
* Max Mattes (mm3888@drexel.edu)

## Our Work Flow

We will be following a model of forks and branches. We each work on our own fork, and only Mark (who's managing operations) can merge to the master repo. If your git-fu fails you and everything is completely messed up, it won't affect anyone else this way, and you can always do a clean pull from master to reset everything.

### First Steps

1. Click the button at the top of this repository that says "Fork". This will create your own personal fork where your (or our) git-fu failures are insulated away from the rest of the team. You'll notice the repository URL is https://github.com/**your-username**/CS-451-001-Checkers so use this information to check your commands in the following steps
1. Clone your personal fork to your programming device (hopefully a real computer of some sort and not like a phone). On the commandline (which I'm going to assume you're using), this is `git clone https://github.com/<**YOUR USERNAME**>/CS-451-001-Checkers.git`. It may ask for credentials or other info and it's up to you to decide if/how to handle that.
1. Add upstream as a remote target (aka you can push/pull to it). The main repository will be called "upstream" and is added to your environment using `git remote add upstream https://github.com/MBLAHO13/CS-451-001-Checkers.git` **REMEMBER, NEVER EVER EVER DO SOMETHING THAT LOOKS LIKE `push upstream`**
1. Your evironment should now be set up and ready to use

### Basic Flow

I'm assuming some special cases here, chances are you can skip some of these steps (but they're all harmless in any case if you do a step you didn't have to).

1. Ensure you're up to date with upstream/master
	1. Checkout master: `git checkout master`
	1. Pull upstream: `git pull upstream master`
	1. Update your fork: `git push origin master`
1. Put yourself on a branch other than master
	1. If you need to make a new branch
		1. Create a branch: `git branch <name-of-branch>`. *Please use dashes instead of spaces because we're working on the commandline and nobody wants to re-learn why bash and quotes don't mix*
		1. Checkout that branch: `git checkout <name-of-branch>`
	1. If the branch already exists:
		1. Checkout that branch: `git checkout <name-of-branch>`
		1. Make sure you're up to date: `git rebase master`
		1. If the rebase said anything other than "`Current branch <name-of-branch> is up to date.`" then push to your fork: `git push origin <name-of-branch>`
		1. If git complains about something (just trust me on this one): `git push origin <name-of-branch> -f`
1. Actual coding work!
	1. Write some code until you feel the need to commit (remember this is all local to you, so commit as often as possible because it won't affect anyone else)
	1. Stage your changes: `git add -A`
	1. Commit your changes: `git commit -m "some useful commit message"`
	1. Push your changes: `git push origin <name-of-branch>`
	1. Keep on coding until you've completed somethng big enough that other people need to look at it
1. PR: Pull Request / Peer Review
	1. If you made way too many commits and it's confusing use `git rebase -i HEAD~20`. Be careful because you're rewriting history a bit here and can ruin your fork very quickly. Use `git log` to check that the result makes sense
	1. When you're ready for review, log onto [GitHub](https://github.com/) (hint: you're probably already here)
	1. Go to the [upstream project page](https://github.com/MBLAHO13/CS-451-001-Checkers)
	1. You should see a button at the top with your branch saying "Compare & Pull Request". Click that
	1. Create a pull request with information about your commit. Please add in-line comments if things are confusing (though that should warrant code comments anyway)
	1. If/when it's set up, CI should automatically test your PR and reject you if it's failing the tests
	1. If you need to change something, you should still be able to push to that same branch in your fork and the PR will update, and CI should re-test your new code.
	1. When you have a :+1: from two other group members, merge the PR by clicking the button at the bottom of the page.

# Mark's list of Links to look at:

* What the hell is git?! : https://rogerdudler.github.io/git-guide/
* Branch Management: https://git-scm.com/book/en/v2/Git-Branching-Branch-Management
* So You Have a Mess On Your Hands (The definitive guide to fixing your oops): http://justinhileman.info/article/git-pretty/

# How do I know if Travis will fail?!

[Depends on: Gradle and Findbugs are installed.]

1. `gradle check`
1. `gradle assemble`
1. `gradle test`
1. If these pass, you should be good. CHECK THE TRAVIS BUILD TOO.
1. If your travis build fails, get the build number from Travis and poke Mark.

# Where is the travis status located?

Here is our Travis homepage:

https://travis-ci.com/MBLAHO13/CS-451-001-Checkers 

You can watch it happen! So fun!

# Intellij is complaining about Gradle.

If you see a popup that says "Unlinked Gradle project" when you start Intellij, click it. Run `gradle getHomeDir` in your terminal, it should output a directory. That directory goes in the box that says "Gradle Home directory". Accept the defaults and everything should be fine.

## Planned Infrastructure

* Github Issues :heavy_check_mark:
* Github VCS :heavy_check_mark:
* Content Requests (Provided by Github Issues) :heavy_check_mark:
* Travis Continuous Integration :heavy_check_mark:
* Code Coverage Tool :white_medium_square:
* Static Analysis Tool :white_medium_square:
