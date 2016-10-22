final class enq extends ens {
    final /* synthetic */ enu a;

    enq(enu enu, enp enp, CharSequence charSequence) {
        this.a = enu;
        super(enp, charSequence);
    }

    public int a(int i) {
        int length = this.a.a.length();
        int length2 = this.d.length() - length;
        int i2 = i;
        while (i2 <= length2) {
            int i3 = 0;
            while (i3 < length) {
                if (this.d.charAt(i3 + i2) == this.a.a.charAt(i3)) {
                    i3++;
                } else {
                    i2++;
                }
            }
            return i2;
        }
        return -1;
    }

    public int b(int i) {
        return this.a.a.length() + i;
    }
}
