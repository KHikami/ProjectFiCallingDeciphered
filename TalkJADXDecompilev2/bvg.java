package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

final class bvg implements OnClickListener {
    final /* synthetic */ bvf a;

    bvg(bvf bvf) {
        this.a = bvf;
    }

    public void onClick(View view) {
        int i;
        int i2;
        if (this.a.g) {
            i = 2519;
        } else {
            i = 1934;
        }
        gwb.a(this.a.b(), i, this.a.f);
        dut dut = (dut) jyn.a(this.a.c(), dut.class);
        if (this.a.g) {
            i2 = 2663;
        } else {
            i2 = 2662;
        }
        dut.a(this.a.c(), bm.v, i2);
    }
}
