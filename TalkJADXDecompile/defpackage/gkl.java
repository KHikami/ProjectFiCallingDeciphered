package defpackage;

import android.net.Uri;

/* renamed from: gkl */
final class gkl {
    int a;
    Uri b;
    boolean c;
    int d;
    float e;
    long f;
    boolean g;

    gkl() {
    }

    public String toString() {
        int i = this.a;
        boolean z = this.c;
        int i2 = this.d;
        String valueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 58).append("{ code=").append(i).append(" looping=").append(z).append(" stream=").append(i2).append(" uri=").append(valueOf).append(" }").toString();
    }
}
