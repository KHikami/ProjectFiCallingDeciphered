package p000;

import android.widget.Toast;

final class bqg implements bpx {
    final /* synthetic */ bqf f4235a;

    bqg(bqf bqf) {
        this.f4235a = bqf;
    }

    public void mo657a(boolean z, bjg bjg) {
        String str = "Babel_ConvCreator";
        String str2 = "Gaia resolution completed ";
        String valueOf = String.valueOf(z ? "successfully" : "unsuccessfully");
        glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        if (z) {
            str = "Babel_ConvCreator";
            str2 = "Resolved ";
            valueOf = String.valueOf(bjg.toString());
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            glk.m17970a(str, valueOf, new Object[0]);
            this.f4235a.f4220h = bjg;
        }
        bqf bqf = this.f4235a;
        boolean a = gwb.m1922a(bqf.f4220h, bqf.f4218f);
        if (!a || gwb.m1899a(bqf.f4214b, bqf.f4220h)) {
            bqf.f4221i.mo644a(bqf.f4220h, bqf.f4218f, a);
            return;
        }
        Toast.makeText(bqf.f4214b, bqf.f4214b.getString(gwb.jE, new Object[]{bqf.f4220h.mo571e()}), 0).show();
        bqf.m6431a(false, 0);
    }
}
