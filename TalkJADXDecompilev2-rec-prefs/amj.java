package p000;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.concurrent.SynchronousQueue;

public final class amj {
    private final Context f1293a;
    private apw f1294b;
    private ard f1295c;
    private aqy f1296d;
    private ase f1297e;
    private asm f1298f;
    private asm f1299g;
    private aru f1300h;
    private asg f1301i;
    private ayj f1302j;
    private int f1303k = 4;
    private azl f1304l = new azl();

    amj(Context context) {
        this.f1293a = context.getApplicationContext();
    }

    ami m2913a() {
        if (this.f1298f == null) {
            this.f1298f = new asm(asm.m3942b(), "source", asq.f2298d, false, false);
        }
        if (this.f1299g == null) {
            this.f1299g = asm.m3940a();
        }
        if (this.f1301i == null) {
            this.f1301i = new ash(this.f1293a).m3933a();
        }
        if (this.f1302j == null) {
            this.f1302j = new ayj();
        }
        if (this.f1295c == null) {
            if (VERSION.SDK_INT >= 11) {
                this.f1295c = new arl(this.f1301i.m3931b());
            } else {
                this.f1295c = new are();
            }
        }
        if (this.f1296d == null) {
            this.f1296d = new aqy(this.f1301i.m3932c());
        }
        if (this.f1297e == null) {
            this.f1297e = new asd(this.f1301i.m3930a());
        }
        if (this.f1300h == null) {
            this.f1300h = new asc(this.f1293a);
        }
        if (this.f1294b == null) {
            this.f1294b = new apw(this.f1297e, this.f1300h, this.f1299g, this.f1298f, new asm(0, Integer.MAX_VALUE, asm.f2287a, "source-unlimited", asq.f2298d, false, false, new SynchronousQueue()));
        }
        Context context = this.f1293a;
        apw apw = this.f1294b;
        ase ase = this.f1297e;
        ard ard = this.f1295c;
        aqy aqy = this.f1296d;
        ayj ayj = this.f1302j;
        int i = this.f1303k;
        azh azh = this.f1304l;
        azh.f2605s = true;
        return new ami(context, apw, ase, ard, aqy, ayj, i, (azl) azh);
    }
}
