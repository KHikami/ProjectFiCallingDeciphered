package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class bph {
    Map<Integer, Set<String>> f4156a = new HashMap();

    bph() {
        RealTimeChatService.m9040a(new bpi(this));
    }

    public boolean m6353a(int i, String str) {
        Set set = (Set) this.f4156a.get(Integer.valueOf(i));
        return set != null && set.contains(str);
    }
}
