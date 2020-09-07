package com.company;

public class Fridge {

    int heightInCM;
    Elephant storage;
    Lion storage2;

    /**
     * 实例方法
     * 对象就是实例
     */
    void printFridgeInfo() {
        System.out.printf("%d厘米高的冰箱中，保存了一个%d厘米高的大象\n", heightInCM, storage.heightInCM);
    }

    void Store(Fridge fridge,Elephant elephant){
        fridge.storage = elephant;
    }

    void Store(Fridge fridge,Lion lion){
        fridge.storage2 = lion;
    }


    Elephant RemoveElephant(Fridge fridge){
        Elephant push = fridge.storage;
        fridge.storage = null;
        return push;
    }
}
