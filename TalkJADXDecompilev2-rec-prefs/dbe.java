package p000;

import android.database.Cursor;
import android.os.Bundle;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class dbe {
    final bko f9450a;
    public HashMap<String, Long> f9451b;
    final /* synthetic */ ConversationListFragment f9452c;
    private long f9453d;
    private final dbg f9454e = new dbg(this);
    private gag f9455f;

    public dbe(ConversationListFragment conversationListFragment, bko bko) {
        this.f9452c = conversationListFragment;
        this.f9450a = bko;
    }

    public void m11406a(Bundle bundle) {
        if (this.f9451b != null && !this.f9451b.isEmpty()) {
            bundle.putSerializable("last_archived", this.f9451b);
        }
    }

    public void m11407a(String str) {
        this.f9454e.m11414a(str);
    }

    public void m11404a() {
        this.f9454e.m11413a();
    }

    public void m11405a(Cursor cursor) {
        if (this.f9451b != null) {
            while (!this.f9451b.isEmpty() && cursor.moveToNext()) {
                this.f9451b.remove(cursor.getString(1));
            }
        }
    }

    public void m11409a(String str, long j, boolean z, boolean z2) {
        if (z2) {
            ((iih) this.f9452c.binder.m25443a(iih.class)).mo1979a(this.f9450a.m5638g()).mo1693b().mo1714c(2885);
        } else {
            ((iih) this.f9452c.binder.m25443a(iih.class)).mo1979a(this.f9450a.m5638g()).mo1693b().mo1714c(2887);
        }
        if (!this.f9454e.m11415a(str, j)) {
            m11403b(str, j, true, true);
        }
        long a = glj.m17956a();
        if (this.f9451b == null) {
            this.f9451b = new HashMap();
        } else if (a - this.f9453d > 1000) {
            this.f9451b.clear();
        }
        this.f9453d = a;
        this.f9451b.put(str, Long.valueOf(j));
        int size = this.f9451b.size();
        gah gah = new gah(this.f9452c.context);
        if (size > 1) {
            gah.m16814a(this.f9452c.getResources().getString(bc.hc, new Object[]{Integer.valueOf(size)}));
        } else if (size == 1) {
            gah.m16814a(this.f9452c.getResources().getString(bc.ak));
        } else {
            return;
        }
        gah.m16817c(this.f9452c.getString(bc.f2960p));
        gah.m16813a(new dbf(this, z2));
        gag a2 = gah.m16811a();
        if (this.f9455f == null || this.f9455f.equals(a2)) {
            this.f9452c.f6261g.mo1143a(a2);
        } else {
            this.f9452c.f6261g.mo1144a(this.f9455f, a2);
        }
        this.f9455f = a2;
    }

    public void m11408a(String str, long j) {
        m11403b(str, j, false, false);
    }

    void m11410a(Map<String, Long> map, boolean z, boolean z2) {
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                m11403b((String) entry.getKey(), gwb.m1523a((Long) entry.getValue()), z, z2);
            }
        }
    }

    private void m11403b(String str, long j, boolean z, boolean z2) {
        List arrayList = new ArrayList();
        for (String add : gwb.m2298m(str)) {
            arrayList.add(add);
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = j;
        }
        RealTimeChatService.m9057a(((fmf) jyn.m25426a(this.f9452c.context, fmf.class)).mo2036a(-1), this.f9450a, (String[]) arrayList.toArray(new String[arrayList.size()]), jArr, z, z2);
    }
}
