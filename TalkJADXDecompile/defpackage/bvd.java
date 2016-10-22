package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.FixedParticipantsGalleryView;
import java.util.List;

/* renamed from: bvd */
public final class bvd extends btm {
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final FixedParticipantsGalleryView g;
    private CharSequence h;

    public bvd(dr drVar, View view) {
        super(drVar, view);
        this.d = (ImageView) view.findViewById(bm.m);
        this.e = (TextView) view.findViewById(bm.C);
        this.g = (FixedParticipantsGalleryView) view.findViewById(bm.l);
        this.g.a(false);
        this.f = (TextView) view.findViewById(bm.c);
    }

    public void a(btf btf) {
        boolean z = false;
        this.e.setText(gwb.a(btf.i, b(), btf.h, btf.e, btf.d, btf.m, btf.n, btf.q, false));
        long a = glj.a();
        this.f.setText(glj.b(btf.b(), a, false));
        edo b = b().b();
        List a2 = gwb.a(b(), btf.n, false);
        boolean z2 = a2 != null && a2.contains(b);
        if (!z2 || (a2 != null && a2.size() == 1)) {
            z = true;
        }
        int i = gwb.kk;
        if (z) {
            i = gwb.kg;
        } else if (btf.q == 1) {
            i = gwb.kf;
        }
        this.d.setImageResource(i);
        this.g.a(b(), a2, b);
        String valueOf = String.valueOf(this.e.getText());
        String valueOf2 = String.valueOf(glj.b(btf.b(), a, true));
        this.h = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append(", ").append(valueOf2).toString();
    }

    public CharSequence e() {
        return this.h;
    }
}
