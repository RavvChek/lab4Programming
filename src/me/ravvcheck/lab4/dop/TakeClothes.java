package me.ravvcheck.lab4.dop;

import me.ravvcheck.lab4.person.Thing;

public interface TakeClothes {
    default void notTakeOff(){
        throw new NotTakeOffClothes("он не снимал одежду");
    }

    void takeOff(Thing obj);
}
