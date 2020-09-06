package com.company;

public class TestCompany {
    public static void main(String[] args) {
        Company BanYuan = new Company();
        People zhang3 = new People("zhang3",1);
        Branch YanFa = new Branch("YanFa");
        YanFa.AddStaff(zhang3);
        BanYuan.Payoff(YanFa);
    }
}
