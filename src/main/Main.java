package main;

import main.BranchMethod;

public class Main {
    public static void main(String[] args) {
        BranchMethod branchMethod = new BranchMethod();
        System.out.println(branchMethod.myMethodWithBranches(1,2));
        System.out.println(branchMethod.myMethodWithBranches(5,3));
        System.out.println(branchMethod.myMethodWithBranches(6,0));
        System.out.println(branchMethod.myMethodWithBranches(3,7));
    }

}
