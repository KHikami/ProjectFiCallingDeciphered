package defpackage;

/* renamed from: fsj */
final class fsj implements Runnable {
    final /* synthetic */ fsr a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ fsh c;
    final /* synthetic */ fsi d;

    fsj(fsi fsi, fsr fsr, byte[] bArr, fsh fsh) {
        this.d = fsi;
        this.a = fsr;
        this.b = bArr;
        this.c = fsh;
    }

    public void run() {
        try {
            fsi fsi;
            String str;
            String valueOf;
            fsi.b.b("saveMediaAndDecode");
            if (fsi.a) {
                fsi = this.d;
                str = "saving media from ";
                valueOf = String.valueOf(this.a.toString());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                fsi.a(valueOf);
            }
            this.d.a(this.b, this.c.b(), this.a, false);
            if (fsi.a) {
                fsi = this.d;
                str = "decodingBytes start ";
                valueOf = String.valueOf(this.a.toString());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                fsi.a(valueOf);
            }
            fsq a = this.a.a(this.b);
            if (fsi.a) {
                fsi fsi2 = this.d;
                String str2 = "decodingBytes finish ";
                valueOf = String.valueOf(this.a.toString());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                fsi2.a(valueOf);
            }
            if (a != null) {
                this.d.a(this.a, a);
            }
            fsi.b.c("saveMediaAndDecode");
        } catch (Throwable th) {
            fsi.b.c("saveMediaAndDecode");
        }
    }
}
