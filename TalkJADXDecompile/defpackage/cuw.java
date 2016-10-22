package defpackage;

/* renamed from: cuw */
final class cuw extends isa {
    final /* synthetic */ cus a;

    cuw(cus cus) {
        this.a = cus;
    }

    public void a(int i, int i2) {
        cus cus;
        if (i == 0 || i2 == 0) {
            cus = this.a;
            if (cus.d != 1.0f) {
                cus.d = 1.0f;
                for (cuz a : cus.l) {
                    a.a();
                }
                return;
            }
            return;
        }
        cus = this.a;
        float f = ((float) i) / ((float) i2);
        if (cus.d != f) {
            cus.d = f;
            for (cuz a2 : cus.l) {
                a2.a();
            }
        }
    }
}
