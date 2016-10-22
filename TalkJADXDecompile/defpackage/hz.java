package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: hz */
final class hz extends hy {
    hz() {
    }

    public Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, ka kaVar) {
        Object c;
        if (kaVar != null) {
            try {
                c = kaVar.c();
            } catch (Exception e) {
                if (gwb.a(e)) {
                    throw new kb();
                }
                throw e;
            }
        }
        c = null;
        return gwb.a(contentResolver, uri, strArr, str, strArr2, str2, c);
    }
}
