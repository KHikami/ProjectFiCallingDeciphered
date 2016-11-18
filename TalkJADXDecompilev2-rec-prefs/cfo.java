package p000;

import android.text.TextUtils;

final class cfo implements cgh {
    final /* synthetic */ int f5193a;
    final /* synthetic */ cdn f5194b;

    cfo(cdn cdn, int i) {
        this.f5194b = cdn;
        this.f5193a = i;
    }

    public void mo893a(String str, cgc cgc) {
        if (!TextUtils.isEmpty(str) && !blo.m5871a(str)) {
            this.f5194b.f5078a.bh = this.f5193a;
            this.f5194b.f5078a.ak.mo550a(new fko(this.f5194b.f5078a.av.m5638g(), cgc.f5231a, this.f5193a));
            if (this.f5194b.f5078a.av != null) {
                this.f5194b.f5078a.bC.mo1030a(this.f5194b.f5078a.av.m5638g(), cgc.f5231a, false);
            }
        }
    }
}
