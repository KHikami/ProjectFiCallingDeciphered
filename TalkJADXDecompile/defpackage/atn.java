package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: atn */
final class atn implements atk<InputStream> {
    final /* synthetic */ atm a;

    atn(atm atm) {
        this.a = atm;
    }

    public /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public /* synthetic */ Object a(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            } else if (str.substring(0, indexOf).endsWith(";base64")) {
                return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
            } else {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }
        throw new IllegalArgumentException("Not a valid image data URL.");
    }
}
