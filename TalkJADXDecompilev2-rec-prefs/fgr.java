package p000;

import java.io.Serializable;

public final class fgr implements Serializable {
    public boolean f13018a;
    public String f13019b;
    public String f13020c;
    public String f13021d;
    public String f13022e;
    public float f13023f;

    fgr() {
    }

    public String toString() {
        boolean z = this.f13018a;
        String str = this.f13019b;
        String str2 = this.f13020c;
        String str3 = this.f13021d;
        String str4 = this.f13022e;
        return new StringBuilder((((String.valueOf(str).length() + 120) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("MergedPerson{isHangoutsReachable=").append(z).append(", gaiaId='").append(str).append("', avatarUrl='").append(str2).append("', name='").append(str3).append("', loggingId='").append(str4).append("', affinityScore='").append(this.f13023f).append("'}").toString();
    }
}
