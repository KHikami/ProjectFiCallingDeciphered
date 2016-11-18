package p000;

public final class ixt {
    final izw f19365a;
    final iyd f19366b;
    final iym f19367c;
    final ixw f19368d;
    final iye f19369e;
    final iyf f19370f;
    final iyb f19371g;

    ixt(izw izw, iyd iyd, iym iym, ixw ixw, iye iye, iyf iyf, iyb iyb) {
        if (izw == null) {
            izw = izw.f19333b;
        }
        this.f19365a = izw;
        if (iyd == null || iyd.mo1636b() <= 0) {
            this.f19366b = iyd.f10284c;
        } else {
            this.f19366b = iyd;
        }
        if (iym == null || iym.mo1636b() <= 0) {
            this.f19367c = iym.f10287c;
        } else {
            this.f19367c = iym;
        }
        if (ixw == null || ixw.mo1636b() <= 0) {
            this.f19368d = ixw.f10290c;
        } else {
            this.f19368d = ixw;
        }
        if (iye == null || iye.mo1636b() <= 0) {
            this.f19369e = iye.f19389a;
        } else {
            this.f19369e = iye;
        }
        if (iyf == null || iyf.mo1636b() <= 0) {
            this.f19370f = iyf.f19390a;
        } else {
            this.f19370f = iyf;
        }
        if (iyb == null || iyb.mo1636b() <= 0) {
            this.f19371g = iyb.f19387a;
        } else {
            this.f19371g = iyb;
        }
    }

    public static ixu newBuilder() {
        return new ixu();
    }
}
