package defpackage;

import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: efl */
final class efl implements fh<Cursor> {
    final int a;
    final /* synthetic */ eff b;
    private int c;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (Cursor) obj);
    }

    public efl(eff eff, int i) {
        this.b = eff;
        this.a = bc.uN;
        this.c = -1;
        this.c = i;
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        int i2 = 0;
        ba.b(i == this.a, i + " does not match saved id " + this.a);
        bko e = fde.e(this.c);
        List arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.b.e)) {
            String[] split = eff.a.split(this.b.e);
            int length = split.length;
            while (i2 < length) {
                CharSequence charSequence = split[i2];
                if (!TextUtils.isEmpty(charSequence)) {
                    arrayList.add(charSequence);
                }
                i2++;
            }
        }
        this.b.g.b("group_search_local_query_latency");
        this.b.g.a("group_search_local_query_latency");
        return new efb(this.b.b, e, arrayList);
    }

    private void a(ig<Cursor> igVar, Cursor cursor) {
        int p = igVar.p();
        ba.b(p == this.a, p + " does not match saved id " + this.a);
        this.b.g.a(this.c, "group_search_local_query_latency", 1024);
        if (cursor == null) {
            this.b.d.a(null);
            this.b.c.a();
            return;
        }
        long b = glj.b() << (System.identityHashCode(cursor) + 32);
        a(b, (efb) igVar, cursor);
        this.b.b.getString(gwb.sq);
        Cursor efa = new efa(cursor, b);
        if (this.b.d == null) {
            glk.c("Babel_GroupSearch", "no partition, ignore onLoadFinished event.", new Object[0]);
            return;
        }
        this.b.d.a(efa);
        this.b.c.a();
    }

    private void a(long j, efb efb, Cursor cursor) {
        mcr mcr = new mcr();
        mcr.a = Long.valueOf(j);
        List h = efb.h();
        if (!(h == null || h.isEmpty())) {
            int size = h.size();
            mcr.b = new int[size];
            for (int i = 0; i < size; i++) {
                int i2;
                String str = (String) h.get(i);
                int[] iArr = mcr.b;
                if (TextUtils.isEmpty(str)) {
                    i2 = 0;
                } else if (str.length() > 20) {
                    i2 = 20;
                } else {
                    i2 = str.length();
                }
                iArr[i] = i2;
            }
        }
        mcr.c = Integer.valueOf(cursor.getCount());
        ((iih) jyn.a(this.b.b, iih.class)).a(this.c).b().a(mcr).c(3203);
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        int p = igVar.p();
        ba.b(p == this.a, p + " does not match saved id " + this.a);
        if (this.b.d == null) {
            glk.c("Babel_GroupSearch", "no partition, ignore onLoaderReset event.", new Object[0]);
            return;
        }
        this.b.d.a(null);
        this.b.c.a();
    }
}
