package p000;

final class enq extends ens {
    final /* synthetic */ enu f11894a;

    enq(enu enu, enp enp, CharSequence charSequence) {
        this.f11894a = enu;
        super(enp, charSequence);
    }

    public int mo1918a(int i) {
        int length = this.f11894a.f11902a.length();
        int length2 = this.f11891d.length() - length;
        int i2 = i;
        while (i2 <= length2) {
            int i3 = 0;
            while (i3 < length) {
                if (this.f11891d.charAt(i3 + i2) == this.f11894a.f11902a.charAt(i3)) {
                    i3++;
                } else {
                    i2++;
                }
            }
            return i2;
        }
        return -1;
    }

    public int mo1919b(int i) {
        return this.f11894a.f11902a.length() + i;
    }
}
