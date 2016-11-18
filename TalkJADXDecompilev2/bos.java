package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

public class bos {
    final gid a;
    final TreeSet<bot> b;
    final Object c = new Object();
    gkq<bot> d;

    public void a(fqj fqj) {
        if (bor.a) {
            long c = fqj.c();
            String valueOf = String.valueOf(fqj.b());
            new StringBuilder(String.valueOf(valueOf).length() + 80).append("[WatermarkTracker] Record new watermark:  timestamp ").append(c).append(" gaiaId ").append(valueOf);
        }
        bot bot = (bot) this.d.get(fqj.b());
        if (bot == null || fqj.c() >= bot.a) {
            synchronized (this.c) {
                if (bot != null) {
                    this.b.remove(bot);
                }
                bot bot2 = new bot(fqj);
                this.d.put(fqj.b(), bot2);
                this.b.add(bot2);
            }
            ayo boq = new boq(bot != null ? bot.d : null, fqj);
            this.a.a(boq, boq.c);
            return;
        }
        glk.a("Babel", "ignore old timestamp", new Object[0]);
    }

    public List<fqj> a(long j, long j2) {
        List<fqj> arrayList = new ArrayList();
        synchronized (this.c) {
            if (this.b.isEmpty()) {
                return arrayList;
            } else if (j2 < ((bot) this.b.first()).a) {
                return arrayList;
            } else {
                bot bot = (bot) this.b.ceiling(new bot(j));
                if (bot == null) {
                    return arrayList;
                }
                for (bot bot2 : this.b.tailSet(bot2, true)) {
                    if (bot2.a < j2) {
                        arrayList.add(bot2.d);
                    }
                }
                return arrayList;
            }
        }
    }

    public void a(StringBuilder stringBuilder) {
        for (Entry entry : this.d.entrySet()) {
            edo edo = (edo) entry.getKey();
            bot bot = (bot) entry.getValue();
            String valueOf = String.valueOf(edo);
            stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 50).append("  participantId: ").append(valueOf).append("  watermark: ").append(bot.a).toString());
            stringBuilder.append("\n");
        }
    }

    public bos(Context context) {
        this.a = (gid) jyn.a(context, gid.class);
        this.d = new gkq();
        this.b = new TreeSet();
    }
}
