package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class bvg implements OnClickListener {
    final /* synthetic */ bvf f4582a;

    bvg(bvf bvf) {
        this.f4582a = bvf;
    }

    public void onClick(View view) {
        int i;
        int i2;
        if (this.f4582a.f4580g) {
            i = 2519;
        } else {
            i = 1934;
        }
        gwb.m1826a(this.f4582a.m6593b(), i, this.f4582a.f4579f);
        dut dut = (dut) jyn.m25426a(this.f4582a.m6595c(), dut.class);
        if (this.f4582a.f4580g) {
            i2 = 2663;
        } else {
            i2 = 2662;
        }
        dut.mo1686a(this.f4582a.m6595c(), bm.f3846v, i2);
    }
}
