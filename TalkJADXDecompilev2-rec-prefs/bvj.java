package p000;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

public final class bvj extends btm {
    private static final int[][] f4584e;
    private final TextView f4585d;

    public bvj(dr drVar, View view) {
        super(drVar, view);
        this.f4585d = (TextView) view.findViewById(bm.f3801C);
    }

    static {
        r0 = new int[2][];
        r0[0] = new int[]{ba.iG, ba.iC, ba.iF, ba.iD, ba.iE};
        r0[1] = new int[]{ba.iL, ba.iH, ba.iK, ba.iI, ba.iJ};
        f4584e = r0;
    }

    public void mo754a(btf btf) {
        boolean z;
        int i = 0;
        int i2 = btf.f4396i == fwy.OFF_THE_RECORD ? 0 : 1;
        edk a = btf.m6584a(this.c);
        if (a == null) {
            z = false;
        } else {
            z = m6593b().m5630a(a.f11213b);
        }
        if (z) {
            switch (bvk.f4586a[btf.f4395h.ordinal()]) {
                case 1:
                case 2:
                    i = f4584e[i2][0];
                    break;
                case 3:
                    i = f4584e[i2][1];
                    break;
                case 4:
                    i = f4584e[i2][2];
                    break;
            }
            if (i > 0) {
                this.f4585d.setText(i);
            }
        } else if (a == null) {
            this.f4585d.setText(f4584e[i2][4]);
        } else {
            Context c = m6595c();
            if (this.c.mo947e() != 2) {
                z = true;
            } else {
                z = false;
            }
            String a2 = gwb.m1648a(c, a, z);
            this.f4585d.setText(m6596d().getString(f4584e[i2][3], new Object[]{a2}));
        }
    }

    public CharSequence mo755e() {
        return this.f4585d.getText();
    }
}
