package me.ravvcheck.lab4.dop;

import me.ravvcheck.lab4.person.Thing;

public interface TakeClothes {
    default void notTakeOff(){
        System.out.println("он не снимал одежду");
    }

    void takeOff(Thing obj);
}
