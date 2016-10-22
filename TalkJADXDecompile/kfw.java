import com.google.api.client.util.GenericData;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class kfw extends AbstractSet<Entry<String, Object>> {
    final /* synthetic */ GenericData a;
    private final kfq b;

    public kfw(GenericData genericData) {
        this.a = genericData;
        this.b = new kfn(genericData, genericData.classInfo.a).a();
    }

    public Iterator<Entry<String, Object>> iterator() {
        return new kfv(this.a, this.b);
    }

    public int size() {
        return this.a.unknownFields.size() + this.b.size();
    }

    public void clear() {
        this.a.unknownFields.clear();
        this.b.clear();
    }
}
