package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;

final class hug extends hwl {
    DataHolder f17272b;
    Cursor f17273c;
    hvi f17274d;
    hvi f17275e;
    ArrayList<String> f17276f;
    HashMap<String, String> f17277g;
    huk f17278h;
    huk f17279i;
    final boolean f17280j;
    huf f17281k;
    private volatile boolean f17282l;
    private final int f17283m;
    private Context f17284n;

    public hug(DataHolder dataHolder, Cursor cursor, Context context, int i, hvi hvi, hvi hvi2, ArrayList arrayList, HashMap hashMap, int i2, Bundle bundle) {
        boolean z = true;
        super(dataHolder);
        gwb.m1419L((Object) dataHolder);
        gwb.m1419L((Object) cursor);
        gwb.m1419L((Object) hashMap);
        gwb.m2047b(i == hvi.m21052a());
        gwb.m2047b(i == hvi2.m21052a());
        gwb.m2047b(i == arrayList.size());
        this.f17272b = dataHolder;
        this.f17273c = cursor;
        this.f17283m = i;
        this.f17276f = arrayList;
        this.f17284n = context;
        this.f17277g = hashMap;
        this.f17278h = new huh(this, this.f17284n.getResources());
        this.f17279i = new hui(this, this.f17284n.getResources());
        this.f17274d = hvi;
        this.f17275e = hvi2;
        if ((i2 & 1) != 0) {
            gwb.m2290l("PeopleAggregator", "PeopleExtraColumnBitmask.EMAILS is not supported in aggregation.  Ignored.");
        }
        if ((i2 & 2) == 0) {
            z = false;
        }
        this.f17280j = z;
        this.f17281k = new huf(bundle);
    }

    private hwk m20842b(int i) {
        m20846f();
        return new huj(this, i);
    }

    public int mo2074a() {
        m20846f();
        return this.f17283m;
    }

    public /* synthetic */ Object mo2075a(int i) {
        return m20842b(i);
    }

    public void mo2073b() {
        if (!this.f17282l) {
            this.f17282l = true;
            this.f17272b.close();
            this.f17273c.close();
            this.f17272b = null;
            this.f17273c = null;
            this.f17274d = null;
            this.f17275e = null;
            this.f17276f = null;
            this.f17277g = null;
            this.f17284n = null;
            this.f17278h = null;
            this.f17279i = null;
            this.f17281k = null;
        }
    }

    void m20846f() {
        if (this.f17282l) {
            throw new IllegalStateException("Already released");
        }
    }
}
