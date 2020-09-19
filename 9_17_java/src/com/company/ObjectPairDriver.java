package com.company;

public class ObjectPairDriver {
    public static void main(String[] args) {
        ObjectPair[] stadiums = new ObjectPair[5];
        ObjectPair<Integer,String> stadium1 = new ObjectPair<>(1,"1球场");
        ObjectPair<Integer,String> stadium2 = new ObjectPair<>(2,"2球场");
        ObjectPair<Integer,String> stadium3 = new ObjectPair<>(3,"3球场");
        ObjectPair<Integer,String> stadium4 = new ObjectPair<>(4,"4球场");
        ObjectPair<Integer,String> stadium5 = new ObjectPair<>(5,"奥体球场");
        stadiums[0] = stadium1;
        stadiums[1] = stadium2;
        stadiums[2] = stadium3;
        stadiums[3] = stadium4;
        stadiums[4] = stadium5;
        System.out.println(ObjectPairDriver.largestStadium(stadiums));




    }

    public static String largestStadium(ObjectPair<Integer,String>[] stadiums){
        String index = null;
        for(int i=0;i< stadiums.length-1; i++){
            String name = stadiums[i].getSecond();
            if(stadiums[i+1].getFirst() > stadiums[i].getFirst()){
                name = stadiums[i+1].getSecond();
            }
            index = name;
        }
        return index;
    }
}
