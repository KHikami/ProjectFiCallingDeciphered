package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: ast */
final class ast implements asw {
    private /* synthetic */ boolean a;
    private /* synthetic */ Uri b;
    private /* synthetic */ asp c;

    ast(asp asp, boolean z, Uri uri) {
        this.c = asp;
        this.a = z;
        this.b = uri;
    }

    public final void a(boolean z) {
        if (z) {
            this.c.a(this.b, this.a);
        } else {
            this.c.a(this.a ? 1 : 2);
        }
    }
}
