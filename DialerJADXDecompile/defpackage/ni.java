package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ni */
public class ni {
    final /* synthetic */ nb a;

    public Object a(int i) {
        mr a = this.a.a(i);
        if (a == null) {
            return null;
        }
        return a.b;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return this.a.a(i, i2, bundle);
    }

    public List a(String str, int i) {
        List list = null;
        nb.a();
        List arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((mr) list.get(i2)).b);
        }
        return arrayList;
    }

    public Object b(int i) {
        nb.b();
        return null;
    }

    ni(ne neVar, nb nbVar) {
        this.a = nbVar;
    }
}
