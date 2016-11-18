package defpackage;

import java.io.Serializable;

public final class eic implements Serializable {
    public final String a;
    public final boolean b;

    public eic(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
