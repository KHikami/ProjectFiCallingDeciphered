package defpackage;

import android.content.IntentFilter;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import ont;
import ooa;
import ook;

/* renamed from: izi */
public class izi {
    public final ixb a;
    public final Map<String, iwq> b;
    public final /* synthetic */ iwp c;

    public void a(String str) {
        iwq iwq = (iwq) this.b.get(str);
        if (iwq == null) {
            iwq = new iwq();
            this.b.put(str, iwq);
        }
        r0.a++;
    }

    public void b(String str) {
        iwq iwq = (iwq) this.b.get(str);
        if (iwq == null) {
            iwq = new iwq();
            this.b.put(str, iwq);
        }
        r0.b++;
    }

    public void a(boolean z) {
        List arrayList = new ArrayList();
        for (Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            iwq iwq = (iwq) entry.getValue();
            if (iwq.b > 0 || iwq.a > 0) {
                ooa ooa = new ooa();
                ooa.a = str;
                ooa.c = Integer.valueOf(iwq.b);
                ooa.b = Integer.valueOf(iwq.a);
                arrayList.add(ooa);
                iwq.b = 0;
                iwq.a = 0;
            }
        }
        if (!arrayList.isEmpty()) {
            ook ook = new ook();
            ook.m = new ont();
            ook.m.a = (ooa[]) arrayList.toArray(new ooa[arrayList.size()]);
            if (this.a.a()) {
                this.a.a(ook);
            }
        }
        if (z && a()) {
            b();
        }
    }

    public void a(List<String> list) {
        List arrayList = new ArrayList();
        for (String str : list) {
            ooa ooa = new ooa();
            int indexOf = str.indexOf(10);
            ooa.a = indexOf < 0 ? str : str.substring(0, indexOf);
            ooa.d = str;
            ooa.c = Integer.valueOf(1);
            arrayList.add(ooa);
        }
        if (!arrayList.isEmpty()) {
            ook ook = new ook();
            ook.m = new ont();
            ook.m.a = (ooa[]) arrayList.toArray(new ooa[arrayList.size()]);
            if (this.a.a()) {
                this.a.a(ook);
            }
        }
        if (Log.isLoggable("MemoryLeakService", 2) && !list.isEmpty()) {
            int size = list.size();
            String valueOf = String.valueOf(list);
            new StringBuilder(String.valueOf(valueOf).length() + 34).append("Primes found ").append(size).append(" leak(s): ").append(valueOf);
        }
    }

    public izi(iwp iwp, ixb ixb) {
        this.c = iwp;
        this.b = new HashMap();
        this.a = (ixb) ba.a((Object) ixb);
    }

    public boolean a() {
        if (!this.c.e || this.c.d.a() || !this.c.d.c()) {
            return false;
        }
        long j = this.c.f.get();
        if (j == 0 || j + 43200000 <= gwb.az()) {
            return true;
        }
        return false;
    }

    public void b() {
        if (this.c.g.compareAndSet(false, true)) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            this.c.a.registerReceiver(new iwr(this.c), intentFilter);
        }
    }
}
