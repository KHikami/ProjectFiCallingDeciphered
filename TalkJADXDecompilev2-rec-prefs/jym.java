package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class jym implements jyw {
    private static final int f21286a = 7;
    private static final int f21287b = 7;
    private final jyw[] f21288c;

    public jym(Context context, Set<String> set) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable e) {
            Log.wtf(String.format("Could not find application info for package: %s", new Object[]{r2}), e);
            applicationInfo = null;
        }
        Bundle bundle = applicationInfo == null ? null : applicationInfo.metaData;
        List arrayList = new ArrayList();
        Set hashSet = new HashSet();
        if (bundle != null) {
            for (String str : applicationInfo.metaData.keySet()) {
                String str2;
                if (str2.startsWith("MODULE.")) {
                    arrayList.add(jym.m25423a(bundle.getString(str2)));
                }
                if (str2.startsWith("MODULE:")) {
                    arrayList.add(jym.m25423a(str2.substring(f21286a)));
                } else if (str2.startsWith("module:")) {
                    String substring = str2.substring(f21287b);
                    hashSet.add(substring);
                    if (set == null || !set.contains(substring)) {
                        String valueOf = String.valueOf("gen_binder.");
                        str2 = String.valueOf(substring.replace('.', '$'));
                        arrayList.add(jym.m25423a(str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf)));
                        if (set != null && Log.isLoggable("Binder", 5)) {
                            str2 = "***WARNING*** Root module does not include ";
                            substring = String.valueOf(substring);
                            if (substring.length() != 0) {
                                str2.concat(substring);
                            } else {
                                substring = new String(str2);
                            }
                        }
                    }
                }
            }
        }
        this.f21288c = (jyw[]) arrayList.toArray(new jyw[arrayList.size()]);
    }

    private static jyw m25423a(String str) {
        Throwable th;
        String str2;
        String valueOf;
        try {
            return (jyw) Class.forName(str).newInstance();
        } catch (Throwable e) {
            th = e;
            str2 = "Failed to add stitch module ";
            valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        } catch (Throwable e2) {
            th = e2;
            str2 = "Failed to add stitch module ";
            valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        } catch (Throwable e22) {
            th = e22;
            str2 = "Failed to add stitch module ";
            valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    public void mo2230a(Context context, Class<?> cls, jyn jyn) {
        for (jyw a : this.f21288c) {
            a.mo2230a(context, cls, jyn);
        }
    }
}
