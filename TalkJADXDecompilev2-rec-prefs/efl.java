package p000;

import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

final class efl implements fh<Cursor> {
    final int f11371a = bc.uN;
    final /* synthetic */ eff f11372b;
    private int f11373c = -1;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m13795a(igVar, (Cursor) obj);
    }

    public efl(eff eff, int i) {
        this.f11372b = eff;
        this.f11373c = i;
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        int i2 = 0;
        ba.m4610b(i == this.f11371a, i + " does not match saved id " + this.f11371a);
        bko e = fde.m15018e(this.f11373c);
        List arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.f11372b.f11348e)) {
            String[] split = eff.f11343a.split(this.f11372b.f11348e);
            int length = split.length;
            while (i2 < length) {
                CharSequence charSequence = split[i2];
                if (!TextUtils.isEmpty(charSequence)) {
                    arrayList.add(charSequence);
                }
                i2++;
            }
        }
        this.f11372b.f11350g.mo1672b("group_search_local_query_latency");
        this.f11372b.f11350g.mo1670a("group_search_local_query_latency");
        return new efb(this.f11372b.f11345b, e, arrayList);
    }

    private void m13795a(ig<Cursor> igVar, Cursor cursor) {
        int p = igVar.m1287p();
        ba.m4610b(p == this.f11371a, p + " does not match saved id " + this.f11371a);
        this.f11372b.f11350g.mo1668a(this.f11373c, "group_search_local_query_latency", 1024);
        if (cursor == null) {
            this.f11372b.f11347d.m13772a(null);
            this.f11372b.f11346c.mo495a();
            return;
        }
        long b = glj.m17963b() << (System.identityHashCode(cursor) + 32);
        m13794a(b, (efb) igVar, cursor);
        this.f11372b.f11345b.getString(gwb.sq);
        Cursor efa = new efa(cursor, b);
        if (this.f11372b.f11347d == null) {
            glk.m17979c("Babel_GroupSearch", "no partition, ignore onLoadFinished event.", new Object[0]);
            return;
        }
        this.f11372b.f11347d.m13772a(efa);
        this.f11372b.f11346c.mo495a();
    }

    private void m13794a(long j, efb efb, Cursor cursor) {
        mcr mcr = new mcr();
        mcr.f27357a = Long.valueOf(j);
        List h = efb.m13753h();
        if (!(h == null || h.isEmpty())) {
            int size = h.size();
            mcr.f27358b = new int[size];
            for (int i = 0; i < size; i++) {
                int i2;
                String str = (String) h.get(i);
                int[] iArr = mcr.f27358b;
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
        mcr.f27359c = Integer.valueOf(cursor.getCount());
        ((iih) jyn.m25426a(this.f11372b.f11345b, iih.class)).mo1979a(this.f11373c).mo1693b().mo1706a(mcr).mo1714c(3203);
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        int p = igVar.m1287p();
        ba.m4610b(p == this.f11371a, p + " does not match saved id " + this.f11371a);
        if (this.f11372b.f11347d == null) {
            glk.m17979c("Babel_GroupSearch", "no partition, ignore onLoaderReset event.", new Object[0]);
            return;
        }
        this.f11372b.f11347d.m13772a(null);
        this.f11372b.f11346c.mo495a();
    }
}
