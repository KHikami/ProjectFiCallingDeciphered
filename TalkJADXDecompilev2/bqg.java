package defpackage;

import android.widget.Toast;

final class bqg implements bpx {
    final /* synthetic */ bqf a;

    bqg(bqf bqf) {
        this.a = bqf;
    }

    public void a(boolean z, bjg bjg) {
        String str = "Babel_ConvCreator";
        String str2 = "Gaia resolution completed ";
        String valueOf = String.valueOf(z ? "successfully" : "unsuccessfully");
        glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        if (z) {
            str = "Babel_ConvCreator";
            str2 = "Resolved ";
            valueOf = String.valueOf(bjg.toString());
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            glk.a(str, valueOf, new Object[0]);
            this.a.h = bjg;
        }
        bqf bqf = this.a;
        boolean a = gwb.a(bqf.h, bqf.f);
        if (!a || gwb.a(bqf.b, bqf.h)) {
            bqf.i.a(bqf.h, bqf.f, a);
            return;
        }
        Toast.makeText(bqf.b, bqf.b.getString(gwb.jE, new Object[]{bqf.h.e()}), 0).show();
        bqf.a(false, 0);
    }
}
