package selgo.com.quickspeak;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.ViewHolder> {

    WordCursorAdapter wordCursorAdapter;
    Context context;


    public WordAdapter(Context context, Cursor cursor) {
        this.context = context;
        this.wordCursorAdapter = new WordCursorAdapter(this.context, cursor);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private View view;

        public ViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;

        }
    }

    @Override
    public int getItemCount() {
        return this.wordCursorAdapter.getCount();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = this.wordCursorAdapter.newView(this.context, this.wordCursorAdapter.getCursor(), parent);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        this.wordCursorAdapter.getCursor().moveToPosition(position);
        this.wordCursorAdapter.bindView(holder.itemView, this.context, this.wordCursorAdapter.getCursor());
    }
}
