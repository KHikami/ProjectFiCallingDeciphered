package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class fx {
    int A = 0;
    Notification B;
    RemoteViews C;
    RemoteViews D;
    RemoteViews E;
    public Notification F = new Notification();
    public ArrayList<String> G;
    public Context a;
    public CharSequence b;
    public CharSequence c;
    PendingIntent d;
    PendingIntent e;
    RemoteViews f;
    public Bitmap g;
    public CharSequence h;
    public int i;
    int j;
    boolean k = true;
    public boolean l;
    public gl m;
    public CharSequence n;
    public CharSequence[] o;
    int p;
    int q;
    boolean r;
    String s;
    boolean t;
    String u;
    public ArrayList<fr> v = new ArrayList();
    boolean w = false;
    String x;
    Bundle y;
    int z = 0;

    public fx(Context context) {
        this.a = context;
        this.F.when = System.currentTimeMillis();
        this.F.audioStreamType = -1;
        this.j = 0;
        this.G = new ArrayList();
    }

    public fx a(long j) {
        this.F.when = j;
        return this;
    }

    public fx a(boolean z) {
        this.k = true;
        return this;
    }

    public fx b(boolean z) {
        this.l = true;
        return this;
    }

    public fx a(int i) {
        this.F.icon = i;
        return this;
    }

    public fx a(CharSequence charSequence) {
        this.b = fx.d(charSequence);
        return this;
    }

    public fx b(CharSequence charSequence) {
        this.c = fx.d(charSequence);
        return this;
    }

    public fx b(int i) {
        this.i = i;
        return this;
    }

    public fx a(PendingIntent pendingIntent) {
        this.d = pendingIntent;
        return this;
    }

    public fx b(PendingIntent pendingIntent) {
        this.F.deleteIntent = pendingIntent;
        return this;
    }

    public fx a(PendingIntent pendingIntent, boolean z) {
        this.e = pendingIntent;
        a(128, true);
        return this;
    }

    public fx c(CharSequence charSequence) {
        this.F.tickerText = fx.d(charSequence);
        return this;
    }

    public fx a(Bitmap bitmap) {
        this.g = bitmap;
        return this;
    }

    public fx a(Uri uri) {
        this.F.sound = uri;
        this.F.audioStreamType = -1;
        return this;
    }

    public fx a(long[] jArr) {
        this.F.vibrate = jArr;
        return this;
    }

    public fx c(boolean z) {
        a(2, true);
        return this;
    }

    public fx d(boolean z) {
        a(8, true);
        return this;
    }

    public fx e(boolean z) {
        a(16, z);
        return this;
    }

    public fx a(String str) {
        this.x = str;
        return this;
    }

    public fx c(int i) {
        this.F.defaults = i;
        if ((i & 4) != 0) {
            Notification notification = this.F;
            notification.flags |= 1;
        }
        return this;
    }

    private void a(int i, boolean z) {
        if (z) {
            Notification notification = this.F;
            notification.flags |= i;
            return;
        }
        notification = this.F;
        notification.flags &= i ^ -1;
    }

    public fx d(int i) {
        this.j = i;
        return this;
    }

    public fx b(String str) {
        this.s = str;
        return this;
    }

    public fx f(boolean z) {
        this.t = true;
        return this;
    }

    public fx c(String str) {
        this.u = str;
        return this;
    }

    public fx a(Bundle bundle) {
        if (this.y == null) {
            this.y = new Bundle(bundle);
        } else {
            this.y.putAll(bundle);
        }
        return this;
    }

    public Bundle a() {
        if (this.y == null) {
            this.y = new Bundle();
        }
        return this.y;
    }

    public fx a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.v.add(new fr(i, charSequence, pendingIntent));
        return this;
    }

    public fx a(fr frVar) {
        this.v.add(frVar);
        return this;
    }

    public fx a(gl glVar) {
        if (this.m != glVar) {
            this.m = glVar;
            if (this.m != null) {
                this.m.a(this);
            }
        }
        return this;
    }

    public fx e(int i) {
        this.z = i;
        return this;
    }

    public fx a(Notification notification) {
        this.B = notification;
        return this;
    }

    public fx a(fz fzVar) {
        fzVar.a(this);
        return this;
    }

    protected static CharSequence d(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    protected CharSequence c() {
        return this.c;
    }

    protected CharSequence d() {
        return this.b;
    }

    public Notification b() {
        return fq.a.a(this, new fy());
    }
}
