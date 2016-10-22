import android.net.Uri;
import android.provider.ContactsContract.DeletedContacts;

/* compiled from: PG */
public interface avz {
    public static final Uri a;
    public static final String[] b;

    static {
        a = DeletedContacts.CONTENT_URI;
        b = new String[]{"contact_id", "contact_deleted_timestamp"};
    }
}
