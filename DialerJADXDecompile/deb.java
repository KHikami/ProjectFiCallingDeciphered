import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.SortedSet;
import java.util.logging.Logger;

/* compiled from: PG */
public class deb implements Externalizable {
    private final ddk a;
    private dec b;

    static {
        Logger.getLogger(deb.class.getName());
    }

    public deb() {
        this.a = ddk.a();
    }

    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            this.b = new ddz();
        } else {
            this.b = new ddy();
        }
        this.b.a(objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.b instanceof ddz);
        this.b.a(objectOutput);
    }

    private String a(long j) {
        int i = this.b.a;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        SortedSet sortedSet = this.b.b;
        while (sortedSet.size() > 0) {
            Integer num = (Integer) sortedSet.last();
            String valueOf = String.valueOf(j);
            if (valueOf.length() > num.intValue()) {
                j = Long.parseLong(valueOf.substring(0, num.intValue()));
            }
            int i3 = i2;
            int i4 = 0;
            i2 = 0;
            while (i4 <= i3) {
                i2 = (i4 + i3) >>> 1;
                int a = this.b.a(i2);
                if (((long) a) == j) {
                    break;
                } else if (((long) a) > j) {
                    i2--;
                    i3 = i2;
                } else {
                    i4 = i2 + 1;
                }
            }
            if (i2 < 0) {
                return null;
            }
            if (j == ((long) this.b.a(i2))) {
                return this.b.b(i2);
            }
            sortedSet = sortedSet.headSet(num);
        }
        return null;
    }

    public String toString() {
        return this.b.toString();
    }

    public final String a(ddo ddo) {
        int i = ddo.b;
        String valueOf = String.valueOf(String.valueOf(ddk.a(ddo)));
        return a(Long.parseLong(new StringBuilder(valueOf.length() + 11).append(i).append(valueOf).toString()));
    }
}
