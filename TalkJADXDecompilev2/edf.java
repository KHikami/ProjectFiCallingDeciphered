package defpackage;

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
    public static final List<String> a = new ArrayList(Arrays.asList(new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}));
    private int b;

    public edf() {
        super(gwb.rU, new int[]{bm.H, bm.I});
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((eia) this.binder.a(eia.class)).a(bm.F, new edg(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ((Button) onCreateView.findViewById(bm.H)).setText(gwb.rY);
        ((Button) onCreateView.findViewById(bm.I)).setText(gwb.rW);
        gwb.a((ImageView) onCreateView.findViewById(bm.G), this.context.getResources(), gwb.rV);
        return onCreateView;
    }

    protected String a() {
        return getString(gwb.rX);
    }

    protected void a(int i) {
        this.b = i;
        if (i == bm.I) {
            ((eia) this.binder.a(eia.class)).a(new eie(bm.F, 2654), a);
        } else {
            b();
        }
    }

    void b() {
        PreferenceManager.getDefaultSharedPreferences(this.context).edit().putBoolean("contacts_rationale_shown", true).apply();
        super.a(this.b);
    }
}
