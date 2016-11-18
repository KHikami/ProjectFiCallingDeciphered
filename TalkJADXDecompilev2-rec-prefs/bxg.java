package p000;

final class bxg implements gia<boq> {
    final /* synthetic */ bxb f4724a;

    bxg(bxb bxb) {
        this.f4724a = bxb;
    }

    public /* bridge */ /* synthetic */ void mo775a(ayo ayo, Exception exception) {
    }

    private void m6880a(boq boq) {
        gwb.aJ();
        this.f4724a.m6871d(boq.f4111b.m15831b()).f4728d = boq.f4111b.m15832c();
        int a = this.f4724a.m6864a(boq.f4111b.m15832c());
        if (a > 0) {
            this.f4724a.f4712b.m6693f(a);
        } else if (a == 0) {
            this.f4724a.f4712b.m6691d(false);
        }
        if (boq.f4110a != null) {
            int a2 = this.f4724a.m6864a(boq.f4110a.m15832c());
            if (a2 >= 0 && a2 != a) {
                this.f4724a.f4712b.m6693f(a2);
            }
        }
    }
}
