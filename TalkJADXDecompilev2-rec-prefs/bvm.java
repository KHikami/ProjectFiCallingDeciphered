package p000;

import android.content.res.Resources;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class bvm extends btm {
    private final ImageView f4587d;
    private final TextView f4588e;

    public bvm(dr drVar, View view) {
        super(drVar, view);
        this.f4587d = (ImageView) view.findViewById(bm.f3837m);
        this.f4588e = (TextView) view.findViewById(bm.f3801C);
    }

    public void mo754a(btf btf) {
        int i;
        boolean z;
        switch (bvn.f4589a[btf.f4396i.ordinal()]) {
            case 1:
                i = gwb.ko;
                break;
            case 2:
            case 3:
                i = gwb.kj;
                break;
            case 4:
                i = gwb.kn;
                break;
            case 5:
                i = gwb.kh;
                break;
            case 6:
            case 7:
                i = gwb.km;
                break;
            case 8:
                i = gwb.kl;
                break;
            default:
                i = gwb.ki;
                break;
        }
        this.f4587d.setImageResource(i);
        if (btf.f4396i == fwy.ERROR || btf.f4396i == fwy.ERROR_FORCE_OTR_CONFLICT || btf.f4396i == fwy.ERROR_FORK || btf.f4395h == fwx.FAILED_TO_SEND) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = this.f4587d;
        Resources d = m6596d();
        if (z) {
            i = ba.hp;
        } else {
            i = ba.hq;
        }
        imageView.setColorFilter(d.getColor(i));
        this.f4588e.setText(Html.fromHtml(gwb.m1661a(btf.f4396i, m6593b(), btf.f4395h, btf.f4392e, btf.f4391d, btf.f4400m, btf.f4401n, btf.f4404q, false)));
    }

    public CharSequence mo755e() {
        return this.f4588e.getText();
    }
}
