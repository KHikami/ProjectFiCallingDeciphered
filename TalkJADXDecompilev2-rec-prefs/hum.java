package p000;

import android.net.Uri;
import android.provider.ContactsContract.Data;

public interface hum {
    public static final Uri f17300a;
    public static final Uri f17301b;

    static {
        Uri withAppendedPath = Uri.withAppendedPath(Data.CONTENT_URI, "contactables");
        f17300a = withAppendedPath;
        f17301b = Uri.withAppendedPath(withAppendedPath, "filter");
    }
}
