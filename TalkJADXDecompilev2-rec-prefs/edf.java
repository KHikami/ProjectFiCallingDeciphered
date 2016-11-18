package p000;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class edf extends ery {
    public static final List<String> f11196a = new ArrayList(Arrays.asList(new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}));
    private int f11197b;

    public edf() {
        super(gwb.rU, new int[]{bm.f3806H, bm.f3807I});
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((eia) this.binder.m25443a(eia.class)).mo1884a(bm.f3804F, new edg(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ((Button) onCreateView.findViewById(bm.f3806H)).setText(gwb.rY);
        ((Button) onCreateView.findViewById(bm.f3807I)).setText(gwb.rW);
        gwb.m1811a((ImageView) onCreateView.findViewById(bm.f3805G), this.context.getResources(), gwb.rV);
        return onCreateView;
    }

    protected String mo495a() {
        return getString(gwb.rX);
    }

    protected void mo517a(int i) {
        this.f11197b = i;
        if (i == bm.f3807I) {
            ((eia) this.binder.m25443a(eia.class)).mo1886a(new eie(bm.f3804F, 2654), f11196a);
        } else {
            m13576b();
        }
    }

    void m13576b() {
        PreferenceManager.getDefaultSharedPreferences(this.context).edit().putBoolean("contacts_rationale_shown", true).apply();
        super.mo517a(this.f11197b);
    }
}
