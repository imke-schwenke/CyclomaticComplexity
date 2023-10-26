package main;

public class BranchMethod {

    public BranchMethod(){}

    public static int myMethodWithBranches(int starter, int multiplier){
        int multiplication = 0;
        if(multiplier == 0){
            return starter;
        }
        else{
            if(starter > multiplier){
                starter -= multiplier;
            }
            else starter += multiplier;
            multiplication = starter;
            while(multiplication < 100){
                multiplication *= multiplier;
            }
            return multiplication;
        }

    }
}
