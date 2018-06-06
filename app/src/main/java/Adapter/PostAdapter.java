package Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.root.simmplelistviewer.R;

import DataMode.PostData;

public class PostAdapter extends ArrayAdapter<PostData>{
    Activity myContext;
    PostData[] myData;

    public PostAdapter(Context context, int textViewResourceId,
                       PostData[] objects) {
        super(context, textViewResourceId, objects);
        // TODO Auto-generated constructor stub
        myContext = (Activity) context;
        myData = objects;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = myContext.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_list_row, null);
        TextView postTitleView = rowView
                .findViewById(R.id.tvTitle);
        postTitleView.setText(myData[position].postTitle);
        TextView postDateView = rowView
                .findViewById(R.id.tvPost);
        postDateView.setText(myData[position].postContent);
        return rowView;
    }
}
