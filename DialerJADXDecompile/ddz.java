import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: PG */
final class ddz extends dec {
    private int c;
    private int d;
    private ByteBuffer e;
    private ByteBuffer f;
    private String[] g;

    ddz() {
    }

    public final int a(int i) {
        return a(this.e, this.c, i);
    }

    public final String b(int i) {
        return this.g[a(this.f, this.d, i)];
    }

    public final void a(ObjectInput objectInput) {
        int i;
        int i2 = 0;
        this.c = objectInput.readInt();
        this.d = objectInput.readInt();
        int readInt = objectInput.readInt();
        this.b.clear();
        for (i = 0; i < readInt; i++) {
            this.b.add(Integer.valueOf(objectInput.readInt()));
        }
        readInt = objectInput.readInt();
        if (this.g == null || this.g.length < readInt) {
            this.g = new String[readInt];
        }
        for (i = 0; i < readInt; i++) {
            this.g[i] = objectInput.readUTF();
        }
        this.a = objectInput.readInt();
        if (this.e == null || this.e.capacity() < this.a) {
            this.e = ByteBuffer.allocate(this.a * this.c);
        }
        if (this.f == null || this.f.capacity() < this.a) {
            this.f = ByteBuffer.allocate(this.a * this.d);
        }
        while (i2 < this.a) {
            a(objectInput, this.c, this.e, i2);
            a(objectInput, this.d, this.f, i2);
            i2++;
        }
    }

    public final void a(ObjectOutput objectOutput) {
        int i;
        objectOutput.writeInt(this.c);
        objectOutput.writeInt(this.d);
        objectOutput.writeInt(this.b.size());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            objectOutput.writeInt(((Integer) it.next()).intValue());
        }
        objectOutput.writeInt(this.g.length);
        for (String writeUTF : this.g) {
            objectOutput.writeUTF(writeUTF);
        }
        objectOutput.writeInt(this.a);
        for (i = 0; i < this.a; i++) {
            a(objectOutput, this.c, this.e, i);
            a(objectOutput, this.d, this.f, i);
        }
    }

    private static void a(ObjectInput objectInput, int i, ByteBuffer byteBuffer, int i2) {
        int i3 = i2 * i;
        if (i == 2) {
            byteBuffer.putShort(i3, objectInput.readShort());
        } else {
            byteBuffer.putInt(i3, objectInput.readInt());
        }
    }

    private static void a(ObjectOutput objectOutput, int i, ByteBuffer byteBuffer, int i2) {
        int i3 = i2 * i;
        if (i == 2) {
            objectOutput.writeShort(byteBuffer.getShort(i3));
        } else {
            objectOutput.writeInt(byteBuffer.getInt(i3));
        }
    }

    private static int a(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 * i;
        return i == 2 ? byteBuffer.getShort(i3) : byteBuffer.getInt(i3);
    }
}
