package defpackage;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: bmw */
public final class bmw implements bmm {
    private final TreeSet a;

    public bmw(Context context, Collection collection) {
        this.a = new TreeSet();
        a(context, collection);
    }

    private static Throwable a(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private void a(Context context, Collection collection) {
        this.a.clear();
        Set<String> hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            try {
                String packageName = context.getApplicationContext().getPackageName();
                this.a.add(packageName);
                ActivityInfo[] activityInfoArr = context.getApplicationContext().getPackageManager().getPackageInfo(packageName, 1).activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        hashSet.add(activityInfo.packageName);
                    }
                }
            } catch (NameNotFoundException e) {
                bpn.a("No package found");
            }
        }
        for (String packageName2 : hashSet) {
            Iterator it = this.a.iterator();
            Object obj = 1;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (packageName2.startsWith(str)) {
                    obj = null;
                } else {
                    if (str.startsWith(packageName2)) {
                        this.a.remove(str);
                    }
                    if (obj != null) {
                        this.a.add(packageName2);
                    }
                }
            }
            if (obj != null) {
                this.a.add(packageName2);
            }
        }
    }

    public final String a(String str, Throwable th) {
        StackTraceElement stackTraceElement;
        Throwable a = bmw.a(th);
        StackTraceElement[] stackTrace = bmw.a(th).getStackTrace();
        if (stackTrace == null || stackTrace.length == 0) {
            stackTraceElement = null;
        } else {
            loop0:
            for (StackTraceElement stackTraceElement2 : stackTrace) {
                String className = stackTraceElement2.getClassName();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    if (className.startsWith((String) it.next())) {
                        stackTraceElement = stackTraceElement2;
                        break loop0;
                    }
                }
            }
            stackTraceElement = stackTrace[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] split = stackTraceElement.getClassName().split("\\.");
            String str2 = "unknown";
            if (split != null && split.length > 0) {
                str2 = split[split.length - 1];
            }
            stringBuilder.append(String.format(" (@%s:%s:%s)", new Object[]{str2, stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())}));
        }
        if (str != null) {
            stringBuilder.append(String.format(" {%s}", new Object[]{str}));
        }
        return stringBuilder.toString();
    }
}
