package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class mfq {
    final mdz f27620a;
    final boolean f27621b;
    final int f27622c;
    private final mfs f27623d;

    private mfq(mfs mfs) {
        this(mfs, false, mdz.m31924a(), Integer.MAX_VALUE);
    }

    private mfq(mfs mfs, boolean z, mdz mdz, int i) {
        this.f27623d = mfs;
        this.f27621b = z;
        this.f27620a = mdz;
        this.f27622c = i;
    }

    public static mfq m31996a(char c) {
        Object a = mdz.m31925a(',');
        bm.m6122a(a);
        return new mfq(new mfs(a));
    }

    public mfq m31999a() {
        return m31997a(mdz.m31926b());
    }

    private mfq m31997a(mdz mdz) {
        bm.m6122a((Object) mdz);
        return new mfq(this.f27623d, this.f27621b, mdz, this.f27622c);
    }

    public List<String> m31998a(CharSequence charSequence) {
        bm.m6122a((Object) charSequence);
        Iterator a = this.f27623d.m32002a(this, charSequence);
        List arrayList = new ArrayList();
        while (a.hasNext()) {
            arrayList.add((String) a.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
