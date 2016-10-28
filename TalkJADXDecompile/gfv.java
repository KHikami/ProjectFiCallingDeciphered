import java.util.Locale;

public final class gfv { //wifi connection cell?
    public final boolean a; //is connected
    public final int b; // signal level
    public final int c; //link speed

    gfv(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    //is good wifi signal :)
    public boolean a(int i, int i2) {
        //is connected & signal level is greater than thresh 1 & link speed is greater than thresh 2
        return this.a && this.b > i && this.c > i2;
    }

    public String toString() {
        return String.format(Locale.US, "is connected: %b, signal level: %d%%, link speed: %dMbps", new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gfv gfv = (gfv) obj;
        if (this.a == gfv.a && this.b == gfv.b && this.c == gfv.c) {
            return true;
        }
        return false;
    }
}
