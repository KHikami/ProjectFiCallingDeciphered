package p000;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class lio implements lhi {
    static final Pattern f25049a = Pattern.compile("(ChromiumNet)|(HttpUrlConnection #[\\d]*)|(JavaCronetEngine)|(Okio Watchdog)|(SharedPreferencesImpl-load)|(Bound thread pool)|(RenderThread)|(SamplingProfiler)|(SamplingProfilerIntegration)|(hwuiTask[0-9])|(Lite Thread #[\\d]*)|(BG Thread #[\\d]*)|(Blocking Thread #[\\d]*)|(Scheduler Thread #[\\d]*)|(java.lang.ProcessManager)|(Espresso Key Event #[\\d]*)|(MonitoringInstrumentation)|(ConnectivityManager)|(AsyncQueryWorker)|(Gservices)|(InstrumentationConnectionThread)|(cr.CleanupReference)|(CleanupReference)|(SettinsObserver)|(SettingsObserver)|(JavaBridge)|NotificationManagerCompat|PPTask|(grpc-timer-[\\d]*)|(PanoramaClient)|(GLThread [\\d]*)|(TileDecoder)|(BackgroundTask #[\\d]*)|(FrameSequence decoding thread)|(Login Manager Threadpool)|(GifDecoder)|(AsyncTask #[\\d]*)|(Resource Decoder Thread #[\\d]*)|(ImageLoader)|(PowerManagerThread)|(NetworkQueueProcessor)|(Curator-SharingServiceHandlerThread)|(ModernAsyncTask #[\\d]*)|(glide-.*)|(IntentService.Gns:IntentService.)|(IntentService.GcmReceiveMessageService.)|(ANDROID_TEST_UTIL_THREAD)|(OkHttp ConnectionPool)|(MockHttpUrlRequestFactory)|(MockHttpURLConnection)|(Mock UrlConnection #.*)|(Primes-.*)|(IntentService\\[Primes.*\\])|(Picasso-.*)|(Stetho-Listener)|(StethoWorker.*)|(GCMService)|(GAC_Executor\\[\\d\\])|(IntentService.AlbumUploadService.)|(WifiManager)|(ConnectivityThread)|(LeakCanary-.*)|(IntentService\\[HeapAnalyzerService\\])|(IntentService\\[com\\.squareup\\.leakcanary\\..*\\])|(ClearcutLoggerApiImpl.*)|(Gservices)|(IntentService\\[AppManagementService\\])|(IntentService\\[GcmRegIntentService\\])|(IntentService\\[com\\.google\\.android\\.apps\\.internal\\.kong\\.app\\..*\\])|(measurement-.*)|(android\\.hardware\\.SystemSensorManager\\$SensorThread)|(LogEventQueue)|(ResizeFrame)");
    private static final Pattern f25050c = Pattern.compile("pool-[0-9]+-thread-1");
    ScheduledFuture<?> f25051b;
    private final ScheduledExecutorService f25052d;
    private final Set<Boolean> f25053e;

    lio(ScheduledExecutorService scheduledExecutorService, Set<Boolean> set) {
        this.f25052d = scheduledExecutorService;
        this.f25053e = set;
    }

    public void mo1922a() {
        boolean z = true;
        if (!this.f25053e.isEmpty()) {
            if (this.f25053e.size() != 1) {
                z = false;
            }
            bm.m6150b(z);
            if (((Boolean) this.f25053e.iterator().next()).booleanValue()) {
                return;
            }
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        for (Thread add : Thread.getAllStackTraces().keySet()) {
            newSetFromMap.add(add);
        }
        this.f25051b = this.f25052d.scheduleWithFixedDelay(new lip(this, newSetFromMap), 0, 500, TimeUnit.MILLISECONDS);
    }

    static boolean m29105a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length == 0) {
            return true;
        }
        StackTraceElement stackTraceElement = stackTraceElementArr[stackTraceElementArr.length - 1];
        try {
            if (Thread.class.isAssignableFrom(Class.forName(stackTraceElement.getClassName())) && stackTraceElement.getMethodName().equals("run")) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException e) {
            return true;
        }
    }

    static boolean m29104a(Set<Thread> set) {
        boolean z = false;
        for (Thread name : set) {
            if (!f25050c.matcher(name.getName()).matches() || r1) {
                return true;
            }
            z = true;
        }
        return false;
    }
}
