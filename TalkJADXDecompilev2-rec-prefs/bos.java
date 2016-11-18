package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

public class bos {
    final gid f4116a;
    final TreeSet<bot> f4117b;
    final Object f4118c = new Object();
    gkq<bot> f4119d;

    public void m6324a(fqj fqj) {
        if (bor.f4113a) {
            long c = fqj.m15832c();
            String valueOf = String.valueOf(fqj.m15831b());
            new StringBuilder(String.valueOf(valueOf).length() + 80).append("[WatermarkTracker] Record new watermark:  timestamp ").append(c).append(" gaiaId ").append(valueOf);
        }
        bot bot = (bot) this.f4119d.get(fqj.m15831b());
        if (bot == null || fqj.m15832c() >= bot.f4121a) {
            synchronized (this.f4118c) {
                if (bot != null) {
                    this.f4117b.remove(bot);
                }
                bot bot2 = new bot(fqj);
                this.f4119d.put(fqj.m15831b(), bot2);
                this.f4117b.add(bot2);
            }
            ayo boq = new boq(bot != null ? bot.f4124d : null, fqj);
            this.f4116a.mo2276a(boq, boq.f4112c);
            return;
        }
        glk.m17970a("Babel", "ignore old timestamp", new Object[0]);
    }

    public List<fqj> m6323a(long j, long j2) {
        List<fqj> arrayList = new ArrayList();
        synchronized (this.f4118c) {
            if (this.f4117b.isEmpty()) {
                return arrayList;
            } else if (j2 < ((bot) this.f4117b.first()).f4121a) {
                return arrayList;
            } else {
                bot bot = (bot) this.f4117b.ceiling(new bot(j));
                if (bot == null) {
                    return arrayList;
                }
                for (bot bot2 : this.f4117b.tailSet(bot2, true)) {
                    if (bot2.f4121a < j2) {
                        arrayList.add(bot2.f4124d);
                    }
                }
                return arrayList;
            }
        }
    }

    public void m6325a(StringBuilder stringBuilder) {
        for (Entry entry : this.f4119d.entrySet()) {
            edo edo = (edo) entry.getKey();
            bot bot = (bot) entry.getValue();
            String valueOf = String.valueOf(edo);
            stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 50).append("  participantId: ").append(valueOf).append("  watermark: ").append(bot.f4121a).toString());
            stringBuilder.append("\n");
        }
    }

    public bos(Context context) {
        this.f4116a = (gid) jyn.m25426a(context, gid.class);
        this.f4119d = new gkq();
        this.f4117b = new TreeSet();
    }
}
