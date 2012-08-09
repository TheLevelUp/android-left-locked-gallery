package com.scvngr.levelup.leftlockedgalleryexample;

import com.scvngr.levelup.views.gallery.Gallery;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Gallery g = (Gallery) findViewById(R.id.tip_selector_gallery);
        g.setAdapter(new TipAdapter(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /**
     * Gets the set of tip values.
     *
     * @param context Application context. Cannot be null.
     * @return Array of tips.
     */
    public static final int[] getTips(final Context context) {
        return context.getResources().getIntArray(R.array.tip_percentages);
    }
    
    /**
     * Adapter to use with the Gallery which provides the underlying dataset.
     */
    private static final class TipAdapter extends BaseAdapter {

        private final Context mContext;

        /**
         * Set of tip percentages.
         */
        private final int[] mTips;

        /**
         * Constructor. Creates the TipAdapter.
         *
         * @param context the context to use when inflating
         */
        public TipAdapter(final Context context) {
            mContext = context;
            mTips = getTips(context);
        }

        @Override
        public int getCount() {
            return mTips.length;
        }

        @Override
        public Object getItem(final int position) {
            return position;
        }

        @Override
        public long getItemId(final int position) {
            return position;
        }

        @Override
        public View getView(final int position, final View convertView, final ViewGroup parent) {
            TextView view;

            if (convertView == null) {
                LayoutInflater inflater =
                        (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = (TextView) inflater.inflate(R.layout.gallery_item, parent, false);
            } else {
                view = (TextView) convertView;
            }

            view.setText(Integer.toString(mTips[position]));
            return view;
        }
    }
}
