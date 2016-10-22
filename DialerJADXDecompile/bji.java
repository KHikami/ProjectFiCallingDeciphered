import android.net.Uri;

/* compiled from: PG */
public final class bji {
    public static final Uri a;
    public static final Uri b;
    private static Uri c;
    private static Uri d;

    static {
        Uri parse = Uri.parse("content://com.google.android.dialer.cacheprovider");
        c = parse;
        a = Uri.withAppendedPath(parse, "contact");
        d = Uri.withAppendedPath(c, "photo");
        b = Uri.withAppendedPath(c, "thumbnail");
    }

    public static Uri a(String str) {
        return d.buildUpon().appendPath(str).build();
    }
}
