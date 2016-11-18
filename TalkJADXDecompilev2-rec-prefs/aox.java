package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;

public final class aox implements aoz {
    private static final String[] f1980b = new String[]{"_data"};
    private final ContentResolver f1981a;

    public aox(ContentResolver contentResolver) {
        this.f1981a = contentResolver;
    }

    public Cursor mo324a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f1981a.query(Thumbnails.EXTERNAL_CONTENT_URI, f1980b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
