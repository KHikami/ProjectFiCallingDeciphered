import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;

final class hug extends hwl {
    DataHolder b;
    Cursor c;
    hvi d;
    hvi e;
    ArrayList<String> f;
    HashMap<String, String> g;
    huk h;
    huk i;
    final boolean j;
    huf k;
    private volatile boolean l;
    private final int m;
    private Context n;

    public hug(DataHolder dataHolder, Cursor cursor, Context context, int i, hvi hvi, hvi hvi2, ArrayList arrayList, HashMap hashMap, int i2, Bundle bundle) {
        boolean z = true;
        super(dataHolder);
        gwb.L((Object) dataHolder);
        gwb.L((Object) cursor);
        gwb.L((Object) hashMap);
        gwb.b(i == hvi.a());
        gwb.b(i == hvi2.a());
        gwb.b(i == arrayList.size());
        this.b = dataHolder;
        this.c = cursor;
        this.m = i;
        this.f = arrayList;
        this.n = context;
        this.g = hashMap;
        this.h = new huh(this, this.n.getResources());
        this.i = new hui(this, this.n.getResources());
        this.d = hvi;
        this.e = hvi2;
        if ((i2 & 1) != 0) {
            gwb.l("PeopleAggregator", "PeopleExtraColumnBitmask.EMAILS is not supported in aggregation.  Ignored.");
        }
        if ((i2 & 2) == 0) {
            z = false;
        }
        this.j = z;
        this.k = new huf(bundle);
    }

    private hwk b(int i) {
        f();
        return new huj(this, i);
    }

    public int a() {
        f();
        return this.m;
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public void b() {
        if (!this.l) {
            this.l = true;
            this.b.close();
            this.c.close();
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.n = null;
            this.h = null;
            this.i = null;
            this.k = null;
        }
    }

    void f() {
        if (this.l) {
            throw new IllegalStateException("Already released");
        }
    }
}
