import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class awr {
    public static final String[] a;
    public static int b;
    public static int c;
    private static final String[] d;

    static {
        d = new String[]{"_id", "number", "date", "duration", "type", "countryiso", "voicemail_uri", "geocoded_location", "name", "numbertype", "numberlabel", "lookup_uri", "matched_number", "normalized_number", "photo_id", "formatted_number", "is_read", "presentation", "subscription_component_name", "subscription_id", "features", "data_usage", "transcription", "photo_uri"};
        b = -1;
        c = -1;
        List arrayList = new ArrayList(Arrays.asList(d));
        if (buf.c()) {
            arrayList.add("post_dial_digits");
            b = arrayList.size() - 1;
            arrayList.add("via_number");
            c = arrayList.size() - 1;
        }
        a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
