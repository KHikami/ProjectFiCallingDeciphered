package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class avh<Data> implements auh<Uri, Data> {
    private static final Set<String> f2394a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    private final auh<atu, Data> f2395b;

    public /* synthetic */ boolean mo378a(Object obj) {
        return f2394a.contains(((Uri) obj).getScheme());
    }

    public avh(auh<atu, Data> auh_atu__Data) {
        this.f2395b = auh_atu__Data;
    }

    private aui<Data> m4111a(Uri uri, int i, int i2, anz anz) {
        return this.f2395b.mo377a(new atu(uri.toString()), i, i2, anz);
    }
}
