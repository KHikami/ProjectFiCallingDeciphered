package p000;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

public final class hvj extends gve implements hwn {
    public hvj(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public String mo1778a() {
        return m18666b("account_name");
    }

    public boolean mo1779b() {
        return mo1781d() != null;
    }

    public String mo1780c() {
        Object b = m18666b("display_name");
        return TextUtils.isEmpty(b) ? mo1778a() : b;
    }

    public String mo1781d() {
        return m18666b("page_gaia_id");
    }

    public boolean mo1287e() {
        return !this.a.m9685h();
    }

    @Deprecated
    public String mo1782g() {
        return mo1781d();
    }

    public String mo1783h() {
        return hvl.f17354a.m21068a(m18666b("avatar"));
    }

    public String mo1784i() {
        return hvl.f17354a.m21068a(m18666b("cover_photo_url"));
    }

    public /* synthetic */ Object mo1288f() {
        throw new UnsupportedOperationException("Method not supported for object Owner");
    }
}
