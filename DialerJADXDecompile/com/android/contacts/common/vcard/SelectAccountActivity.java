package com.android.contacts.common.vcard;

import afb;
import agd;
import aih;
import aii;
import ajr;
import ajs;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.ListAdapter;
import buf;
import java.util.List;

/* compiled from: PG */
public class SelectAccountActivity extends Activity {
    private aii a;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = buf.fr;
        List a = afb.a((Context) this).a(true);
        if (a.size() == 0) {
            Log.w("SelectAccountActivity", "Account does not exist");
            finish();
        } else if (a.size() == 1) {
            agd agd = (agd) a.get(0);
            Intent intent = new Intent();
            intent.putExtra("account_name", agd.a);
            intent.putExtra("account_type", agd.b);
            intent.putExtra("data_set", agd.c);
            setResult(-1, intent);
            finish();
        } else {
            new StringBuilder(45).append("The number of available accounts: ").append(a.size());
            this.a = new ajr(this, this, a, i);
            showDialog(i);
        }
    }

    protected Dialog onCreateDialog(int i, Bundle bundle) {
        if (i != buf.fr) {
            return super.onCreateDialog(i, bundle);
        }
        if (this.a == null) {
            throw new NullPointerException("mAccountSelectionListener must not be null.");
        }
        OnClickListener aii;
        aii aii2 = this.a;
        OnCancelListener ajs = new ajs(this);
        afb a = afb.a((Context) this);
        List a2 = a.a(true);
        new StringBuilder(45).append("The number of available accounts: ").append(a2.size());
        ListAdapter aih = new aih(this, buf.do, a2, (LayoutInflater) new ContextThemeWrapper(this, 16973836).getSystemService("layout_inflater"), a);
        if (aii2 == null) {
            aii = new aii(this, a2, i);
        } else {
            Object obj = aii2;
        }
        return new Builder(this).setTitle(buf.eC).setSingleChoiceItems(aih, 0, aii).setOnCancelListener(ajs).create();
    }
}
