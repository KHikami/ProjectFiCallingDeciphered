package p000;

import java.util.concurrent.ThreadFactory;

final class aso implements ThreadFactory {
    final asq f2290a;
    final boolean f2291b;
    private final String f2292c;
    private int f2293d;

    aso(String str, asq asq, boolean z) {
        this.f2292c = str;
        this.f2290a = asq;
        this.f2291b = z;
    }

    public synchronized Thread newThread(Runnable runnable) {
        Thread asp;
        String str = this.f2292c;
        asp = new asp(this, runnable, new StringBuilder(String.valueOf(str).length() + 25).append("glide-").append(str).append("-thread-").append(this.f2293d).toString());
        this.f2293d++;
        return asp;
    }
}
