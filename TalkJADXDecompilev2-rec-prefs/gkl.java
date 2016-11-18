package p000;

import android.net.Uri;

final class gkl {
    int f15501a;
    Uri f15502b;
    boolean f15503c;
    int f15504d;
    float f15505e;
    long f15506f;
    boolean f15507g;

    gkl() {
    }

    public String toString() {
        int i = this.f15501a;
        boolean z = this.f15503c;
        int i2 = this.f15504d;
        String valueOf = String.valueOf(this.f15502b);
        return new StringBuilder(String.valueOf(valueOf).length() + 58).append("{ code=").append(i).append(" looping=").append(z).append(" stream=").append(i2).append(" uri=").append(valueOf).append(" }").toString();
    }
}
