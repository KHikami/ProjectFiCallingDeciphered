package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: avn */
public final class avn implements auh<Uri, InputStream> {
    public final Context a;

    public /* bridge */ /* synthetic */ aui a(Object obj, int i, int i2, anz anz) {
        return a((Uri) obj, i, i2);
    }

    public /* synthetic */ boolean a(Object obj) {
        return gwb.d((Uri) obj);
    }

    public avn(Context context) {
        this.a = context.getApplicationContext();
    }

    private aui a(Uri uri, int i, int i2) {
        if (!gwb.c(i, i2)) {
            return null;
        }
        anv bag = new bag(uri);
        Context context = this.a;
        return new aui(bag, aow.a(context, uri, new aox(context.getContentResolver())));
    }
}
