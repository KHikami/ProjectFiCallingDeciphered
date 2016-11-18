package p000;

import android.content.Context;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class cmd extends gpf implements btd {
    String f5626a;
    gph f5627b;
    MessageListItemView f5628c;
    private dex f5629d;

    public cmd(Context context) {
        super(context, null);
    }

    public cmd(Context context, int i, boolean z, String str, String str2, int i2, int i3, String str3, MessageListItemView messageListItemView, gph gph) {
        super(context, null);
        m7906a(i, z, str, str2, i2, i3, str3, messageListItemView, gph);
    }

    public boolean mo717a() {
        return false;
    }

    public void mo715a(btf btf) {
        m7906a(((jca) jyn.m25426a(getContext(), jca.class)).mo2317a(), true, btf.f4406s.f4358a, btf.f4406s.m6574a(), btf.f4406s.f4360c, btf.f4406s.f4361d, btf.f4406s.f4368k, null, null);
    }

    public void mo718b(btf btf) {
        mo716a(btf.f4406s.m6574a());
    }

    private void m7906a(int i, boolean z, String str, String str2, int i2, int i3, String str3, MessageListItemView messageListItemView, gph gph) {
        String replace = str.startsWith("file://") ? str.replace("file://", "") : null;
        if (!str.startsWith("file://")) {
            str = str2;
        }
        mo716a(str);
        this.n = z;
        this.f5627b = gph;
        this.f5628c = messageListItemView;
        this.f5629d = (dex) jyn.m25426a(getContext(), dex.class);
        int dimension = (int) getContext().getResources().getDimension(gwb.nl);
        this.h.setMaxWidth(dimension);
        this.h.setMaxHeight(dimension);
        if (i2 <= 0 || i3 <= 0) {
            this.h.m9393a(dimension, dimension);
        } else {
            this.h.m9393a(i2, i3);
        }
        if (!(messageListItemView == null || gph == null)) {
            setOnClickListener(new cme(this));
        }
        setContentDescription(cmx.m7943a(getContext().getResources(), str3));
        if (this.f5629d.mo1511c()) {
            dey dey = (dey) jyn.m25426a(getContext(), dey.class);
            m6630f();
            this.f5629d.mo1510b(str2, this.m, dey.mo1516b(getContext().getResources().getInteger(gwb.no)), null);
            return;
        }
        gkc a = new gkc(this.f5626a, null).m5547a(getContext().getResources().getInteger(gwb.no));
        a.m5538b(str3);
        this.o = new bon(i, a, replace, this, true, null);
        if (((fsi) jyn.m25426a(getContext(), fsi.class)).m16142a(this.o, this.n)) {
            this.o = null;
        } else {
            m6630f();
        }
    }

    protected boolean mo719b() {
        return false;
    }

    public void mo716a(String str) {
        if (this.f5626a == null || !this.f5626a.startsWith("file://")) {
            this.f5626a = str;
        }
    }
}
