import android.app.job.JobParameters;
import android.content.SharedPreferences.Editor;
import com.google.android.apps.dialer.spam.impl.SpamJobService;

/* compiled from: PG */
public class bku {
    final /* synthetic */ JobParameters a;
    final /* synthetic */ SpamJobService b;

    public void a(boolean z) {
        SpamJobService spamJobService;
        boolean z2 = false;
        if (z) {
            spamJobService = this.b;
            long currentTimeMillis = System.currentTimeMillis();
            buf.c("SpamJobService, updating last updated spam list time from " + spamJobService.a() + " to " + currentTimeMillis, new Object[0]);
            Editor edit = spamJobService.getSharedPreferences(spamJobService.getApplicationContext().getPackageName(), 0).edit();
            edit.putLong("spam_jobs_last_updated_blacklist", currentTimeMillis);
            edit.apply();
            bkw.a.clear();
            bkw.b.clear();
        }
        SpamJobService.a = false;
        spamJobService = this.b;
        JobParameters jobParameters = this.a;
        if (!z) {
            z2 = true;
        }
        spamJobService.jobFinished(jobParameters, z2);
    }

    public bku(SpamJobService spamJobService, JobParameters jobParameters) {
        this.b = spamJobService;
        this.a = jobParameters;
    }
}
