package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class fx {
    int f14208A = 0;
    Notification f14209B;
    RemoteViews f14210C;
    RemoteViews f14211D;
    RemoteViews f14212E;
    public Notification f14213F = new Notification();
    public ArrayList<String> f14214G;
    public Context f14215a;
    public CharSequence f14216b;
    public CharSequence f14217c;
    PendingIntent f14218d;
    PendingIntent f14219e;
    RemoteViews f14220f;
    public Bitmap f14221g;
    public CharSequence f14222h;
    public int f14223i;
    int f14224j;
    boolean f14225k = true;
    public boolean f14226l;
    public gl f14227m;
    public CharSequence f14228n;
    public CharSequence[] f14229o;
    int f14230p;
    int f14231q;
    boolean f14232r;
    String f14233s;
    boolean f14234t;
    String f14235u;
    public ArrayList<fr> f14236v = new ArrayList();
    boolean f14237w = false;
    String f14238x;
    Bundle f14239y;
    int f14240z = 0;

    public fx(Context context) {
        this.f14215a = context;
        this.f14213F.when = System.currentTimeMillis();
        this.f14213F.audioStreamType = -1;
        this.f14224j = 0;
        this.f14214G = new ArrayList();
    }

    public fx m16419a(long j) {
        this.f14213F.when = j;
        return this;
    }

    public fx m16431a(boolean z) {
        this.f14225k = true;
        return this;
    }

    public fx m16438b(boolean z) {
        this.f14226l = true;
        return this;
    }

    public fx m16417a(int i) {
        this.f14213F.icon = i;
        return this;
    }

    public fx m16429a(CharSequence charSequence) {
        this.f14216b = fx.m16415d(charSequence);
        return this;
    }

    public fx m16436b(CharSequence charSequence) {
        this.f14217c = fx.m16415d(charSequence);
        return this;
    }

    public fx m16434b(int i) {
        this.f14223i = i;
        return this;
    }

    public fx m16421a(PendingIntent pendingIntent) {
        this.f14218d = pendingIntent;
        return this;
    }

    public fx m16435b(PendingIntent pendingIntent) {
        this.f14213F.deleteIntent = pendingIntent;
        return this;
    }

    public fx m16422a(PendingIntent pendingIntent, boolean z) {
        this.f14219e = pendingIntent;
        m16414a(128, true);
        return this;
    }

    public fx m16440c(CharSequence charSequence) {
        this.f14213F.tickerText = fx.m16415d(charSequence);
        return this;
    }

    public fx m16423a(Bitmap bitmap) {
        this.f14221g = bitmap;
        return this;
    }

    public fx m16424a(Uri uri) {
        this.f14213F.sound = uri;
        this.f14213F.audioStreamType = -1;
        return this;
    }

    public fx m16432a(long[] jArr) {
        this.f14213F.vibrate = jArr;
        return this;
    }

    public fx m16442c(boolean z) {
        m16414a(2, true);
        return this;
    }

    public fx m16445d(boolean z) {
        m16414a(8, true);
        return this;
    }

    public fx m16448e(boolean z) {
        m16414a(16, z);
        return this;
    }

    public fx m16430a(String str) {
        this.f14238x = str;
        return this;
    }

    public fx m16439c(int i) {
        this.f14213F.defaults = i;
        if ((i & 4) != 0) {
            Notification notification = this.f14213F;
            notification.flags |= 1;
        }
        return this;
    }

    private void m16414a(int i, boolean z) {
        if (z) {
            Notification notification = this.f14213F;
            notification.flags |= i;
            return;
        }
        notification = this.f14213F;
        notification.flags &= i ^ -1;
    }

    public fx m16444d(int i) {
        this.f14224j = i;
        return this;
    }

    public fx m16437b(String str) {
        this.f14233s = str;
        return this;
    }

    public fx m16449f(boolean z) {
        this.f14234t = true;
        return this;
    }

    public fx m16441c(String str) {
        this.f14235u = str;
        return this;
    }

    public fx m16425a(Bundle bundle) {
        if (this.f14239y == null) {
            this.f14239y = new Bundle(bundle);
        } else {
            this.f14239y.putAll(bundle);
        }
        return this;
    }

    public Bundle m16416a() {
        if (this.f14239y == null) {
            this.f14239y = new Bundle();
        }
        return this.f14239y;
    }

    public fx m16418a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f14236v.add(new fr(i, charSequence, pendingIntent));
        return this;
    }

    public fx m16426a(fr frVar) {
        this.f14236v.add(frVar);
        return this;
    }

    public fx m16428a(gl glVar) {
        if (this.f14227m != glVar) {
            this.f14227m = glVar;
            if (this.f14227m != null) {
                this.f14227m.m16301a(this);
            }
        }
        return this;
    }

    public fx m16447e(int i) {
        this.f14240z = i;
        return this;
    }

    public fx m16420a(Notification notification) {
        this.f14209B = notification;
        return this;
    }

    public fx m16427a(fz fzVar) {
        fzVar.mo1800a(this);
        return this;
    }

    protected static CharSequence m16415d(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    protected CharSequence m16443c() {
        return this.f14217c;
    }

    protected CharSequence m16446d() {
        return this.f14216b;
    }

    public Notification m16433b() {
        return fq.f13726a.mo2203a(this, new fy());
    }
}
