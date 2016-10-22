package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: ahl */
public final class ahl extends ib {
    private final Uri w;
    private final String[] x;

    public /* synthetic */ Object d() {
        return h();
    }

    public ahl(Context context, Uri uri, String[] strArr) {
        super(context);
        this.w = uri;
        if (strArr == null) {
            strArr = ahm.a;
        }
        this.x = strArr;
    }

    public Cursor h() {
        a(this.w.buildUpon().appendQueryParameter("contentType", "image/").build());
        a(this.x);
        return super.h();
    }
}
