import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.wesleyreisz.mymusic.R;
import com.wesleyreisz.mymusic.model.Song;

import java.util.List;

/**
 * Created by spencerkerber on 10/19/15.
 */
public class SongAdapter extends ArrayAdapter<Song> {
    private Context mContext;
    private List<Song>mEntries;

    public SongAdapter(Context context, int textViewResourceID, List<Song> entries) {
        super(context, textViewResourceID, entries);

        mContext = context;
        mEntries = entries;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        if (view== null){
            LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_view_for_each_song,parent,false);
        }
        final Song song = mEntries.get(position);
        return view;
    }
}
