package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bgy */
public final class bgy {
    String a;
    List b;
    Map c;
    String d;
    List e;
    byte[] f;

    public bgy() {
        this.c = new HashMap();
    }

    public final void a(String str) {
        if (this.a != null) {
            Log.w("vCard", String.format("Property name is re-defined (existing: %s, requested: %s", new Object[]{this.a, str}));
        }
        this.a = str;
    }

    public final void a(String str, String str2) {
        Collection collection;
        if (this.c.containsKey(str)) {
            collection = (Collection) this.c.get(str);
        } else {
            if (str.equals("TYPE")) {
                collection = new HashSet();
            } else {
                collection = new ArrayList();
            }
            this.c.put(str, collection);
        }
        collection.add(str2);
    }

    public final Collection b(String str) {
        return (Collection) this.c.get(str);
    }
}
