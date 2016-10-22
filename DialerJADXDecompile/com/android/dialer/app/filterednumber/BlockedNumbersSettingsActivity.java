package com.android.dialer.app.filterednumber;

import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import ape;
import aq;
import aqz;
import buf;
import pz;

/* compiled from: PG */
public class BlockedNumbersSettingsActivity extends pz implements aqz {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(buf.hw);
        if (bundle == null) {
            Fragment fragment = (ape) getFragmentManager().findFragmentByTag("blocked_management");
            if (fragment == null) {
                fragment = new ape();
            }
            getFragmentManager().beginTransaction().replace(aq.l, fragment, "blocked_management").commit();
            buf.H(this).a(18, this);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    public final boolean u() {
        return false;
    }

    public final boolean v() {
        return false;
    }

    public final int w() {
        return 0;
    }

    public final int x() {
        return 0;
    }
}
