package fantasy.rqg.sdk;

import android.util.Log;

/**
 * Created by rqg on 21/11/2016.
 *
 * 此类为了打印方便，请勿使用
 */

@Deprecated
public class ResultCallbackImpl implements ResultCallback {
    private static final String TAG = "ResultCallbackImpl";

    @Override
    public void finished() {
        Log.d(TAG, "finished() called");
    }

    @Override
    public void onError(Throwable t) {
        Log.e(TAG, "onError: ", t);
    }
}
