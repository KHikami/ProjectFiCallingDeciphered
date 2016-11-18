package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

public final class hwe extends gve implements hwp {
    public static final String[] f17412c = new String[]{"_id", "qualified_id", "gaia_id", "name", "sort_key", "sort_key_irank", "avatar", "profile_type", "v_circle_ids", "blocked", "in_viewer_domain", "last_modified", "name_verified", "given_name", "family_name", "affinity1", "affinity2", "affinity3", "affinity4", "affinity5", "people_in_common", "v_emails", "v_phones"};
    private final Bundle f17413d;
    private final huf f17414e;
    private final hue f17415f;
    private final boolean f17416g = this.f17413d.getBoolean("emails_with_affinities", false);

    public hwe(DataHolder dataHolder, int i, Bundle bundle, huf huf, hue hue) {
        super(dataHolder, i);
        this.f17413d = bundle;
        this.f17414e = huf;
        this.f17415f = hue;
    }

    public Iterable<hwm> mo2079c() {
        return this.f17415f.m20839a(m18666b("v_emails"), this.f17416g);
    }

    public Iterable<hwr> mo2080d() {
        return this.f17414e.m20839a(m18666b("v_phones"), false);
    }

    public String[] mo2085i() {
        CharSequence b = m18666b("v_circle_ids");
        return TextUtils.isEmpty(b) ? hvx.f17386d : hvx.f17387e.split(b, -1);
    }
}
