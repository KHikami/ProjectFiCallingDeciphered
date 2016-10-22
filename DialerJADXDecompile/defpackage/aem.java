package defpackage;

import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* renamed from: aem */
public class aem extends adi implements aek, aeu {
    private static final String n;
    public aei k;
    public boolean l;
    public int m;
    private String o;
    private adn p;
    private View q;
    private View r;

    public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        a(loader, (Cursor) obj);
    }

    static {
        n = aem.class.getSimpleName();
    }

    public aem() {
        this.m = adr.a(false);
        this.b = false;
        c(true);
        a(true);
        this.g = 0;
        setHasOptionsMenu(true);
    }

    public final void a(int i) {
        a(i, true);
    }

    public final void f(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        this.g = i;
    }

    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.b(layoutInflater, viewGroup);
        View inflate = layoutInflater.inflate(buf.dq, null, false);
        this.r = inflate.findViewById(cob.s);
        this.i.addHeaderView(inflate);
        this.q = getView().findViewById(cob.l);
        f();
        b(true);
    }

    public void d(boolean z) {
        super.d(z);
        f();
    }

    private final void f() {
        adn adn = this.p;
        if (this.q != null && adn != null) {
            boolean z;
            if (this.d || !aif.a(this.q, adn, false)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.r.setVisibility(8);
                this.q.setVisibility(0);
                return;
            }
            this.r.setVisibility(0);
            this.q.setVisibility(8);
        }
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.p = (adn) bundle.getParcelable("filter");
            this.o = bundle.getString("shortcutAction");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("filter", this.p);
        bundle.putString("shortcutAction", this.o);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.k != null) {
            this.k.b_();
        }
        return true;
    }

    public void a(int i, long j) {
        a(i, false);
    }

    private final void a(int i, boolean z) {
        Object string;
        Uri c = c(i);
        if (c == null) {
            String k = ((aej) this.h).k(i);
            if (TextUtils.isEmpty(k)) {
                Log.w(n, "Item at " + i + " was clicked before adapter is ready. Ignoring");
            } else {
                b(i);
                this.k.a(k, z, g(true));
            }
        } else if (this.o == null) {
            this.k.a(c, z, g(false));
        } else {
            new aev(new aes(getActivity(), this), c, this.o).execute(new Void[0]);
        }
        Cursor cursor = (Cursor) ((aej) this.h).getItem(i);
        if (cursor != null) {
            string = cursor.getString(5);
        } else {
            string = null;
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Object string2 = jSONObject.getString("analytics_category");
                Object string3 = jSONObject.getString("analytics_action");
                string = jSONObject.getString("analytics_value");
                if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string)) {
                    try {
                        buf.H(getActivity()).a(string2, string3, "", (long) Float.parseFloat(string));
                    } catch (NumberFormatException e) {
                    }
                }
            } catch (JSONException e2) {
            }
        }
    }

    public void b(int i) {
    }

    public void f_() {
        super.f_();
    }

    public final void a(Loader loader, Cursor cursor) {
        super.a(loader, cursor);
        boolean z = (cursor == null || cursor.isClosed() || cursor.getCount() <= 0) ? false : true;
        b(z);
    }

    public adh a() {
        adh aej = new aej(getActivity());
        aej.f = true;
        aej.z = this.l;
        return aej;
    }

    protected final void e() {
        super.e();
        adh adh = this.h;
        if (adh != null) {
            if (!(this.d || this.p == null)) {
                adh.t = this.p;
            }
            ((aej) adh).y = this.m;
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(buf.dr, null);
    }

    public final void a(Intent intent) {
        this.k.a(intent);
    }

    public int g(boolean z) {
        return 0;
    }

    public Uri c(int i) {
        return ((aej) this.h).l(i);
    }
}
