import android.content.Context;
import android.content.CursorLoader;
import android.provider.ContactsContract.Contacts;

/* compiled from: PG */
public final class abk {
    private static String[] a;

    static {
        a = new String[]{"_id", "display_name", "starred", "photo_uri", "lookup", "data1", "data2", "data3", "is_super_primary", "pinned", "contact_id", "display_name_alt"};
        String[] strArr = new String[]{"_id", "display_name", "starred", "photo_uri", "lookup", "contact_presence", "contact_status"};
    }

    public static CursorLoader a(Context context) {
        return new CursorLoader(context, Contacts.CONTENT_STREQUENT_URI.buildUpon().appendQueryParameter("strequent_phone_only", "true").build(), a, null, null, null);
    }
}
