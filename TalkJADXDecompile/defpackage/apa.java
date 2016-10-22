package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: apa */
final class apa {
    private static final aov a;
    private final aov b;
    private final aoz c;
    private final aqy d;
    private final ContentResolver e;

    static {
        a = new aov();
    }

    public apa(aoz aoz, aqy aqy, ContentResolver contentResolver) {
        this(a, aoz, aqy, contentResolver);
    }

    private apa(aov aov, aoz aoz, aqy aqy, ContentResolver contentResolver) {
        this.b = aov;
        this.c = aoz;
        this.d = aqy;
        this.e = contentResolver;
    }

    public int a(Uri uri) {
        int i = -1;
        InputStream inputStream = null;
        try {
            inputStream = this.e.openInputStream(uri);
            i = new ImageHeaderParser(inputStream, this.d).c();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        } catch (IOException e2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                String valueOf = String.valueOf(uri);
                new StringBuilder(String.valueOf(valueOf).length() + 20).append("Failed to open uri: ").append(valueOf);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                }
            }
        }
        return i;
    }

    public InputStream b(Uri uri) {
        Cursor a = this.c.a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    Object string = a.getString(0);
                    if (!TextUtils.isEmpty(string)) {
                        Uri uri2;
                        File file = new File(string);
                        if (!file.exists() || file.length() <= 0) {
                            uri2 = null;
                        } else {
                            uri2 = Uri.fromFile(file);
                        }
                        if (a != null) {
                            a.close();
                        }
                        if (uri2 != null) {
                            return this.e.openInputStream(uri2);
                        }
                        return null;
                    } else if (a == null) {
                        return null;
                    } else {
                        a.close();
                        return null;
                    }
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.close();
                }
            }
        }
        if (a == null) {
            return null;
        }
        a.close();
        return null;
    }
}
