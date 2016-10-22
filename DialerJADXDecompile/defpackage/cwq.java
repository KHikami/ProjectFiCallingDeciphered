package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: cwq */
public class cwq {
    public final cva a;
    public final Map b;

    public void a(String str) {
        cup cup = (cup) this.b.get(str);
        if (cup == null) {
            cup = new cup();
            this.b.put(str, cup);
        }
        r0.a++;
    }

    public void b(String str) {
        cup cup = (cup) this.b.get(str);
        if (cup == null) {
            cup = new cup();
            this.b.put(str, cup);
        }
        r0.b++;
    }

    public void a() {
        List arrayList = new ArrayList();
        for (Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            cup cup = (cup) entry.getValue();
            if (cup.b > 0 || cup.a > 0) {
                dlh dlh = new dlh();
                dlh.a = str;
                dlh.c = Integer.valueOf(cup.b);
                dlh.b = Integer.valueOf(cup.a);
                arrayList.add(dlh);
                cup.b = 0;
                cup.a = 0;
            }
        }
        if (!arrayList.isEmpty()) {
            dln dln = new dln();
            dln.i = new dlb();
            dln.i.a = (dlh[]) arrayList.toArray(new dlh[arrayList.size()]);
            if (this.a.a()) {
                this.a.a(dln);
            }
        }
    }

    public cwq(cva cva) {
        this.b = new HashMap();
        this.a = (cva) buf.B((Object) cva);
    }
}
