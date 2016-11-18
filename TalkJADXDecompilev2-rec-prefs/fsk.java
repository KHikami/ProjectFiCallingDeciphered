package p000;

final class fsk implements Runnable {
    final /* synthetic */ fsr f13906a;
    final /* synthetic */ byte[] f13907b;
    final /* synthetic */ fsh f13908c;
    final /* synthetic */ fsi f13909d;

    fsk(fsi fsi, fsr fsr, byte[] bArr, fsh fsh) {
        this.f13909d = fsi;
        this.f13906a = fsr;
        this.f13907b = bArr;
        this.f13908c = fsh;
    }

    public void run() {
        try {
            fsi.f13895b.m18078b("saveMedia");
            if (fsi.f13894a) {
                fsi fsi = this.f13909d;
                String str = "saving media from ";
                String valueOf = String.valueOf(this.f13906a.toString());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                fsi.m16139a(valueOf);
            }
            this.f13909d.m16131a(this.f13907b, this.f13908c.m16125b(), this.f13906a, true);
        } finally {
            fsi.f13895b.m18079c("saveMedia");
        }
    }
}
