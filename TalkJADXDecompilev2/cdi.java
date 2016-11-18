package defpackage;

final class cdi implements Runnable {
    final /* synthetic */ cdh a;

    cdi(cdh cdh) {
        this.a = cdh;
    }

    public void run() {
        cdh cdh = this.a;
        long b = glj.b();
        int length = cdh.b.getText().toString().trim().length();
        switch (cdh.d) {
            case 1:
                if (length != 0) {
                    if (b - cdh.e > 5000) {
                        cdh.d = 2;
                        cdh.a(cdh.d);
                        break;
                    }
                }
                cdh.d = 3;
                cdh.a(cdh.d);
                break;
                break;
            case 2:
                if (length != 0) {
                    cdh.d = 1;
                    cdh.a(cdh.d);
                    break;
                }
                cdh.d = 3;
                break;
            case 3:
                if (length > 0) {
                    cdh.d = 1;
                    cdh.a(cdh.d);
                    break;
                }
                break;
        }
        if (cdh.d == 1) {
            gwb.b(cdh.j);
            gwb.a(cdh.j, 5000);
            cdh.e = b;
        }
    }
}
