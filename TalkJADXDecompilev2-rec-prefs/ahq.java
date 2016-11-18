package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

public class ahq {
    public final ContentResolver f808a;
    public final Uri f809b;

    public InputStream mo219a() {
        return this.f808a.openInputStream(this.f809b);
    }

    public ahq(ContentResolver contentResolver, Uri uri) {
        this.f808a = contentResolver;
        this.f809b = uri;
    }
}
