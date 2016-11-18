package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;

enum fbj extends fbe {
    fbj(String str, int i) {
        super(str, 4);
    }

    public Object mo1963a(Cursor cursor, int i) {
        Throwable e;
        try {
            return gld.m17927a(cursor.getBlob(i));
        } catch (ClassNotFoundException e2) {
            e = e2;
            glk.m17978c("Babel", "Deserialization failed", e);
            return null;
        } catch (IOException e3) {
            e = e3;
            glk.m17978c("Babel", "Deserialization failed", e);
            return null;
        }
    }

    public void mo1964a(String str, Object obj, ContentValues contentValues) {
        try {
            contentValues.put(str, gld.m17940a(obj));
        } catch (Throwable e) {
            glk.m17980d("Babel", "Serialization failed", e);
            iil.m21870a("Object serialization failed - not serializable?");
        }
    }
}
