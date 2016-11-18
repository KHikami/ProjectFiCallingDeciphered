package defpackage;

import java.io.IOException;

public final class dzo extends IOException {
    private static final long serialVersionUID = -2558890850533726919L;

    public dzo(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
