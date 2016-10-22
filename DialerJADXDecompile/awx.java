import android.net.Uri;

/* compiled from: PG */
final class awx {
    public static final String[] a;
    private static final String[] b;
    private static final String[] c;

    static {
        a = new String[]{"display_name_alt"};
        b = new String[]{"contact_id", "display_name", "type", "label", "number", "normalized_number", "photo_id", "lookup", "photo_uri"};
        c = new String[]{"_id", "display_name", "type", "label", "number", "normalized_number", "photo_id", "lookup", "photo_uri"};
    }

    public static String[] a(Uri uri) {
        if (buf.c()) {
            return b;
        }
        if (uri.getBooleanQueryParameter("sip", false)) {
            return b;
        }
        return c;
    }
}
