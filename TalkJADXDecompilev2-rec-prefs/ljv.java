package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;

final class ljv implements Runnable {
    final /* synthetic */ UUID f25116a;
    final /* synthetic */ ArrayList f25117b;
    final /* synthetic */ mti f25118c;
    final /* synthetic */ lju f25119d;

    ljv(lju lju, UUID uuid, ArrayList arrayList, mti mti) {
        this.f25119d = lju;
        this.f25116a = uuid;
        this.f25117b = arrayList;
        this.f25118c = mti;
    }

    public void run() {
        this.f25119d.f25113c.remove(this.f25116a);
        List unmodifiableList = Collections.unmodifiableList(this.f25117b);
        lkb.m29211b(ljg.f25083b);
        try {
            for (ljs ljw : (Set) this.f25119d.f25112b.mo1297a()) {
                this.f25118c.mo3706a(ljy.m29195a(new ljw(this, ljw, unmodifiableList)), this.f25119d.f25111a);
            }
        } finally {
            lkb.m29211b(null);
        }
    }
}
