import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

public final class avg implements auj<Uri, InputStream>, avf<InputStream> {
    private final ContentResolver a;

    public avg(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public aoe<InputStream> a(Uri uri) {
        return new aou(this.a, uri);
    }

    public auh<Uri, InputStream> a(aup aup) {
        return new avd(this);
    }
}
