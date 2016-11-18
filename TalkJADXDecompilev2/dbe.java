package defpackage;

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
    final bko a;
    public HashMap<String, Long> b;
    final /* synthetic */ ConversationListFragment c;
    private long d;
    private final dbg e = new dbg(this);
    private gag f;

    public dbe(ConversationListFragment conversationListFragment, bko bko) {
        this.c = conversationListFragment;
        this.a = bko;
    }

    public void a(Bundle bundle) {
        if (this.b != null && !this.b.isEmpty()) {
            bundle.putSerializable("last_archived", this.b);
        }
    }

    public void a(String str) {
        this.e.a(str);
    }

    public void a() {
        this.e.a();
    }

    public void a(Cursor cursor) {
        if (this.b != null) {
            while (!this.b.isEmpty() && cursor.moveToNext()) {
                this.b.remove(cursor.getString(1));
            }
        }
    }

    public void a(String str, long j, boolean z, boolean z2) {
        if (z2) {
            ((iih) this.c.binder.a(iih.class)).a(this.a.g()).b().c(2885);
        } else {
            ((iih) this.c.binder.a(iih.class)).a(this.a.g()).b().c(2887);
        }
        if (!this.e.a(str, j)) {
            b(str, j, true, true);
        }
        long a = glj.a();
        if (this.b == null) {
            this.b = new HashMap();
        } else if (a - this.d > 1000) {
            this.b.clear();
        }
        this.d = a;
        this.b.put(str, Long.valueOf(j));
        int size = this.b.size();
        gah gah = new gah(this.c.context);
        if (size > 1) {
            gah.a(this.c.getResources().getString(bc.hc, new Object[]{Integer.valueOf(size)}));
        } else if (size == 1) {
            gah.a(this.c.getResources().getString(bc.ak));
        } else {
            return;
        }
        gah.c(this.c.getString(bc.p));
        gah.a(new dbf(this, z2));
        gag a2 = gah.a();
        if (this.f == null || this.f.equals(a2)) {
            this.c.g.a(a2);
        } else {
            this.c.g.a(this.f, a2);
        }
        this.f = a2;
    }

    public void a(String str, long j) {
        b(str, j, false, false);
    }

    void a(Map<String, Long> map, boolean z, boolean z2) {
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                b((String) entry.getKey(), gwb.a((Long) entry.getValue()), z, z2);
            }
        }
    }

    private void b(String str, long j, boolean z, boolean z2) {
        List arrayList = new ArrayList();
        for (String add : gwb.m(str)) {
            arrayList.add(add);
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = j;
        }
        RealTimeChatService.a(((fmf) jyn.a(this.c.context, fmf.class)).a(-1), this.a, (String[]) arrayList.toArray(new String[arrayList.size()]), jArr, z, z2);
    }
}
