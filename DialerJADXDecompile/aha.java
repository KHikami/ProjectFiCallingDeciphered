import android.provider.ContactsContract.CommonDataKinds.Relation;

/* compiled from: PG */
public final class aha extends agh {
    protected final int a(Integer num) {
        return Relation.getTypeLabelResource(num == null ? 0 : num.intValue());
    }
}
