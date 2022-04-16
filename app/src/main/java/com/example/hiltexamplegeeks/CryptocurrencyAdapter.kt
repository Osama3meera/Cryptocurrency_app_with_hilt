import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hiltexamplegeeks.Cryptocurrency
import com.example.hiltexamplegeeks.R

class CryptocurrencyAdapter(private val cryptocurrency: List<Cryptocurrency>) : RecyclerView.Adapter<CryptocurrencyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflating list data from list_item to view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }
    // Binding cryptocurrency list to ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(cryptocurrency[position])
    }
    override fun getItemCount() = cryptocurrency.size
    // Iterating ViewHolder and loading it's
    // content to our Image and Text ViewsT
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(index: Cryptocurrency) {
            // Here, we are using Glide library to
            // load the image into ImageView
            Glide.with(itemView.context)
                .load(index.image).dontAnimate()
                .into(itemView.findViewById(R.id.image))
            // Setting name of cryptocurrency to TextView
            itemView.findViewById<TextView>(R.id.cryptocurrency).text = index.name
        }
    }
}
