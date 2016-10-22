package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.concurrent.SynchronousQueue;

/* renamed from: amj */
public final class amj {
    private final Context a;
    private apw b;
    private ard c;
    private aqy d;
    private ase e;
    private asm f;
    private asm g;
    private aru h;
    private asg i;
    private ayj j;
    private int k;
    private azl l;

    amj(Context context) {
        this.k = 4;
        this.l = new azl();
        this.a = context.getApplicationContext();
    }

    ami a() {
        if (this.f == null) {
            this.f = new asm(asm.b(), "source", asq.d, false, false);
        }
        if (this.g == null) {
            this.g = asm.a();
        }
        if (this.i == null) {
            this.i = new ash(this.a).a();
        }
        if (this.j == null) {
            this.j = new ayj();
        }
        if (this.c == null) {
            if (VERSION.SDK_INT >= 11) {
                this.c = new arl(this.i.b());
            } else {
                this.c = new are();
            }
        }
        if (this.d == null) {
            this.d = new aqy(this.i.c());
        }
        if (this.e == null) {
            this.e = new asd(this.i.a());
        }
        if (this.h == null) {
            this.h = new asc(this.a);
        }
        if (this.b == null) {
            this.b = new apw(this.e, this.h, this.g, this.f, new asm(0, Integer.MAX_VALUE, asm.a, "source-unlimited", asq.d, false, false, new SynchronousQueue()));
        }
        Context context = this.a;
        apw apw = this.b;
        ase ase = this.e;
        ard ard = this.c;
        aqy aqy = this.d;
        ayj ayj = this.j;
        int i = this.k;
        azh azh = this.l;
        azh.s = true;
        return new ami(context, apw, ase, ard, aqy, ayj, i, (azl) azh);
    }
}
