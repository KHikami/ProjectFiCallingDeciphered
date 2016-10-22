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
    public static final Creator<jmu> CREATOR;
    public String a;
    public String b;
    public int c;
    public boolean d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public jmf r;
    public Class<? extends jmh> s;
    public Bundle t;
    public List<Class<? extends jmw>> u;

    public jmu() {
        this.b = "com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST";
        this.c = -1;
        this.d = true;
        this.k = -1;
        this.u = new ArrayList();
    }

    public jmu a() {
        return d().b();
    }

    private jmu d() {
        this.f = true;
        return this;
    }

    public jmu b() {
        this.g = true;
        return this;
    }

    public jmu a(int i) {
        this.c = i;
        return this;
    }

    public jmu a(Context context, Intent intent) {
        this.k = intent.getIntExtra("account_id", -1);
        icl a = ((ick) jyn.a(context, ick.class)).a(context, intent);
        if (a != null) {
            this.l = a.a;
            this.m = a.b;
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
            this.n = stringExtra;
            this.m = str;
        }
        return this;
    }

    public jmu c() {
        this.h = true;
        return this;
    }

    public jmu a(String str) {
        this.o = str;
        return this;
    }

    public jmu a(Class<? extends jmh> cls) {
        return a((Class) cls, null);
    }

    public jmu a(Class<? extends jmh> cls, Bundle bundle) {
        this.s = cls;
        this.t = bundle;
        return this;
    }

    public jmu a(boolean z) {
        this.d = false;
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
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        if (this.g) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (this.h) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (this.i) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (!this.j) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeInt(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.c);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeParcelable(this.r, 0);
        if (this.s != null) {
            name = this.s.getName();
        } else {
            name = null;
        }
        parcel.writeString(name);
        parcel.writeBundle(this.t);
        String[] strArr = new String[this.u.size()];
        for (Class name2 : this.u) {
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
        this.b = "com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST";
        this.c = -1;
        this.d = true;
        this.k = -1;
        this.u = new ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readInt() > 0;
        if (parcel.readInt() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (parcel.readInt() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        if (parcel.readInt() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
        if (parcel.readInt() <= 0) {
            z2 = false;
        }
        this.j = z2;
        this.k = parcel.readInt();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.c = parcel.readInt();
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = (jmf) parcel.readParcelable(getClass().getClassLoader());
        String readString = parcel.readString();
        this.t = parcel.readBundle();
        String[] createStringArray = parcel.createStringArray();
        if (readString != null) {
            try {
                this.s = Class.forName(readString);
            } catch (Throwable e) {
                if (Log.isLoggable("LoginRequest", 6)) {
                    Log.e("LoginRequest", "Could not deserialize class", e);
                    return;
                }
                return;
            }
        }
        if (createStringArray.length > 0) {
            this.u = new ArrayList(createStringArray.length);
            while (i < createStringArray.length) {
                this.u.add(Class.forName(createStringArray[i]));
                i++;
            }
        }
    }

    static {
        CREATOR = new jmv();
    }
}
