package com.android.dialer.app;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

/* compiled from: PG */
public class DialerBackupAgent extends BackupAgentHelper {
    public void onCreate() {
        addHelper("shared_pref", new SharedPreferencesBackupHelper(this, new String[]{"com.android.dialer_preferences"}));
    }
}
