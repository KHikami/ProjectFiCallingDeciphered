package p000;

import java.util.Observable;

public class gln extends Observable {
    public String f15584a;

    public String m17986a() {
        return this.f15584a;
    }

    public gln(byte b) {
        this();
    }

    public void m17987a(String str) {
        if (!gwb.m2223g(this.f15584a, (Object) str)) {
            this.f15584a = str;
            setChanged();
            notifyObservers();
        }
    }
}
