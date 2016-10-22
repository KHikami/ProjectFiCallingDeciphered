package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;

/* renamed from: fbj */
enum fbj extends fbe {
    fbj(String str, int i) {
        super(4, (byte) 0);
    }

    public Object a(Cursor cursor, int i) {
        Throwable e;
        try {
            return gld.a(cursor.getBlob(i));
        } catch (ClassNotFoundException e2) {
            e = e2;
            glk.c("Babel", "Deserialization failed", e);
            return null;
        } catch (IOException e3) {
            e = e3;
            glk.c("Babel", "Deserialization failed", e);
            return null;
        }
    }

    public void a(String str, Object obj, ContentValues contentValues) {
        try {
            contentValues.put(str, gld.a(obj));
        } catch (Throwable e) {
            glk.d("Babel", "Serialization failed", e);
            iil.a("Object serialization failed - not serializable?");
        }
    }
}
