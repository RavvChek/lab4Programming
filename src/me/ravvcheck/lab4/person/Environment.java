package me.ravvcheck.lab4.person;

import me.ravvcheck.lab4.dop.State;

public class Environment {
    private State TYPE1;
    private State TYPE2;
    Environment(State type1, State type2){
        TYPE1 = type1;
        TYPE2 = type2;
    }
    public void influence() {
        if (TYPE1 == State.STUFFY & TYPE2 == State.UNBEARABLY) {
            System.out.println("было нестерпимо душно");
        }
    }
}