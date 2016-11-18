package p000;

import java.io.IOException;

public final class jul extends IOException {
    private final int f21071a;
    private final String f21072b;

    public jul(int i, String str) {
        super(new StringBuilder(String.valueOf(str).length() + 13).append(i).append(": ").append(str).toString());
        this.f21071a = i;
        this.f21072b = str;
    }

    public int m25240a() {
        return this.f21071a;
    }
}
