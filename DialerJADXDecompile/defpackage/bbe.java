package defpackage;

import android.graphics.drawable.Drawable;
import android.location.Address;
import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* renamed from: bbe */
public final class bbe {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Uri j;
    public Uri k;
    public String l;
    public Address m;
    public List n;
    public int o;
    public long p;
    public Uri q;

    public bbe() {
        this.o = 1;
        this.p = 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(buf.l(this.a));
        String valueOf2 = String.valueOf(buf.l(this.b));
        String valueOf3 = String.valueOf(buf.l(this.c));
        String valueOf4 = String.valueOf(buf.l(this.d));
        String str = this.e;
        String valueOf5 = String.valueOf(this.f);
        boolean z = this.g;
        String valueOf6 = String.valueOf(null);
        String valueOf7 = String.valueOf(this.j);
        String valueOf8 = String.valueOf(this.m);
        String valueOf9 = String.valueOf(this.n);
        int i = this.o;
        long j = this.p;
        String valueOf10 = String.valueOf(this.q);
        return new StringBuilder(((((((((((String.valueOf(valueOf).length() + 254) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(str).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()) + String.valueOf(valueOf10).length()).append("ContactCacheEntry{name='").append(valueOf).append("', nameAlternative='").append(valueOf2).append("', number='").append(valueOf3).append("', location='").append(valueOf4).append("', label='").append(str).append("', photo=").append(valueOf5).append(", isSipCall=").append(z).append(", contactUri=").append(valueOf6).append(", displayPhotoUri=").append(valueOf7).append(", locationAddress=").append(valueOf8).append(", openingHours=").append(valueOf9).append(", contactLookupResult=").append(i).append(", userType=").append(j).append(", contactRingtoneUri=").append(valueOf10).append("}").toString();
    }
}
