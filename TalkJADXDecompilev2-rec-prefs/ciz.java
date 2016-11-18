package p000;

import android.database.Cursor;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class ciz {
    ky<String, Set<CharSequence>> f5414a = new ky();
    private final int f5415b;

    ciz(int i) {
        this.f5415b = i;
    }

    void m7749a(Bundle bundle) {
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
                        this.f5414a.put(charSequence2, new HashSet(Arrays.asList(charSequenceArray2)));
                    }
                }
            }
            valueOf = String.valueOf(this.f5414a);
            glk.m17979c("Babel_UnrenderedMsg", new StringBuilder(String.valueOf(valueOf).length() + 40).append("Saved unrendered message list restored: ").append(valueOf).toString(), new Object[0]);
        }
    }

    void m7751b(Bundle bundle) {
        if (!this.f5414a.isEmpty()) {
            String valueOf = String.valueOf(this.f5414a);
            glk.m17979c("Babel_UnrenderedMsg", new StringBuilder(String.valueOf(valueOf).length() + 31).append("Unrendered message list saved: ").append(valueOf).toString(), new Object[0]);
            int size = this.f5414a.size();
            bundle.putCharSequenceArray("unrendered_message_list_conv_ids", (CharSequence[]) this.f5414a.keySet().toArray(new CharSequence[size]));
            for (int i = 0; i < size; i++) {
                String str = (String) this.f5414a.m28017b(i);
                Set set = (Set) this.f5414a.m28018c(i);
                valueOf = String.valueOf("unrendered_message_list");
                str = String.valueOf(str);
                bundle.putCharSequenceArray(str.length() != 0 ? valueOf.concat(str) : new String(valueOf), (CharSequence[]) set.toArray(new CharSequence[set.size()]));
            }
        }
    }

    void m7747a() {
        String valueOf = String.valueOf(this.f5414a);
        glk.m17979c("Babel_UnrenderedMsg", new StringBuilder(String.valueOf(valueOf).length() + 54).append("Leaving conversation, unrendered message list logged: ").append(valueOf).toString(), new Object[0]);
        long b = glj.m17963b();
        for (int i = 0; i < this.f5414a.size(); i++) {
            String str = (String) this.f5414a.m28017b(i);
            for (CharSequence charSequence : (Set) this.f5414a.m28018c(i)) {
                ba.m4548a(this.f5415b, b, 10, ba.m4618c().m12789a(str).m12794b(charSequence.toString()).m12786a(209));
            }
        }
        this.f5414a.clear();
    }

    void m7748a(Cursor cursor) {
        int i = 0;
        if (cursor != null) {
            int position = cursor.getPosition();
            long b = glj.m17963b();
            int min = Math.min(10, cursor.getCount());
            cursor.moveToLast();
            int i2 = 0;
            while (!cursor.isBeforeFirst() && i2 < min) {
                m7746a(cursor.getString(1), b);
                cursor.moveToPrevious();
                i2++;
            }
            cursor.moveToFirst();
            while (!cursor.isAfterLast() && i < min) {
                m7746a(cursor.getString(1), b);
                cursor.moveToNext();
                i++;
            }
            cursor.moveToPosition(position);
        }
    }

    private void m7746a(String str, long j) {
        for (int i = 0; i < this.f5414a.size(); i++) {
            String str2 = (String) this.f5414a.m28017b(i);
            if (((Set) this.f5414a.m28018c(i)).remove(str)) {
                String str3 = "Babel_UnrenderedMsg";
                String str4 = "MessageList data changed, remove unrendered message ID: ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    valueOf = str4.concat(valueOf);
                } else {
                    valueOf = new String(str4);
                }
                glk.m17979c(str3, valueOf, new Object[0]);
                ba.m4548a(this.f5415b, j, 10, ba.m4618c().m12789a(str2).m12794b(str).m12786a(208));
            }
        }
    }

    void m7750a(String str, String str2) {
        if (!this.f5414a.containsKey(str)) {
            this.f5414a.put(str, new HashSet());
        }
        ((Set) this.f5414a.get(str)).add(str2);
        glk.m17979c("Babel_UnrenderedMsg", new StringBuilder((String.valueOf(str2).length() + 59) + String.valueOf(str).length()).append("Message sent, add unrendered message ID: ").append(str2).append(" to conversation: ").append(str).toString(), new Object[0]);
    }
}
