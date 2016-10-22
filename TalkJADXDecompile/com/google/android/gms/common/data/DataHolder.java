package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import guy;
import guz;
import gva;
import gvf;
import gwb;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Creator<DataHolder> CREATOR;
    private static final guz l;
    Bundle a;
    int[] b;
    int c;
    boolean d;
    private final int e;
    private final String[] f;
    private final CursorWindow[] g;
    private final int h;
    private final Bundle i;
    private Object j;
    private boolean k;

    static {
        CREATOR = new gvf();
        l = new guy(new String[0], null);
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.d = false;
        this.k = true;
        this.e = i;
        this.f = strArr;
        this.g = cursorWindowArr;
        this.h = i2;
        this.i = bundle;
    }

    private DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.d = false;
        this.k = true;
        this.e = 1;
        this.f = (String[]) gwb.L((Object) strArr);
        this.g = (CursorWindow[]) gwb.L((Object) cursorWindowArr);
        this.h = i;
        this.i = bundle;
        a();
    }

    private void a(String str, int i) {
        if (this.a == null || !this.a.containsKey(str)) {
            String str2 = "No such column: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (h()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.c) {
            throw new CursorIndexOutOfBoundsException(i, this.c);
        }
    }

    public int a(int i) {
        int i2 = 0;
        boolean z = i >= 0 && i < this.c;
        gwb.a(z);
        while (i2 < this.b.length) {
            if (i < this.b[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.b.length ? i2 - 1 : i2;
    }

    public int a(String str, int i, int i2) {
        a(str, i);
        return this.g[i2].getInt(i, this.a.getInt(str));
    }

    public void a() {
        int i;
        int i2 = 0;
        this.a = new Bundle();
        for (i = 0; i < this.f.length; i++) {
            this.a.putInt(this.f[i], i);
        }
        this.b = new int[this.g.length];
        i = 0;
        while (i2 < this.g.length) {
            this.b[i2] = i;
            i += this.g[i2].getNumRows() - (i - this.g[i2].getStartPosition());
            i2++;
        }
        this.c = i;
    }

    public void a(Object obj) {
        this.j = obj;
    }

    int b() {
        return this.e;
    }

    public String b(String str, int i, int i2) {
        a(str, i);
        return this.g[i2].getString(i, this.a.getInt(str));
    }

    public byte[] c(String str, int i, int i2) {
        a(str, i);
        return this.g[i2].getBlob(i, this.a.getInt(str));
    }

    String[] c() {
        return this.f;
    }

    public void close() {
        synchronized (this) {
            if (!this.d) {
                this.d = true;
                for (CursorWindow close : this.g) {
                    close.close();
                }
            }
        }
    }

    CursorWindow[] d() {
        return this.g;
    }

    public int e() {
        return this.h;
    }

    public Bundle f() {
        return this.i;
    }

    protected void finalize() {
        try {
            if (this.k && this.g.length > 0 && !h()) {
                String valueOf;
                if (this.j == null) {
                    String str = "internal object: ";
                    valueOf = String.valueOf(toString());
                    valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                } else {
                    valueOf = this.j.toString();
                }
                Log.e("DataBuffer", new StringBuilder(String.valueOf(valueOf).length() + 161).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (").append(valueOf).append(")").toString());
                close();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public int g() {
        return this.c;
    }

    public boolean h() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        return z;
    }

    private DataHolder(guz guz, int i, Bundle bundle) {
        this(guz.a, a(guz, -1), i, bundle);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.a(parcel, 1, c(), false);
        gwb.a(parcel, 2, d(), i, false);
        gwb.d(parcel, 3, e());
        gwb.a(parcel, 4, f(), false);
        gwb.d(parcel, 1000, b());
        gwb.v(parcel, c);
    }

    private static CursorWindow[] a(guz guz, int i) {
        int i2 = 0;
        if (guz.a.length == 0) {
            return new CursorWindow[0];
        }
        List list = guz.b;
        int size = list.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(guz.a.length);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            try {
                int i5;
                int i6;
                CursorWindow cursorWindow2;
                if (!cursorWindow.allocRow()) {
                    new StringBuilder(72).append("Allocating additional cursor window for large data set (row ").append(i3).append(")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i3);
                    cursorWindow.setNumColumns(guz.a.length);
                    arrayList.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) list.get(i3);
                boolean z = true;
                for (int i7 = 0; i7 < guz.a.length && z; i7++) {
                    String str = guz.a[i7];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z = cursorWindow.putNull(i3, i7);
                    } else if (obj instanceof String) {
                        z = cursorWindow.putString((String) obj, i3, i7);
                    } else if (obj instanceof Long) {
                        z = cursorWindow.putLong(((Long) obj).longValue(), i3, i7);
                    } else if (obj instanceof Integer) {
                        z = cursorWindow.putLong((long) ((Integer) obj).intValue(), i3, i7);
                    } else if (obj instanceof Boolean) {
                        z = cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1 : 0, i3, i7);
                    } else if (obj instanceof byte[]) {
                        z = cursorWindow.putBlob((byte[]) obj, i3, i7);
                    } else if (obj instanceof Double) {
                        z = cursorWindow.putDouble(((Double) obj).doubleValue(), i3, i7);
                    } else if (obj instanceof Float) {
                        z = cursorWindow.putDouble((double) ((Float) obj).floatValue(), i3, i7);
                    } else {
                        String valueOf = String.valueOf(obj);
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("Unsupported object for column ").append(str).append(": ").append(valueOf).toString());
                    }
                }
                if (z) {
                    i5 = i3;
                    i6 = 0;
                    cursorWindow2 = cursorWindow;
                } else if (i4 != 0) {
                    throw new gva("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                } else {
                    new StringBuilder(74).append("Couldn't populate window data for row ").append(i3).append(" - allocating new window.");
                    cursorWindow.freeLastRow();
                    CursorWindow cursorWindow3 = new CursorWindow(false);
                    cursorWindow3.setStartPosition(i3);
                    cursorWindow3.setNumColumns(guz.a.length);
                    arrayList.add(cursorWindow3);
                    i5 = i3 - 1;
                    cursorWindow2 = cursorWindow3;
                    i6 = 1;
                }
                i4 = i6;
                cursorWindow = cursorWindow2;
                i3 = i5 + 1;
            } catch (RuntimeException e) {
                RuntimeException runtimeException = e;
                i3 = arrayList.size();
                while (i2 < i3) {
                    ((CursorWindow) arrayList.get(i2)).close();
                    i2++;
                }
                throw runtimeException;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    public static DataHolder b(int i) {
        return new DataHolder(l, i, null);
    }
}
