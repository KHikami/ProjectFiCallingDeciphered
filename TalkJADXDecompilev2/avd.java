package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class avd<Data> implements auh<Uri, Data> {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    private final avf<Data> b;

    public /* bridge */ /* synthetic */ aui a(Object obj, int i, int i2, anz anz) {
        return a((Uri) obj);
    }

    public /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    public avd(avf<Data> avf_Data) {
        this.b = avf_Data;
    }

    private aui a(Uri uri) {
        return new aui(new bag(uri), this.b.a(uri));
    }
}
