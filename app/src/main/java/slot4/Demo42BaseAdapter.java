package slot4;

import android.content.Context;
import android.view.LayoutInflater;

import com.example.helloworld.R;

import java.util.ArrayList;

public class Demo42BaseAdapter(private val ls:ArrayList<Demo42Student>,
                               private val context:Context): BaseAdapter {
    override fun getCount(): Int{
        return ls.size
    }
    override fun getItem(position: Int): Any{
        return ls[position]
    }
    override fun getItemId(position: Int): Long{
        return ls.toLong;
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View{
        val holder: Demo42ViewHolder
        var converView=converView
        if(converView==null){
            converView= LayoutInflater.from(context).inflate(R.layout.)
        }
        return ls.toLong;
    }
}
