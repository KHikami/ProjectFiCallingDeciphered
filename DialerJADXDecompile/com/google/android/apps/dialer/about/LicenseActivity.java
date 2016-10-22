package com.google.android.apps.dialer.about;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import buf;
import pz;

/* compiled from: PG */
public class LicenseActivity extends pz {
    private WebView g;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e().a().b(true);
        setContentView(buf.lV);
        this.g = (WebView) findViewById(buf.lU);
        this.g.loadUrl("file:///android_asset/dialer_licenses.html");
    }

    protected void onDestroy() {
        this.g.destroy();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
