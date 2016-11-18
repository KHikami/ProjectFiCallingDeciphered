package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class avl implements auh<Uri, InputStream> {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    private final auh<atu, InputStream> b;

    public /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    public avl(auh<atu, InputStream> auh_atu__java_io_InputStream) {
        this.b = auh_atu__java_io_InputStream;
    }

    private aui<InputStream> a(Uri uri, int i, int i2, anz anz) {
        return this.b.a(new atu(uri.toString()), i, i2, anz);
    }
}
