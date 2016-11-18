package defpackage;

import java.io.Serializable;

public final class etw implements Serializable {
    private static final long serialVersionUID = 1;
    public final int a = 0;
    public final String b;

    public etw(ltw ltw) {
        this.b = ltw.b;
    }
}
