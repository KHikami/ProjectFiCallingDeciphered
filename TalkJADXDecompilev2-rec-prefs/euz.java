package p000;

public class euz extends esw {
    private static final long serialVersionUID = 1;
    public final String[] f12335c;

    public euz(String[] strArr) {
        this.f12335c = strArr;
    }

    public nzf mo1944a(String str, int i, int i2) {
        int i3 = 0;
        glk.m17970a("BabelClient", "GetFifeUrlRequest build protobuf", new Object[0]);
        nzf lxd = new lxd();
        lxd.requestHeader = euk.m14556a(str, i, i2, this.i);
        int length = this.f12335c.length;
        lxc[] lxcArr = new lxc[length];
        while (i3 < length) {
            String str2 = this.f12335c[i3];
            lxc lxc = new lxc();
            lxc.f26748b = str2;
            lxc.f26747a = Integer.valueOf(1);
            lxcArr[i3] = lxc;
            i3++;
        }
        lxd.f26749a = lxcArr;
        return lxd;
    }

    public String mo1947g() {
        return "urls/urlredirectwrapper";
    }

    public String K_() {
        return "ui_queue";
    }
}
