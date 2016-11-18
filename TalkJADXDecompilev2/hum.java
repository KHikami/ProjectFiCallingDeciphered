package defpackage;

import android.net.Uri;
import android.provider.ContactsContract.Data;

public interface hum {
    public static final Uri a;
    public static final Uri b;

    static {
        Uri withAppendedPath = Uri.withAppendedPath(Data.CONTENT_URI, "contactables");
        a = withAppendedPath;
        b = Uri.withAppendedPath(withAppendedPath, "filter");
    }
}
