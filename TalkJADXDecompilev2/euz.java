package defpackage;

public class euz extends esw {
    private static final long serialVersionUID = 1;
    public final String[] c;

    public euz(String[] strArr) {
        this.c = strArr;
    }

    public nzf a(String str, int i, int i2) {
        int i3 = 0;
        glk.a("BabelClient", "GetFifeUrlRequest build protobuf", new Object[0]);
        nzf lxd = new lxd();
        lxd.requestHeader = euk.a(str, i, i2, this.i);
        int length = this.c.length;
        lxc[] lxcArr = new lxc[length];
        while (i3 < length) {
            String str2 = this.c[i3];
            lxc lxc = new lxc();
            lxc.b = str2;
            lxc.a = Integer.valueOf(1);
            lxcArr[i3] = lxc;
            i3++;
        }
        lxd.a = lxcArr;
        return lxd;
    }

    public String g() {
        return "urls/urlredirectwrapper";
    }

    public String K_() {
        return "ui_queue";
    }
}
