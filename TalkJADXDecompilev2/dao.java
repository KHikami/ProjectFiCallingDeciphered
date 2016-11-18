package defpackage;

import java.io.Serializable;

public final class dao extends dam implements Serializable {
    public final String a;

    public dao(String str) {
        this.a = str;
    }

    public String toString() {
        return this.a;
    }
}
