package p000;

import java.util.Observable;

public class glm extends Observable {
    public boolean f15583a;

    public boolean m17985a() {
        return this.f15583a;
    }

    public glm(byte b) {
        this();
    }

    public void m17984a(boolean z) {
        if (!gwb.m2223g(Boolean.valueOf(this.f15583a), Boolean.valueOf(z))) {
            this.f15583a = z;
            setChanged();
            notifyObservers();
        }
    }
}
