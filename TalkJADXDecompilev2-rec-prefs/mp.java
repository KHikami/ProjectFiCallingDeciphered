package p000;

import android.view.KeyEvent;

public class mp {
    public boolean mo3900a(int i, int i2) {
        if (mp.m32589a(mp.m32589a(mo3899a(i) & 247, i2, 1, 64, 128), i2, 2, 16, 32) == i2) {
            return true;
        }
        return false;
    }

    public boolean mo3902b(int i) {
        return (mo3899a(i) & 247) == 0;
    }

    public boolean mo3901a(KeyEvent keyEvent) {
        return false;
    }

    mp() {
    }

    static int m32589a(int i, int i2, int i3, int i4, int i5) {
        Object obj = 1;
        Object obj2 = (i2 & i3) != 0 ? 1 : null;
        int i6 = i4 | i5;
        if ((i2 & i6) == 0) {
            obj = null;
        }
        if (obj2 != null) {
            if (obj == null) {
                return i & (i6 ^ -1);
            }
            throw new IllegalArgumentException("bad arguments");
        } else if (obj != null) {
            return i & (i3 ^ -1);
        } else {
            return i;
        }
    }

    public int mo3899a(int i) {
        int i2;
        if ((i & 192) != 0) {
            i2 = i | 1;
        } else {
            i2 = i;
        }
        if ((i2 & 48) != 0) {
            i2 |= 2;
        }
        return i2 & 247;
    }
}
