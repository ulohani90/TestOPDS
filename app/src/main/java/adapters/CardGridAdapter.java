package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test.testsmashwords.R;

import java.util.ArrayList;

import Objects.CardGridObjects;

/**
 * Created by umesh on 29/1/15.
 */
public class CardGridAdapter extends BaseAdapter {

    Context mContext;

    ArrayList<CardGridObjects> mObjs;

    public CardGridAdapter(Context context) {
        this.mContext = context;
    }

    public void setData(ArrayList<CardGridObjects> objs) {
        this.mObjs = objs;
    }

    @Override
    public int getCount() {
        return mObjs != null ? mObjs.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return mObjs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                    .inflate(R.layout.card_list_item_layout, null);
        }
        TextView textView = (TextView)convertView.findViewById(R.id.book_name);
        textView.setText(mObjs.get(position).getBookName());
        textView = (TextView)convertView.findViewById(R.id.author_name);
        textView.setText(mObjs.get(position).getBookAuthorName());
        ImageView imageView = (ImageView)convertView.findViewById(R.id.book_icon);

        return convertView;
    }
}
