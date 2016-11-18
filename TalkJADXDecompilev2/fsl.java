package defpackage;

final class fsl implements Runnable {
    final /* synthetic */ fsr a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ fsi c;

    fsl(fsi fsi, fsr fsr, byte[] bArr) {
        this.c = fsi;
        this.a = fsr;
        this.b = bArr;
    }

    public void run() {
        try {
            String valueOf;
            fsi.b.b("decodeMedia");
            if (fsi.a) {
                fsi fsi = this.c;
                String str = "decodingBytes start ";
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
                fsi fsi2 = this.c;
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
                this.c.a(this.a, a);
            }
            fsi.b.c("decodeMedia");
        } catch (Throwable th) {
            fsi.b.c("decodeMedia");
        }
    }
}
