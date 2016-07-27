# CS-451-001-Checkers
A Networked Checkers Game. All documentation and no code makes Jack a Software Engineer!

# Group Members

* Mark Blaho (cpb49@drexel.edu)
* Khoi Tran (knt36@drexel.edu)
* Rachel Goeken (rmg92@drexel.edu)
* Max Mattes (mm3888@drexel.edu)

## Our Work Flow

We will be following a model of forks and branches. This means we each work on our own fork, and only Mark (who's managing operations) can merge to the master repo. If your git-fu fails you and everything is completely messed up, it won't affect anyone else this way, and you can always do a clean pull from master to reset everything.

*Please, please PLEASE do not merge your PRs to Master.* This is Mark's job, because munging the repo will just slow everyone down. Mark is the Benevolent Dictator :innocent:

Don't forget to set your name and email on your local machine as well! Just a nice thing to do. [Documentation on how to do that is here](https://help.github.com/articles/setting-your-email-in-git/)

We'll also be using the branching model. This means that every discrete code chunk gets its own branch with a descriptive name. (This commit is located in the `Readme-Changes-Example` branch as an example.) 

After a branch is created, you can push as many commits to it as you want. Once you're satisfied with it, and Travis (or a similar unit tester) is reporting success, create your pull request. ([Github Documentation](https://help.github.com/articles/using-pull-requests/)) Once someone else in the group looks over the changes and says it's good, the PR will be merged into master by Mark. **All PRs must be peer-reviewed before merging, with at least one other person looking at the code and saying it's good. This ensures we don't produce :hankey:!** For an example of this, check the PR request for `Readme-Changes-Example`, which is #1 .

# Links to look at:

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
