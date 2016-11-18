package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class avd<Data> implements auh<Uri, Data> {
    private static final Set<String> f2390a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    private final avf<Data> f2391b;

    public /* bridge */ /* synthetic */ aui mo377a(Object obj, int i, int i2, anz anz) {
        return m4103a((Uri) obj);
    }

    public /* synthetic */ boolean mo378a(Object obj) {
        return f2390a.contains(((Uri) obj).getScheme());
    }

    public avd(avf<Data> avf_Data) {
        this.f2391b = avf_Data;
    }

    private aui m4103a(Uri uri) {
        return new aui(new bag(uri), this.f2391b.mo392a(uri));
    }
}
