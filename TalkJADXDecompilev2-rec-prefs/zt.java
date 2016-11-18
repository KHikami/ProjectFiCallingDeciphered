package p000;

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
    static final String f35923a = zt.class.getSimpleName();
    private static final Object f35924e = new Object();
    private static final Map<String, zt> f35925f = new HashMap();
    final Context f35926b;
    final String f35927c;
    boolean f35928d;
    private final Object f35929g;
    private final List<zu> f35930h;
    private final List<zv> f35931i;
    private Intent f35932j;
    private a f35933k;
    private int f35934l;
    private boolean f35935m;
    private boolean f35936n;
    private boolean f35937o;
    private a f35938p;

    public int m41607a() {
        int size;
        synchronized (this.f35929g) {
            m41603c();
            size = this.f35930h.size();
        }
        return size;
    }

    public ResolveInfo m41609a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f35929g) {
            m41603c();
            resolveInfo = ((zu) this.f35930h.get(i)).f35939a;
        }
        return resolveInfo;
    }

    public int m41608a(ResolveInfo resolveInfo) {
        synchronized (this.f35929g) {
            m41603c();
            List list = this.f35930h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((zu) list.get(i)).f35939a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public Intent m41610b(int i) {
        synchronized (this.f35929g) {
            if (this.f35932j == null) {
                return null;
            }
            m41603c();
            zu zuVar = (zu) this.f35930h.get(i);
            ComponentName componentName = new ComponentName(zuVar.f35939a.activityInfo.packageName, zuVar.f35939a.activityInfo.name);
            Intent intent = new Intent(this.f35932j);
            intent.setComponent(componentName);
            if (this.f35938p != null) {
                Intent intent2 = new Intent(intent);
                if (this.f35938p.a_()) {
                    return null;
                }
            }
            m41602a(new zv(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public ResolveInfo m41611b() {
        synchronized (this.f35929g) {
            m41603c();
            if (this.f35930h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((zu) this.f35930h.get(0)).f35939a;
            return resolveInfo;
        }
    }

    public void m41612c(int i) {
        synchronized (this.f35929g) {
            float f;
            m41603c();
            zu zuVar = (zu) this.f35930h.get(i);
            zu zuVar2 = (zu) this.f35930h.get(0);
            if (zuVar2 != null) {
                f = (zuVar2.f35940b - zuVar.f35940b) + 5.0f;
            } else {
                f = 1.0f;
            }
            m41602a(new zv(new ComponentName(zuVar.f35939a.activityInfo.packageName, zuVar.f35939a.activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    private boolean m41604d() {
        if (this.f35933k == null || this.f35932j == null || this.f35930h.isEmpty() || this.f35931i.isEmpty()) {
            return false;
        }
        Collections.unmodifiableList(this.f35931i);
        return true;
    }

    private boolean m41602a(zv zvVar) {
        boolean add = this.f35931i.add(zvVar);
        if (add) {
            this.f35936n = true;
            m41605e();
            if (this.f35935m) {
                if (this.f35936n) {
                    this.f35936n = false;
                    if (!TextUtils.isEmpty(this.f35927c)) {
                        gwb.a(new zw(this), new Object[]{new ArrayList(this.f35931i), this.f35927c});
                    }
                }
                m41604d();
                notifyChanged();
            } else {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
        }
        return add;
    }

    private void m41605e() {
        int size = this.f35931i.size() - this.f35934l;
        if (size > 0) {
            this.f35936n = true;
            for (int i = 0; i < size; i++) {
                this.f35931i.remove(0);
            }
        }
    }

    private void m41606f() {
        try {
            InputStream openFileInput = this.f35926b.openFileInput(this.f35927c);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List list = this.f35931i;
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
                Log.e(f35923a, "Error reading historical recrod file: " + this.f35927c, e2);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (Throwable e22) {
                Log.e(f35923a, "Error reading historical recrod file: " + this.f35927c, e22);
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

    private void m41603c() {
        int i;
        int i2 = 1;
        if (!this.f35937o || this.f35932j == null) {
            i = 0;
        } else {
            this.f35937o = false;
            this.f35930h.clear();
            List queryIntentActivities = this.f35926b.getPackageManager().queryIntentActivities(this.f35932j, 0);
            int size = queryIntentActivities.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.f35930h.add(new zu(this, (ResolveInfo) queryIntentActivities.get(i3)));
            }
            i = 1;
        }
        if (this.f35928d && this.f35936n && !TextUtils.isEmpty(this.f35927c)) {
            this.f35928d = false;
            this.f35935m = true;
            m41606f();
        } else {
            i2 = 0;
        }
        i |= i2;
        m41605e();
        if (i != 0) {
            m41604d();
            notifyChanged();
        }
    }
}
