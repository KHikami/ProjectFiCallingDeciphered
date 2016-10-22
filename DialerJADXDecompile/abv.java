import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Callable;

/* compiled from: PG */
public final class abv {
    private static final Uri a;

    static {
        a = Uri.withAppendedPath(Callable.CONTENT_URI, "filter_enterprise");
    }

    public static Uri a() {
        if (buf.c()) {
            return a;
        }
        return Callable.CONTENT_FILTER_URI;
    }
}
