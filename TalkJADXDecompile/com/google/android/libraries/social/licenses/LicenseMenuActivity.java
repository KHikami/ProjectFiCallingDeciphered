package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import gwb;
import jma;
import uq;

public final class LicenseMenuActivity extends uq {
    public LicenseMenuActivity() {
        super((byte) 0);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.zl);
        if (g() != null) {
            g().b(true);
        }
        ListAdapter arrayAdapter = new ArrayAdapter(this, gwb.zj, gwb.zf, gwb.ao(this));
        ListView listView = (ListView) findViewById(gwb.zi);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new jma(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
