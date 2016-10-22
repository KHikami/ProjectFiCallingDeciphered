package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;

/* renamed from: aox */
public final class aox implements aoz {
    private static final String[] b;
    private final ContentResolver a;

    public aox(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    static {
        b = new String[]{"_data"};
    }

    public Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.a.query(Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
