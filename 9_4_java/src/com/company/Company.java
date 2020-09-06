package com.company;

public class Company {
    /*
    人 老板 员工 学员
    产品
    部门
    研发3个 招生3个 教学3个 后勤1个
    每个人都有上司(除了老板)
    完成对人和部门的增删改查
     */
    private Branch[] branchlist = new Branch[100];
    private People boss = new People("阿巴阿巴",1);
    private String name;
    private int BranchNum = 0;
    public void CreateBranch(String NewBranch){
        Branch newone = new Branch(NewBranch);
        branchlist[BranchNum] = newone;
        BranchNum++;
    }
    public void Payoff(Branch one){
        for(int i=0;i<=one.PeopleNumber;i++){
            one.peoplelist[i].balance += one.peoplelist[i].salary;
            System.out.println("部门"+ one.BranchName+"中的成员" + one.peoplelist[i].name +"领取了工资：" + one.peoplelist[i].salary);
        }
    }

}
