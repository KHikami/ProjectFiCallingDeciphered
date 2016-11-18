package defpackage;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class gjn {
    static final String a = System.getProperty("line.separator");
    static final String b;
    static final SimpleDateFormat p = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
    String c;
    String d;
    long e;
    long f;
    boolean g;
    String h;
    int i;
    boolean j;
    int k;
    String l;
    String m;
    String n;
    int o;

    static {
        String str = "date,logType,extraData,messageTime,screenOn,activity,activeClient,notificationLevel,conversationId,sizeInBytes,accountName,accountID";
        String valueOf = String.valueOf(a);
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        b = valueOf;
    }

    public gjn() {
        a();
    }

    public gjn a() {
        this.c = null;
        this.d = "";
        this.e = -1;
        this.f = -1;
        this.g = false;
        this.h = "";
        this.i = -1;
        this.j = false;
        this.k = -1;
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = 0;
        return this;
    }

    public gjn a(String str) {
        this.c = str;
        return this;
    }

    public gjn b(String str) {
        if (TextUtils.isEmpty(this.d)) {
            this.d = str;
        } else {
            this.d = this.d.concat(";").concat(str);
        }
        return this;
    }

    public gjn a(long j) {
        this.e = j;
        return this;
    }

    public gjn b(long j) {
        this.f = j;
        return this;
    }

    public gjn a(int i) {
        this.i = i;
        return this;
    }

    public gjn a(boolean z) {
        this.j = z;
        return this;
    }

    public gjn b(int i) {
        this.k = i;
        return this;
    }

    public gjn c(String str) {
        this.l = str;
        return this;
    }

    public gjn a(edo edo) {
        this.m = edo.toString();
        return this;
    }

    public gjn d(String str) {
        this.n = str;
        return this;
    }

    public gjn a(bko bko) {
        this.m = bko.b().toString();
        this.n = bko.a();
        return this;
    }

    public gjn c(int i) {
        this.o = i;
        return this;
    }

    public void b() {
        synchronized (gjk.a) {
            if (gjk.b) {
                try {
                    String str;
                    BufferedOutputStream bufferedOutputStream = gjk.c;
                    this.g = gjk.d.isScreenOn();
                    if (gjk.e != null) {
                        str = gjk.e;
                    } else {
                        str = "--";
                    }
                    this.h = str;
                    if (this.e == -1) {
                        this.e = glj.a();
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    if (this.c == null) {
                        glk.e("Babel", "null datatype in DataLog.build", new Object[0]);
                        this.c = "(unknown)";
                    }
                    stringBuilder.append(p.format(new Date(this.e))).append("(").append(this.e).append("),").append(this.c).append(",").append(this.d).append(",").append(this.f).append(",").append(this.g).append(",").append(this.h).append(",").append(this.i).append(",").append(this.j).append(",").append(this.k).append(",").append(this.l).append(",").append(this.o).append(",").append(this.n).append(",").append(this.m).append(a);
                    bufferedOutputStream.write(stringBuilder.toString().getBytes());
                    gjk.c.flush();
                } catch (Throwable e) {
                    glk.d("Babel", "error writing to datalog output stream", e);
                }
                return;
            }
        }
    }
}
