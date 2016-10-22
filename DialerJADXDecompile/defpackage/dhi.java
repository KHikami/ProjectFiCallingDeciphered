package defpackage;

import java.net.URI;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: dhi */
public final class dhi extends dhg {
    public static final dhi a;
    private final CopyOnWriteArrayList c;
    private final String d;

    static {
        a = new dhi(dgh.a);
    }

    private dhi(dhg dhg) {
        this.c = new CopyOnWriteArrayList();
        this.c.add(0, dhg);
        this.d = (String) cob.b(dhg.a(), (Object) "defaultScheme");
    }

    public final dhf a(URI uri, dfc dfc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            dhf a = ((dhg) it.next()).a(uri, dfc);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public final String a() {
        return this.d;
    }
}
