package p000;

public final class fza {
    private int f14413a;
    private int f14414b;

    public void m16654a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        this.f14413a = i;
        this.f14414b = 0;
    }

    public void m16657b(int i) {
        int i2;
        this.f14413a--;
        switch (i) {
            case -1:
                i2 = 0;
                break;
            case 2:
            case 4:
                i2 = 1;
                break;
            default:
                i2 = 2;
                break;
        }
        if (i2 > this.f14414b) {
            this.f14414b = i2;
        }
    }

    public boolean m16655a() {
        return this.f14413a > 0;
    }

    public int m16656b() {
        return this.f14414b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SendResult:");
        stringBuilder.append("Pending=").append(this.f14413a).append(",");
        stringBuilder.append("HighestFailureLevel=").append(this.f14414b);
        return stringBuilder.toString();
    }
}
