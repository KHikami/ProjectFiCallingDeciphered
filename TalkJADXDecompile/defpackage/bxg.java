package defpackage;

/* renamed from: bxg */
final class bxg implements gia<boq> {
    final /* synthetic */ bxb a;

    bxg(bxb bxb) {
        this.a = bxb;
    }

    public /* bridge */ /* synthetic */ void a(ayo ayo, Exception exception) {
    }

    private void a(boq boq) {
        gwb.aJ();
        this.a.d(boq.b.b()).d = boq.b.c();
        int a = this.a.a(boq.b.c());
        if (a > 0) {
            this.a.b.f(a);
        } else if (a == 0) {
            this.a.b.d(false);
        }
        if (boq.a != null) {
            int a2 = this.a.a(boq.a.c());
            if (a2 >= 0 && a2 != a) {
                this.a.b.f(a2);
            }
        }
    }
}
