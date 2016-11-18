package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.MessageQueue.IdleHandler;
import java.util.ArrayList;
import java.util.List;

final class jkx implements IdleHandler {
    private final jld f20387a;
    private final List<jky> f20388b = new ArrayList(3);
    private volatile boolean f20389c = true;
    private int f20390d = 0;

    public jkx(jlq jlq, jld jld, int i, int i2) {
        this.f20387a = jld;
        jky a = jkx.m24619a(jlq, i, (int) (((float) i) * 1.3f));
        if (a != null) {
            this.f20388b.add(a);
        }
        a = jkx.m24619a(jlq, (int) (((float) i) * 1.3f), i);
        if (a != null) {
            this.f20388b.add(a);
        }
        this.f20388b.add(new jky(i2, i2, 12));
    }

    private static jky m24619a(jlq jlq, int i, int i2) {
        int i3 = jlq.f20441c / (((i * i2) << 2) * 3);
        if (i3 > 0) {
            return new jky(i, i2, i3);
        }
        return null;
    }

    void m24620a() {
        if (this.f20389c && this.f20387a.m24633b() > 0.85f) {
            this.f20389c = false;
        }
    }

    public boolean queueIdle() {
        if (this.f20389c && this.f20387a.m24633b() < 0.85f) {
            Bitmap bitmap;
            if (this.f20390d >= this.f20388b.size()) {
                bitmap = null;
            } else {
                jky jky = (jky) this.f20388b.get(this.f20390d);
                if (jky == null) {
                    bitmap = null;
                } else {
                    int i = jky.f20393c - 1;
                    jky.f20393c = i;
                    if (i == 0) {
                        this.f20390d++;
                    }
                    bitmap = Bitmap.createBitmap(jky.f20391a, jky.f20392b, Config.ARGB_8888);
                }
            }
            if (bitmap != null) {
                this.f20387a.m24631a(bitmap);
            }
        }
        return this.f20389c;
    }
}
