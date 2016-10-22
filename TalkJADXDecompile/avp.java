import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public final class avp implements auh<Uri, InputStream> {
    private final Context a;

    public /* synthetic */ boolean a(Object obj) {
        return gwb.c((Uri) obj);
    }

    avp(Context context) {
        this.a = context.getApplicationContext();
    }

    private aui<InputStream> a(Uri uri, int i, int i2, anz anz) {
        if (gwb.c(i, i2)) {
            Object obj;
            Long l = (Long) anz.a(axc.a);
            if (l == null || l.longValue() != -1) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj != null) {
                anv bag = new bag(uri);
                Context context = this.a;
                return new aui(bag, aow.a(context, uri, new aoy(context.getContentResolver())));
            }
        }
        return null;
    }
}
