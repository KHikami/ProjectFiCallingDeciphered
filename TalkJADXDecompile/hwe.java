import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

public final class hwe extends gve implements hwp {
    public static final String[] c;
    private final Bundle d;
    private final huf e;
    private final hue f;
    private final boolean g;

    static {
        c = new String[]{"_id", "qualified_id", "gaia_id", "name", "sort_key", "sort_key_irank", "avatar", "profile_type", "v_circle_ids", "blocked", "in_viewer_domain", "last_modified", "name_verified", "given_name", "family_name", "affinity1", "affinity2", "affinity3", "affinity4", "affinity5", "people_in_common", "v_emails", "v_phones"};
    }

    public hwe(DataHolder dataHolder, int i, Bundle bundle, huf huf, hue hue) {
        super(dataHolder, i);
        this.d = bundle;
        this.e = huf;
        this.f = hue;
        this.g = this.d.getBoolean("emails_with_affinities", false);
    }

    public Iterable<hwm> c() {
        return this.f.a(b("v_emails"), this.g);
    }

    public Iterable<hwr> d() {
        return this.e.a(b("v_phones"), false);
    }

    public String[] i() {
        CharSequence b = b("v_circle_ids");
        return TextUtils.isEmpty(b) ? hvx.d : hvx.e.split(b, -1);
    }
}
