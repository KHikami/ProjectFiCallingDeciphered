package com.google.android.apps.hangouts.service;

import android.app.backup.BackupAgentHelper;
import android.app.backup.FullBackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.os.ParcelFileDescriptor;
import glk;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class BabelBackupAgent extends BackupAgentHelper {
    private static final String[] a;

    static {
        a = new String[]{"recentEmoji"};
    }

    public void onRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) {
        if (i == 1) {
            String name = file.getName();
            String str;
            String str2;
            if (a(name)) {
                if (glk.a("Babel", 3)) {
                    str = "Babel";
                    str2 = "Restoring file: ";
                    name = String.valueOf(name);
                    glk.a(str, name.length() != 0 ? str2.concat(name) : new String(str2), new Object[0]);
                }
                super.onRestoreFile(parcelFileDescriptor, j, file, i, j2, j3);
            } else if (glk.a("Babel", 3)) {
                str = "Babel";
                str2 = "Skip restoring file: ";
                name = String.valueOf(name);
                glk.a(str, name.length() != 0 ? str2.concat(name) : new String(str2), new Object[0]);
            }
        }
    }

    private static boolean a(String str) {
        for (String startsWith : a) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public void onCreate() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(getPackageName()).concat("_preferences"));
        Collections.addAll(arrayList, a);
        addHelper("shared_prefs", new SharedPreferencesBackupHelper(this, (String[]) arrayList.toArray(new String[arrayList.size()])));
    }

    public void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        for (File file : new File(new File(getApplicationInfo().dataDir).getAbsolutePath(), "shared_prefs").listFiles()) {
            String name = file.getName();
            String str;
            if (a(name)) {
                if (glk.a("Babel", 3)) {
                    str = "Babel";
                    String str2 = "Backing up file: ";
                    name = String.valueOf(name);
                    glk.a(str, name.length() != 0 ? str2.concat(name) : new String(str2), new Object[0]);
                }
                fullBackupFile(file, fullBackupDataOutput);
            } else if (glk.a("Babel", 3)) {
                String str3 = "Babel";
                str = "Skip backing up file: ";
                name = String.valueOf(name);
                glk.a(str3, name.length() != 0 ? str.concat(name) : new String(str), new Object[0]);
            }
        }
    }
}
