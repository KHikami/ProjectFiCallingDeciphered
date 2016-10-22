package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.views.MessageListItemView;

/* renamed from: cmd */
public final class cmd extends gpf implements btd {
    String a;
    gph b;
    MessageListItemView c;
    private dex d;

    public cmd(Context context) {
        super(context, null);
    }

    public cmd(Context context, int i, boolean z, String str, String str2, int i2, int i3, String str3, MessageListItemView messageListItemView, gph gph) {
        super(context, null);
        a(i, z, str, str2, i2, i3, str3, messageListItemView, gph);
    }

    public boolean a() {
        return false;
    }

    public void a(btf btf) {
        a(((jca) jyn.a(getContext(), jca.class)).a(), true, btf.s.a, btf.s.a(), btf.s.c, btf.s.d, btf.s.k, null, null);
    }

    public void b(btf btf) {
        a(btf.s.a());
    }

    private void a(int i, boolean z, String str, String str2, int i2, int i3, String str3, MessageListItemView messageListItemView, gph gph) {
        String replace = str.startsWith("file://") ? str.replace("file://", "") : null;
        if (!str.startsWith("file://")) {
            str = str2;
        }
        a(str);
        this.n = z;
        this.b = gph;
        this.c = messageListItemView;
        this.d = (dex) jyn.a(getContext(), dex.class);
        int dimension = (int) getContext().getResources().getDimension(gwb.nl);
        this.h.setMaxWidth(dimension);
        this.h.setMaxHeight(dimension);
        if (i2 <= 0 || i3 <= 0) {
            this.h.a(dimension, dimension);
        } else {
            this.h.a(i2, i3);
        }
        if (!(messageListItemView == null || gph == null)) {
            setOnClickListener(new cme(this));
        }
        setContentDescription(cmx.a(getContext().getResources(), str3));
        if (this.d.c()) {
            dey dey = (dey) jyn.a(getContext(), dey.class);
            f();
            this.d.b(str2, this.m, dey.b(getContext().getResources().getInteger(gwb.no)), null);
            return;
        }
        gkc a = new gkc(this.a, null).a(getContext().getResources().getInteger(gwb.no));
        a.b(str3);
        this.o = new bon(i, a, replace, this, true, null);
        if (((fsi) jyn.a(getContext(), fsi.class)).a(this.o, this.n)) {
            this.o = null;
        } else {
            f();
        }
    }

    protected boolean b() {
        return false;
    }

    public void a(String str) {
        if (this.a == null || !this.a.startsWith("file://")) {
            this.a = str;
        }
    }
}
