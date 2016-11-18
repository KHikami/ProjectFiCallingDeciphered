package p000;

final class fsj implements Runnable {
    final /* synthetic */ fsr f13902a;
    final /* synthetic */ byte[] f13903b;
    final /* synthetic */ fsh f13904c;
    final /* synthetic */ fsi f13905d;

    fsj(fsi fsi, fsr fsr, byte[] bArr, fsh fsh) {
        this.f13905d = fsi;
        this.f13902a = fsr;
        this.f13903b = bArr;
        this.f13904c = fsh;
    }

    public void run() {
        try {
            fsi fsi;
            String str;
            String valueOf;
            fsi.f13895b.m18078b("saveMediaAndDecode");
            if (fsi.f13894a) {
                fsi = this.f13905d;
                str = "saving media from ";
                valueOf = String.valueOf(this.f13902a.toString());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                fsi.m16139a(valueOf);
            }
            this.f13905d.m16131a(this.f13903b, this.f13904c.m16125b(), this.f13902a, false);
            if (fsi.f13894a) {
                fsi = this.f13905d;
                str = "decodingBytes start ";
                valueOf = String.valueOf(this.f13902a.toString());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                fsi.m16139a(valueOf);
            }
            fsq a = this.f13902a.mo595a(this.f13903b);
            if (fsi.f13894a) {
                fsi fsi2 = this.f13905d;
                String str2 = "decodingBytes finish ";
                valueOf = String.valueOf(this.f13902a.toString());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                fsi2.m16139a(valueOf);
            }
            if (a != null) {
                this.f13905d.m16138a(this.f13902a, a);
            }
            fsi.f13895b.m18079c("saveMediaAndDecode");
        } catch (Throwable th) {
            fsi.f13895b.m18079c("saveMediaAndDecode");
        }
    }
}
