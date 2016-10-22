import android.net.Uri;
import android.provider.ContactsContract.Contacts;

/* compiled from: PG */
public final class abx {
    private static final Uri a;

    static {
        a = Uri.withAppendedPath(Contacts.CONTENT_URI, "filter_enterprise");
    }

    public static Uri a() {
        if (buf.c()) {
            return a;
        }
        return Contacts.CONTENT_FILTER_URI;
    }

    public static boolean a(long j) {
        if (abw.h()) {
            return Contacts.isEnterpriseContactId(j);
        }
        return j >= 1000000000 && j < 9223372034707292160L;
    }
}
