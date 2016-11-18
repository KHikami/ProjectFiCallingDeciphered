package p000;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class avl implements auh<Uri, InputStream> {
    private static final Set<String> f2399a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    private final auh<atu, InputStream> f2400b;

    public /* synthetic */ boolean mo378a(Object obj) {
        return f2399a.contains(((Uri) obj).getScheme());
    }

    public avl(auh<atu, InputStream> auh_atu__java_io_InputStream) {
        this.f2400b = auh_atu__java_io_InputStream;
    }

    private aui<InputStream> m4119a(Uri uri, int i, int i2, anz anz) {
        return this.f2400b.mo377a(new atu(uri.toString()), i, i2, anz);
    }
}
