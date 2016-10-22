package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: aho */
final class aho extends ahq {
    private byte[] c;

    public aho(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public InputStream a() {
        if (this.c == null) {
            this.c = aho.a(this.b);
            if (this.c == null) {
                return super.a();
            }
        }
        return new ByteArrayInputStream(this.c);
    }

    private static byte[] a(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        try {
            if (schemeSpecificPart.startsWith("base64,")) {
                return Base64.decode(schemeSpecificPart.substring(7), 8);
            }
            if (ahn.a.matcher(schemeSpecificPart).matches()) {
                return Base64.decode(schemeSpecificPart.substring(schemeSpecificPart.indexOf("base64,") + 7), 0);
            }
            return null;
        } catch (IllegalArgumentException e) {
            schemeSpecificPart = String.valueOf(e);
            Log.e("ImageUtils", new StringBuilder(String.valueOf(schemeSpecificPart).length() + 21).append("Mailformed data URI: ").append(schemeSpecificPart).toString());
            return null;
        }
    }
}
