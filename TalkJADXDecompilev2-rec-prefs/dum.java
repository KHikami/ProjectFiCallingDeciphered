package p000;

import java.util.List;

final class dum implements Runnable {
    final /* synthetic */ bls f10573a;
    final /* synthetic */ String f10574b;
    final /* synthetic */ duk f10575c;

    dum(duk duk, bls bls, String str) {
        this.f10575c = duk;
        this.f10573a = bls;
        this.f10574b = str;
    }

    public void run() {
        String str;
        String str2;
        if (this.f10573a != null) {
            duk duk = this.f10575c;
            str = this.f10574b;
            bls bls = this.f10573a;
            List<frj> c = duk.m12716c(str);
            if (!(c == null || c.size() == 0)) {
                duk.f10567d = false;
                for (frj frj : c) {
                    ((bkk) frj).f3625b.mo1116a(bls);
                }
            }
            str2 = "Notify conversation load succeed for ";
            str = String.valueOf(this.f10574b);
            if (str.length() != 0) {
                str2.concat(str);
                return;
            } else {
                str = new String(str2);
                return;
            }
        }
        this.f10575c.m12726a(this.f10574b);
        str2 = "Notify conversation load failed for ";
        str = String.valueOf(this.f10574b);
        if (str.length() != 0) {
            str2.concat(str);
        } else {
            str = new String(str2);
        }
    }
}
