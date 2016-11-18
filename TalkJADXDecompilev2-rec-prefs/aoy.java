package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Video.Thumbnails;

public final class aoy implements aoz {
    private static final String[] f1982b = new String[]{"_data"};
    private final ContentResolver f1983a;

    public aoy(ContentResolver contentResolver) {
        this.f1983a = contentResolver;
    }

    public Cursor mo324a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f1983a.query(Thumbnails.EXTERNAL_CONTENT_URI, f1982b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }
}
