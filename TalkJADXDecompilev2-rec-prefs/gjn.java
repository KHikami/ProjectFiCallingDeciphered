package p000;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class gjn {
    static final String f15370a = System.getProperty("line.separator");
    static final String f15371b;
    static final SimpleDateFormat f15372p = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
    String f15373c;
    String f15374d;
    long f15375e;
    long f15376f;
    boolean f15377g;
    String f15378h;
    int f15379i;
    boolean f15380j;
    int f15381k;
    String f15382l;
    String f15383m;
    String f15384n;
    int f15385o;

    static {
        String str = "date,logType,extraData,messageTime,screenOn,activity,activeClient,notificationLevel,conversationId,sizeInBytes,accountName,accountID";
        String valueOf = String.valueOf(f15370a);
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        f15371b = valueOf;
    }

    public gjn() {
        m17814a();
    }

    public gjn m17814a() {
        this.f15373c = null;
        this.f15374d = "";
        this.f15375e = -1;
        this.f15376f = -1;
        this.f15377g = false;
        this.f15378h = "";
        this.f15379i = -1;
        this.f15380j = false;
        this.f15381k = -1;
        this.f15382l = "";
        this.f15383m = "";
        this.f15384n = "";
        this.f15385o = 0;
        return this;
    }

    public gjn m17819a(String str) {
        this.f15373c = str;
        return this;
    }

    public gjn m17823b(String str) {
        if (TextUtils.isEmpty(this.f15374d)) {
            this.f15374d = str;
        } else {
            this.f15374d = this.f15374d.concat(";").concat(str);
        }
        return this;
    }

    public gjn m17816a(long j) {
        this.f15375e = j;
        return this;
    }

    public gjn m17822b(long j) {
        this.f15376f = j;
        return this;
    }

    public gjn m17815a(int i) {
        this.f15379i = i;
        return this;
    }

    public gjn m17820a(boolean z) {
        this.f15380j = z;
        return this;
    }

    public gjn m17821b(int i) {
        this.f15381k = i;
        return this;
    }

    public gjn m17826c(String str) {
        this.f15382l = str;
        return this;
    }

    public gjn m17818a(edo edo) {
        this.f15383m = edo.toString();
        return this;
    }

    public gjn m17827d(String str) {
        this.f15384n = str;
        return this;
    }

    public gjn m17817a(bko bko) {
        this.f15383m = bko.m5632b().toString();
        this.f15384n = bko.m5629a();
        return this;
    }

    public gjn m17825c(int i) {
        this.f15385o = i;
        return this;
    }

    public void m17824b() {
        synchronized (gjk.f15364a) {
            if (gjk.f15365b) {
                try {
                    String str;
                    BufferedOutputStream bufferedOutputStream = gjk.f15366c;
                    this.f15377g = gjk.f15367d.isScreenOn();
                    if (gjk.f15368e != null) {
                        str = gjk.f15368e;
                    } else {
                        str = "--";
                    }
                    this.f15378h = str;
                    if (this.f15375e == -1) {
                        this.f15375e = glj.m17956a();
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    if (this.f15373c == null) {
                        glk.m17982e("Babel", "null datatype in DataLog.build", new Object[0]);
                        this.f15373c = "(unknown)";
                    }
                    stringBuilder.append(f15372p.format(new Date(this.f15375e))).append("(").append(this.f15375e).append("),").append(this.f15373c).append(",").append(this.f15374d).append(",").append(this.f15376f).append(",").append(this.f15377g).append(",").append(this.f15378h).append(",").append(this.f15379i).append(",").append(this.f15380j).append(",").append(this.f15381k).append(",").append(this.f15382l).append(",").append(this.f15385o).append(",").append(this.f15384n).append(",").append(this.f15383m).append(f15370a);
                    bufferedOutputStream.write(stringBuilder.toString().getBytes());
                    gjk.f15366c.flush();
                } catch (Throwable e) {
                    glk.m17980d("Babel", "error writing to datalog output stream", e);
                }
                return;
            }
        }
    }
}
