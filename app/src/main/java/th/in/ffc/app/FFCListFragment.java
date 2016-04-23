/* ***********************************************************************
 *                                                                 _ _ _
 *                                                               ( _ _  |
 *                                                           _ _ _ _  | |
 *                                                          (_ _ _  | |_|
 *  _     _   _ _ _ _     _ _ _   _ _ _ _ _   _ _ _ _     _ _ _   | | 
 * |  \  | | |  _ _ _|   /  _ _| |_ _   _ _| |  _ _ _|   /  _ _|  | |
 * | | \ | | | |_ _ _   /  /         | |     | |_ _ _   /  /      |_|
 * | |\ \| | |  _ _ _| (  (          | |     |  _ _ _| (  (    
 * | | \ | | | |_ _ _   \  \_ _      | |     | |_ _ _   \  \_ _ 
 * |_|  \__| |_ _ _ _|   \_ _ _|     |_|     |_ _ _ _|   \_ _ _| 
 *  a member of NSTDA, @Thailand
 *  
 * ***********************************************************************
 *
 *
 * FFC-Plus Project
 *
 * Copyright (C) 2010-2012 National Electronics and Computer Technology Center
 * All Rights Reserved.
 * 
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 * 
 */

package th.in.ffc.app;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import th.in.ffc.R;

/**
 * add description here! please
 *
 * @author piruinpanichphol
 * @version 1.0
 * @since Family Folder Collector 2.0
 */
public class FFCListFragment extends FFCFragmentActivity {

    protected static final String TAG = "FFC-listFragment";


    private LinearLayout mProgessLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_list);
    }

    public void showProgess(boolean show) {
        if (mProgessLayout != null) {
            if (show)
                mProgessLayout.setVisibility(View.VISIBLE);
            else
                mProgessLayout.setVisibility(View.GONE);
        }
    }

    public void findProgessLayout(View parent) {
        this.findProgessLayout(parent, android.R.id.progress);
    }

    public void findProgessLayout(View parent, int id) {
        mProgessLayout = (LinearLayout) parent.findViewById(id);
    }


    /**
     * this method use to send Refresh command from activity to Fragment overall
     * project
     *
     * @param bundle to argument for fragment
     */
    protected void onRefresh(Bundle bundle) {
        // to do something
    }

    public FFCFragmentActivity getFFCActivity() {
        return this;
    }


}
