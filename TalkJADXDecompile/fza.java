public final class fza {
    private int a;
    private int b;

    public void a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        this.a = i;
        this.b = 0;
    }

    public void b(int i) {
        int i2;
        this.a--;
        switch (i) {
            case -1:
                i2 = 0;
                break;
            case wi.l /*2*/:
            case wi.h /*4*/:
                i2 = 1;
                break;
            default:
                i2 = 2;
                break;
        }
        if (i2 > this.b) {
            this.b = i2;
        }
    }

    public boolean a() {
        return this.a > 0;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SendResult:");
        stringBuilder.append("Pending=").append(this.a).append(",");
        stringBuilder.append("HighestFailureLevel=").append(this.b);
        return stringBuilder.toString();
    }
}
