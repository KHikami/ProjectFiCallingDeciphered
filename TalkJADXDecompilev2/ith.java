package defpackage;

public final class ith {
    private iti a;
    private itf b;
    private itk c;
    private String d;
    private String e;
    private int f;
    private String g;
    private int h;

    public itf a() {
        return this.b;
    }

    public itk b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public int g() {
        return this.h;
    }

    public ith a(iti iti) {
        this.a = iti;
        return this;
    }

    public ith a(itf itf) {
        this.b = itf;
        return this;
    }

    public ith a(itk itk) {
        this.c = itk;
        return this;
    }

    public ith a(String str) {
        this.d = str;
        return this;
    }

    public ith b(String str) {
        this.e = str;
        return this;
    }

    public ith a(int i) {
        this.f = i;
        return this;
    }

    public ith c(String str) {
        this.g = str;
        return this;
    }

    public ith b(int i) {
        this.h = i;
        return this;
    }

    public String toString() {
        String valueOf = String.valueOf("CallStateInfo: \n localMediaSessionId: ");
        String str = this.d;
        String str2 = this.e;
        int i = this.f;
        String str3 = this.g;
        int i2 = this.h;
        String valueOf2 = String.valueOf(this.a);
        if (new StringBuilder(((((String.valueOf(valueOf).length() + 106) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append("\n remoteMediaSessionId: ").append(str2).append("\n mediaSessionType: ").append(i).append("\n participantLogId: ").append(str3).append("\n mediaNetworkType: ").append(i2).append(valueOf2).toString() == null) {
            return "";
        }
        valueOf = String.valueOf(this.a);
        str = String.valueOf(this.b);
        if (new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append("\n").append(valueOf).append(str).toString() == null) {
            return "";
        }
        valueOf = String.valueOf(this.b);
        str = String.valueOf(this.c);
        if (new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append("\n").append(valueOf).append(str).toString() == null) {
            return "";
        }
        valueOf = String.valueOf(this.c);
        return new StringBuilder(String.valueOf(valueOf).length() + 1).append("\n").append(valueOf).toString();
    }
}
