package p000;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class ahr {
    private InputStream f815a;
    private byte[] f816b;
    private boolean f817c;
    private int f818d = 0;
    private int f819e = 0;

    public ahr(InputStream inputStream, int i, boolean z) {
        this.f815a = inputStream;
        this.f816b = new byte[ahr.m1347e(16)];
        this.f817c = false;
    }

    public byte m1348a(int i) {
        bc.m4813a("get");
        if (m1349b(i)) {
            int i2 = i - this.f818d;
            bc.m4827c();
            return this.f816b[i2];
        }
        bc.m4827c();
        throw new IndexOutOfBoundsException(String.format("Index %d beyond length.", new Object[]{Integer.valueOf(i)}));
    }

    public boolean m1349b(int i) {
        bc.m4813a("has");
        if (i < this.f818d) {
            bc.m4827c();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f818d)}));
        }
        int i2 = i - this.f818d;
        if (i2 >= this.f819e || i2 >= this.f816b.length) {
            bc.m4827c();
            return m1346d(i);
        }
        bc.m4827c();
        return true;
    }

    public void m1350c(int i) {
        int i2;
        bc.m4813a("advance to");
        int i3 = i - this.f818d;
        if (i3 <= 0) {
            bc.m4827c();
            return;
        }
        if (i3 < this.f819e) {
            if (i3 >= this.f816b.length) {
                throw new IndexOutOfBoundsException(String.format("Index %d out of bounds. Length %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f816b.length)}));
            }
            for (i2 = 0; i2 + i3 < this.f819e; i2++) {
                this.f816b[i2] = this.f816b[i2 + i3];
            }
            this.f818d = i;
            this.f819e -= i3;
        } else if (this.f815a != null) {
            i2 = i3 - this.f819e;
            int i4 = 0;
            while (i2 > 0) {
                try {
                    long skip = this.f815a.skip((long) i2);
                    if (skip <= 0) {
                        i4++;
                    } else {
                        i2 = (int) (((long) i2) - skip);
                    }
                    if (i4 >= 5) {
                        i4 = i2;
                        i2 = 1;
                        break;
                    }
                } catch (IOException e) {
                    i4 = i2;
                    i2 = 1;
                }
            }
            i4 = i2;
            i2 = 0;
            if (i2 != 0) {
                this.f815a = null;
            }
            this.f818d = i - i4;
            this.f819e = 0;
        } else {
            this.f818d = i;
            this.f819e = 0;
        }
        if (Log.isLoggable("InputStreamBuffer", 3)) {
            String.format("advanceTo %d buffer: %s", new Object[]{Integer.valueOf(i3), this});
        }
        bc.m4827c();
    }

    private boolean m1346d(int i) {
        bc.m4813a("fill");
        if (i < this.f818d) {
            bc.m4827c();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f818d)}));
        }
        int i2 = i - this.f818d;
        if (this.f815a == null) {
            bc.m4827c();
            return false;
        }
        int i3 = i2 + 1;
        if (i3 > this.f816b.length) {
            if (this.f817c) {
                m1350c(i);
                i2 = i - this.f818d;
            } else {
                String.format("Increasing buffer length from %d to %d. Bad buffer size chosen, or advanceTo() not called.", new Object[]{Integer.valueOf(this.f816b.length), Integer.valueOf(ahr.m1347e(i3))});
                this.f816b = Arrays.copyOf(this.f816b, i3);
            }
        }
        try {
            i3 = this.f815a.read(this.f816b, this.f819e, this.f816b.length - this.f819e);
        } catch (IOException e) {
            i3 = -1;
        }
        if (i3 != -1) {
            this.f819e = i3 + this.f819e;
        } else {
            this.f815a = null;
        }
        if (Log.isLoggable("InputStreamBuffer", 3)) {
            String.format("fill %d      buffer: %s", new Object[]{Integer.valueOf(i2), this});
        }
        bc.m4827c();
        if (i2 < this.f819e) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("+%d+%d [%d]", new Object[]{Integer.valueOf(this.f818d), Integer.valueOf(this.f816b.length), Integer.valueOf(this.f819e)});
    }

    private static int m1347e(int i) {
        int i2 = i - 1;
        i2 |= i2 >> 1;
        i2 |= i2 >> 2;
        i2 |= i2 >> 4;
        i2 |= i2 >> 8;
        return (i2 | (i2 >> 16)) + 1;
    }
}
