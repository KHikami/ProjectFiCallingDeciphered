import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dmp implements dmn, jza, kcm, kcq {
    private final List<Runnable> a;
    private final Context b;
    private doh c;

    dmp(Context context, kbu kbu) {
        this.a = new CopyOnWriteArrayList();
        this.b = context;
        kbu.a((kcq) this);
    }

    public boolean b() {
        return ((AudioManager) this.b.getSystemService("audio")).isMicrophoneMute();
    }

    public void c() {
        gwb.aJ();
        ((AudioManager) this.b.getSystemService("audio")).setMicrophoneMute(false);
        gwb.f(2609);
        for (Runnable run : this.a) {
            run.run();
        }
        this.a.clear();
    }

    public void a(Runnable runnable) {
        gwb.aJ();
        if (b()) {
            this.a.add(runnable);
        } else {
            runnable.run();
        }
    }

    public dmn a(jyn jyn) {
        jyn.a(dmn.class, (Object) this);
        return this;
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.c = (doh) jyn.a(doh.class);
    }

    public void R_() {
        if (b()) {
            this.c.a(gwb.q(this.b));
        }
    }
}
