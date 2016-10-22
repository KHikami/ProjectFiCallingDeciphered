import java.io.Serializable;

public final class fgr implements Serializable {
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public float f;

    fgr() {
    }

    public String toString() {
        boolean z = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        return new StringBuilder((((String.valueOf(str).length() + 120) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("MergedPerson{isHangoutsReachable=").append(z).append(", gaiaId='").append(str).append("', avatarUrl='").append(str2).append("', name='").append(str3).append("', loggingId='").append(str4).append("', affinityScore='").append(this.f).append("'}").toString();
    }
}
