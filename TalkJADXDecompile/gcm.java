import java.util.Objects;

public final class gcm { //created by gck
    public final int a; //serviceState (0 = in Service, 1 = out of service, 2= emergency, 3 = powered off)
    public final int b; //signalLevelPercentage (0, 25, 50, 75, 100, -1 (by default))
    //-1 => undefined signal
    public final int c; // phoneType (from telephony manager)
    public final String d; //networkOperator
    public final int e;//networkType
    public final int f; //systemID

    //new cell with service state, signal strength, phonetype, network operatior, network type, system ID
    gcm(int i, int i2, int i3, String str, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = i4;
        this.f = i5;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        String str = this.d;
        int i4 = this.e;
        return new StringBuilder(String.valueOf(str).length() + 161).append("CellState, serviceState: ").append(i).append(", signalLevelPercent: ").append(i2).append(", phoneType: ").append(i3).append(", networkOperator: ").append(str).append(", networkType: ").append(i4).append(", systemId: ").append(this.f).toString();
    }

    // Returns true if anything is wrong with service or signal
    public boolean a() {    // is_service_bad()
        //service state is not null or signal level percentage is -1 or signal is 0
        return this.a != 0 || this.b == -1 || this.b == 0;
    }

    // Returns true if service is working and signal is better than the given threshold i
    public boolean a(int i) {   // is_service_better_than(threshold)
        //returns that service state is 0 and signal level percentage is not -1 and signal percentage is greater than given number
        return this.a == 0 && this.b != -1 && this.b > i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gcm gcm = (gcm) obj;
        if (this.a == gcm.a && this.b == gcm.b && this.c == gcm.c && Objects.equals(this.d, gcm.d) && this.e == gcm.e && this.f == gcm.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = ((((this.a + 31) * 31) + this.b) * 31) + this.c;
        if (this.d != null) {
            i = (i * 31) + this.d.hashCode();
        }
        return (((i * 31) + this.e) * 31) + this.f;
    }
}
