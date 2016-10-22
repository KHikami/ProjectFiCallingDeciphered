package defpackage;

import android.content.res.Resources;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: bvm */
public final class bvm extends btm {
    private final ImageView d;
    private final TextView e;

    public bvm(dr drVar, View view) {
        super(drVar, view);
        this.d = (ImageView) view.findViewById(bm.m);
        this.e = (TextView) view.findViewById(bm.C);
    }

    public void a(btf btf) {
        int i;
        boolean z;
        switch (bvn.a[btf.i.ordinal()]) {
            case wi.j /*1*/:
                i = gwb.ko;
                break;
            case wi.l /*2*/:
            case wi.z /*3*/:
                i = gwb.kj;
                break;
            case wi.h /*4*/:
                i = gwb.kn;
                break;
            case wi.p /*5*/:
                i = gwb.kh;
                break;
            case wi.s /*6*/:
            case wi.q /*7*/:
                i = gwb.km;
                break;
            case wi.m /*8*/:
                i = gwb.kl;
                break;
            default:
                i = gwb.ki;
                break;
        }
        this.d.setImageResource(i);
        if (btf.i == fwy.ERROR || btf.i == fwy.ERROR_FORCE_OTR_CONFLICT || btf.i == fwy.ERROR_FORK || btf.h == fwx.FAILED_TO_SEND) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = this.d;
        Resources d = d();
        if (z) {
            i = ba.hp;
        } else {
            i = ba.hq;
        }
        imageView.setColorFilter(d.getColor(i));
        this.e.setText(Html.fromHtml(gwb.a(btf.i, b(), btf.h, btf.e, btf.d, btf.m, btf.n, btf.q, false)));
    }

    public CharSequence e() {
        return this.e.getText();
    }
}
