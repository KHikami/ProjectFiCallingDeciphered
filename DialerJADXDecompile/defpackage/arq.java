package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.telecom.PhoneAccountHandle;

/* compiled from: PG */
/* renamed from: arq */
public final class arq {
    public int a;
    public PhoneAccountHandle b;
    public boolean c;
    private Uri d;

    public arq(Uri uri) {
        this.c = false;
        this.d = uri;
    }

    public arq(String str) {
        this(buf.e(str));
    }

    public final Intent a() {
        return buf.a(this.d, this.b, this.c ? 3 : 0, this.a);
    }
}
