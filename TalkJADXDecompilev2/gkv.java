package defpackage;

import java.io.Serializable;

public final class gkv<F extends Serializable, S extends Serializable> implements Serializable {
    private static final long serialVersionUID = 1;
    public final F a;
    public final S b;

    public gkv(F f, S s) {
        this.a = f;
        this.b = s;
    }
}
