package p000;

import java.io.IOException;

public final class anu extends IOException {
    private final int f1944a;

    public anu(int i) {
        this("Http request failed with status code: " + i, i);
    }

    public anu(String str) {
        this(str, -1);
    }

    public anu(String str, int i) {
        this(str, i, null);
    }

    private anu(String str, int i, Throwable th) {
        super(str, null);
        this.f1944a = i;
    }

    public int m3519a() {
        return this.f1944a;
    }
}
