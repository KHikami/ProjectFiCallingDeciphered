package p000;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class grw extends gno {
    gsd f15990n;
    final /* synthetic */ grt f15991o;
    private String f15992p;
    private Uri f15993q;
    private gru f15994r;
    private long f15995s;

    public grw(grt grt, Context context, String str, Uri uri, hxz hxz, long j, gru gru) {
        this.f15991o = grt;
        super(context);
        this.f15994r = gru;
        this.f15990n = new gsd(hxz);
        this.f15992p = str;
        this.f15993q = uri;
        this.f15990n.m18438a(str);
        this.f15995s = j;
    }

    public void m18378a(Cursor cursor, int i, Map<String, String> map) {
        boolean z = true;
        bko e = fde.m15018e(i);
        m9269a(cursor, fde.m15018e(i), false, (Object) this.f15992p);
        this.f15990n.m18439a(this.f15991o.m18372a(i, this.f15992p, 0, map));
        this.f15990n.m18450e(cursor.getString(41));
        int v = m9319v();
        boolean z2 = m9318u() == 2;
        this.f15990n.m18442b(v);
        gsd gsd = this.f15990n;
        if (!gwb.m2254i(m9319v())) {
            v = gsb.f16003a;
        } else if (z2 && fyi.m16627c()) {
            v = gsb.f16005c;
        } else {
            v = gsb.f16004b;
        }
        gsd.m18435a(v);
        this.f15990n.m18436a(m9320w());
        this.f15990n.m18440a(m9316s());
        this.f15990n.m18445b(z2);
        gsd gsd2 = this.f15990n;
        if (cursor.getInt(40) == 1) {
            z = false;
        }
        gsd2.m18448c(z);
        List<edk> a = m18375a(i, this.f15992p);
        ArrayList arrayList = new ArrayList();
        if (!z2) {
            String str;
            edk edk = null;
            edk edk2 = null;
            for (edk edk3 : a) {
                if (e.m5632b().m13608a(edk3.f11213b)) {
                    edk2 = edk3;
                } else {
                    edk = edk3;
                }
            }
            if (edk != null) {
                if (edk2 == null || TextUtils.isEmpty(edk.f11217f) || edk.f11217f.equals(edk2.f11217f)) {
                    str = edk.f11216e;
                } else {
                    str = edk.f11217f;
                }
                if (e.m5641j() && !edk.f11236y) {
                    arrayList.add(str);
                }
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = this.f15990n.m18434a();
            }
            this.f15990n.m18449d(str);
        } else if (e.m5641j()) {
            for (edk edk32 : a) {
                if (!(edk32.f11236y || !e.m5641j() || e.m5632b().m13608a(edk32.f11213b))) {
                    CharSequence charSequence = edk32.f11217f != null ? edk32.f11217f : edk32.f11216e;
                    if (!TextUtils.isEmpty(charSequence)) {
                        arrayList.add(charSequence);
                    }
                }
            }
        }
        this.f15990n.m18444b(arrayList);
    }

    private List<edk> m18375a(int i, String str) {
        return new blo(this.f15991o.f15986a, i).m5916H(str);
    }

    public boolean mo2323n() {
        return m9320w() > this.f15995s;
    }

    public void mo1218a(boolean z, Bitmap bitmap, boolean z2, Object obj) {
        if (obj != null && obj.equals(this.f15992p) && !z2) {
            this.f15994r.m18373a(this.f15993q, bitmap);
        }
    }

    public void mo1223b(String str) {
        if (str != null && str.length() > 1) {
            this.f15990n.m18443b(str.substring(1));
        }
    }

    public CharSequence mo1219b() {
        return null;
    }

    public void mo1220b(int i) {
    }

    public void mo1217a(boolean z) {
    }

    public void mo1225c(int i) {
    }

    public void mo1211a(int i) {
    }

    public CharSequence mo1224c() {
        return null;
    }

    public void mo1216a(CharSequence charSequence) {
        if (charSequence != null) {
            this.f15990n.m18447c(charSequence.toString());
        }
    }

    public TextView mo1228d() {
        return null;
    }

    public void mo1214a(Bitmap bitmap) {
    }

    public void mo1221b(Drawable drawable) {
    }

    public void mo1232e(int i) {
    }

    public void mo1234f(int i) {
    }

    public void mo1229d(int i) {
    }

    public int mo1231e() {
        return 0;
    }

    public void mo1236g(int i) {
    }

    public CharSequence mo1233f() {
        return null;
    }

    public void mo1222b(CharSequence charSequence) {
    }

    public CharSequence mo1235g() {
        return null;
    }

    public void mo1227c(CharSequence charSequence) {
    }

    public int mo1237h() {
        return 0;
    }

    public void mo1238h(int i) {
    }

    public int mo1239i() {
        return 0;
    }

    public void mo1240i(int i) {
    }

    public int mo1241j() {
        return 0;
    }

    public void mo1242j(int i) {
    }

    public void mo1244k(int i) {
    }

    public int mo1243k() {
        return 0;
    }

    public void mo1246l(int i) {
    }

    public void mo1247m(int i) {
    }

    public void mo1249n(int i) {
    }

    public void mo1226c(Drawable drawable) {
    }

    protected void mo1245l() {
    }

    public void mo1212a(int i, int i2, int i3) {
    }

    public boolean mo1248m() {
        return false;
    }

    public void mo1230d(CharSequence charSequence) {
    }

    public void mo2322a(boolean z, gkt gkt, boolean z2, Object obj) {
        if (grm.m18337a(this.f15991o.f15986a)) {
            mo1218a(z, gkt.m17897d(), z2, obj);
        } else {
            super.mo2322a(z, gkt, z2, obj);
        }
    }

    protected void mo2321a(Drawable drawable, int i) {
    }
}
