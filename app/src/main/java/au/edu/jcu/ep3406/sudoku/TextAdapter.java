package au.edu.jcu.ep3406.sudoku;

import android.content.Context;
import android.graphics.Color;
import android.text.InputType;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

public class TextAdapter extends BaseAdapter {
    private Context context;
    public TextAdapter(Context c){
        this.context = c;
    }
    @Override
    public int getCount() {
        return 81;
    }

    @Override
    public Object getItem(int position) {
        return ""+((position%9)+1);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        EditText editText = new EditText(context);
        editText.setInputType(InputType.TYPE_CLASS_NUMBER);
        editText.setText(""+((position%9)+1));
        editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        editText.setBackgroundColor(Color.rgb(120,120,240));
        return editText;
    }
}
