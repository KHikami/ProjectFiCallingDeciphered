package defpackage;

import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Phone;

/* compiled from: PG */
/* renamed from: awa */
public interface awa {
    public static final Uri a;
    public static final String[] b;

    static {
        a = Phone.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").appendQueryParameter("remove_duplicate_entries", "true").build();
        b = new String[]{"_id", "data2", "data3", "data1", "contact_id", "lookup", "display_name", "photo_id", "last_time_used", "times_used", "starred", "is_super_primary", "in_visible_group", "is_primary", "carrier_presence"};
    }
}
