package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class jmu implements Parcelable {
    public static final Creator<jmu> CREATOR = new jmv();
    public String f20498a;
    public String f20499b = "com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST";
    public int f20500c = -1;
    public boolean f20501d = true;
    public String f20502e;
    public boolean f20503f;
    public boolean f20504g;
    public boolean f20505h;
    public boolean f20506i;
    public boolean f20507j;
    public int f20508k = -1;
    public String f20509l;
    public String f20510m;
    public String f20511n;
    public String f20512o;
    public String f20513p;
    public String f20514q;
    public jmf f20515r;
    public Class<? extends jmh> f20516s;
    public Bundle f20517t;
    public List<Class<? extends jmw>> f20518u = new ArrayList();

    public jmu m24731a() {
        return m24730d().m24738b();
    }

    private jmu m24730d() {
        this.f20503f = true;
        return this;
    }

    public jmu m24738b() {
        this.f20504g = true;
        return this;
    }

    public jmu m24732a(int i) {
        this.f20500c = i;
        return this;
    }

    public jmu m24733a(Context context, Intent intent) {
        this.f20508k = intent.getIntExtra("account_id", -1);
        icl a = ((ick) jyn.m25426a(context, ick.class)).mo3140a(context, intent);
        if (a != null) {
            this.f20509l = a.f17577a;
            this.f20510m = a.f17578b;
        }
        String stringExtra = intent.getStringExtra("viewerid");
        String str = null;
        if (stringExtra != null) {
            str = intent.getStringExtra("effectiveid");
        } else {
            Uri data = intent.getData();
            if (data != null) {
                try {
                    stringExtra = data.getQueryParameter("viewerid");
                    if (stringExtra != null) {
                        str = data.getQueryParameter("effectiveid");
                    }
                } catch (UnsupportedOperationException e) {
                }
            }
        }
        if (stringExtra != null) {
            this.f20511n = stringExtra;
            this.f20510m = str;
        }
        return this;
    }

    public jmu m24739c() {
        this.f20505h = true;
        return this;
    }

    public jmu m24736a(String str) {
        this.f20512o = str;
        return this;
    }

    public jmu m24734a(Class<? extends jmh> cls) {
        return m24735a((Class) cls, null);
    }

    public jmu m24735a(Class<? extends jmh> cls, Bundle bundle) {
        this.f20516s = cls;
        this.f20517t = bundle;
        return this;
    }

    public jmu m24737a(boolean z) {
        this.f20501d = false;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        String name;
        int i3 = 1;
        int i4 = 0;
        parcel.writeString(this.f20498a);
        parcel.writeString(this.f20499b);
        parcel.writeString(this.f20502e);
        parcel.writeInt(this.f20503f ? 1 : 0);
        if (this.f20504g) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (this.f20505h) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (this.f20506i) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (!this.f20507j) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeInt(this.f20508k);
        parcel.writeString(this.f20509l);
        parcel.writeString(this.f20510m);
        parcel.writeString(this.f20511n);
        parcel.writeInt(this.f20500c);
        parcel.writeString(this.f20512o);
        parcel.writeString(this.f20513p);
        parcel.writeString(this.f20514q);
        parcel.writeParcelable(this.f20515r, 0);
        if (this.f20516s != null) {
            name = this.f20516s.getName();
        } else {
            name = null;
        }
        parcel.writeString(name);
        parcel.writeBundle(this.f20517t);
        String[] strArr = new String[this.f20518u.size()];
        for (Class name2 : this.f20518u) {
            i3 = i4 + 1;
            strArr[i4] = name2.getName();
            i4 = i3;
        }
        parcel.writeStringArray(strArr);
    }

    public jmu(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        int i = 0;
        this.f20498a = parcel.readString();
        this.f20499b = parcel.readString();
        this.f20502e = parcel.readString();
        this.f20503f = parcel.readInt() > 0;
        if (parcel.readInt() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f20504g = z;
        if (parcel.readInt() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f20505h = z;
        if (parcel.readInt() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f20506i = z;
        if (parcel.readInt() <= 0) {
            z2 = false;
        }
        this.f20507j = z2;
        this.f20508k = parcel.readInt();
        this.f20509l = parcel.readString();
        this.f20510m = parcel.readString();
        this.f20511n = parcel.readString();
        this.f20500c = parcel.readInt();
        this.f20512o = parcel.readString();
        this.f20513p = parcel.readString();
        this.f20514q = parcel.readString();
        this.f20515r = (jmf) parcel.readParcelable(getClass().getClassLoader());
        String readString = parcel.readString();
        this.f20517t = parcel.readBundle();
        String[] createStringArray = parcel.createStringArray();
        if (readString != null) {
            try {
                this.f20516s = Class.forName(readString);
            } catch (Throwable e) {
                if (Log.isLoggable("LoginRequest", 6)) {
                    Log.e("LoginRequest", "Could not deserialize class", e);
                    return;
                }
                return;
            }
        }
        if (createStringArray.length > 0) {
            this.f20518u = new ArrayList(createStringArray.length);
            while (i < createStringArray.length) {
                this.f20518u.add(Class.forName(createStringArray[i]));
                i++;
            }
        }
    }
}
