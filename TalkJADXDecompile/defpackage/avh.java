package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: avh */
public final class avh<Data> implements auh<Uri, Data> {
    private static final Set<String> a;
    private final auh<atu, Data> b;

    public /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    static {
        a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    }

    public avh(auh<atu, Data> auh_atu__Data) {
        this.b = auh_atu__Data;
    }

    private aui<Data> a(Uri uri, int i, int i2, anz anz) {
        return this.b.a(new atu(uri.toString()), i, i2, anz);
    }
}
