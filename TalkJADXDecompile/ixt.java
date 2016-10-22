public final class ixt {
    final izw a;
    final iyd b;
    final iym c;
    final ixw d;
    final iye e;
    final iyf f;
    final iyb g;

    ixt(izw izw, iyd iyd, iym iym, ixw ixw, iye iye, iyf iyf, iyb iyb) {
        if (izw == null) {
            izw = izw.b;
        }
        this.a = izw;
        if (iyd == null || iyd.b() <= 0) {
            this.b = iyd.c;
        } else {
            this.b = iyd;
        }
        if (iym == null || iym.b() <= 0) {
            this.c = iym.c;
        } else {
            this.c = iym;
        }
        if (ixw == null || ixw.b() <= 0) {
            this.d = ixw.c;
        } else {
            this.d = ixw;
        }
        if (iye == null || iye.b() <= 0) {
            this.e = iye.a;
        } else {
            this.e = iye;
        }
        if (iyf == null || iyf.b() <= 0) {
            this.f = iyf.a;
        } else {
            this.f = iyf;
        }
        if (iyb == null || iyb.b() <= 0) {
            this.g = iyb.a;
        } else {
            this.g = iyb;
        }
    }

    public static ixu newBuilder() {
        return new ixu();
    }
}
