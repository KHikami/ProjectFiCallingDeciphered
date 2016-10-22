import android.net.Uri;
import java.util.Objects;

/* compiled from: PG */
public final class ajf {
    public final String a;
    public final Uri b;
    public final String c;

    public ajf(String str, Uri uri) {
        this(str, uri, null);
    }

    private ajf(String str, Uri uri, String str2) {
        this.a = (String) Objects.requireNonNull(str);
        this.b = (Uri) Objects.requireNonNull(uri);
        this.c = null;
    }
}
