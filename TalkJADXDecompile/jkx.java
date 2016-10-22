import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.MessageQueue.IdleHandler;
import java.util.ArrayList;
import java.util.List;

final class jkx implements IdleHandler {
    private final jld a;
    private final List<jky> b;
    private volatile boolean c;
    private int d;

    public jkx(jlq jlq, jld jld, int i, int i2) {
        this.b = new ArrayList(3);
        this.c = true;
        this.d = 0;
        this.a = jld;
        jky a = a(jlq, i, (int) (((float) i) * 1.3f));
        if (a != null) {
            this.b.add(a);
        }
        a = a(jlq, (int) (((float) i) * 1.3f), i);
        if (a != null) {
            this.b.add(a);
        }
        this.b.add(new jky(i2, i2, 12));
    }

    private static jky a(jlq jlq, int i, int i2) {
        int i3 = jlq.c / (((i * i2) << 2) * 3);
        if (i3 > 0) {
            return new jky(i, i2, i3);
        }
        return null;
    }

    void a() {
        if (this.c && this.a.b() > 0.85f) {
            this.c = false;
        }
    }

    public boolean queueIdle() {
        if (this.c && this.a.b() < 0.85f) {
            Bitmap bitmap;
            if (this.d >= this.b.size()) {
                bitmap = null;
            } else {
                jky jky = (jky) this.b.get(this.d);
                if (jky == null) {
                    bitmap = null;
                } else {
                    int i = jky.c - 1;
                    jky.c = i;
                    if (i == 0) {
                        this.d++;
                    }
                    bitmap = Bitmap.createBitmap(jky.a, jky.b, Config.ARGB_8888);
                }
            }
            if (bitmap != null) {
                this.a.a(bitmap);
            }
        }
        return this.c;
    }
}
