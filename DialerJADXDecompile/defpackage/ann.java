package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: ann */
public abstract class ann {
    public abstract Intent a(Context context);

    static {
        ann.class.getSimpleName();
    }

    public static ann a() {
        return new anq();
    }

    public static ann c(String str) {
        return new anr(str);
    }

    public static ann a(long j, long[] jArr, String str) {
        return new ans(null, jArr, j);
    }

    public static ann a(Uri uri, CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        return new ant(uri, z, charSequence, charSequence2, i);
    }

    public static ann a(String str) {
        return new ano(str, null);
    }

    public static ann b(String str) {
        return new anp(str, null);
    }
}
