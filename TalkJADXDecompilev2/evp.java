package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class evp extends esw {
    private static final long serialVersionUID = 1;
    private final Map<Integer, Boolean> c = new HashMap();

    public evp(List<gkv<Integer, Boolean>> list) {
        for (gkv gkv : list) {
            this.c.put((Integer) gkv.a, (Boolean) gkv.b);
        }
    }

    public nzf a(String str, int i, int i2) {
        nzf lvt = new lvt();
        StringBuilder stringBuilder = new StringBuilder();
        lvt.a = new lus[this.c.size()];
        int i3 = 0;
        for (Entry entry : this.c.entrySet()) {
            lus lus = new lus();
            int a = gwb.a((Integer) entry.getKey());
            boolean b = gwb.b((Boolean) entry.getValue());
            if (a) {
                stringBuilder.append("{").append(a).append(", ").append(b).append("} ");
            }
            lus.a = Integer.valueOf(a);
            lus.b = Boolean.valueOf(b);
            lvt.a[i3] = lus;
            i3++;
        }
        if (a) {
            String str2 = "SetRichPresenceEnabledStateRequest build protobuf. Values: ";
            String valueOf = String.valueOf(stringBuilder.toString());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        lvt.requestHeader = euk.a(str, i, i2, this.i);
        return lvt;
    }

    public String g() {
        return "presence/setrichpresenceenabledstate";
    }

    public String K_() {
        return "event_queue";
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        for (Entry entry : ((evp) ead).c.entrySet()) {
            if (this.c.get(entry.getKey()) == null) {
                this.c.put((Integer) entry.getKey(), (Boolean) entry.getValue());
            }
        }
        return true;
    }
}
