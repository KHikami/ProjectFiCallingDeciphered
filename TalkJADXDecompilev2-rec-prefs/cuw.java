package p000;

final class cuw extends isa {
    final /* synthetic */ cus f9146a;

    cuw(cus cus) {
        this.f9146a = cus;
    }

    public void mo1433a(int i, int i2) {
        cus cus;
        if (i == 0 || i2 == 0) {
            cus = this.f9146a;
            if (cus.f9127d != 1.0f) {
                cus.f9127d = 1.0f;
                for (cuz a : cus.f9135l) {
                    a.mo1420a();
                }
                return;
            }
            return;
        }
        cus = this.f9146a;
        float f = ((float) i) / ((float) i2);
        if (cus.f9127d != f) {
            cus.f9127d = f;
            for (cuz a2 : cus.f9135l) {
                a2.mo1420a();
            }
        }
    }
}
