package com.google.android.apps.hangouts.phone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import ba;
import bc;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import dcl;
import eom;
import gmp;
import gwb;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import tp;

public class HelpAndFeedbackActivity extends dcl {
    public static final Set<String> r;
    private WebView s;

    static {
        Set hashSet = new HashSet();
        r = hashSet;
        hashSet.add("support.google.com");
        r.add("www.google.co.kr");
        r.add("www.google.com");
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.gM);
        View findViewById = findViewById(ba.cW);
        this.s = (WebView) findViewById(ba.co);
        this.s.getSettings().setJavaScriptEnabled(true);
        if (bundle == null) {
            this.s.setWebViewClient(new eom(this, findViewById));
            this.s.loadUrl(j());
        }
        tp g = g();
        g.b(getResources().getString(bc.fo, new Object[]{((gmp) this.E.a(gmp.class)).c()}));
        g.b(true);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.s.saveState(bundle);
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.s.restoreState(bundle);
    }

    protected boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == ba.bi) {
            gwb.a(null, 1608);
            gwb.z(getApplicationContext());
            return true;
        } else if (menuItem.getItemId() == ba.gi) {
            gwb.A((Context) this);
            gwb.a(null, 1609);
            return true;
        } else if (menuItem.getItemId() == ba.dk) {
            startActivity(gwb.z(gwb.b((Context) this, "babel_privacy_policy_url", "https://www.google.com/policies/privacy/")));
            gwb.a(null, 1610);
            return true;
        } else if (menuItem.getItemId() == ba.dj) {
            startActivity(new Intent(getApplicationContext(), LicenseMenuActivity.class));
            gwb.a(null, 1611);
            return true;
        } else if (menuItem.getItemId() == ba.dn) {
            startActivity(gwb.z(gwb.b((Context) this, "babel_tos_url", "https://www.google.com/accounts/tos")));
            gwb.a(null, 1612);
            return true;
        } else if (menuItem.getItemId() == ba.dg) {
            String b = gwb.b((Context) this, "babel_maps_tos_url", "https://www.google.com/intl/en/help/terms_maps.html");
            if (!TextUtils.isEmpty(Locale.getDefault().getLanguage())) {
                String valueOf = String.valueOf(Locale.getDefault().getLanguage());
                b = b.replace("/en/", new StringBuilder(String.valueOf(valueOf).length() + 2).append("/").append(valueOf).append("/").toString());
            }
            startActivity(gwb.z(b));
            gwb.a(null, 1669);
            return true;
        } else if (menuItem.getItemId() != ba.dd) {
            return super.a(menuItem);
        } else {
            startActivity(gwb.z(gwb.b((Context) this, "babel_location_tos_url", "https://www.google.co.kr/intl/ko/policies/terms/location/")));
            gwb.a(null, 1613);
            return true;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(gwb.hM, menu);
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        if ("KR".equals(gwb.W(getApplicationContext()))) {
            menu.findItem(ba.dd).setVisible(true);
        }
        return onCreateOptionsMenu;
    }

    public void onLowMemory() {
        super.onLowMemory();
        gwb.B();
    }

    protected void onDestroy() {
        super.onDestroy();
        gwb.B();
    }

    protected String j() {
        return gwb.K("androidhelp").toString();
    }
}
