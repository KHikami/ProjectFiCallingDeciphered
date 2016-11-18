package p000;

import android.content.Intent;

final class cjy implements bpg {
    final /* synthetic */ Intent f5480a;
    final /* synthetic */ cjx f5481b;

    cjy(cjx cjx, Intent intent) {
        this.f5481b = cjx;
        this.f5480a = intent;
    }

    public void mo720a(bpd bpd) {
        new cit(this.f5481b.f5479a.context).execute(new Intent[]{this.f5480a});
        ((cnh) this.f5481b.f5479a.binder.m25443a(cnh.class)).m7969a(2329, 1, 0, null);
    }
}
