package md.tekwill;

public class GitWorkFlow {

    public static void main(String[] args) {

        String step1 = "Open IntelliJ IDEA and navigate to the master branch - git checkout master";
        String step2 = "Open the terminal and execute the - git fetch - command to make sure there are some changes on cloud, but not download them";
        String step3 = "Execute the command - git pull - that will download the changes from origin/master to local master branch";
        String step4 = "Create a new branch and move to it - git checkout -b task_1 - it will redirect us to the task_1 branch";

        // As result, there are 2 branch on the local memory: master & task_1, and on the cloud memory we have only one branch: origin/master

        String step5 = "Add the change related to the task 1, being on the task_1 branch";
        String step6 = "Add the changes into the history of the local branch task_1 - git commit";
        String step7 = "Execute the command - git push - as result, there is created a new branch on GitHub called origin/task_1";

        // As result, there are 2 branches on local memory and 2 branches on the cloud memory - origin/master & origin/task_1

        String step8 = "Create a pull request from source origin/task_1 to origin/master - make sure you add the reviewers";
        String step9 = "If there are no comments and the code is approved (changes), then we merge the code";

        String step9_1 = "If there are some comments, then we go back to local branch task_1 -> IntelliJ IDEA";
        String step9_2 = "We add the changes and modify the last commit by using the git commit amend";
        String step9_3 = "Then we have to execute the git push -f command";


        // As result, the origin/master will have the latest code that was previously added in the origin/task_1

        String step10 = "Go back to IntelliJ IDEA where we are on task_1 branch, and move to master - git checkout master";
        String step11 = "Execute the commands git fetch and git pull to download the latest changes that were added to origin/master";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
    }
}
