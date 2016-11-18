package p000;

final class cdi implements Runnable {
    final /* synthetic */ cdh f5072a;

    cdi(cdh cdh) {
        this.f5072a = cdh;
    }

    public void run() {
        cdh cdh = this.f5072a;
        long b = glj.m17963b();
        int length = cdh.f5060b.getText().toString().trim().length();
        switch (cdh.f5062d) {
            case 1:
                if (length != 0) {
                    if (b - cdh.f5063e > 5000) {
                        cdh.f5062d = 2;
                        cdh.m7258a(cdh.f5062d);
                        break;
                    }
                }
                cdh.f5062d = 3;
                cdh.m7258a(cdh.f5062d);
                break;
                break;
            case 2:
                if (length != 0) {
                    cdh.f5062d = 1;
                    cdh.m7258a(cdh.f5062d);
                    break;
                }
                cdh.f5062d = 3;
                break;
            case 3:
                if (length > 0) {
                    cdh.f5062d = 1;
                    cdh.m7258a(cdh.f5062d);
                    break;
                }
                break;
        }
        if (cdh.f5062d == 1) {
            gwb.m2042b(cdh.f5068j);
            gwb.m1864a(cdh.f5068j, 5000);
            cdh.f5063e = b;
        }
    }
}
