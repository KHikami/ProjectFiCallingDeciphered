package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: aml */
final class aml {
    public static final String[] a;
    private static final String[] b;

    static {
        b = new String[]{"date", "duration", "number", "type", "countryiso", "geocoded_location", "presentation", "subscription_component_name", "subscription_id", "features", "data_usage", "transcription"};
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(b));
        if (buf.c()) {
            arrayList.add("post_dial_digits");
            arrayList.add("via_number");
        }
        arrayList.trimToSize();
        a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
