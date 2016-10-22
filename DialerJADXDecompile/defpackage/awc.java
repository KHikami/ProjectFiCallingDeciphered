package defpackage;

import android.net.Uri;
import android.provider.ContactsContract.Contacts;

/* compiled from: PG */
/* renamed from: awc */
public interface awc {
    public static final Uri a;
    public static final String[] b;

    static {
        a = Contacts.CONTENT_URI;
        b = new String[]{"_id"};
    }
}
