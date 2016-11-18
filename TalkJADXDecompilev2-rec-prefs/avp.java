package p000;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public final class avp implements auh<Uri, InputStream> {
    private final Context f2403a;

    public /* synthetic */ boolean mo378a(Object obj) {
        return gwb.m2113c((Uri) obj);
    }

    avp(Context context) {
        this.f2403a = context.getApplicationContext();
    }

    private aui<InputStream> m4127a(Uri uri, int i, int i2, anz anz) {
        if (gwb.m2109c(i, i2)) {
            Object obj;
            Long l = (Long) anz.m3528a(axc.f2469a);
            if (l == null || l.longValue() != -1) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj != null) {
                anv bag = new bag(uri);
                Context context = this.f2403a;
                return new aui(bag, aow.m3593a(context, uri, new aoy(context.getContentResolver())));
            }
        }
        return null;
    }
}
