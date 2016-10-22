import android.content.Context;
import android.view.View;
import android.widget.TextView;

public final class bvj extends btm {
    private static final int[][] e;
    private final TextView d;

    public bvj(dr drVar, View view) {
        super(drVar, view);
        this.d = (TextView) view.findViewById(bm.C);
    }

    static {
        r0 = new int[2][];
        r0[0] = new int[]{ba.iG, ba.iC, ba.iF, ba.iD, ba.iE};
        r0[1] = new int[]{ba.iL, ba.iH, ba.iK, ba.iI, ba.iJ};
        e = r0;
    }

    public void a(btf btf) {
        boolean z;
        int i = 0;
        int i2 = btf.i == fwy.OFF_THE_RECORD ? 0 : 1;
        edk a = btf.a(this.c);
        if (a == null) {
            z = false;
        } else {
            z = b().a(a.b);
        }
        if (z) {
            switch (bvk.a[btf.h.ordinal()]) {
                case wi.j /*1*/:
                case wi.l /*2*/:
                    i = e[i2][0];
                    break;
                case wi.z /*3*/:
                    i = e[i2][1];
                    break;
                case wi.h /*4*/:
                    i = e[i2][2];
                    break;
            }
            if (i > 0) {
                this.d.setText(i);
            }
        } else if (a == null) {
            this.d.setText(e[i2][4]);
        } else {
            Context c = c();
            if (this.c.e() != 2) {
                z = true;
            } else {
                z = false;
            }
            String a2 = gwb.a(c, a, z);
            this.d.setText(d().getString(e[i2][3], new Object[]{a2}));
        }
    }

    public CharSequence e() {
        return this.d.getText();
    }
}
