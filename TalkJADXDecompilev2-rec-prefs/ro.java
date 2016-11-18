package p000;

import android.view.animation.AnimationUtils;

final class ro {
    private int f35068a;
    private int f35069b;
    private float f35070c;
    private float f35071d;
    private long f35072e = Long.MIN_VALUE;
    private long f35073f = 0;
    private int f35074g = 0;
    private int f35075h = 0;
    private long f35076i = -1;
    private float f35077j;
    private int f35078k;

    ro() {
    }

    public void m40557a(int i) {
        this.f35068a = i;
    }

    public void m40559b(int i) {
        this.f35069b = i;
    }

    public void m40555a() {
        this.f35072e = AnimationUtils.currentAnimationTimeMillis();
        this.f35076i = -1;
        this.f35073f = this.f35072e;
        this.f35077j = 0.5f;
        this.f35074g = 0;
        this.f35075h = 0;
    }

    public void m40558b() {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f35078k = rn.m40538a((int) (currentAnimationTimeMillis - this.f35072e), 0, this.f35069b);
        this.f35077j = m40554a(currentAnimationTimeMillis);
        this.f35076i = currentAnimationTimeMillis;
    }

    public boolean m40560c() {
        return this.f35076i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f35076i + ((long) this.f35078k);
    }

    private float m40554a(long j) {
        if (j < this.f35072e) {
            return 0.0f;
        }
        if (this.f35076i < 0 || j < this.f35076i) {
            return rn.m40536a(((float) (j - this.f35072e)) / ((float) this.f35068a), 0.0f, 1.0f) * 0.5f;
        }
        long j2 = j - this.f35076i;
        return (rn.m40536a(((float) j2) / ((float) this.f35078k), 0.0f, 1.0f) * this.f35077j) + (1.0f - this.f35077j);
    }

    public void m40561d() {
        if (this.f35073f == 0) {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float a = m40554a(currentAnimationTimeMillis);
        a = (a * 4.0f) + ((-4.0f * a) * a);
        long j = currentAnimationTimeMillis - this.f35073f;
        this.f35073f = currentAnimationTimeMillis;
        this.f35074g = (int) ((((float) j) * a) * this.f35070c);
        this.f35075h = (int) ((((float) j) * a) * this.f35071d);
    }

    public void m40556a(float f, float f2) {
        this.f35070c = f;
        this.f35071d = f2;
    }

    public int m40562e() {
        return (int) (this.f35070c / Math.abs(this.f35070c));
    }

    public int m40563f() {
        return (int) (this.f35071d / Math.abs(this.f35071d));
    }

    public int m40564g() {
        return this.f35075h;
    }
}
