package com.android.dialer.app.settings;

import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.preference.RingtonePreference;
import android.provider.Settings.System;
import android.util.AttributeSet;
import android.widget.Toast;
import cob;

/* compiled from: PG */
public class DefaultRingtonePreference extends RingtonePreference {
    public DefaultRingtonePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onPrepareRingtonePickerIntent(Intent intent) {
        super.onPrepareRingtonePickerIntent(intent);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", false);
    }

    protected void onSaveRingtone(Uri uri) {
        if (System.canWrite(getContext())) {
            RingtoneManager.setActualDefaultRingtoneUri(getContext(), getRingtoneType(), uri);
        } else {
            Toast.makeText(getContext(), getContext().getResources().getString(cob.dg), 0).show();
        }
    }

    protected Uri onRestoreRingtone() {
        return RingtoneManager.getActualDefaultRingtoneUri(getContext(), getRingtoneType());
    }
}
