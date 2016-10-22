import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class bft implements bfx {
    private final String a;
    private final List b;

    public bft(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final void a(List list, int i) {
        Builder newInsert = ContentProviderOperation.newInsert(Data.CONTENT_URI);
        newInsert.withValueBackReference("raw_contact_id", i);
        newInsert.withValue("mimetype", this.a);
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            String str = (String) this.b.get(i2);
            if (!TextUtils.isEmpty(str)) {
                newInsert.withValue("data" + (i2 + 1), str);
            }
        }
        list.add(newInsert.build());
    }

    public final boolean a() {
        return TextUtils.isEmpty(this.a) || this.b == null || this.b.size() == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bft)) {
            return false;
        }
        bft bft = (bft) obj;
        if (!TextUtils.equals(this.a, bft.a)) {
            return false;
        }
        if (this.b == null) {
            return bft.b == null;
        } else {
            int size = this.b.size();
            if (size != bft.b.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!TextUtils.equals((CharSequence) this.b.get(i), (CharSequence) bft.b.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int hashCode() {
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        } else {
            hashCode = 0;
        }
        if (this.b == null) {
            return hashCode;
        }
        int i = hashCode;
        for (String str : this.b) {
            i *= 31;
            if (str != null) {
                hashCode = str.hashCode();
            } else {
                hashCode = 0;
            }
            i = hashCode + i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = this.a;
        stringBuilder.append(new StringBuilder(String.valueOf(str).length() + 24).append("android-custom: ").append(str).append(", data: ").toString());
        stringBuilder.append(this.b == null ? "null" : Arrays.toString(this.b.toArray()));
        return stringBuilder.toString();
    }

    public final bfz b() {
        return bfz.ANDROID_CUSTOM;
    }
}
