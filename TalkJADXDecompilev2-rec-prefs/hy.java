package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

class hy {
    public Cursor mo3082a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, ka kaVar) {
        if (kaVar != null) {
            kaVar.m25494a();
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2);
    }

    hy() {
    }
}
