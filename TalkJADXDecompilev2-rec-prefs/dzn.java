package p000;

import java.io.Closeable;
import java.io.InputStream;

public final class dzn implements Closeable {
    final /* synthetic */ dzi f10926a;
    private final String f10927b;
    private final long f10928c;
    private final InputStream[] f10929d;

    dzn(dzi dzi, String str, long j, InputStream[] inputStreamArr) {
        this.f10926a = dzi;
        this.f10927b = str;
        this.f10928c = j;
        this.f10929d = inputStreamArr;
    }

    public InputStream m13177a(int i) {
        return this.f10929d[0];
    }

    public void close() {
        for (Closeable a : this.f10929d) {
            dzi.m13153a(a);
        }
    }
}
