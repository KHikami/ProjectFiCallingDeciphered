package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class aho extends ahq {
    private byte[] f810c;

    public aho(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public InputStream mo219a() {
        if (this.f810c == null) {
            this.f810c = aho.m1343a(this.f809b);
            if (this.f810c == null) {
                return super.mo219a();
            }
        }
        return new ByteArrayInputStream(this.f810c);
    }

    private static byte[] m1343a(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        try {
            if (schemeSpecificPart.startsWith("base64,")) {
                return Base64.decode(schemeSpecificPart.substring(7), 8);
            }
            if (ahn.f806a.matcher(schemeSpecificPart).matches()) {
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
