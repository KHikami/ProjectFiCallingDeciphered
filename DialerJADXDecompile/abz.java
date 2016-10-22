import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Phone;

/* compiled from: PG */
public final class abz {
    private static final Uri a;

    static {
        a = Uri.withAppendedPath(Phone.CONTENT_URI, "filter_enterprise");
    }

    public static Uri a() {
        if (buf.c()) {
            return a;
        }
        return Phone.CONTENT_FILTER_URI;
    }
}
