final class fsk implements Runnable {
    final /* synthetic */ fsr a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ fsh c;
    final /* synthetic */ fsi d;

    fsk(fsi fsi, fsr fsr, byte[] bArr, fsh fsh) {
        this.d = fsi;
        this.a = fsr;
        this.b = bArr;
        this.c = fsh;
    }

    public void run() {
        try {
            fsi.b.b("saveMedia");
            if (fsi.a) {
                fsi fsi = this.d;
                String str = "saving media from ";
                String valueOf = String.valueOf(this.a.toString());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                fsi.a(valueOf);
            }
            this.d.a(this.b, this.c.b(), this.a, true);
        } finally {
            fsi.b.c("saveMedia");
        }
    }
}
