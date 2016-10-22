package defpackage;

import java.io.IOException;

/* renamed from: jul */
public final class jul extends IOException {
    private final int a;
    private final String b;

    public jul(int i, String str) {
        super(new StringBuilder(String.valueOf(str).length() + 13).append(i).append(": ").append(str).toString());
        this.a = i;
        this.b = str;
    }

    public int a() {
        return this.a;
    }
}
