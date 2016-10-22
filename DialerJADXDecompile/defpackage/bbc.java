package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Looper;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bbc */
public class bbc implements bbj {
    public static final String a;
    private static bbc f;
    public final Context b;
    public final Map c;
    public final Map d;
    public bea e;
    private final bei g;
    private Drawable h;

    static {
        a = bbc.class.getSimpleName();
        f = null;
    }

    private bbc(Context context) {
        this.c = new ArrayMap();
        this.d = new ArrayMap();
        this.b = context;
        this.g = buf.K(context).a(context);
        this.e = buf.K(context).d(context);
    }

    public static synchronized bbc a(Context context) {
        bbc bbc;
        synchronized (bbc.class) {
            if (f == null) {
                f = new bbc(context.getApplicationContext());
            }
            bbc = f;
        }
        return bbc;
    }

    public static bbe a(Context context, ayo ayo, boolean z) {
        bbe bbe = new bbe();
        bbc.a(context, ban.a(context, ayo), bbe, ayo.d(), z);
        return bbe;
    }

    private static void a(Context context, bad bad, bbe bbe, int i, boolean z) {
        String a;
        String str;
        String valueOf;
        String str2 = null;
        Objects.requireNonNull(bad);
        boolean z2 = false;
        Object obj = bad.c;
        if (!TextUtils.isEmpty(obj)) {
            z2 = awy.a((String) obj);
            if (obj.startsWith("sip:")) {
                obj = obj.substring(4);
            }
        }
        String str3;
        if (TextUtils.isEmpty(bad.a)) {
            if (TextUtils.isEmpty(obj)) {
                a = bbc.a(context, i, bad.u);
                str = a;
                str3 = "  ==> no name *or* number! displayName = ";
                valueOf = String.valueOf(a);
                if (valueOf.length() != 0) {
                    valueOf = str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
                bdf.a(str, valueOf);
                valueOf = null;
                str = a;
                a = null;
            } else if (i != 1) {
                a = bbc.a(context, i, bad.u);
                str = a;
                str3 = "  ==> presentation not allowed! displayName = ";
                valueOf = String.valueOf(a);
                bdf.a(str, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                valueOf = null;
                str = a;
                a = null;
            } else if (TextUtils.isEmpty(bad.g)) {
                if (z) {
                    str = bad.f;
                    str3 = a;
                    String str4 = "Geodescrption: ";
                    a = String.valueOf(bad.f);
                    bdf.a(str3, a.length() != 0 ? str4.concat(a) : new String(str4));
                    a = str;
                } else {
                    a = null;
                }
                str = a;
                str3 = String.valueOf(bdf.a(obj));
                bdf.a(str, new StringBuilder((String.valueOf(str3).length() + 76) + String.valueOf(a).length()).append("  ==>  no name; falling back to number: displayNumber '").append(str3).append("', displayLocation '").append(a).append("'").toString());
                str = null;
            } else {
                a = bad.g;
                bad.a = bad.g;
                bdf.a(a, new StringBuilder((String.valueOf(a).length() + 58) + String.valueOf(obj).length()).append("  ==> cnapName available: displayName '").append(a).append("', displayNumber '").append(obj).append("'").toString());
                str = a;
                a = null;
            }
        } else if (i != 1) {
            a = bbc.a(context, i, bad.u);
            str = a;
            str3 = "  ==> valid name, but presentation not allowed! displayName = ";
            valueOf = String.valueOf(a);
            bdf.a(str, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            valueOf = null;
            str = a;
            a = null;
        } else {
            str = bad.a;
            bbe.b = bad.b;
            a = bad.k;
            bdf.a(a, new StringBuilder((String.valueOf(str).length() + 70) + String.valueOf(obj).length()).append("  ==>  name is present in CallerInfo: displayName '").append(str).append("', displayNumber '").append(obj).append("'").toString());
            String str5 = a;
            a = null;
            str2 = str5;
        }
        bbe.a = str;
        bbe.c = valueOf;
        bbe.d = a;
        bbe.e = str2;
        bbe.g = z2;
        bbe.p = bad.p;
        if (bad.j) {
            bbe.o = 2;
        }
    }

    private static String a(Context context, int i, String str) {
        String string = context.getString(aq.dC);
        if (!TextUtils.isEmpty(str) && (i == 3 || i == 2)) {
            return str;
        }
        if (i == 2) {
            string = context.getString(aq.dn);
        } else if (i == 4) {
            string = context.getString(aq.dm);
        }
        return string;
    }

    public final void a(ayo ayo, boolean z, bbf bbf) {
        if (Looper.getMainLooper().isCurrentThread()) {
            Objects.requireNonNull(bbf);
            String str = ayo.d;
            bbe bbe = (bbe) this.c.get(str);
            Set set = (Set) this.d.get(str);
            if (bbe != null) {
                String str2 = a;
                String str3 = "Contact lookup. In memory cache hit; lookup ";
                String valueOf = String.valueOf(set == null ? "complete" : "still running");
                bdf.a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                bbf.a(str, bbe);
                if (set == null) {
                    return;
                }
            }
            if (set != null) {
                set.add(bbf);
                return;
            }
            bdf.a(a, "Contact lookup. In memory cache miss; searching provider.");
            Set arraySet = new ArraySet();
            arraySet.add(bbf);
            this.d.put(str, arraySet);
            a(ayo, ban.a(this.b, ayo, new bbg(this, z)), z, false);
            return;
        }
        throw new IllegalStateException();
    }

    final void a(ayo ayo, bad bad, boolean z, boolean z2) {
        int i;
        String str = ayo.d;
        int d = ayo.d();
        if (bad.j || bad.v || bad.w) {
            i = 1;
        } else {
            i = d;
        }
        bbe bbe = (bbe) this.c.get(str);
        if (bbe == null || TextUtils.isEmpty(bbe.a) || bad.j) {
            Drawable drawable;
            Context context = this.b;
            bbe bbe2 = new bbe();
            bbc.a(context, bad, bbe2, i, z);
            if (bad.m != 0) {
                drawable = context.getResources().getDrawable(bad.m);
            } else {
                boolean z3 = bad.t;
                if (bad.q == null) {
                    drawable = a();
                } else {
                    bbe2.j = bad.q;
                    drawable = null;
                }
            }
            if (bad.o == null || (!buf.c() && bad.n == 0)) {
                bdf.b(a, "lookup key is null or contact ID is 0 on M. Don't create a lookup uri.");
                bbe2.k = null;
            } else {
                bbe2.k = Contacts.getLookupUri(bad.n, bad.o);
            }
            bbe2.f = drawable;
            bbe2.l = bad.o;
            bbe2.q = bad.r;
            if (bbe2.q == null || bbe2.q == Uri.EMPTY) {
                bbe2.q = RingtoneManager.getDefaultUri(1);
            }
            this.c.put(str, bbe2);
            bbe = bbe2;
        }
        a(str, bbe);
        if (!z2) {
            return;
        }
        if (!bad.j && this.g != null) {
            bdf.a(a, "Contact lookup. Local contacts miss, checking remote");
            Object beb = new beb(this, str);
            this.g.a(bbe.c, beb, beb, z);
        } else if (bbe.j != null) {
            bdf.a(a, "Contact lookup. Local contact found, starting image load");
            bbe.h = true;
            bbh.a(0, this.b, bbe.j, this, str);
        } else {
            if (bad.j) {
                bdf.a(a, "Contact lookup done. Local contact found, no image.");
            } else {
                bdf.a(a, "Contact lookup done. Local contact not found and no remote lookup service available.");
            }
            a(str);
        }
    }

    public final void a(Drawable drawable, Bitmap bitmap, Object obj) {
        bdf.a((Object) this, "Image load complete with context: ", this.b);
        String str = (String) obj;
        Object obj2 = (bbe) this.c.get(str);
        if (obj2 == null) {
            bdf.c((Object) this, "Image Load received for empty search entry.");
            a(str);
            return;
        }
        obj2.h = false;
        bdf.a((Object) this, "setting photo for entry: ", obj2);
        if (drawable != null) {
            bdf.b(this, "direct drawable: ", drawable);
            obj2.f = drawable;
        } else if (bitmap != null) {
            bdf.b(this, "photo icon: ", bitmap);
            obj2.f = new BitmapDrawable(this.b.getResources(), bitmap);
        } else {
            bdf.b((Object) this, "unknown photo");
            obj2.f = null;
        }
        b(str, obj2);
        if (!obj2.i) {
            a(str);
        }
    }

    public final void a(String str, bbe bbe) {
        Set<bbf> set = (Set) this.d.get(str);
        if (set != null) {
            for (bbf a : set) {
                a.a(str, bbe);
            }
        }
    }

    private final void b(String str, bbe bbe) {
        Set<bbf> set = (Set) this.d.get(str);
        if (set != null && bbe.f != null) {
            for (bbf b : set) {
                b.b(str, bbe);
            }
        }
    }

    public final void a(String str) {
        this.d.remove(str);
    }

    public final Drawable a() {
        if (this.h == null) {
            this.h = this.b.getResources().getDrawable(buf.kF);
        }
        return this.h;
    }
}
