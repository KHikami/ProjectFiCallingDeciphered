package p000;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dmp implements dmn, jza, kcm, kcq {
    private final List<Runnable> f10131a = new CopyOnWriteArrayList();
    private final Context f10132b;
    private doh f10133c;

    dmp(Context context, kbu kbu) {
        this.f10132b = context;
        kbu.m25514a((kcq) this);
    }

    public boolean mo1605b() {
        return ((AudioManager) this.f10132b.getSystemService("audio")).isMicrophoneMute();
    }

    public void mo1606c() {
        gwb.aJ();
        ((AudioManager) this.f10132b.getSystemService("audio")).setMicrophoneMute(false);
        gwb.m2198f(2609);
        for (Runnable run : this.f10131a) {
            run.run();
        }
        this.f10131a.clear();
    }

    public void mo1604a(Runnable runnable) {
        gwb.aJ();
        if (mo1605b()) {
            this.f10131a.add(runnable);
        } else {
            runnable.run();
        }
    }

    public dmn mo1603a(jyn jyn) {
        jyn.m25444a(dmn.class, (Object) this);
        return this;
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f10133c = (doh) jyn.m25443a(doh.class);
    }

    public void R_() {
        if (mo1605b()) {
            this.f10133c.mo1630a(gwb.m2330q(this.f10132b));
        }
    }
}
