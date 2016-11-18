package defpackage;

import android.content.Intent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public final class giu extends Exception implements Serializable {
    private static final long serialVersionUID = 1;
    public Intent a;
    public int b;

    public giu(Intent intent) {
        this.a = intent;
        this.b = 0;
    }

    public giu(int i) {
        this.a = null;
        this.b = i;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.b);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.b = objectInputStream.readInt();
    }
}
