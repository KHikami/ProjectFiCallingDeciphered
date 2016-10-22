package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: avq */
public final class avq implements auj<Uri, InputStream> {
    private final Context a;

    public avq(Context context) {
        this.a = context;
    }

    public auh<Uri, InputStream> a(aup aup) {
        return new avp(this.a);
    }
}
