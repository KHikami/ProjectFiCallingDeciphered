package defpackage;

import android.database.Cursor;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class ciz {
    ky<String, Set<CharSequence>> a = new ky();
    private final int b;

    ciz(int i) {
        this.b = i;
    }

    void a(Bundle bundle) {
        if (bundle != null) {
            String valueOf;
            CharSequence[] charSequenceArray = bundle.getCharSequenceArray("unrendered_message_list_conv_ids");
            if (charSequenceArray != null) {
                for (CharSequence charSequence : charSequenceArray) {
                    String charSequence2 = charSequence.toString();
                    String valueOf2 = String.valueOf("unrendered_message_list");
                    valueOf = String.valueOf(charSequence2);
                    CharSequence[] charSequenceArray2 = bundle.getCharSequenceArray(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                    if (charSequenceArray2 != null && charSequenceArray2.length > 0) {
                        this.a.put(charSequence2, new HashSet(Arrays.asList(charSequenceArray2)));
                    }
                }
            }
            valueOf = String.valueOf(this.a);
            glk.c("Babel_UnrenderedMsg", new StringBuilder(String.valueOf(valueOf).length() + 40).append("Saved unrendered message list restored: ").append(valueOf).toString(), new Object[0]);
        }
    }

    void b(Bundle bundle) {
        if (!this.a.isEmpty()) {
            String valueOf = String.valueOf(this.a);
            glk.c("Babel_UnrenderedMsg", new StringBuilder(String.valueOf(valueOf).length() + 31).append("Unrendered message list saved: ").append(valueOf).toString(), new Object[0]);
            int size = this.a.size();
            bundle.putCharSequenceArray("unrendered_message_list_conv_ids", (CharSequence[]) this.a.keySet().toArray(new CharSequence[size]));
            for (int i = 0; i < size; i++) {
                String str = (String) this.a.b(i);
                Set set = (Set) this.a.c(i);
                valueOf = String.valueOf("unrendered_message_list");
                str = String.valueOf(str);
                bundle.putCharSequenceArray(str.length() != 0 ? valueOf.concat(str) : new String(valueOf), (CharSequence[]) set.toArray(new CharSequence[set.size()]));
            }
        }
    }

    void a() {
        String valueOf = String.valueOf(this.a);
        glk.c("Babel_UnrenderedMsg", new StringBuilder(String.valueOf(valueOf).length() + 54).append("Leaving conversation, unrendered message list logged: ").append(valueOf).toString(), new Object[0]);
        long b = glj.b();
        for (int i = 0; i < this.a.size(); i++) {
            String str = (String) this.a.b(i);
            for (CharSequence charSequence : (Set) this.a.c(i)) {
                ba.a(this.b, b, 10, ba.c().a(str).b(charSequence.toString()).a(209));
            }
        }
        this.a.clear();
    }

    void a(Cursor cursor) {
        int i = 0;
        if (cursor != null) {
            int position = cursor.getPosition();
            long b = glj.b();
            int min = Math.min(10, cursor.getCount());
            cursor.moveToLast();
            int i2 = 0;
            while (!cursor.isBeforeFirst() && i2 < min) {
                a(cursor.getString(1), b);
                cursor.moveToPrevious();
                i2++;
            }
            cursor.moveToFirst();
            while (!cursor.isAfterLast() && i < min) {
                a(cursor.getString(1), b);
                cursor.moveToNext();
                i++;
            }
            cursor.moveToPosition(position);
        }
    }

    private void a(String str, long j) {
        for (int i = 0; i < this.a.size(); i++) {
            String str2 = (String) this.a.b(i);
            if (((Set) this.a.c(i)).remove(str)) {
                String str3 = "Babel_UnrenderedMsg";
                String str4 = "MessageList data changed, remove unrendered message ID: ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    valueOf = str4.concat(valueOf);
                } else {
                    valueOf = new String(str4);
                }
                glk.c(str3, valueOf, new Object[0]);
                ba.a(this.b, j, 10, ba.c().a(str2).b(str).a(208));
            }
        }
    }

    void a(String str, String str2) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, new HashSet());
        }
        ((Set) this.a.get(str)).add(str2);
        glk.c("Babel_UnrenderedMsg", new StringBuilder((String.valueOf(str2).length() + 59) + String.valueOf(str).length()).append("Message sent, add unrendered message ID: ").append(str2).append(" to conversation: ").append(str).toString(), new Object[0]);
    }
}
