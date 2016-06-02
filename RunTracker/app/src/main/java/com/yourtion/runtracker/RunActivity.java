package com.yourtion.runtracker;

import android.app.Fragment;

public class RunActivity extends SingleFragmentActivity {
    /**
     * A key for passing a run ID as a long
     */
    public static final String EXTRA_RUN_ID = "com.yourtion.runtracker.run_id";

    @Override
    protected Fragment createFragment() {
        long runId = getIntent().getLongExtra(EXTRA_RUN_ID, -1);
        if (runId != -1) {
            return RunFragment.newInstance(runId);
        } else {
            return new RunFragment();
        }
    }

}
