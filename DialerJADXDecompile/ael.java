import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class ael {
    public static final String[] a;
    public static final String[] b;
    private static String[] c;
    private static String[] d;

    static {
        c = new String[]{"_id", "data2", "data3", "data1", "contact_id", "lookup", "photo_id", "display_name", "photo_thumb_uri"};
        d = new String[]{"_id", "data2", "data3", "data1", "contact_id", "lookup", "photo_id", "display_name_alt", "photo_thumb_uri"};
        List arrayList = new ArrayList(Arrays.asList(c));
        if (abw.g()) {
            arrayList.add("carrier_presence");
        }
        a = (String[]) arrayList.toArray(new String[arrayList.size()]);
        arrayList = new ArrayList(Arrays.asList(d));
        if (abw.g()) {
            arrayList.add("carrier_presence");
        }
        b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
