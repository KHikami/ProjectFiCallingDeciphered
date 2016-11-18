package p000;

import java.io.Serializable;

public final class bhc implements Serializable {
    private final String f3343a;

    public bhc(String str) {
        this.f3343a = str;
    }

    public boolean m5246a(bhc bhc) {
        return this.f3343a.equals(bhc.f3343a);
    }

    public String toString() {
        return this.f3343a;
    }
}
