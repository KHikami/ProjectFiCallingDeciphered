package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: ahq */
public class ahq {
    public final ContentResolver a;
    public final Uri b;

    public InputStream a() {
        return this.a.openInputStream(this.b);
    }

    public ahq(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
    }
}
