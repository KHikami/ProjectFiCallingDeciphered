package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.FixedParticipantsGalleryView;
import java.util.List;

public final class bvd extends btm {
    private final ImageView f4572d;
    private final TextView f4573e;
    private final TextView f4574f;
    private final FixedParticipantsGalleryView f4575g;
    private CharSequence f4576h;

    public bvd(dr drVar, View view) {
        super(drVar, view);
        this.f4572d = (ImageView) view.findViewById(bm.f3837m);
        this.f4573e = (TextView) view.findViewById(bm.f3801C);
        this.f4575g = (FixedParticipantsGalleryView) view.findViewById(bm.f3836l);
        this.f4575g.m9396a(false);
        this.f4574f = (TextView) view.findViewById(bm.f3827c);
    }

    public void mo754a(btf btf) {
        boolean z = false;
        this.f4573e.setText(gwb.m1661a(btf.f4396i, m6593b(), btf.f4395h, btf.f4392e, btf.f4391d, btf.f4400m, btf.f4401n, btf.f4404q, false));
        long a = glj.m17956a();
        this.f4574f.setText(glj.m17966b(btf.m6587b(), a, false));
        edo b = m6593b().m5632b();
        List a2 = gwb.m1696a(m6593b(), btf.f4401n, false);
        boolean z2 = a2 != null && a2.contains(b);
        if (!z2 || (a2 != null && a2.size() == 1)) {
            z = true;
        }
        int i = gwb.kk;
        if (z) {
            i = gwb.kg;
        } else if (btf.f4404q == 1) {
            i = gwb.kf;
        }
        this.f4572d.setImageResource(i);
        this.f4575g.m9395a(m6593b(), a2, b);
        String valueOf = String.valueOf(this.f4573e.getText());
        String valueOf2 = String.valueOf(glj.m17966b(btf.m6587b(), a, true));
        this.f4576h = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append(", ").append(valueOf2).toString();
    }

    public CharSequence mo755e() {
        return this.f4576h;
    }
}
