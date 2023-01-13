package me.ravvcheck.lab4.dop;

public enum State {
    MERCILESSLY("немилосердно"), STUFFY("душно"), SOON("скоро"), UNBEARABLY("нестерпимо");
    private String value;
    private State(String s){
        value = s;
    }
    @Override
    public String toString(){
        return value;
    }
}
