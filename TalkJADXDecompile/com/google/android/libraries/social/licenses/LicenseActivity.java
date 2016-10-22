package com.google.android.libraries.social.licenses;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import gwb;
import jlx;
import jlz;
import uq;

public final class LicenseActivity extends uq {
    public LicenseActivity() {
        super((byte) 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.zk);
        jlx jlx = (jlx) getIntent().getParcelableExtra("license");
        g().a(jlx.a());
        g().a(true);
        g().b(true);
        g().a(null);
        TextView textView = (TextView) findViewById(gwb.zh);
        CharSequence a = gwb.a((Context) this, jlx);
        if (a == null) {
            finish();
        } else {
            textView.setText(a);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = (TextView) findViewById(gwb.zh);
        bundle.putInt("scroll_pos", textView.getLayout().getLineStart(textView.getLayout().getLineForVertical(((ScrollView) findViewById(gwb.zg)).getScrollY())));
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(gwb.zg);
        scrollView.post(new jlz(this, bundle.getInt("scroll_pos"), scrollView));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
