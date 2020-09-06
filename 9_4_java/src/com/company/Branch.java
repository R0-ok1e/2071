package com.company;

public class Branch {
    public String BranchName;
    public People[] peoplelist = new People[100];
    public int PeopleNumber = 0;
    private int CurNum = 0;
    Branch(String name){
        BranchName = name;
    }
    public void AddStaff(People newone){
        if(PeopleNumber<100){
            peoplelist[CurNum] = newone;
            CurNum++;
            PeopleNumber++;
        }else {
            System.out.println("已达员工上限");
        }

    }

}
