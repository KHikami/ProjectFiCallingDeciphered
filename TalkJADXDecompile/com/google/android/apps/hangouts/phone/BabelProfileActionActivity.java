package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.Toast;
import bc;
import bko;
import enl;
import fde;
import fh;
import glk;
import ig;
import jzp;

public class BabelProfileActionActivity extends jzp implements fh<Cursor> {
    private static final String[] n;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a((Cursor) obj);
    }

    static {
        n = new String[]{"account_name", "sourceid", "data5", "display_name"};
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable data = getIntent().getData();
        if (data == null) {
            finish();
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("data_uri", data);
        f().a(0, bundle2, this);
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        return new enl(this, null, (Uri) bundle.getParcelable("data_uri"), n, null, null, null);
    }

    public void a(Cursor cursor) {
        if (cursor == null || !cursor.moveToFirst()) {
            Toast.makeText(this, bc.iB, 0).show();
            finish();
            return;
        }
        String string = cursor.getString(1);
        if (TextUtils.isEmpty(string) || !string.startsWith("g:")) {
            Toast.makeText(this, bc.iB, 0).show();
            finish();
            return;
        }
        String substring = string.substring(2);
        bko a = fde.a(cursor.getString(0));
        int g = a != null ? a.g() : -1;
        String string2 = cursor.getString(2);
        String string3 = cursor.getString(3);
        Intent a2;
        if ("conversation".equals(string2)) {
            a2 = BabelGatewayActivity.a(g, substring, string3, null, false, null);
            a2.addFlags(33554432);
            startActivity(a2);
        } else if ("hangout".equals(string2)) {
            a2 = BabelGatewayActivity.a(g, substring, string3, null, null, 51, 0);
            a2.addFlags(33554432);
            startActivity(a2);
        } else {
            substring = "Babel";
            string3 = "Unrecognized profile command: ";
            string = String.valueOf(string2);
            glk.e(substring, string.length() != 0 ? string3.concat(string) : new String(string3), new Object[0]);
        }
        finish();
    }

    public void onLoaderReset(ig<Cursor> igVar) {
    }
}
