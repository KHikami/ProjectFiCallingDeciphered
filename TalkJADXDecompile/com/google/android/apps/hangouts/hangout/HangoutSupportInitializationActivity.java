package com.google.android.apps.hangouts.hangout;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import bc;
import dcl;
import dgg;
import dhz;
import fde;
import iil;

public final class HangoutSupportInitializationActivity extends dcl implements OnClickListener {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (dgg.a().c()) {
            Intent intent = getIntent();
            intent.setClass(this, HangoutActivity.class);
            intent.putExtra("account_id", fde.a(((dhz) getIntent().getParcelableExtra("hangout_room_info")).a()).g());
            startActivity(intent);
            finish();
            return;
        }
        int i;
        ((dhz) getIntent().getParcelableExtra("hangout_room_info")).s();
        if (getPackageManager().hasSystemFeature("android.hardware.microphone")) {
            i = bc.eN;
        } else {
            i = bc.eO;
        }
        Builder builder = new Builder(this);
        builder.setMessage(getString(i));
        builder.setPositiveButton(bc.hR, this);
        builder.setCancelable(false);
        builder.show();
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        iil.a(Integer.valueOf(i), Integer.valueOf(0));
        Dialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(bc.fM));
        progressDialog.setProgressStyle(0);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        finish();
    }
}
