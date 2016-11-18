package p000;

import android.content.Intent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public final class giu extends Exception implements Serializable {
    private static final long serialVersionUID = 1;
    public Intent f15318a;
    public int f15319b;

    public giu(Intent intent) {
        this.f15318a = intent;
        this.f15319b = 0;
    }

    public giu(int i) {
        this.f15318a = null;
        this.f15319b = i;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f15319b);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f15319b = objectInputStream.readInt();
    }
}
