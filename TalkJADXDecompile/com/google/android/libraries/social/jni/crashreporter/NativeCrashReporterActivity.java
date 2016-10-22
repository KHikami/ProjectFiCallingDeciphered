package com.google.android.libraries.social.jni.crashreporter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import gwb;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import jlw;

public final class NativeCrashReporterActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        HashMap hashMap;
        Throwable th;
        String str;
        String str2;
        String valueOf;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("runnableName");
        Serializable serializableExtra = getIntent().getSerializableExtra("runnableArgs");
        if (serializableExtra != null) {
            hashMap = (HashMap) serializableExtra;
        } else {
            hashMap = null;
        }
        if (stringExtra != null) {
            try {
                ((Runnable) Class.forName(stringExtra).getDeclaredConstructor(new Class[]{Map.class}).newInstance(new Object[]{hashMap})).run();
            } catch (Throwable e) {
                th = e;
                str = "NativeCrashReporterActivity";
                str2 = "Failed to find class: ";
                valueOf = String.valueOf(stringExtra);
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            } catch (Throwable e2) {
                th = e2;
                str = "NativeCrashReporterActivity";
                str2 = "Failed to instantiate class: ";
                valueOf = String.valueOf(stringExtra);
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            } catch (Throwable e22) {
                Log.e("NativeCrashReporterActivity", "Failed to find constructor that takes a Map<String,String> as argument", e22);
            } catch (Throwable e222) {
                th = e222;
                str = "NativeCrashReporterActivity";
                str2 = "Failed to execute runnable: ";
                valueOf = String.valueOf(stringExtra);
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            }
        }
        gwb.a(new jlw(this, getIntent().getStringExtra("description")), 3000);
    }
}
