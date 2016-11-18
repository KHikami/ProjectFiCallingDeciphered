package p000;

final class fsl implements Runnable {
    final /* synthetic */ fsr f13910a;
    final /* synthetic */ byte[] f13911b;
    final /* synthetic */ fsi f13912c;

    fsl(fsi fsi, fsr fsr, byte[] bArr) {
        this.f13912c = fsi;
        this.f13910a = fsr;
        this.f13911b = bArr;
    }

    public void run() {
        try {
            String valueOf;
            fsi.f13895b.m18078b("decodeMedia");
            if (fsi.f13894a) {
                fsi fsi = this.f13912c;
                String str = "decodingBytes start ";
                valueOf = String.valueOf(this.f13910a.toString());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                fsi.m16139a(valueOf);
            }
            fsq a = this.f13910a.mo595a(this.f13911b);
            if (fsi.f13894a) {
                fsi fsi2 = this.f13912c;
                String str2 = "decodingBytes finish ";
                valueOf = String.valueOf(this.f13910a.toString());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                fsi2.m16139a(valueOf);
            }
            if (a != null) {
                this.f13912c.m16138a(this.f13910a, a);
            }
            fsi.f13895b.m18079c("decodeMedia");
        } catch (Throwable th) {
            fsi.f13895b.m18079c("decodeMedia");
        }
    }
}
