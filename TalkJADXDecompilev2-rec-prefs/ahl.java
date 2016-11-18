package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public final class ahl extends ib {
    private final Uri f802w;
    private final String[] f803x;

    public /* synthetic */ Object mo213d() {
        return mo218h();
    }

    public ahl(Context context, Uri uri, String[] strArr) {
        super(context);
        this.f802w = uri;
        if (strArr == null) {
            strArr = ahm.f804a;
        }
        this.f803x = strArr;
    }

    public Cursor mo218h() {
        m1324a(this.f802w.buildUpon().appendQueryParameter("contentType", "image/").build());
        m1327a(this.f803x);
        return super.mo218h();
    }
}
