package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

final class hz extends hy {
    hz() {
    }

    public Cursor mo3082a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, ka kaVar) {
        Object c;
        if (kaVar != null) {
            try {
                c = kaVar.m25496c();
            } catch (Exception e) {
                if (gwb.m1932a(e)) {
                    throw new kb();
                }
                throw e;
            }
        }
        c = null;
        return gwb.m1559a(contentResolver, uri, strArr, str, strArr2, str2, c);
    }
}
