import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import android.text.TextUtils;
import com.google.android.apps.dialer.settings.TextViewPreference;

/* compiled from: PG */
public class bka extends PreferenceFragment implements OnPreferenceChangeListener, cc {
    private static int a;
    private String b;
    private Context c;
    private SwitchPreference d;
    private SwitchPreference e;
    private SwitchPreference f;
    private Preference g;
    private Preference h;
    private TextViewPreference i;
    private SharedPreferences j;

    static {
        a = 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        r3 = 0;
        r1 = 1;
        r2 = 0;
        super.onCreate(r11);
        r0 = r10.getResources();
        r4 = buf.lG;
        r0 = r0.getString(r4);
        r10.b = r0;
        r0 = r10.getActivity();
        r0 = r0.getApplicationContext();
        r10.c = r0;
        r0 = r10.getActivity();
        r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0);
        r10.j = r0;
        r0 = r10.c;
        r0.getContentResolver();
        r0 = r10.getResources();
        r4 = buf.lI;
        r0 = r0.getString(r4);
        r4 = r10.getResources();
        r5 = buf.lL;
        r4 = r4.getString(r5);
        r5 = r10.getResources();
        r6 = buf.lH;
        r5 = r5.getString(r6);
        r6 = r10.getResources();
        r7 = buf.lJ;
        r6 = r6.getString(r7);
        r7 = r10.getResources();
        r8 = buf.lK;
        r7 = r7.getString(r8);
        r8 = buf.lT;
        r10.addPreferencesFromResource(r8);
        r0 = r10.findPreference(r0);
        r0 = (android.preference.SwitchPreference) r0;
        r10.d = r0;
        r0 = r10.d;
        r0.setOnPreferenceChangeListener(r10);
        r0 = r10.findPreference(r4);
        r0 = (android.preference.SwitchPreference) r0;
        r10.e = r0;
        r0 = r10.e;
        r0.setOnPreferenceChangeListener(r10);
        r0 = r10.findPreference(r6);
        r0 = (android.preference.SwitchPreference) r0;
        r10.f = r0;
        r0 = r10.f;
        r0.setOnPreferenceChangeListener(r10);
        r0 = r10.findPreference(r7);
        r10.g = r0;
        r0 = r10.b;
        r0 = r10.findPreference(r0);
        r10.h = r0;
        r0 = r10.h;
        r4 = new bkb;
        r4.<init>(r10);
        r0.setOnPreferenceClickListener(r4);
        r0 = r10.h;
        r4 = r10.b();
        r0.setSummary(r4);
        r0 = r10.e;
        r4 = r10.d;
        r4 = r4.isChecked();
        r0.setEnabled(r4);
        r4 = r10.h;
        r0 = r10.d;
        r0 = r0.isChecked();
        if (r0 == 0) goto L_0x0110;
    L_0x00bf:
        r0 = r10.e;
        r0 = r0.isChecked();
        if (r0 == 0) goto L_0x0110;
    L_0x00c7:
        r0 = r1;
    L_0x00c8:
        r4.setEnabled(r0);
        r0 = r10.findPreference(r5);
        r0 = (com.google.android.apps.dialer.settings.TextViewPreference) r0;
        r10.i = r0;
        r5 = r10.i;
        r0 = r10.getResources();
        r4 = buf.lE;
        r0 = r0.getString(r4);
        r0 = android.text.Html.fromHtml(r0);
        r4 = new android.text.SpannableStringBuilder;
        r4.<init>(r0);
        r0 = r0.length();
        r6 = android.text.style.URLSpan.class;
        r0 = r4.getSpans(r2, r0, r6);
        r0 = (android.text.style.URLSpan[]) r0;
        r6 = r0.length;
        if (r6 == r1) goto L_0x0112;
    L_0x00f7:
        r0 = "NearbyPlacesSettingsFragment";
        r4 = "Wrong number of hyperlinks in info text.";
        android.util.Log.e(r0, r4);
        r0 = r3;
    L_0x00ff:
        r5.setTitle(r0);
        r4 = bjd.y;
        r0 = crm.b;
        if (r0 != 0) goto L_0x012d;
    L_0x0108:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0110:
        r0 = r2;
        goto L_0x00c8;
    L_0x0112:
        r0 = r0[r2];
        r6 = r4.getSpanStart(r0);
        r7 = r4.getSpanEnd(r0);
        r8 = r4.getSpanFlags(r0);
        r9 = new bkc;
        r9.<init>(r10);
        r4.setSpan(r9, r6, r7, r8);
        r4.removeSpan(r0);
        r0 = r4;
        goto L_0x00ff;
    L_0x012d:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x01a1;
    L_0x013b:
        r0 = r4.i;
        if (r0 == 0) goto L_0x0189;
    L_0x013f:
        r0 = crm.b;
        r3 = r4.i;
        r0 = r0.getSharedPreferences(r3, r2);
        r3 = r4.g;
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x01a1;
    L_0x014f:
        r0 = r4.a(r0);
    L_0x0153:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0169;
    L_0x015b:
        r0 = r10.getPreferenceScreen();
        r3 = r10.e;
        r0.removePreference(r3);
        r3 = r10.h;
        r0.removePreference(r3);
    L_0x0169:
        r10.c();
        r0 = r10.getActivity();
        r0 = r0.getIntent();
        r0 = r0.getExtras();
        r3 = "extra_enable_personalization";
        r0 = r0.getBoolean(r3, r2);
        if (r0 == 0) goto L_0x0188;
    L_0x0180:
        r0 = r10.e;
        r0.setChecked(r1);
        r10.a(r1);
    L_0x0188:
        return;
    L_0x0189:
        if (r3 != 0) goto L_0x01b8;
    L_0x018b:
        r0 = r4.j;
        r3 = crm.b;
        r5 = r4.f;
        r6 = r4.g;
        r7 = r4.h;
        r0 = r0.a(r3, r5, r6, r7);
    L_0x0199:
        if (r0 == 0) goto L_0x01a1;
    L_0x019b:
        r0 = r4.a(r0);
        if (r0 != 0) goto L_0x0153;
    L_0x01a1:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r3 = r4.e;
        r0 = ckq.a(r0, r3);
        if (r0 == 0) goto L_0x01b5;
    L_0x01af:
        r0 = r4.a(r0);
        if (r0 != 0) goto L_0x0153;
    L_0x01b5:
        r0 = r4.k;
        goto L_0x0153;
    L_0x01b8:
        r0 = r4.j;
        r5 = r4.f;
        r6 = r4.g;
        r7 = r4.h;
        r8 = new crk;
        r8.<init>(r5, r6, r7);
        r5 = r0.a(r8);
        if (r5 == 0) goto L_0x01d0;
    L_0x01cb:
        r0 = r5.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0199;
    L_0x01d0:
        r0 = r0.a(r3, r8);
        goto L_0x0199;
        */
        throw new UnsupportedOperationException("Method not decompiled: bka.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
        c();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == a && i2 == -1 && intent != null && intent.getExtras() != null) {
            String string = intent.getExtras().getString("authAccount");
            if (!string.isEmpty()) {
                a(string);
                this.h.setSummary(string);
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1 && iArr.length == 1 && iArr[0] == 0) {
            c();
        }
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        boolean z = false;
        if (preference == this.d) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
                this.e.setEnabled(true);
                Preference preference2 = this.h;
                if (booleanValue && this.e.isChecked()) {
                    z = true;
                }
                preference2.setEnabled(z);
            } else {
                this.e.setEnabled(false);
                this.h.setEnabled(false);
            }
        } else if (preference == this.e) {
            a(((Boolean) obj).booleanValue());
        } else if (preference == this.f) {
            bv.a(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1);
        }
        return true;
    }

    private final void a(boolean z) {
        this.j.edit().putBoolean("show_personalization_promo_card", false).apply();
        if (z) {
            Account[] a = blm.a(this.c);
            if (a.length == 1) {
                a(a[0].name);
                this.h.setSummary(a[0].name);
            } else {
                a();
            }
            this.h.setEnabled(true);
            return;
        }
        this.h.setEnabled(false);
    }

    private final void a(String str) {
        this.j.edit().putString(this.b, str).apply();
    }

    final void a() {
        CharSequence b = b();
        if (!TextUtils.isEmpty(b)) {
            for (Account account : blm.a(this.c)) {
                if (account.name.equals(b)) {
                    break;
                }
            }
        }
        Account account2 = null;
        startActivityForResult(buf.a(account2, null, new String[]{"com.google"}, true, null, null, null, null), a);
    }

    private final String b() {
        return this.j.getString(this.b, "");
    }

    private final void c() {
        if (buf.c(this.c, "android.permission.ACCESS_FINE_LOCATION")) {
            getPreferenceScreen().removePreference(this.f);
            getPreferenceScreen().addPreference(this.g);
            return;
        }
        getPreferenceScreen().addPreference(this.f);
        this.f.setChecked(false);
        getPreferenceScreen().removePreference(this.g);
    }
}
