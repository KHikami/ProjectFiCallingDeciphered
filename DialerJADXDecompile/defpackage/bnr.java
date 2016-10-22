package defpackage;

import android.content.Context;

/* renamed from: bnr */
public final class bnr {
    final Context a;
    final Context b;

    public bnr(Context context) {
        buf.A((Object) context);
        Object applicationContext = context.getApplicationContext();
        buf.d(applicationContext, (Object) "Application context can't be null");
        this.a = applicationContext;
        this.b = applicationContext;
    }
}
