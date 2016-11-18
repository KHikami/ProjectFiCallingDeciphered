package p000;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public final class avn implements auh<Uri, InputStream> {
    public final Context f2401a;

    public /* bridge */ /* synthetic */ aui mo377a(Object obj, int i, int i2, anz anz) {
        return m4123a((Uri) obj, i, i2);
    }

    public /* synthetic */ boolean mo378a(Object obj) {
        return gwb.m2153d((Uri) obj);
    }

    public avn(Context context) {
        this.f2401a = context.getApplicationContext();
    }

    private aui m4123a(Uri uri, int i, int i2) {
        if (!gwb.m2109c(i, i2)) {
            return null;
        }
        anv bag = new bag(uri);
        Context context = this.f2401a;
        return new aui(bag, aow.m3593a(context, uri, new aox(context.getContentResolver())));
    }
}
