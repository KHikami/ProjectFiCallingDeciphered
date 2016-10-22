package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: hvj */
public final class hvj extends gve implements hwn {
    public hvj(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public String a() {
        return b("account_name");
    }

    public boolean b() {
        return d() != null;
    }

    public String c() {
        Object b = b("display_name");
        return TextUtils.isEmpty(b) ? a() : b;
    }

    public String d() {
        return b("page_gaia_id");
    }

    public boolean e() {
        return !this.a.h();
    }

    @Deprecated
    public String g() {
        return d();
    }

    public String h() {
        return hvl.a.a(b("avatar"));
    }

    public String i() {
        return hvl.a.a(b("cover_photo_url"));
    }

    public /* synthetic */ Object f() {
        throw new UnsupportedOperationException("Method not supported for object Owner");
    }
}
