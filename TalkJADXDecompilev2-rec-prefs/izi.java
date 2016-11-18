package p000;

import android.content.IntentFilter;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class izi {
    public final ixb f19477a;
    public final Map<String, iwq> f19478b;
    public final /* synthetic */ iwp f19479c;

    public void m23577a(String str) {
        iwq iwq = (iwq) this.f19478b.get(str);
        if (iwq == null) {
            iwq = new iwq();
            this.f19478b.put(str, iwq);
        }
        r0.f19287a++;
    }

    public void m23582b(String str) {
        iwq iwq = (iwq) this.f19478b.get(str);
        if (iwq == null) {
            iwq = new iwq();
            this.f19478b.put(str, iwq);
        }
        r0.f19288b++;
    }

    public void m23579a(boolean z) {
        List arrayList = new ArrayList();
        for (Entry entry : this.f19478b.entrySet()) {
            String str = (String) entry.getKey();
            iwq iwq = (iwq) entry.getValue();
            if (iwq.f19288b > 0 || iwq.f19287a > 0) {
                ooa ooa = new ooa();
                ooa.a = str;
                ooa.c = Integer.valueOf(iwq.f19288b);
                ooa.b = Integer.valueOf(iwq.f19287a);
                arrayList.add(ooa);
                iwq.f19288b = 0;
                iwq.f19287a = 0;
            }
        }
        if (!arrayList.isEmpty()) {
            ook ook = new ook();
            ook.m = new ont();
            ook.m.a = (ooa[]) arrayList.toArray(new ooa[arrayList.size()]);
            if (this.f19477a.m23425a()) {
                this.f19477a.m23424a(ook);
            }
        }
        if (z && m23580a()) {
            m23581b();
        }
    }

    public void m23578a(List<String> list) {
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
            if (this.f19477a.m23425a()) {
                this.f19477a.m23424a(ook);
            }
        }
        if (Log.isLoggable("MemoryLeakService", 2) && !list.isEmpty()) {
            int size = list.size();
            String valueOf = String.valueOf(list);
            new StringBuilder(String.valueOf(valueOf).length() + 34).append("Primes found ").append(size).append(" leak(s): ").append(valueOf);
        }
    }

    public izi(iwp iwp, ixb ixb) {
        this.f19479c = iwp;
        this.f19478b = new HashMap();
        this.f19477a = (ixb) ba.m4536a((Object) ixb);
    }

    public boolean m23580a() {
        if (!this.f19479c.f19282e || this.f19479c.f19281d.m23494a() || !this.f19479c.f19281d.m23498c()) {
            return false;
        }
        long j = this.f19479c.f19283f.get();
        if (j == 0 || j + 43200000 <= gwb.az()) {
            return true;
        }
        return false;
    }

    public void m23581b() {
        if (this.f19479c.f19284g.compareAndSet(false, true)) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            this.f19479c.f19278a.registerReceiver(new iwr(this.f19479c), intentFilter);
        }
    }
}
