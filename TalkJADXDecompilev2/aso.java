package defpackage;

import java.util.concurrent.ThreadFactory;

final class aso implements ThreadFactory {
    final asq a;
    final boolean b;
    private final String c;
    private int d;

    aso(String str, asq asq, boolean z) {
        this.c = str;
        this.a = asq;
        this.b = z;
    }

    public synchronized Thread newThread(Runnable runnable) {
        Thread asp;
        String str = this.c;
        asp = new asp(this, runnable, new StringBuilder(String.valueOf(str).length() + 25).append("glide-").append(str).append("-thread-").append(this.d).toString());
        this.d++;
        return asp;
    }
}
