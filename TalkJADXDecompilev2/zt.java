package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class zt extends DataSetObservable {
    static final String a = zt.class.getSimpleName();
    private static final Object e = new Object();
    private static final Map<String, zt> f = new HashMap();
    final Context b;
    final String c;
    boolean d;
    private final Object g;
    private final List<zu> h;
    private final List<zv> i;
    private Intent j;
    private a k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private a p;

    public int a() {
        int size;
        synchronized (this.g) {
            c();
            size = this.h.size();
        }
        return size;
    }

    public ResolveInfo a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.g) {
            c();
            resolveInfo = ((zu) this.h.get(i)).a;
        }
        return resolveInfo;
    }

    public int a(ResolveInfo resolveInfo) {
        synchronized (this.g) {
            c();
            List list = this.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((zu) list.get(i)).a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public Intent b(int i) {
        synchronized (this.g) {
            if (this.j == null) {
                return null;
            }
            c();
            zu zuVar = (zu) this.h.get(i);
            ComponentName componentName = new ComponentName(zuVar.a.activityInfo.packageName, zuVar.a.activityInfo.name);
            Intent intent = new Intent(this.j);
            intent.setComponent(componentName);
            if (this.p != null) {
                Intent intent2 = new Intent(intent);
                if (this.p.a_()) {
                    return null;
                }
            }
            a(new zv(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public ResolveInfo b() {
        synchronized (this.g) {
            c();
            if (this.h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((zu) this.h.get(0)).a;
            return resolveInfo;
        }
    }

    public void c(int i) {
        synchronized (this.g) {
            float f;
            c();
            zu zuVar = (zu) this.h.get(i);
            zu zuVar2 = (zu) this.h.get(0);
            if (zuVar2 != null) {
                f = (zuVar2.b - zuVar.b) + 5.0f;
            } else {
                f = 1.0f;
            }
            a(new zv(new ComponentName(zuVar.a.activityInfo.packageName, zuVar.a.activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    private boolean d() {
        if (this.k == null || this.j == null || this.h.isEmpty() || this.i.isEmpty()) {
            return false;
        }
        Collections.unmodifiableList(this.i);
        return true;
    }

    private boolean a(zv zvVar) {
        boolean add = this.i.add(zvVar);
        if (add) {
            this.n = true;
            e();
            if (this.m) {
                if (this.n) {
                    this.n = false;
                    if (!TextUtils.isEmpty(this.c)) {
                        gwb.a(new zw(this), new Object[]{new ArrayList(this.i), this.c});
                    }
                }
                d();
                notifyChanged();
            } else {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
        }
        return add;
    }

    private void e() {
        int size = this.i.size() - this.l;
        if (size > 0) {
            this.n = true;
            for (int i = 0; i < size; i++) {
                this.i.remove(0);
            }
        }
    }

    private void f() {
        try {
            InputStream openFileInput = this.b.openFileInput(this.c);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List list = this.i;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            break;
                        } else if (!(next == 3 || next == 4)) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new zv(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                            return;
                        } catch (IOException e) {
                            return;
                        }
                    }
                    return;
                }
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            } catch (Throwable e2) {
                Log.e(a, "Error reading historical recrod file: " + this.c, e2);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (Throwable e22) {
                Log.e(a, "Error reading historical recrod file: " + this.c, e22);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e4) {
                    }
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e5) {
                    }
                }
            }
        } catch (FileNotFoundException e6) {
        }
    }

    private void c() {
        int i;
        int i2 = 1;
        if (!this.o || this.j == null) {
            i = 0;
        } else {
            this.o = false;
            this.h.clear();
            List queryIntentActivities = this.b.getPackageManager().queryIntentActivities(this.j, 0);
            int size = queryIntentActivities.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.h.add(new zu(this, (ResolveInfo) queryIntentActivities.get(i3)));
            }
            i = 1;
        }
        if (this.d && this.n && !TextUtils.isEmpty(this.c)) {
            this.d = false;
            this.m = true;
            f();
        } else {
            i2 = 0;
        }
        i |= i2;
        e();
        if (i != 0) {
            d();
            notifyChanged();
        }
    }
}
