package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class bwj extends jgc {
    final /* synthetic */ bwe f4652a;
    private final ExecutorService f4653b = Executors.newSingleThreadExecutor();
    private final Pattern f4654c = Pattern.compile(String.valueOf(this.f4652a.m6820f().getPath()).concat("/(\\d*)-(\\d*)"));

    public bwj(bwe bwe, Context context) {
        this.f4652a = bwe;
        super(context, "Babel_MsgListLoad");
    }

    protected Executor mo763a() {
        return this.f4653b;
    }

    public void q_() {
        m6396a(true);
        this.f4653b.shutdownNow();
    }

    protected jgz mo648a(Context context) {
        new Object[1][0] = this.f4654c;
        List arrayList = new ArrayList();
        while (true) {
            try {
                arrayList.add((Uri) this.f4652a.f4628d.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            if (m6407f()) {
                new Object[1][0] = this.f4654c;
                return new jgz(true);
            }
            this.f4652a.f4628d.drainTo(arrayList, 449);
            m6826a(context, arrayList);
            arrayList.clear();
        }
    }

    private void m6826a(Context context, List<Uri> list) {
        List arrayList = new ArrayList();
        for (Uri path : list) {
            Matcher matcher = this.f4654c.matcher(path.getPath());
            if (matcher.find()) {
                arrayList.add(matcher.group(1));
                arrayList.add(matcher.group(2));
            }
        }
        if (!arrayList.isEmpty()) {
            new Object[1][0] = arrayList;
            StringBuilder append = new StringBuilder("_id >=? AND ").append("_id <=?");
            for (int i = 2; i < arrayList.size(); i += 2) {
                append.append(" OR _id").append(" >=? AND _id").append(" <=?");
            }
            Cursor query = context.getContentResolver().query(this.f4652a.m6819e(), bny.f4074a, append.toString(), (String[]) arrayList.toArray(new String[0]), bny.f4075b);
            if (query != null) {
                try {
                    bub a = bub.m6672a(query);
                    Set hashSet = new HashSet();
                    for (int i2 = 0; i2 < arrayList.size(); i2 += 2) {
                        long ad = gwb.ad((String) arrayList.get(i2));
                        long ad2 = gwb.ad((String) arrayList.get(i2 + 1));
                        for (long j = ad; j <= ad2; j++) {
                            hashSet.add(String.valueOf(j));
                        }
                    }
                    this.f4652a.m6816a(a, hashSet, null);
                    gwb.m1863a(new bwk(this, list.size()));
                } finally {
                    query.close();
                }
            }
        }
    }
}
