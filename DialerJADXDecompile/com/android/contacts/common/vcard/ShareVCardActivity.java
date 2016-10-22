package com.android.contacts.common.vcard;

import ajf;
import ajp;
import ajv;
import android.content.ComponentName;
import android.os.IBinder;
import android.support.v4.content.FileProvider;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
public class ShareVCardActivity extends ExportVCardActivity {
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a = true;
        this.b = ((ajv) iBinder).a;
        for (File file : getCacheDir().listFiles()) {
            long currentTimeMillis = System.currentTimeMillis() - file.lastModified();
            if (file.getName().startsWith("vcards_") && currentTimeMillis > 86400000) {
                file.delete();
            }
        }
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()).toString();
        String valueOf = String.valueOf("vcards_");
        File file2 = new File(getCacheDir(), new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(str).length()).append(valueOf).append(str).append(".vcf").toString());
        try {
            file2.createNewFile();
            this.b.a(new ajf("com.google.android.dialer.files", FileProvider.a(this, "com.google.android.dialer.files", file2)), new ajp(this));
            a();
        } catch (IOException e) {
            str = String.valueOf(e);
            Log.e("VCardShare", new StringBuilder(String.valueOf(str).length() + 37).append("Failed to create .vcf file, because: ").append(str).toString());
            a();
        }
    }
}
