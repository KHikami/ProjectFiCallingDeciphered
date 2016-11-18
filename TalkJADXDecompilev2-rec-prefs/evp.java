package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class evp extends esw {
    private static final long serialVersionUID = 1;
    private final Map<Integer, Boolean> f12377c = new HashMap();

    public evp(List<gkv<Integer, Boolean>> list) {
        for (gkv gkv : list) {
            this.f12377c.put((Integer) gkv.f15524a, (Boolean) gkv.f15525b);
        }
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lvt = new lvt();
        StringBuilder stringBuilder = new StringBuilder();
        lvt.f26619a = new lus[this.f12377c.size()];
        int i3 = 0;
        for (Entry entry : this.f12377c.entrySet()) {
            lus lus = new lus();
            int a = gwb.m1507a((Integer) entry.getKey());
            boolean b = gwb.m2061b((Boolean) entry.getValue());
            if (a) {
                stringBuilder.append("{").append(a).append(", ").append(b).append("} ");
            }
            lus.f26529a = Integer.valueOf(a);
            lus.f26530b = Boolean.valueOf(b);
            lvt.f26619a[i3] = lus;
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
        lvt.requestHeader = euk.m14556a(str, i, i2, this.i);
        return lvt;
    }

    public String mo1947g() {
        return "presence/setrichpresenceenabledstate";
    }

    public String K_() {
        return "event_queue";
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        for (Entry entry : ((evp) ead).f12377c.entrySet()) {
            if (this.f12377c.get(entry.getKey()) == null) {
                this.f12377c.put((Integer) entry.getKey(), (Boolean) entry.getValue());
            }
        }
        return true;
    }
}
