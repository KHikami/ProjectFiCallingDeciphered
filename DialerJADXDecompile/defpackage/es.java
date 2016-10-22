package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: es */
public final class es {
    public Context a;
    public CharSequence b;
    public CharSequence c;
    public PendingIntent d;
    int e;
    boolean f;
    public int g;
    public int h;
    public boolean i;
    public ArrayList j;
    boolean k;
    public int l;
    int m;
    public Notification n;
    public ArrayList o;

    public es(Context context) {
        this.f = true;
        this.j = new ArrayList();
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.n = new Notification();
        this.a = context;
        this.n.when = System.currentTimeMillis();
        this.n.audioStreamType = -1;
        this.e = 0;
        this.o = new ArrayList();
    }

    public final es a(int i) {
        this.n.icon = i;
        return this;
    }

    public final es a(CharSequence charSequence) {
        this.b = es.d(charSequence);
        return this;
    }

    public final es b(CharSequence charSequence) {
        this.c = es.d(charSequence);
        return this;
    }

    public final es c(CharSequence charSequence) {
        this.n.tickerText = es.d(charSequence);
        return this;
    }

    public final es a(boolean z) {
        a(16, true);
        return this;
    }

    public final void a(int i, boolean z) {
        if (z) {
            Notification notification = this.n;
            notification.flags |= i;
            return;
        }
        notification = this.n;
        notification.flags &= i ^ -1;
    }

    private static CharSequence d(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final Notification a() {
        return eo.a.a(this, new et());
    }
}
