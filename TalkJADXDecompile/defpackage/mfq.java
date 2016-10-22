package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: mfq */
public final class mfq {
    final mdz a;
    final boolean b;
    final int c;
    private final mfs d;

    private mfq(mfs mfs) {
        this(mfs, false, mdz.a(), Integer.MAX_VALUE);
    }

    private mfq(mfs mfs, boolean z, mdz mdz, int i) {
        this.d = mfs;
        this.b = z;
        this.a = mdz;
        this.c = i;
    }

    public static mfq a(char c) {
        Object a = mdz.a(',');
        bm.a(a);
        return new mfq(new mfs(a));
    }

    public mfq a() {
        return a(mdz.b());
    }

    private mfq a(mdz mdz) {
        bm.a((Object) mdz);
        return new mfq(this.d, this.b, mdz, this.c);
    }

    public List<String> a(CharSequence charSequence) {
        bm.a((Object) charSequence);
        Iterator a = this.d.a(this, charSequence);
        List arrayList = new ArrayList();
        while (a.hasNext()) {
            arrayList.add((String) a.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
